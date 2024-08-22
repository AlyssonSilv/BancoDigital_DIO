# Projeto Banco Digital

Este projeto é um exemplo de um sistema bancário simples desenvolvido em Java. O sistema inclui diferentes tipos de contas e serviços bancários. A estrutura do projeto é organizada em pacotes para separar as responsabilidades das classes.

## Estrutura do Projeto

- **Pacote `com.banco`**
  - `BancoDigital.java`: Classe principal do sistema bancário.

- **Pacote `com.banco.modelos`**
  - `Conta.java`: Classe base para uma conta bancária.
  - `ContaCorrente.java`: Classe para contas correntes, com suporte a cheque especial.
  - `ContaPoupanca.java`: Classe para contas poupança, com aplicação de rendimento.

- **Pacote `com.banco.servicos`**
  - `Banco.java`: Classe que realiza operações com contas, como depósitos e saques.

## Pré-requisitos

- JDK 11 ou superior instalado
- IDE como VS Code, IntelliJ IDEA, ou outro editor de texto
- Terminal ou Prompt de Comando para executar comandos de compilação e execução

## Estrutura de Diretórios

```plaintext
ProjBancoDigital/
  src/
    com/
      banco/
        BancoDigital.java
        modelos/
          Conta.java
          ContaCorrente.java
          ContaPoupanca.java
        servicos/
          Banco.java
