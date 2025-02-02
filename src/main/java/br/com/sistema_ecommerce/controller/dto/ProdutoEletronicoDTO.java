package br.com.sistema_ecommerce.controller.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
public class ProdutoEletronicoDTO extends ProdutoDTO {
    private String marca;
    private String modelo;
    private String duracaoBateria;
    private Double peso;
}
