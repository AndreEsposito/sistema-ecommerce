package br.com.sistema_ecommerce.factory;

import br.com.sistema_ecommerce.controller.dto.ProdutoDTO;
import br.com.sistema_ecommerce.controller.dto.ProdutoEletronicoDTO;
import br.com.sistema_ecommerce.repository.entity.ProdutoEletronicoEntity;
import br.com.sistema_ecommerce.repository.entity.ProdutoEntity;

// Nessa classe é utilizado o pattern Factory Method para realizar os mapeamentos entre DTO e Entity de um Produto Eletronico
public class ProdutoEletronicoFactory implements ProdutoFactory {

    @Override
    public ProdutoEntity eletronicoDtoToEletronicoEntity(ProdutoDTO requestDTO) {
        ProdutoEletronicoDTO produtoEletronicoDTO = (ProdutoEletronicoDTO) requestDTO;
        return ProdutoEletronicoEntity.builder()
                .nome(produtoEletronicoDTO.getNome())
                .preco(produtoEletronicoDTO.getPreco())
                .quantidade(produtoEletronicoDTO.getQuantidade())
                .marca(produtoEletronicoDTO.getMarca())
                .modelo(produtoEletronicoDTO.getModelo())
                .duracaoBateria(produtoEletronicoDTO.getDuracaoBateria())
                .peso(produtoEletronicoDTO.getPeso())
                .build();
    }

    @Override
    public ProdutoDTO eletronicoEntityToEletronicoDto(ProdutoEntity entity) {
        ProdutoEletronicoEntity produtoEletronicoEntity = (ProdutoEletronicoEntity) entity;
        return ProdutoEletronicoDTO.builder()
                .nome(produtoEletronicoEntity.getNome())
                .preco(produtoEletronicoEntity.getPreco())
                .quantidade(produtoEletronicoEntity.getQuantidade())
                .marca(produtoEletronicoEntity.getMarca())
                .modelo(produtoEletronicoEntity.getModelo())
                .duracaoBateria(produtoEletronicoEntity.getDuracaoBateria())
                .peso(produtoEletronicoEntity.getPeso())
                .build();
    }

    @Override
    public ProdutoEntity roupaDtoToRoupaEntity(ProdutoDTO requestDTO) {
        throw new UnsupportedOperationException("Método não suportado para produtos eletrônicos");
    }

    @Override
    public ProdutoDTO roupaEntityToRoupaDto(ProdutoEntity entity) {
        throw new UnsupportedOperationException("Método não suportado para produtos eletrônicos");
    }
}
