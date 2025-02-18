package br.com.sistema_ecommerce.mapper;
import br.com.sistema_ecommerce.controller.dto.ProdutoDTO;
import br.com.sistema_ecommerce.repository.entity.ProdutoEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProdutoMapper {

    ProdutoDTO toDTO(ProdutoEntity entity);
    ProdutoEntity toEntity(ProdutoDTO dto);
}
