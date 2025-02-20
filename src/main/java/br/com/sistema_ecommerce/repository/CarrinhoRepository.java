package br.com.sistema_ecommerce.repository;

import br.com.sistema_ecommerce.repository.entity.CarrinhoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrinhoRepository extends JpaRepository<CarrinhoEntity, Long> {
}
