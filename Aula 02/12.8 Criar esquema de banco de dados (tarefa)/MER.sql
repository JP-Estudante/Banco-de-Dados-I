-- Tabela Pessoa
CREATE TABLE Pessoa (
    cpf INT PRIMARY KEY,
    nome VARCHAR(100),
    sexo CHAR(1),
    data_nascimento DATE,
    cidade_id INT,
    FOREIGN KEY (cidade_id) REFERENCES Cidade(id)
);

-- Tabela Cidade
CREATE TABLE Cidade (
    id INT PRIMARY KEY,
    nome VARCHAR(100),
    uf CHAR(2)
);

-- Tabela Empresa
CREATE TABLE Empresa (
    id INT PRIMARY KEY,
    nome VARCHAR(100),
    cidade_id INT,
    FOREIGN KEY (cidade_id) REFERENCES Cidade(id)
);

-- Tabela Trabalho
CREATE TABLE Trabalho (
    pessoa_cpf INT,
    empresa_id INT,
    data_inicio DATE,
    data_fim DATE,
    PRIMARY KEY (pessoa_cpf, empresa_id),
    FOREIGN KEY (pessoa_cpf) REFERENCES Pessoa(cpf),
    FOREIGN KEY (empresa_id) REFERENCES Empresa(id)
);
