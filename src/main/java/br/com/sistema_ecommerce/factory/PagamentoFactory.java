package br.com.sistema_ecommerce.factory;

import br.com.sistema_ecommerce.config.exception.RegrasDeNegocioException;
import br.com.sistema_ecommerce.strategy.*;

import java.util.HashMap;
import java.util.Map;

public class PagamentoFactory {
    private static final Map<String, PagamentoStrategy> metodosPagamento = new HashMap<>();

    static {
        metodosPagamento.put("pix", new PagamentoPix());
        metodosPagamento.put("crédito", new PagamentoCartaoCredito());
        metodosPagamento.put("débito", new PagamentoCartaoDebito());
        metodosPagamento.put("boleto", new PagamentoBoleto());
    }

    public static PagamentoStrategy criarPagamento(String tipo) {
        PagamentoStrategy estrategia = metodosPagamento.get(tipo.toLowerCase());
        if (estrategia == null) {
            throw new RegrasDeNegocioException("Método de pagamento inválido: " + tipo);
        }
        return estrategia;
    }

}
