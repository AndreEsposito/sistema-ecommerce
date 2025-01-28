package br.com.sistema_ecommerce.repository;

import br.com.sistema_ecommerce.repository.entity.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long> {
}