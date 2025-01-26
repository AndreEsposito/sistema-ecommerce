package br.com.sistema_ecommerce.controller.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
public class ProdutoEletronicoDTO extends ProdutoDTO {
    private String marca;
    private String modelo;
    private String duracaoBateria;
    private Double peso;
}
