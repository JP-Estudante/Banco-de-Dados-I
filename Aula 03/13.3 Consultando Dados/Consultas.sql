-- 1. Selecione o nome de todos os clientes cadastrados:
SELECT nome FROM cliente;

-- 2. Selecione a data e valor total de todas as vendas cadastradas:
SELECT data, valorTotal FROM venda;

-- 3. Selecione o nome de todos os clientes cujo nome contém a letra "a":
SELECT nome FROM cliente 
WHERE nome LIKE '%a%';

-- 4. Selecione todas as vendas ocorridas em janeiro de 2021:
SELECT data, valorTotal FROM venda 
WHERE EXTRACT(MONTH FROM data) = 1 AND EXTRACT(YEAR FROM data) = 2021;

-- 5. Selecione todas as vendas ocorridas após 20 de janeiro de 2021:
SELECT data, valorTotal FROM venda 
WHERE data > '2021-01-20';
