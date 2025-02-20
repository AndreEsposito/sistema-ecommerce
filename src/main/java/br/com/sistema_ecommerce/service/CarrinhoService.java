package br.com.sistema_ecommerce.service;

import br.com.sistema_ecommerce.controller.dto.CarrinhoDTO;
import br.com.sistema_ecommerce.mapper.CarrinhoMapper;
import br.com.sistema_ecommerce.repository.CarrinhoRepository;
import br.com.sistema_ecommerce.repository.ProdutoRepository;
import br.com.sistema_ecommerce.repository.entity.CarrinhoEntity;
import br.com.sistema_ecommerce.repository.entity.ProdutoEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CarrinhoService {
    private final CarrinhoRepository carrinhoRepository;
    private final ProdutoRepository produtoRepository;
    private final CarrinhoMapper mapper;

    public CarrinhoDTO obterCarrinho(Long id) {
        CarrinhoEntity carrinho = carrinhoRepository.findById(id).orElseThrow(() -> new DuplicateKeyException("Carrinho não encontrado"));
        Double valorTotalCarrinho = carrinho.getProdutos().stream().mapToDouble(ProdutoEntity::getPreco).sum();
        CarrinhoDTO carrinhoDTO = mapper.toDTO(carrinho);
        carrinhoDTO.setValorTotal(valorTotalCarrinho);
        return carrinhoDTO;
    }

    public void adicionarProduto(Long carrinhoId, Long produtoId) {
        CarrinhoEntity carrinho = carrinhoRepository.findById(carrinhoId).orElse(new CarrinhoEntity());
        ProdutoEntity produto = produtoRepository.findById(produtoId).orElseThrow(() -> new DuplicateKeyException("Produto não encontrado"));

        carrinho.getProdutos().add(ProdutoEntity.builder()
                .id(produto.getId())
                .nome(produto.getNome())
                .preco(produto.getPreco())
                .build());

        carrinhoRepository.save(carrinho);
    }

    public void removerProduto(Long carrinhoId, Long produtoId) {
        CarrinhoEntity carrinho = carrinhoRepository.findById(carrinhoId).orElseThrow();
        carrinho.getProdutos().removeIf(produto -> produto.getId().equals(produtoId));
        carrinhoRepository.save(carrinho);
    }

    public double calcularTotal(Long carrinhoId) {
        CarrinhoEntity carrinho = carrinhoRepository.findById(carrinhoId).orElse(new CarrinhoEntity());
        return carrinho.getProdutos().stream().mapToDouble(ProdutoEntity::getPreco).sum();
    }
}
