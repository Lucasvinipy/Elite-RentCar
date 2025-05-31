# 🚗 Elite RentCar

Sistema de gerenciamento de aluguel de carros desenvolvido em **Java (Swing)** com **MySQL**. O projeto simula as operações básicas de uma locadora de veículos, incluindo o cadastro de clientes, carros, lojas e o controle de aluguéis, aplicando regras de negócio reais com interface gráfica e banco de dados relacional.

---

## 📌 Funcionalidades

- Tela principal com navegação para os módulos: **Cliente, Carro, Loja e Aluguel**
- CRUD completo para todas as entidades
- Relacionamentos com chaves estrangeiras entre as tabelas
- Máscaras para CPF, CNPJ e placa
- Validações para evitar inconsistências no banco

---

## 📋 Regras de Negócio

- Aluguéis com período máximo de **200 dias**
- Um **cliente deve estar cadastrado** antes de realizar um aluguel
- Um **carro só pode ser cadastrado se estiver vinculado a uma loja**
- Aluguéis só são permitidos se o cliente e o carro existirem
- Um **carro não pode estar alugado para mais de um cliente ao mesmo tempo**

---

## 🧱 Estrutura do Banco de Dados

- `cliente(id, nome, cpf, telefone, endereço)`
- `loja(id, nome_loja, cnpj, cidade, estado)`
- `carro(id, placa, marca, modelo, ano, categoria, id_loja)`
- `aluguel(id, id_cliente, id_carro, data_inicio, data_fim)`

Relacionamentos:
- Loja 1:N Carros  
- Cliente 1:N Aluguéis  
- Carro 1:N Aluguéis

---

## 🛠️ Tecnologias Utilizadas

- Java (Swing)
- NetBeans
- MySQL
- JDBC
- Regex para validação
- SQL JOINs e FKs

---

## 📈 Melhorias Futuras

- Autenticação com login de usuário
- Controle de disponibilidade em tempo real
- Relatórios em PDF
- Versão Web e Mobile

---

## 📸 Interface

> 

---

## 👨‍💻 Autor

**Lucas Vinicius Reis de Oliveira**

Estudante de Análise e Desenvolvimento de Sistemas | Apaixonado por tecnologia e soluções inteligentes 🚀
