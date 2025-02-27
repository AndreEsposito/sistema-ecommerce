package br.com.sistema_ecommerce.strategy;

import br.com.sistema_ecommerce.controller.enums.StatusPagamentoEnum;

import java.util.Random;

public class PagamentoCartaoCredito implements PagamentoStrategy {
    private static final double LIMITE_CREDITO = 3000.00; // Simulação de limite

    @Override
    public StatusPagamentoEnum processarPagamento(Double valor) {
        if (valor > LIMITE_CREDITO) {
            return StatusPagamentoEnum.RECUSADO;
        }

        // Análise de risco: quanto maior o valor, menor a chance de aprovação
        double chanceAprovacao = 95 - (valor / 50); // Exemplo: para R$1000, a chance será 75%
        return new Random().nextInt(100) < chanceAprovacao ? StatusPagamentoEnum.APROVADO : StatusPagamentoEnum.RECUSADO;
    }
}
