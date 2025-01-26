package br.com.sistema_ecommerce.controller.dto;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public abstract class ProdutoDTO {
    private Long id;
    private String nome;
    private Double preco;
    private Integer quantidade;
    private String categoria;
}
