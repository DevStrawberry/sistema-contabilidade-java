# Sistema de Contabilidade em Java

Este projeto é uma aplicação de linha de comando desenvolvida em Java para simular um sistema de contabilidade simples. O objetivo principal foi aplicar e demonstrar conceitos de Programação Orientada a Objetos (POO) em um cenário prático e interativo.

A aplicação permite ao usuário gerenciar contas contábeis, registrar transações e visualizar relatórios de saldos e histórico de movimentações.

### Funcionalidades e Conceitos Aplicados

- **Menu Interativo**: A navegação é feita através de um menu de opções no console.
- **Programação Orientada a Objetos (POO)**: O projeto é estruturado em classes bem definidas (`Conta`, `Transacao`, `LivroRazao`) para representar entidades do mundo real.
- **Lógica de Partida Dobrada**: Cada transação envolve um débito e um crédito, garantindo a integridade dos saldos.
- **Transações Atômicas**: A lógica de transação foi implementada de forma que, se o débito falhar, o crédito não é realizado, garantindo a consistência dos dados.
- **Coleções Java**: Utilização de `Map` e `List` para armazenar e gerenciar contas e transações de forma eficiente.

### Como Usar

1.  Clone este repositório para a sua máquina local.
2.  Compile o código-fonte Java.
3.  Execute a classe `Main`.
4.  Utilize o menu no console para interagir com o sistema, adicionando contas, registrando transações e visualizando os relatórios.

### Tecnologias Utilizadas

- **Linguagem**: Java
- **Bibliotecas**: `java.util.Scanner` (para entrada do usuário) e `java.time.LocalDate` (para gerenciamento de datas).

### Autor

- **Matheus** ([@DevStrawberry](https://github.com/DevStrawberry))
