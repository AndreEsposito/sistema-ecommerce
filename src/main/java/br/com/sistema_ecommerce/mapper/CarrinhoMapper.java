package br.com.sistema_ecommerce.mapper;

import br.com.sistema_ecommerce.controller.dto.CarrinhoDTO;
import br.com.sistema_ecommerce.repository.entity.CarrinhoEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CarrinhoMapper {

    CarrinhoDTO toDTO(CarrinhoEntity entity);
    CarrinhoEntity toEntity(CarrinhoDTO dto);
}
