# Projeto de Gerenciamento de Estoque

## Descrição

Este projeto é uma aplicação RESTful desenvolvida com Spring Boot que gerencia um estoque de produtos. Ele utiliza o banco de dados H2 em memória e implementa os padrões de design Singleton, Strategy e Facade.

## Funcionalidades

- Adicionar um produto
- Atualizar um produto
- Remover um produto
- Listar todos os produtos
- Obter detalhes de um produto específico
- Aplicar desconto aos produtos

## Padrões de Design Utilizados

- **Singleton**: Utilizado para garantir que apenas uma instância de um serviço específico seja criada.
- **Strategy**: Utilizado para aplicar diferentes estratégias de desconto aos produtos.
- **Facade**: Utilizado para fornecer uma interface simplificada para interagir com o repositório de produtos e aplicar descontos.

## Tecnologias Utilizadas

- Java
- Spring Boot
- H2 Database
- Swagger UI para documentação e testes da API

## Configuração do Banco de Dados H2

O banco de dados H2 é configurado em memória. Para acessar o console do H2, utilize a seguinte URL:

```
http://localhost:8080/h2-console
```

**Credenciais de Acesso ao H2 Console:**

- **JDBC URL**: `jdbc:h2:mem:testdb`
- **User Name**: `sa`
- **Password**: (deixe em branco)

## Endpoints da API

A documentação da API está disponível no Swagger UI. Acesse [Swagger UI](http://localhost:8080/swagger-ui/index.html#/).

**Exemplos de Endpoints:**

- **Adicionar Produto (POST)**: `/produtos`
- **Atualizar Produto (PUT)**: `/produtos/{id}`
- **Remover Produto (DELETE)**: `/produtos/{id}`
- **Listar Produtos (GET)**: `/produtos`
- **Obter Produto por ID (GET)**: `/produtos/{id}`
- **Aplicar Desconto (POST)**: `/produtos/{id}/desconto`

## Estrutura do Projeto

```plaintext
src/
└── main/
    ├── java/
    │   └── com/
    │       └── exemplo/
    │           └── gerenciamentoestoque/
    │               ├── controller/
    │               │   └── ProdutoController.java
    │               ├── model/
    │               │   └── Produto.java
    │               ├── repository/
    │               │   └── ProdutoRepository.java
    │               ├── service/
    │               │   └── ProdutoService.java
    │               └── strategy/
    │                   ├── DescontoStrategy.java
    │                   └── DescontoPorCategoria.java
    └── resources/
        ├── application.properties
        
```

## Executando o Projeto

1. Clone o repositório:
    ```sh
    git clone https://github.com/seu-usuario/seu-repositorio.git
    ```
2. Navegue até o diretório do projeto:
    ```sh
    cd seu-repositorio
    ```
3. Execute o projeto com Maven:
    ```sh
    mvn spring-boot:run
    ```

## Autor

- [Janielle de Oliveira Brito](https://github.com/JanielleOliveira)

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

