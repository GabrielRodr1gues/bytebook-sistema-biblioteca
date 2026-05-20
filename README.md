# Bytebook — Sistema de Biblioteca

Sistema de gerenciamento de biblioteca desenvolvido em Java para o Projeto A3 da disciplina de Lógica de Programação com POO.

---

## Descrição

O sistema simula uma biblioteca universitária com cadastro de livros, usuários, funcionários e controle de empréstimos. Tudo via menu no terminal.

---

## Funcionalidades

- Cadastrar, listar e buscar livros
- Cadastrar e listar usuários
- Cadastrar e listar funcionários
- Realizar e registrar devolução de empréstimos

---

## Classes utilizadas

| Classe | Descrição |
|---|---|
| `Pessoa` | Classe base com nome, email e telefone |
| `Usuario` | Herda de Pessoa, adiciona matrícula |
| `Funcionario` | Herda de Pessoa, adiciona cargo |
| `Livro` | Representa um livro do acervo |
| `Emprestimo` | Liga um livro a um usuário |
| `Biblioteca` | Gerencia todas as listas e operações |
| `Main` | Menu principal com Scanner |

---

## Conceitos de POO aplicados

- **Encapsulamento**: todos os atributos são `private`, acessados por getters e setters
- **Herança**: `Usuario` e `Funcionario` estendem `Pessoa` com `extends`
- **Polimorfismo**: `exibirInfo()` é sobrescrito com `@Override` em cada subclasse
- **Objetos**: criação e uso de objetos das classes ao longo do sistema

---

## Como executar

```bash
cd src
javac *.java
java Main
```

**Requisito:** Java JDK 11 ou superior.

---

## Estrutura do projeto

```
Biblioteca A3/
└── Biblioteca/
    └── src/
        ├── Pessoa.java
        ├── Usuario.java
        ├── Funcionario.java
        ├── Livro.java
        ├── Emprestimo.java
        ├── Biblioteca.java
        └── Main.java
```

---

## ByteBook

> Gabriel Rodrigues

---

Projeto A3 — Entrega: 08 e 09 de junho de 2026


