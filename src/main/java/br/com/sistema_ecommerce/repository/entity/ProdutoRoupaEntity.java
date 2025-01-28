package br.com.sistema_ecommerce.repository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@Entity
@Table(name = "produto_roupa")
public class ProdutoRoupaEntity extends ProdutoEntity {

    @Column(name = "tamanho")
    private String tamanho;

    @Column(name = "material")
    private String material;
}
