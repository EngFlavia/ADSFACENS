/*
	Nome  : Flávia Florentino de Almeida
	Turma : ADS 2
	Data  : 11.05.2020

*/



drop database if exists Vendas;
create database Vendas;

use Vendas;


drop table if exists cliente;

create table cliente (
	cliente_id						int 			auto_increment		primary key,
	nome_cliente					varchar(50)		not null,			
	email 							varchar(50)		not null,
    login							varchar(50)		not null,
    senha							varchar(50)		not null,
    confirmar_senha					varchar(50)		not null
);

drop table if exists produto;

create table produto (
	produto_id						int 			auto_increment		primary key,
	nome_produto					varchar(50)		not null,			
	quantidade_estoque				int				not null,
    valor_custo						float			not null,
    valor_venda 					float			not null
);

drop table if exists carrinho;

create table carrinho (
	carrinho_id						int 			auto_increment		primary key,
	produto_id						int 			references produto (produto_id),
    quantidade_produto_comprado		int				not null

);

drop table if exists pedido;

create table pedido (
	pedido_id						int 			auto_increment		primary key,
    cliente_id 						int 			references cliente(cliente_id),
	carrinho_id						int 			references carrinho (carrinho_id),			
	data_compra						varchar(50)		not null
    
);

delimiter $
create trigger verifica_senha before insert on cliente
for each row
if new.senha != new.confirmar_senha then
set new.cliente =null;
end if;
$

create trigger verifica_estoque before insert on carrinho
for each row
if new.quantidade_produto_comprado > quantidade_estoque then
set new.quantidade_produto_comprado = null;
end if;
$

create trigger verifica_valor before insert on produto
for each row
if new.valor_custo > valor_venda then
set new.produto = null;
end if;
$
delimiter ;

insert into cliente (cliente_id, nome_cliente, email, login, senha, confirmar_senha) values (null, "Paulo", "paulo@email.com", "paulinho162", "123456", "123456");
insert into cliente (cliente_id, nome_cliente, email, login, senha, confirmar_senha) values (null, "Ana", "ana@email.com", "aninha162", "123456", "123456");
insert into cliente (cliente_id, nome_cliente, email, login, senha, confirmar_senha) values (null, "Carlos", "carlos@email.com", "carlinho162", "123456", "123456");
insert into cliente (cliente_id, nome_cliente, email, login, senha, confirmar_senha) values (null, "Sandra", "sandras@email.com", "Sandra56", "123456", "123456");
insert into cliente (cliente_id, nome_cliente, email, login, senha, confirmar_senha) values (null, "Claudio", "claudio@email.com", "claudio77", "123456", "123456");

insert into produto ( produto_id, nome_produto, quantidade_estoque, valor_custo, valor_venda) values ( null, "caneta", "10", "1.00", "2.50");
insert into produto ( produto_id, nome_produto, quantidade_estoque, valor_custo, valor_venda) values ( null, "caderno", "15", "12.00", "24.50");
insert into produto ( produto_id, nome_produto, quantidade_estoque, valor_custo, valor_venda) values ( null, "lapis", "25", "0.80", "1.50");
insert into produto ( produto_id, nome_produto, quantidade_estoque, valor_custo, valor_venda) values ( null, "caneca", "13", "7.00", "12.00");
insert into produto ( produto_id, nome_produto, quantidade_estoque, valor_custo, valor_venda) values ( null, "lapis de cor", "20", "15.00", "32.00");
insert into produto ( produto_id, nome_produto, quantidade_estoque, valor_custo, valor_venda) values ( null, "fone de ouvido", "10", "35.00", "52.00");
insert into produto ( produto_id, nome_produto, quantidade_estoque, valor_custo, valor_venda) values ( null, "regua", "30", "0.80", "1.50");
insert into produto ( produto_id, nome_produto, quantidade_estoque, valor_custo, valor_venda) values ( null, "estojo", "10", "5.00", "12.50");
insert into produto ( produto_id, nome_produto, quantidade_estoque, valor_custo, valor_venda) values ( null, "lapiseira", "12", "16.00", "23.00");
insert into produto ( produto_id, nome_produto, quantidade_estoque, valor_custo, valor_venda) values ( null, "mochila", "5", "100.80", "150.50");
insert into produto ( produto_id, nome_produto, quantidade_estoque, valor_custo, valor_venda) values ( null, "lancheira", "5", "80.80", "110.50");
insert into produto ( produto_id, nome_produto, quantidade_estoque, valor_custo, valor_venda) values ( null, "garrafa térmica", "2", "23.00", "31.50");
insert into produto ( produto_id, nome_produto, quantidade_estoque, valor_custo, valor_venda) values ( null, "grampeador", "6", "10.80", "17.50");
insert into produto ( produto_id, nome_produto, quantidade_estoque, valor_custo, valor_venda) values ( null, "grampo", "8", "8.00", "12.50");
insert into produto ( produto_id, nome_produto, quantidade_estoque, valor_custo, valor_venda) values ( null, "compasso", "2", "42.00", "51.50");

insert into carrinho (carrinho_id, produto_id, quantidade_produto_comprado) values ( null, 1, 3); 
insert into carrinho (carrinho_id, produto_id, quantidade_produto_comprado) values ( null, 2, 2); 
insert into carrinho (carrinho_id, produto_id, quantidade_produto_comprado) values ( null, 3, 2); 
insert into carrinho (carrinho_id, produto_id, quantidade_produto_comprado) values ( null, 4, 1); 
insert into carrinho (carrinho_id, produto_id, quantidade_produto_comprado) values ( null, 5, 3); 
insert into carrinho (carrinho_id, produto_id, quantidade_produto_comprado) values ( null, 6, 2); 
insert into carrinho (carrinho_id, produto_id, quantidade_produto_comprado) values ( null, 7, 2); 
insert into carrinho (carrinho_id, produto_id, quantidade_produto_comprado) values ( null, 8, 1); 
insert into carrinho (carrinho_id, produto_id, quantidade_produto_comprado) values ( null, 9, 1); 
insert into carrinho (carrinho_id, produto_id, quantidade_produto_comprado) values ( null, 10, 3); 
insert into carrinho (carrinho_id, produto_id, quantidade_produto_comprado) values ( null, 11, 3); 
insert into carrinho (carrinho_id, produto_id, quantidade_produto_comprado) values ( null, 12, 2); 
insert into carrinho (carrinho_id, produto_id, quantidade_produto_comprado) values ( null, 13, 3); 


insert into pedido (pedido_id, cliente_id, carrinho_id, data_compra) values (null, 1, 1, CURDATE( ) );
insert into pedido (pedido_id, cliente_id, carrinho_id, data_compra) values (null, 1, 2, CURDATE( ) );
insert into pedido (pedido_id, cliente_id, carrinho_id, data_compra) values (null, 2, 3, CURDATE( ) );
insert into pedido (pedido_id, cliente_id, carrinho_id, data_compra) values (null, 2, 4, CURDATE( ) );
insert into pedido (pedido_id, cliente_id, carrinho_id, data_compra) values (null, 3, 5, CURDATE( ) );
insert into pedido (pedido_id, cliente_id, carrinho_id, data_compra) values (null, 4, 6, CURDATE( ) );
insert into pedido (pedido_id, cliente_id, carrinho_id, data_compra) values (null, 5, 7, CURDATE( ) );
insert into pedido (pedido_id, cliente_id, carrinho_id, data_compra) values (null, 5, 8, CURDATE( ) );
insert into pedido (pedido_id, cliente_id, carrinho_id, data_compra) values (null, 1, 9, CURDATE( ) );
insert into pedido (pedido_id, cliente_id, carrinho_id, data_compra) values (null, 1, 10, CURDATE( ) ); 

create or replace view pedido_finalizado as
select nome_cliente, data_compra, nome_produto, valor_venda, quantidade_produto_comprado, (valor_venda*quantidade_produto_comprado) as valor_total_produto
from pedido pd
left join carrinho cr on pd.carrinho_id = cr.carrinho_id
left join produto p on p.produto_id = cr.produto_id
left join cliente c on c.cliente_id= pd.cliente_id
order by nome_cliente;


select * from pedido_finalizado;


 

