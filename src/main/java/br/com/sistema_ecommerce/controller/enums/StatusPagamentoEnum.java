package br.com.sistema_ecommerce.controller.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum StatusPagamentoEnum {
    PENDENTE("Pendente"),
    APROVADO("Aprovado"),
    RECUSADO("Recusado"),
    CANCELADO("Cancelado");

    private final String status;
}
