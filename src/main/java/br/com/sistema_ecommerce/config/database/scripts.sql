-- Scripts para criar banco e tabelas para rodar projeto localmente

CREATE DATABASE sistema_ecommerce;

USE sistema_ecommerce;

CREATE TABLE produto (
    id INT PRIMARY KEY,
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
