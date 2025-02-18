//package br.com.sistema_ecommerce.factory;
//
//import br.com.sistema_ecommerce.controller.dto.ProdutoDTO;
//import br.com.sistema_ecommerce.repository.entity.ProdutoEntity;
//
//// Nessa classe é utilizado o pattern Factory Method para realizar os mapeamentos entre DTO e Entity de um Produto Eletronico
//public class ProdutoEletronicoFactory implements ProdutoFactory {
//
//    @Override
//    public ProdutoEntity eletronicoDtoToEletronicoEntity(ProdutoDTO requestDTO) {
//        if (requestDTO instanceof ProdutoEletronicoDTO produtoEletronicoDTO) {
//            return ProdutoEletronicoEntity.builder()
//                    .id(produtoEletronicoDTO.getId())
//                    .nome(produtoEletronicoDTO.getNome())
//                    .preco(produtoEletronicoDTO.getPreco())
//                    .quantidade(produtoEletronicoDTO.getQuantidade())
//                    .categoria(produtoEletronicoDTO.getCategoria())
//                    .marca(produtoEletronicoDTO.getMarca())
//                    .modelo(produtoEletronicoDTO.getModelo())
//                    .duracaoBateria(produtoEletronicoDTO.getDuracaoBateria())
//                    .peso(produtoEletronicoDTO.getPeso())
//                    .build();
//        } else {
//            throw new IllegalArgumentException("O DTO fornecido não é do tipo ProdutoEletronicoDTO");
//        }
//    }
//
//    @Override
//    public ProdutoDTO eletronicoEntityToEletronicoDto(ProdutoEntity entity) {
//        if (entity instanceof ProdutoEletronicoEntity produtoEletronicoEntity) {
//            return ProdutoEletronicoDTO.builder()
//                    .id(produtoEletronicoEntity.getId())
//                    .nome(produtoEletronicoEntity.getNome())
//                    .preco(produtoEletronicoEntity.getPreco())
//                    .quantidade(produtoEletronicoEntity.getQuantidade())
//                    .categoria(produtoEletronicoEntity.getCategoria())
//                    .marca(produtoEletronicoEntity.getMarca())
//                    .modelo(produtoEletronicoEntity.getModelo())
//                    .duracaoBateria(produtoEletronicoEntity.getDuracaoBateria())
//                    .peso(produtoEletronicoEntity.getPeso())
//                    .build();
//        } else {
//            throw new IllegalArgumentException("A entidade fornecida não é do tipo ProdutoEletronicoEntity");
//        }
//    }
//
//    @Override
//    public ProdutoEntity roupaDtoToRoupaEntity(ProdutoDTO requestDTO) {
//        throw new UnsupportedOperationException("Método não suportado para produtos eletrônicos");
//    }
//
//    @Override
//    public ProdutoDTO roupaEntityToRoupaDto(ProdutoEntity entity) {
//        throw new UnsupportedOperationException("Método não suportado para produtos eletrônicos");
//    }
//}