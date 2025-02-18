package br.com.sistema_ecommerce.controller.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProdutoDTO {
    private Long id;
    private String nome;
    private Double preco;
    private Integer quantidade;
    private String categoria;

    // Eletronicos
    private String marca;
    private String modelo;
    private String duracaoBateria;
    private Double peso;

    // Roupas
    private String tamanho;
    private String material;
}
