drop database if exists produtosVenda;
create database produtosVenda;

use produtosVenda;
/*
*/

drop table if exists produtos;
create table produtos (
	nome_produto			varchar(50)			null,
	preco					int			null
);

/* se o trigger for inserido aqui ele se aplica a tabela abaixo quando criada*/

insert into produtos (nome_produto, preco) values ('copo', 4);
insert into produtos (nome_produto, preco) values ('garrafa',	25);
insert into produtos (nome_produto, preco) values ('cadeira',	150);
insert into produtos (nome_produto, preco) values ('mesa', 1700);
insert into produtos (nome_produto, preco) values ('almofada', 50);
insert into produtos (nome_produto, preco) values ('garfo', 5);
insert into produtos (nome_produto, preco) values ('faca', 5);
insert into produtos (nome_produto, preco) values ('colher', 5);
insert into produtos (nome_produto, preco) values ('caneca',9);

delimiter $
create trigger verifica_preco before insert on produtos
for each row
if new.preco = 0 then
set new.preco = null;
end if;
$
delimiter ;

delimiter $
create trigger verifica_preco2 before insert on produtos 
for each row
if new.preco >1000 then
set new.preco = null;
end if;
$
delimiter ;

delimiter $
create trigger verifica_preco3 before insert on produtos
for each row
if new.preco < 0 then
-- set new.preco = null;
signal sqlstate "45000" set message_text = 'Dado inserido de form incorreta';
end if;
$
delimiter ;

delimiter $
create trigger bf_update_preco before update on produtos
for each row
if new.preco < 0 then
-- set new.preco = null;
signal sqlstate "45000" set message_text = 'Alteração bloqueada';
end if;
$
delimiter ;












