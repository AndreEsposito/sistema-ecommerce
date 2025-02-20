package br.com.sistema_ecommerce.repository.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "produto")
public class ProdutoEntity {

    @Id
    @Column(name = "id_produto")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "preco")
    private Double preco;

    @Column(name = "quantidade")
    private Integer quantidade;

    @Column(name = "categoria")
    private String categoria;

    // Eletronicos
    @Column(name = "marca")
    private String marca;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "duracao_bateria")
    private String duracaoBateria;

    @Column(name = "peso")
    private Double peso;

    // Roupas
    @Column(name = "tamanho")
    private String tamanho;

    @Column(name = "material")
    private String material;
}
