package br.com.sistema_ecommerce.factory;

public class ProdutoFactoryProvider {
    // aqui é utilizado indiretamente o pattern Strategy, pois a classe ProdutoFactoryProvider é responsável por instanciar a fábrica correta dinamicamente
    public static ProdutoFactory getFactory(String categoria) {
        switch (categoria.toLowerCase()) {
            case "eletronico":
                return new ProdutoEletronicoFactory();
            case "roupa":
                return new ProdutoRoupaFactory();
            default:
                throw new IllegalArgumentException("Categoria não encontrada"); // TODO: Criar exceções personalizadas
        }
    }
}
