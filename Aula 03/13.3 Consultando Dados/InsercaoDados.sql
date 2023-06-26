-- Inserção de 5 clientes
INSERT INTO cliente (nome) VALUES
('Cliente 1'),
('Cliente 2'),
('Cliente 3'),
('Cliente 4'),
('Cliente 5');

-- Inserção de 5 vendas de janeiro de 2021
INSERT INTO venda (data, valorTotal, codCliente) VALUES
('2021-01-01', 100.00, 1),
('2021-01-05', 50.00, 2),
('2021-01-10', 200.00, 3),
('2021-01-15', 150.00, 4),
('2021-01-20', 120.00, 5);

-- Inserção de 5 vendas de fevereiro de 2021
INSERT INTO venda (data, valor_total, cod_cliente) VALUES
('2021-02-01', 180.00, 1),
('2021-02-05', 90.00, 2),
('2021-02-10', 300.00, 3),
('2021-02-15', 250.00, 4),
('2021-02-20', 80.00, 5);
