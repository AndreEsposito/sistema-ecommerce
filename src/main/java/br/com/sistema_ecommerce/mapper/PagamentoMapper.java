package br.com.sistema_ecommerce.mapper;

import br.com.sistema_ecommerce.controller.dto.PagamentoDTO;
import br.com.sistema_ecommerce.repository.entity.PagamentoEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PagamentoMapper {

    PagamentoDTO toDTO(PagamentoEntity entity);
    PagamentoEntity toEntity(PagamentoDTO dto);
}
