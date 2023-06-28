CREATE TABLE estado(
	uf CHAR(2) NOT NULL,
	nome_estado	VARCHAR(50),
	
	CONSTRAINT pk_estado PRIMARY KEY (uf)
)

CREATE TABLE cidade(
	cod_cidade SERIAL NOT NULL,
	nome_cidade VARCHAR(80) NOT NULL,
	cod_estado CHAR(2),
	
	CONSTRAINT pk_cidade PRIMARY KEY (cod_cidade),
	
	CONSTRAINT cod_estado FOREIGN KEY
	(cod_estado) REFERENCES estado(uf),	
)

CREATE TABLE fornecedor