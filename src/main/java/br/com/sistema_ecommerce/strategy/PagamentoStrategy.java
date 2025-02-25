package br.com.sistema_ecommerce.strategy;

import br.com.sistema_ecommerce.controller.enums.StatusPagamentoEnum;

public interface PagamentoStrategy {
    StatusPagamentoEnum processarPagamento(Double valor);
}
