CREATE TABLE estado(
	uf CHAR(2) NOT NULL,
	nome_estado	VARCHAR(50),
	
	CONSTRAINT pk_estado PRIMARY KEY (uf)
)

CREATE TABLE cidade(
	codigo SERIAL NOT NULL,
	nome_cidade VARCHAR(80) NOT NULL,
	cod_estado CHAR(2),
	
	CONSTRAINT pk_cidade PRIMARY KEY (codigo),
	
	CONSTRAINT cod_estado FOREIGN KEY
	(cod_estado) REFERENCES estado(uf)
)

CREATE TABLE fornecedor(
	id_fornecedor SERIAL NOT NULL,
	nome_fantasia VARCHAR(80),
	CNPJ CHAR(14),
    endereco VARCHAR(255),
    cod_cidade INTEGER,
	FOREIGN KEY (cod_cidade) REFERENCES cidade(codigo) 
)

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

