//package br.com.sistema_ecommerce.factory;
//
//import br.com.sistema_ecommerce.controller.dto.ProdutoDTO;
//import br.com.sistema_ecommerce.repository.entity.ProdutoEntity;
//
//// Nessa classe é utilizado o pattern Factory Method para realizar os mapeamentos entre DTO e Entity de um Produto de Roupa
//public class ProdutoRoupaFactory implements ProdutoFactory {
//
//    @Override
//    public ProdutoEntity eletronicoDtoToEletronicoEntity(ProdutoDTO requestDTO) {
//        throw new UnsupportedOperationException("Método não suportado para produtos de roupa");
//    }
//
//    @Override
//    public ProdutoDTO eletronicoEntityToEletronicoDto(ProdutoEntity entity) {
//        throw new UnsupportedOperationException("Método não suportado para produtos de roupa");
//    }
//
//    @Override
//    public ProdutoEntity roupaDtoToRoupaEntity(ProdutoDTO requestDTO) {
//        ProdutoRoupaDTO produtoRoupaDTO = (ProdutoRoupaDTO) requestDTO;
//        return ProdutoRoupaEntity.builder()
//                .nome(produtoRoupaDTO.getNome())
//                .preco(produtoRoupaDTO.getPreco())
//                .quantidade(produtoRoupaDTO.getQuantidade())
//                .tamanho(produtoRoupaDTO.getTamanho())
//                .material(produtoRoupaDTO.getMaterial())
//                .build();
//    }
//
//    @Override
//    public ProdutoDTO roupaEntityToRoupaDto(ProdutoEntity entity) {
//        ProdutoRoupaEntity produtoRoupaEntity = (ProdutoRoupaEntity) entity;
//        return ProdutoRoupaDTO.builder()
//                .nome(produtoRoupaEntity.getNome())
//                .preco(produtoRoupaEntity.getPreco())
//                .quantidade(produtoRoupaEntity.getQuantidade())
//                .tamanho(produtoRoupaEntity.getTamanho())
//                .material(produtoRoupaEntity.getMaterial())
//                .build();
//    }
//
//}
