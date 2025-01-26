package br.com.sistema_ecommerce.repository.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@Entity
@Table(name = "produto")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class ProdutoEntity {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "preco")
    private Double preco;

    @Column(name = "quantidade")
    private Integer quantidade;

    @Column(name = "catoria")
    private String categoria;
}
