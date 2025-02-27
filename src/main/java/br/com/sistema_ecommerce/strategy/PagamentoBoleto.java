package br.com.sistema_ecommerce.strategy;

import br.com.sistema_ecommerce.controller.enums.StatusPagamentoEnum;

public class PagamentoBoleto implements PagamentoStrategy {

    @Override
    public StatusPagamentoEnum processarPagamento(Double valor) {
        if (valor > 5000) {
            return StatusPagamentoEnum.CANCELADO; // Boletos muito altos são cancelados por segurança
        }
        return StatusPagamentoEnum.PENDENTE;
    }
}
