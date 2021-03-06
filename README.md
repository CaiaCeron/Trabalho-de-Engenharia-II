![logo](http://sisdia.abmes.org.br/images/logo/5000_Logo.jpg)

# Trabalho De Engenharia de Software II

# Integrantes:
- Caiã Ceron Silva.
- Jaco Protzen Wally.

# Spring Boot

O Spring Boot foi criado para o desenvolvimento de aplicações que utilizam o framework Spring sem que seja necessária praticamente nenhuma configuração. O Spring Boot é capaz de identificar quais as principais características da aplicação que está sendo desenvolvida e fazer automaticamente as configurações necessárias, ganhando muito em produtividade, focando apenas no desenvolvimento da aplicação e não na configuração das ferramentas e frameworks utilizados, que são repetidos em praticamente todos os projetos.
O Spring necessitou de diversas configurações, mas versão a versão a ferramenta vem melhorando essa característica. No início, toda a configuração do Spring era feita com arquivos XML, mas na versão 2.5 foram introduzidas as anotações para que a mesma fosse feita diretamente no código, eliminando boa parte dos arquivos XML, facilitando bastante a configuração das aplicações. Com o Spring Boot, a ideia é que praticamente nenhuma configuração seja necessária.

Ele tem quatro componentes principais:
1.	Configuração Automática: O Spring Boot identifica automaticamente as configurações necessárias pelo tipo de aplicação;
2.	Dependências Automáticas: O Spring Boot adiciona, pelo tipo de projeto, um conjunto de bibliotecas que já foram testadas juntas, diminuindo problemas de compatibilidade;
3.	Interface de Linha de Comando: disponibiliza uma interface de linha de comando onde o programador pode, de maneira fácil, criar, executar e modificar uma aplicação;
4.	Actuator: É uma ferramenta que permite ao programador verificar o que está acontecendo internamente em uma aplicação com o Spring Boot.
Nesse artigo será mostrado como configurar a aplicação utilizando as configurações e as dependências automáticas do Spring Boot para criar uma aplicação web de maneira rápida e fácil e com praticamente nenhuma configuração necessária. Tecnicamente, vamos construir uma aplicação com o framework Spring MVC, o Spring Data JPA para fazer a persistência dos dados, o banco de dados H2 que já vem na instalação padrão do Spring Boot e o Thymeleaf para definir as visões. Este último é um template engine que substituiu o JSP.

A documentação do Spring Boot se encontra em https://spring.io/docs/reference com outros projetos Spring.
- Video Ilustrativo |[Parte 1](https://youtu.be/FZDnqVICLus) / [Parte 2](https://youtu.be/MuhTg71FmYQ) / [Parte 3](https://youtu.be/uIi_DT7L-58)|

# Requisitos Para Utilização do Aplicativo
- Java SDK 8.
- IDE de sua escolha. (recomendamos NetBeans)
- Banco de Dados Mysql.
- Spring Boot 1.5.4
- Thymeleaf 1.5.4

# Como Instalar o Aplicativo
1. Baixe o arquivo eng.zip do Repositorio.
2. Inicie sua IDE, vá a opção de importar o arquivo, feito isso.
3. De um build and Clean no Projeto, espere todos as dependencias serem baixadas.
4. execute o arquivo EngApplication.java que se encontra no pacote com.engenharia.eng.
5. Abra seu browser e digite na barra de navegação "localhost:8080" (sem aspas).
6. Pronto a Aplicação está funcionando corretamente.

# Vantagens do FrameWork:
- Fácil Instalação.
- Configuração Mínima.
- Toda a base do projeto já vem configurada.
- Não é necessário a configuração do pom.xml

# Desvantagens do FrameWork
- Difícil entendimento devido ao vasto numero de funções que possui.
- Não Possui uma Documentação em Português.
- Muitas de suas Funções são de difícil compreenção.

