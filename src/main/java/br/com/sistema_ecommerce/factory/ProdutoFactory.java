package br.com.sistema_ecommerce.factory;

import br.com.sistema_ecommerce.controller.dto.ProdutoDTO;
import br.com.sistema_ecommerce.repository.entity.ProdutoEntity;

public interface ProdutoFactory {
    ProdutoEntity eletronicoDtoToEletronicoEntity(ProdutoDTO requestDTO);

    ProdutoDTO eletronicoEntityToEletronicoDto(ProdutoEntity entity);

    ProdutoEntity roupaDtoToRoupaEntity(ProdutoDTO requestDTO);

    ProdutoDTO roupaEntityToRoupaDto(ProdutoEntity entity);
}
