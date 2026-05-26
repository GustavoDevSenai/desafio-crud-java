# CRUD Produtos e Categorias API

API REST desenvolvida com Java e Spring Boot para gerenciamento de Produtos e Categorias utilizando MySQL.

O projeto foi criado com foco em:

* CRUD completo
* Relacionamento entre entidades
* Arquitetura em camadas
* Documentação com Swagger
* Versionamento com Git/GitHub
* Boas práticas de desenvolvimento backend

---

# 🚀 Tecnologias Utilizadas

* Java 17
* Spring Boot
* Spring Web
* Spring Data JPA
* MySQL
* Maven
* Swagger / OpenAPI
* Lombok
* Hibernate

---

# 📁 Estrutura do Projeto

```text
src/main/java
└── com/crud-desafio
    ├── controller
    ├── service
    ├── repository
    ├── entity
    ├── dto
    ├── exception
    └── config
```

---

# 📌 Funcionalidades

## 📦 Produtos

* Cadastrar produto
* Listar produtos
* Buscar produto por ID
* Atualizar produto
* Deletar produto

## 🗂 Categorias

* Cadastrar categoria
* Listar categorias
* Buscar categoria por ID
* Atualizar categoria
* Deletar categoria

---

# 🔗 Relacionamento

Um produto pertence a uma categoria.

Exemplo:

```text
Categoria -> Informática
Produto -> Notebook Gamer
```

---

# 📚 Documentação Swagger

A documentação da API pode ser acessada em:

```text
http://localhost:8080/swagger-ui/index.html
```

---

# ⚙️ Configuração do Banco de Dados

## Criar banco no MySQL

```sql
CREATE DATABASE crud_produtos;
```

---

# ⚙️ Configuração do application.properties

Crie um arquivo:

```text
src/main/resources/application.properties
```

Utilize a configuração abaixo:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/crud_produtos
spring.datasource.username=root
spring.datasource.password=SUA_SENHA

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

⚠️ Nunca envie senhas reais do banco para o GitHub.

Recomenda-se adicionar o arquivo `application.properties` no `.gitignore`.

---

# ▶️ Como Executar o Projeto

## Clonar repositório

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
```

---

## Entrar na pasta

```bash
cd seu-repositorio
```

---

## Executar aplicação

```bash
./mvnw spring-boot:run
```

---

# 📌 Endpoints

## Produtos

### Criar produto

```http
POST /api/produtos
```

### Buscar produto por ID

```http
GET /api/produtos/{id}
```

### Atualizar produto

```http
PUT /api/produtos/{id}
```

### Deletar produto

```http
DELETE /api/produtos/{id}
```

### Listar produtos

```http
GET /api/produtos
```

---

## Categorias

### Criar categoria

```http
POST /api/categorias
```

### Buscar categoria por ID

```http
GET /api/categorias/{id}
```

### Atualizar categoria

```http
PUT /api/categorias/{id}
```

### Deletar categoria

```http
DELETE /api/categorias/{id}
```

### Listar categorias

```http
GET /api/categorias
```

---

# 👨‍💻 Objetivo Educacional

Este projeto foi desenvolvido com fins educacionais para praticar:

* CRUD com Spring Boot
* Relacionamentos JPA
* Integração com MySQL
* API REST
* Swagger
* Git e GitHub
* GitHub Actions
* Organização com Kanban
