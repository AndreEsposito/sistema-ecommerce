package br.com.sistema_ecommerce.strategy;

import br.com.sistema_ecommerce.controller.enums.StatusPagamentoEnum;

public class PagamentoCartaoDebito implements PagamentoStrategy {
    private static final double SALDO_DISPONIVEL = 1500.00; // Simulação de saldo

    @Override
    public StatusPagamentoEnum processarPagamento(Double valor) {
        return valor <= SALDO_DISPONIVEL ? StatusPagamentoEnum.APROVADO : StatusPagamentoEnum.RECUSADO;
    }
}