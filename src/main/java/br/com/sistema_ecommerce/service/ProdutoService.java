package br.com.sistema_ecommerce.service;

import br.com.sistema_ecommerce.controller.dto.ProdutoDTO;
import br.com.sistema_ecommerce.mapper.ProdutoMapper;
import br.com.sistema_ecommerce.repository.ProdutoRepository;
import br.com.sistema_ecommerce.repository.entity.ProdutoEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProdutoService {
    private final ProdutoRepository repository;
    private final ProdutoMapper mapper;

    public void incluir(String categoria, ProdutoDTO requestDTO) {
        requestDTO.setCategoria(categoria);

        ProdutoEntity entity = mapper.toEntity(requestDTO);

        repository.save(entity);
    }

    public ProdutoDTO atualizarPorId(Long id, ProdutoDTO requestDTO) {
        requestDTO.setId(id);

        repository.findById(id).orElseThrow(() -> new DuplicateKeyException("Produto não encontrado"));

        repository.deleteById(id);

        ProdutoEntity entity = mapper.toEntity(requestDTO);

        repository.save(entity);

        return mapper.toDTO(entity);
    }

    public void removerPorId(Long id) {
        repository.findById(id).orElseThrow(() -> new DuplicateKeyException("Produto não encontrado"));
        repository.deleteById(id);
    }

    public List<ProdutoDTO> listarTodosPorCategoria(String categoria) {
        return repository.findAll().stream()
                .filter(produto -> produto.getCategoria().equals(categoria))
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }

    public ProdutoDTO buscarPorId(Long id) {
        return repository.findById(id)
                .map(mapper::toDTO)
                .orElseThrow(() -> new DuplicateKeyException("Produto não encontrado"));
    }
}