# Sistema de Gestão de Biblioteca Universitária

Projeto desenvolvido para o Projeto de Bloco de Back-end - TP1, utilizando Java.

## Objetivo

O projeto tem como objetivo iniciar o desenvolvimento de um Sistema de Gestão de Biblioteca Universitária, contemplando o levantamento de requisitos, a modelagem de casos de uso e a implementação inicial de um programa standalone.

## Tecnologias utilizadas

- Java 21 (JDK 21)
- IntelliJ IDEA Community
- UML
- GitHub

## Estrutura do projeto

```text
ProjetoBloco_BackEnd_Biblioteca/
├── docs/
│   ├── Diagrama_Casos_de_Uso.png
│   ├── Diagrama_Casos_de_Uso.puml
│   └── Requisitos_Biblioteca.pdf
├── src/
│   ├── ProgramaBiblioteca.java
│   └── TesteAmbiente.java
└── .gitignore
```

## Implementação

O programa inicial simula a verificação de solicitações de empréstimo, considerando:

- Quantidade de empréstimos ativos do membro;
- Disponibilidade do exemplar;
- Condições de conservação do exemplar.

Também foram utilizados tipos primitivos, operadores, estruturas condicionais e repetição.

## Como executar

Com o JDK 21 instalado, abra o terminal na pasta principal do projeto.

**Teste do ambiente Java:**

```bash
javac src/TesteAmbiente.java
java -cp src TesteAmbiente
```

**Programa de biblioteca:**

```bash
javac src/ProgramaBiblioteca.java
java -cp src ProgramaBiblioteca
```

## Escopo do TP1

Nesta etapa, foram desenvolvidos o levantamento de requisitos, a identificação dos atores, o diagrama de casos de uso e um programa standalone inicial.

As demais funcionalidades do sistema serão implementadas progressivamente nas próximas etapas do Projeto de Bloco.

## Autora

Julia Beatriz Chuery dos Santos
