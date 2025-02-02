package br.com.sistema_ecommerce.controller.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoDTO {
    private Long id;
    private String nome;
    private Double preco;
    private Integer quantidade;
    private String categoria;
}
