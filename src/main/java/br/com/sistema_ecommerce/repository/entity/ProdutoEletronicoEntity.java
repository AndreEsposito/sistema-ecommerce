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
@Table(name = "produto_eletronico")
public class ProdutoEletronicoEntity extends ProdutoEntity {
    @Column(name = "marca")
    private String marca;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "duracao_bateria")
    private String duracaoBateria;

    @Column(name = "peso")
    private Double peso;
}
