package br.com.sistema_ecommerce.factory;

import br.com.sistema_ecommerce.strategy.PagamentoBoleto;
import br.com.sistema_ecommerce.strategy.PagamentoCartaoCredito;
import br.com.sistema_ecommerce.strategy.PagamentoPix;
import br.com.sistema_ecommerce.strategy.PagamentoStrategy;

import java.util.HashMap;
import java.util.Map;

public class PagamentoFactory {
    private static final Map<String, PagamentoStrategy> metodosPagamento = new HashMap<>();

    static {
        metodosPagamento.put("pix", new PagamentoPix());
        metodosPagamento.put("crédito", new PagamentoCartaoCredito());
        metodosPagamento.put("débito", new PagamentoCartaoCredito());
        metodosPagamento.put("boleto", new PagamentoBoleto());
    }

    public static PagamentoStrategy criarPagamento(String tipo) {
        PagamentoStrategy estrategia = metodosPagamento.get(tipo.toLowerCase());
        if (estrategia == null) {
            throw new IllegalArgumentException("Método de pagamento inválido: " + tipo);
        }
        return estrategia;
    }

}
