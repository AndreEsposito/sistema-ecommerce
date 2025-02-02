package br.com.sistema_ecommerce.repository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
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
