-- Scripts para criar banco e tabelas para rodar projeto localmente

CREATE DATABASE sistema_ecommerce;

USE sistema_ecommerce;

CREATE TABLE produto (
    id INT PRIMARY KEY,
    nome VARCHAR(50),
    preco DECIMAL(10, 2),
    quantidade INT,
    catoria VARCHAR(50)
);

CREATE TABLE produto_eletronico (
    id INT PRIMARY KEY,
    marca VARCHAR(255) NOT NULL,
    modelo VARCHAR(255) NOT NULL,
    duracao_bateria VARCHAR(255),
    peso DECIMAL(10, 2),
    FOREIGN KEY (id) REFERENCES produto (id)
);
