    CREATE TABLE paciente (
        id BIGINT NOT NULL AUTO_INCREMENT,
        name VARCHAR(100) NOT NULL,
        email VARCHAR(255) NOT NULL UNIQUE,
        telefone VARCHAR(20) NOT NULL,
        cpf VARCHAR(14) NOT NULL UNIQUE,
        logradouro VARCHAR(255) NOT NULL,
        numero VARCHAR(10),
        complemento VARCHAR(100),
        bairro VARCHAR(100),
        cidade VARCHAR(100),
        uf CHAR(2) NOT NULL,
        cep VARCHAR(10) NOT NULL,
        PRIMARY KEY (id)
    );

