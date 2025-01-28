package br.com.sistema_ecommerce.controller.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
public class ProdutoRoupaDTO extends ProdutoDTO {
    private String tamanho;
    private String material;
}
