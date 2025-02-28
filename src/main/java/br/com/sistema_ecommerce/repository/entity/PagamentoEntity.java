package br.com.sistema_ecommerce.repository.entity;

import br.com.sistema_ecommerce.controller.enums.StatusPagamentoEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pagamento")
public class PagamentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pagamento")
    private Long id;


    private String metodo;
    private Double valor;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private StatusPagamentoEnum status;
}
