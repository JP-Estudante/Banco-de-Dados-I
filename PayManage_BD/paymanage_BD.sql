CREATE TABLE Estado(
	codigo SERIAL NOT NULL,
	uf CHAR(2) NOT NULL,
	nome_estado VARCHAR(50),
	
	CONSTRAINT pk_estado PRIMARY KEY (codigo)
);

CREATE TABLE Cidade(
	codigo SERIAL NOT NULL,
	c_Mun CHAR(7) NOT NULL,
	nome_cidade VARCHAR(80) NOT NULL,
	cod_estado INTEGER,
	
	CONSTRAINT pk_cidade PRIMARY KEY (codigo),
	
	CONSTRAINT cod_estado FOREIGN KEY(cod_estado) REFERENCES estado(codigo)
);

CREATE TABLE Fornecedor(
	id_fornecedor SERIAL NOT NULL,
	nome_fantasia VARCHAR(80),
	CNPJ CHAR(14),
    endereco VARCHAR(255),
    cod_cidade INTEGER,
	
	FOREIGN KEY (cod_cidade) REFERENCES cidade(codigo) 

	ALTER TABLE Fornecedor
	RENAME COLUMN endereco TO municipio,

	ALTER TABLE Fornecedor
	ADD COLUMN bairro VARCHAR(60);
);

CREATE TABLE NFe(
	codigo SERIAL PRIMARY KEY,
	chave_acesso CHAR(44),
	valor_total DECIMAL(12, 2) NOT NULL
);

CREATE TABLE Parcela (
    codigo SERIAL PRIMARY KEY,
    cod_nfe INTEGER NOT NULL,
    numero_parcela INTEGER NOT NULL,
    valor DECIMAL(12, 2) NOT NULL,

    FOREIGN KEY (cod_nfe) REFERENCES NFe (codigo)
);

CREATE TABLE Usuario(
	codigo SERIAL PRIMARY KEY,
	usuario VARCHAR(10),
	senha VARCHAR(10)
);

CREATE TABLE Configuracao(
	codigo SERIAL PRIMARY KEY,
	email_alerta VARCHAR(100)
);

SELECT * 
	FROM Fornecedor
	
DELETE FROM Configuracao