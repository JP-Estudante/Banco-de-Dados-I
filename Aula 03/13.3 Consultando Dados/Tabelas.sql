CREATE TABLE cliente(
	codigo SERIAL NOT NULL,
	nome VARCHAR(85) NOT NULL,

	CONSTRAINT pkCliente PRIMARY KEY (codigo)	
);

CREATE TABLE venda(
	id SERIAL NOT NULL,
	data DATE NOT NULL,
	valorTotal DECIMAL(10, 2),
	codCliente SERIAL NOT NULL,
	FOREIGN KEY (codCliente) REFERENCES cliente(codigo),
	CONSTRAINT pkId PRIMARY KEY (id)
);