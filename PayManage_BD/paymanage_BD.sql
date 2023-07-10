CREATE TABLE Estado(
	codigo INTEGER PRIMARY KEY,
	uf CHAR(2) NOT NULL UNIQUE,
	nome_estado VARCHAR(50)
);

CREATE TABLE Cidade(
	codigo SERIAL PRIMARY KEY,
	c_mun VARCHAR(7) NOT NULL,
	nome_cidade VARCHAR(80) NOT NULL,
	cod_estado INTEGER,
	cod_fornecedor INTEGER,
	bairro VARCHAR(60),		
	razao_social VARCHAR(100),

	CONSTRAINT fk_cidade_estado FOREIGN KEY(cod_estado) REFERENCES Estado(codigo),
	CONSTRAINT fk_cidade_fornecedor FOREIGN KEY(cod_fornecedor) REFERENCES Fornecedor(id_fornecedor)
);

CREATE TABLE Fornecedor(
	id_fornecedor SERIAL PRIMARY KEY,
	nome_fantasia VARCHAR(80),
	CNPJ CHAR(18),
	razao_social VARCHAR(100),	
);

CREATE TABLE NFe(
	codigo SERIAL PRIMARY KEY,
	chave_acesso CHAR(44) NOT NULL UNIQUE,
	valor_total DECIMAL(12, 2) NOT NULL
	data_cadastro DATE,
);

CREATE TABLE Parcela (
    codigo SERIAL PRIMARY KEY,
    cod_nfe INTEGER NOT NULL,
    numero_parcela INTEGER NOT NULL,
    valor_parcela DECIMAL(12, 2) NOT NULL,
	data_venc DATE,
	
	CONSTRAINT fk_parcela_nfe FOREIGN KEY(cod_nfe) REFERENCES NFe(codigo)
);

CREATE TABLE Usuario(
	codigo SERIAL PRIMARY KEY,
	usuario VARCHAR(20),
	senha VARCHAR(20)
);

CREATE TABLE Configuracao(
	codigo SERIAL PRIMARY KEY,
	cod_email INTEGER,
	FOREIGN KEY (cod_email) REFERENCES Email(codigo)
);

CREATE TABLE Email(
	codigo SERIAL PRIMARY KEY,
	email VARCHAR(120)
);

-- Inserindo todos os dados da tabela Estado
INSERT INTO Estado (codigo, uf, nome_estado)
VALUES (11, 'RO', 'Rondônia'),
       (12, 'AC', 'Acre'),
       (13, 'AM', 'Amazonas'),
       (14, 'RR', 'Roraima'),
       (15, 'PA', 'Pará'),
       (16, 'AP', 'Amapá'),
       (17, 'TO', 'Tocantins'),
       (21, 'MA', 'Maranhão'),
       (22, 'PI', 'Piauí'),
       (23, 'CE', 'Ceará'),
       (24, 'RN', 'Rio Grande do Norte'),
       (25, 'PB', 'Paraíba'),
       (26, 'PE', 'Pernambuco'),
       (27, 'AL', 'Alagoas'),
       (28, 'SE', 'Sergipe'),
       (29, 'BA', 'Bahia'),
       (31, 'MG', 'Minas Gerais'),
       (32, 'ES', 'Espírito Santo'),
       (33, 'RJ', 'Rio de Janeiro'),
       (35, 'SP', 'São Paulo'),
       (41, 'PR', 'Paraná'),
       (42, 'SC', 'Santa Catarina'),
       (43, 'RS', 'Rio Grande do Sul'),
       (50, 'MS', 'Mato Grosso do Sul'),
       (51, 'MT', 'Mato Grosso'),
       (52, 'GO', 'Goiás'),
       (53, 'DF', 'Distrito Federal');

-- Comandos da tabela Estado
SELECT * FROM Estado;


-- Comandos da tabela Cidade
SELECT * FROM Cidade;
DELETE FROM Cidade;
ALTER SEQUENCE Cidade_codigo_seq RESTART WITH 1;


-- Comandos da tabela Fornecedor
SELECT * FROM Fornecedor
SELECT id_fornecedor, nome_fantasia, CNPJ, razao_social FROM Fornecedor;
DELETE FROM Fornecedor;
ALTER SEQUENCE Fornecedor_id_fornecedor_seq RESTART WITH 1;


-- Comandos da tabela NFe
SELECT * FROM NFe;
DELETE FROM NFe;

-- Comandos da tabela Parcela
SELECT * FROM Parcela;


-- Comandos da tabela Usuario
SELECT * FROM Usuario;


-- Comandos da tabela Configuracao
SELECT * FROM Configuracao;


-- Comandos da tabela Email
SELECT * FROM Email;
DELETE FROM Email;
ALTER SEQUENCE Email_codigo_seq RESTART WITH 1;