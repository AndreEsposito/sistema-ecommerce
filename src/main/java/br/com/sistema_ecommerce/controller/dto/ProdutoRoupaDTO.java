package br.com.sistema_ecommerce.controller.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
public class ProdutoRoupaDTO extends ProdutoDTO {
    private String tamanho;
    private String material;
}
