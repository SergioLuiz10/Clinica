create table medico (
    id bigint not null auto_increment,
    nome varchar(100) NOT NULL,
    especialidade varchar(255)not null,
    crm varchar(20)  not null UNIQUE,
    telefone varchar(100)not null,
    email varchar(255) not null UNIQUE,
    logradouro varchar(255)not null,
    numero varchar(20),
    complemento varchar(100),
    cidade varchar(100),
    uf CHAR(2)not null,
    cep varchar(10)not null,
    PRIMARY KEY (id)
);