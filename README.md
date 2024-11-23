# Documentação 
Uma API desenvolvida utilizando Java, Spring Boot, MySQL e outras tecnologias para gerenciar médicos e pacientes.

---

## 1. Tecnologias Utilizadas

- **Java e Spring Boot**: Linguagem de programação e framework utilizados para o backend da aplicação.
- **MySQL**: Banco de dados relacional utilizado para armazenar dados de médicos e pacientes.
- **JPA e Hibernate**: Frameworks para persistência de dados e gerenciamento de consultas SQL.
- **Postman**: Ferramenta para testar as APIs e validar as requisições.
- **Maven**: Gerenciador de dependências utilizado para simplificar a construção e execução do projeto.

---

## 2. Dependências do Projeto (no `pom.xml`)

```xml
<dependencies>
    <!-- Spring Boot Starter Web: Inclui dependências para criar APIs RESTful -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <!-- Spring Boot Starter Data JPA: Inclui dependências para usar JPA e Hibernate -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>

    <!-- MySQL Driver: Para conectar ao banco de dados MySQL -->
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
    </dependency>

    <!-- Spring Boot Starter Validation: Para validação de dados -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-validation</artifactId>
    </dependency>

    <!-- Spring Boot Starter Lombok: Para reduzir a verbosidade do código -->
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <scope>provided</scope>
    </dependency>
</dependencies>
