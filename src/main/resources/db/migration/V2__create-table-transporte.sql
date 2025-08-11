create table transportes(
    id BIGINT not null AUTO_INCREMENT,
    pedido_transporte VARCHAR(6) NOT NULL,
    transportadora VARCHAR(100) NOT NULL,
    codigo_rastreio VARCHAR(255),
    data_int VARCHAR(255),
    data_exp VARCHAR(255),
    previsao_rastreio VARCHAR(255),
    status_transportadora VARCHAR(100),
    status_entrega VARCHAR(100),
    validacao_transportadora VARCHAR(100),
    nota_fiscal VARCHAR(9) NOT NULL,
    peso_kg DECIMAL(10, 3),
    volume_caixa VARCHAR(100),
    uni_pecas INT,

    primary key(id)
);