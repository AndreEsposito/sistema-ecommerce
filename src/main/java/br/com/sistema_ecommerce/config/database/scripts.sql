-- Scripts para criar banco e tabelas para rodar projeto localmente

CREATE DATABASE sistema_ecommerce;

USE sistema_ecommerce;

CREATE TABLE produto (
    id_produto INT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    preco DECIMAL(10, 2) NOT NULL,
    quantidade INT NOT NULL,
    categoria VARCHAR(50) NOT NULL,
    marca VARCHAR(50),
    modelo VARCHAR(50),
    duracao_bateria VARCHAR(50),
    peso DECIMAL(10, 2),
    tamanho VARCHAR(10),
    material VARCHAR(50)
);

CREATE TABLE carrinho_compras (
    id_carrinho INT AUTO_INCREMENT PRIMARY KEY
);

CREATE TABLE carrinho_produtos (
    id_carrinho INT,
    id_produto INT,
    PRIMARY KEY (id_carrinho, id_produto),
    FOREIGN KEY (id_carrinho) REFERENCES carrinho_compras(id_carrinho) ON DELETE CASCADE,
    FOREIGN KEY (id_produto) REFERENCES produto(id_produto) ON DELETE CASCADE
);

CREATE TABLE pagamento (
    id_pagamento INT AUTO_INCREMENT PRIMARY KEY,
    metodo VARCHAR(20) NOT NULL,
    valor DECIMAL(10,2) NOT NULL,
    status VARCHAR(20) NOT NULL
);