package br.com.sistema_ecommerce.repository.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "carrinho_compras")
public class CarrinhoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carrinho")
    private Long id;

    @ManyToMany
    @JoinTable(
            name = "carrinho_produtos",
            joinColumns = @JoinColumn(name = "id_carrinho"),
            inverseJoinColumns = @JoinColumn(name = "id_produto")
    )
    private List<ProdutoEntity> produtos = new ArrayList<>();
}
