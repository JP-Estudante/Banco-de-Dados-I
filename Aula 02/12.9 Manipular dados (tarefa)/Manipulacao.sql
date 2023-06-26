-- Inserção de dados

-- Inserir cidades
INSERT INTO Cidade (id, nome) VALUES (1, 'Ibirubá');
INSERT INTO Cidade (id, nome) VALUES (2, 'Selbach');
INSERT INTO Cidade (id, nome) VALUES (3, 'Soledade');

-- Inserir pessoas de Ibirubá
INSERT INTO Pessoa (cpf, nome, cidade_id) VALUES (1, 'João', 1);
INSERT INTO Pessoa (cpf, nome, cidade_id) VALUES (2, 'Maria', 1);

-- Inserir pessoas de Selbach
INSERT INTO Pessoa (cpf, nome, cidade_id) VALUES (3, 'Pedro', 2);
INSERT INTO Pessoa (cpf, nome, cidade_id) VALUES (4, 'Letícia', 2);

-- Inserir empresas
INSERT INTO Empresa (id, nome, cidade_id) VALUES (1, 'Vence Tudo', 1);
INSERT INTO Empresa (id, nome, cidade_id) VALUES (2, 'Indutar', 1);
INSERT INTO Empresa (id, nome, cidade_id) VALUES (3, 'AGCO', 2);

-- Inserir informações de trabalho
INSERT INTO Trabalho (pessoa_cpf, empresa_id, data_inicio, data_fim) VALUES (1, 2, '2010-01-11', '2012-02-12');
INSERT INTO Trabalho (pessoa_cpf, empresa_id, data_inicio, data_fim) VALUES (2, 3, '2013-04-11', '2015-02-12');
INSERT INTO Trabalho (pessoa_cpf, empresa_id, data_inicio) VALUES (1, 3, '2012-06-15');

-- Alterações no Banco de Dados

-- Atualizar cidade do João para Selbach
UPDATE Pessoa SET cidade_id = 2 WHERE cpf = 1;

-- Atualizar informação de trabalho do João (de Indutar para Vence Tudo)
UPDATE Trabalho SET empresa_id = 1 WHERE pessoa_cpf = 1 AND empresa_id = 2;

-- Atualizar data de saída do João da AGCO
UPDATE Trabalho SET data_fim = '2018-02-15' WHERE pessoa_cpf = 1 AND empresa_id = 3;