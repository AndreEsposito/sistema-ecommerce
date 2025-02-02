package br.com.sistema_ecommerce.repository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@Entity
@Table(name = "produto_roupa")
public class ProdutoRoupaEntity extends ProdutoEntity {

    @Column(name = "tamanho")
    private String tamanho;

    @Column(name = "material")
    private String material;
}
