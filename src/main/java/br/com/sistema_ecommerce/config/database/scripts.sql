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
    marca VARCHAR(50) NOT NULL,
    modelo VARCHAR(50) NOT NULL,
    duracao_bateria VARCHAR(50),
    peso DECIMAL(10, 2),
    FOREIGN KEY (id) REFERENCES produto (id)
);

CREATE TABLE produto_roupa (
    id INT PRIMARY KEY,
    tamanho VARCHAR(10) NOT NULL,
    materia VARCHAR(50) NOT NULL,
    FOREIGN KEY (id) REFERENCES produto (id)
);