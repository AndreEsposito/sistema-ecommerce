package br.com.sistema_ecommerce.strategy;

import br.com.sistema_ecommerce.controller.enums.StatusPagamentoEnum;

import java.util.Random;

public class PagamentoPix implements PagamentoStrategy {

    @Override
    public StatusPagamentoEnum processarPagamento(Double valor) {
        if (valor <= 500) {
            return StatusPagamentoEnum.APROVADO;
        }
        return new Random().nextInt(100) < 90 ? StatusPagamentoEnum.APROVADO : StatusPagamentoEnum.RECUSADO; // 90% de chance de aprovação para valores acima de R$500 por segurança
    }
}
