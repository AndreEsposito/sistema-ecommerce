package br.com.sistema_ecommerce.service;

import br.com.sistema_ecommerce.controller.dto.ProdutoDTO;
import br.com.sistema_ecommerce.factory.ProdutoFactory;
import br.com.sistema_ecommerce.factory.ProdutoFactoryProvider;
import br.com.sistema_ecommerce.repository.ProdutoRepository;
import br.com.sistema_ecommerce.repository.entity.ProdutoEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProdutoService {
    private final ProdutoRepository repository;

    public void incluir(String categoria, ProdutoDTO requestDTO) {
        requestDTO.setCategoria(categoria);

        ProdutoFactory factory = ProdutoFactoryProvider.getFactory(categoria);
        ProdutoEntity entity = factory.eletronicoDtoToEletronicoEntity(requestDTO);

        repository.save(entity);
    }

    public ProdutoDTO atualizarPorId(Long id, ProdutoDTO requestDTO) {
        requestDTO.setId(id);

        ProdutoEntity produtoEncontrado = repository.findById(id)
                .orElseThrow( () -> new RuntimeException("Produto não encontrado")); // TODO: Criar exceções personalizadas

        repository.deleteById(id);

        ProdutoFactory factory = ProdutoFactoryProvider.getFactory(produtoEncontrado.getCategoria());
        ProdutoEntity entity = factory.eletronicoDtoToEletronicoEntity(requestDTO);

        repository.save(entity);

        return factory.eletronicoEntityToEletronicoDto(entity);
    }

    public void removerPorId(Long id) {
        repository.findById(id).orElseThrow( () -> new RuntimeException("Produto não encontrado")); // TODO: Criar exceções personalizadas
        repository.deleteById(id);
    }

    public ProdutoDTO listarTodosPorCategoria(String categoria) {
        return repository.findAll().stream().filter(produto -> produto.getCategoria().equals(categoria))
                .map(produto -> ProdutoFactoryProvider.getFactory(categoria).eletronicoEntityToEletronicoDto(produto))
                .findFirst().orElseThrow( () -> new RuntimeException("Categoria não encontrada")); // TODO: Criar exceções personalizadas
    }

    public ProdutoDTO buscarPorId(Long id) {
        return repository.findById(id)
                .map(produto -> ProdutoFactoryProvider.getFactory(produto.getCategoria()).eletronicoEntityToEletronicoDto(produto))
                .orElseThrow( () -> new RuntimeException("Produto não encontrado")); // TODO: Criar exceções personalizadas
    }
}
