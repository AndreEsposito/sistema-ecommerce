# 🛒 Sistema E-commerce

Este é um projeto bem simples de e-commerce, desenvolvido para aplicar na prática os conhecimentos adquiridos sobre **Design Patterns** 
na construção de uma API. O objetivo é estruturar um sistema modular, escalável e de fácil manutenção, utilizando boas práticas de arquitetura de software.

---

## 🚀 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Lombok**
- **MapStruct**
- **MySQL** (ou outro banco de dados relacional)
- **Maven**

---

## 📌 Objetivo do Projeto

Criar um **sistema de e-commerce simples**, que contemple:

✔️ Cadastro de produtos  
✔️ Carrinho de compras  
✔️ Diferentes formas de pagamento  
✔️ Aplicação de descontos  
✔️ Padrões de projeto para escalabilidade

---

## 🎨 Padrões de Projeto Aplicados

### 🔹 **Criacionais**
Focados na criação flexível e reutilizável de objetos.

- **Builder** → Utilizado para facilitar a criação de DTOs e Entities com **Lombok**.
- **Factory Method** → Responsável por instanciar a forma de pagamento correta de maneira centralizada.

### 🔹 **Comportamentais**
Definem a forma como os objetos interagem e delegam responsabilidades.

- **Strategy** → Permite a escolha dinâmica da forma de pagamento em tempo de execução, tornando o sistema mais flexível e desacoplado.

### ❌ **Padrões considerados, mas não implementados**

- **Proxy** → Poderia ser utilizado para proteger informações sensíveis no checkout, como dados de cartão de crédito.
- **Decorator** → Poderia ser utilizado para adicionar dinamicamente funcionalidades ao carrinho de compras.
- **Template Method** → Poderia ser utilizado para organizar regras de negócio, como categorização de produtos, seguindo boas práticas do **SOLID**.

---

## 🏗️ Estrutura do Projeto

📂 **src/main/java/br/com/sistema_ecommerce/**  
├── **config/** → Configurações globais do projeto  
├── **controller/** → Endpoints da API  
├── **entity/** → Representação das entidades (produtos, clientes, pedidos, etc.)  
├── **dto/** → Transporte de dados entre camadas  
├── **service/** → Regras de negócio (cálculo de descontos, validação de pagamentos, etc.)  
├── **factory/** → Instancia objetos relacionados às categorias de produtos  
├── **checkout/** → Lida com as transações financeiras  
├── **utils/** → Componentes reutilizáveis, como gerenciamento de descontos

---

## 🔧 Como Executar o Projeto

### 1️⃣ Clone este repositório:
```bash
git clone https://github.com/AndreEsposito/sistema-ecommerce.git
```

### 2️⃣ Acesse o diretório do projeto:
```bash
cd sistema-ecommerce
```

### 3️⃣ Configure o banco de dados:
Este projeto utiliza MySQL. Caso não tenha o MySQL instalado, faça a instalação antes de prosseguir.

Acesse seu banco de dados MySQL e execute os seguintes comandos SQL para criar o banco e as tabelas:
```sql
CREATE DATABASE sistema_ecommerce;

USE sistema_ecommerce;

CREATE TABLE produtos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    descricao TEXT,
    preco DECIMAL(10,2) NOT NULL,
    estoque INT NOT NULL
);

CREATE TABLE clientes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL
);

CREATE TABLE pedidos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    cliente_id INT,
    data_pedido TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (cliente_id) REFERENCES clientes(id)
);

CREATE TABLE pagamentos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    pedido_id INT,
    metodo_pagamento VARCHAR(50) NOT NULL,
    status_pagamento VARCHAR(50) NOT NULL,
    FOREIGN KEY (pedido_id) REFERENCES pedidos(id)
);
```
📌 Caso esteja utilizando um banco de dados diferente, adapte os comandos conforme necessário.

### 4️⃣ Configure o acesso ao banco de dados no application.properties:
Edite o arquivo src/main/resources/application.properties e defina suas credenciais do MySQL:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/sistema_ecommerce
spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
spring.jpa.hibernate.ddl-auto=update
```
🔹 Substitua SEU_USUARIO e SUA_SENHA pelas credenciais do seu MySQL.

### 5️⃣ Compile e execute a aplicação:
```bash
mvn spring-boot:run
```

### 6️⃣ Acesse a API:
A API estará disponível em:
```bash
http://localhost:8080
```