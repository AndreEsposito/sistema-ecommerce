package br.com.sistema_ecommerce.controller.dto;

import br.com.sistema_ecommerce.controller.enums.StatusPagamentoEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PagamentoDTO {
    private Long id;
    private String metodo;
    private Double valor;
    private StatusPagamentoEnum status;
}
