/*
	Nome  : Flávia Florentino de Almeida
	Turma : ADS 2
	Data  : 18.05.2020

*/



drop database if exists Jogos;
create database Jogos;

use Jogos;


drop table if exists usuario;

create table usuario (
	usuario_id						int 			auto_increment		primary key,
	nome_usuario					varchar(50)		not null,			
	email 							varchar(50)		not null,
    login							varchar(50)		not null,
    senha							varchar(50)		not null,
    confirmar_senha					varchar(50)		not null
);

drop table if exists game;

create table game (
	game_id						int 			auto_increment		primary key,
	nome_game					varchar(50)		not null,	
    genero_id					int 			references genero (genero_id),
	valor_venda 				float			not null
);

drop table if exists genero;

create table genero (
	genero_id						int 			auto_increment		primary key,
	nome_genero						varchar(50)		not null	
);

drop table if exists carrinho;

create table carrinho (
	carrinho_id						int 			auto_increment		primary key,
	game_id						int 			references game (game_id)

);

drop table if exists pedido;

create table pedido (
	pedido_id						int 			auto_increment		primary key,
    usuario_id 						int 			references usuario(usuario_id),
	carrinho_id						int 			references carrinho (carrinho_id),			
	data_compra						varchar(50)		not null
    
);

delimiter $

drop trigger if exists verifica_senha ;
create trigger verifica_senha before insert on usuario
for each row
if (new.senha != new.confirmar_senha or CHAR_LENGTH(new.senha) <3) then
signal sqlstate "45000" set message_text = 'Senha de confirmação não bate com a senha digitada';
elseif (CHAR_LENGTH(new.senha) <3) then
signal sqlstate "45000" set message_text = 'Senha não pode possuir menos de 3 caracteres';
end if;
$

delimiter $
drop trigger if exists verifica_genero ;
create trigger verifica_genero before insert on genero
for each row
if new.nome_genero = "" then
signal sqlstate "45000" set message_text = 'Genero não pode estar vazio';
end if;
$

delimiter $
drop trigger if exists verifica_valor ;
create trigger verifica_valor before insert on game
for each row
if new.valor_venda <= 0 then
signal sqlstate "45000" set message_text = 'Valor não pode ser menor que 0';
end if;
$

delimiter ;

insert into usuario (usuario_id, nome_usuario, email, login, senha, confirmar_senha) values (null, "Paulo", "paulo@email.com", "paulinho162", "123456", "123456");
insert into usuario (usuario_id, nome_usuario, email, login, senha, confirmar_senha) values (null, "Ana", "ana@email.com", "aninha162", "123456", "123456");
insert into usuario (usuario_id, nome_usuario, email, login, senha, confirmar_senha) values (null, "Carlos", "carlos@email.com", "carlinho162", "123456", "123456");
insert into usuario (usuario_id, nome_usuario, email, login, senha, confirmar_senha) values (null, "Sandra", "sandras@email.com", "Sandra56", "123456", "123456");
insert into usuario (usuario_id, nome_usuario, email, login, senha, confirmar_senha) values (null, "Claudio", "claudio@email.com", "claudio77", "123456", "123456");
insert into usuario (usuario_id, nome_usuario, email, login, senha, confirmar_senha) values (null, "Saulo", "saulo@email.com", "saulinho162", "123456", "123456");
insert into usuario (usuario_id, nome_usuario, email, login, senha, confirmar_senha) values (null, "Clara", "clara@email.com", "clarinha162", "123456", "123456");
insert into usuario (usuario_id, nome_usuario, email, login, senha, confirmar_senha) values (null, "Carina", "carina@email.com", "carina162", "123456", "123456");
insert into usuario (usuario_id, nome_usuario, email, login, senha, confirmar_senha) values (null, "Samanta", "samanta@email.com", "samanta56", "123456", "123456");
insert into usuario (usuario_id, nome_usuario, email, login, senha, confirmar_senha) values (null, "Bruna", "bruna@email.com", "bruna77", "123456", "123456");

insert into game ( game_id, nome_game, genero_id, valor_venda) values ( null, "GTA", 4, "120.50");
insert into game ( game_id, nome_game, genero_id, valor_venda) values ( null, "Super Mario Galaxy", 4, "240.50");
insert into game ( game_id, nome_game, genero_id, valor_venda) values (null, "Animal Crossing", 8, "102.50");
insert into game ( game_id, nome_game, genero_id, valor_venda) values ( null, "Pokemon", 4, "120.00");
insert into game ( game_id, nome_game, genero_id, valor_venda) values ( null, "Minecraft", 7, "82.00");
insert into game ( game_id, nome_game, genero_id, valor_venda) values ( null, "Resident Evil", 1, "52.00");
insert into game ( game_id, nome_game, genero_id, valor_venda) values ( null, "Last of Us", 1, "111.50");
insert into game ( game_id, nome_game, genero_id, valor_venda) values ( null, "SuperSmash Bros", 4, "120.50");
insert into game ( game_id, nome_game, genero_id, valor_venda) values ( null, "Super Mario Kart", 3, "123.00");
insert into game ( game_id, nome_game, genero_id, valor_venda) values ( null, "Super Mario Party", 10 , "150.50");

insert into genero ( genero_id, nome_genero) values ( 1, "Terror");
insert into genero ( genero_id, nome_genero) values ( 2, "Esportes");
insert into genero ( genero_id, nome_genero) values ( 3, "Corrida");
insert into genero ( genero_id, nome_genero) values ( 4, "Ação");
insert into genero ( genero_id, nome_genero) values ( 5, "Shoter");
insert into genero ( genero_id, nome_genero) values ( 6, "Aventura");
insert into genero ( genero_id, nome_genero) values ( 7, "Construção");
insert into genero ( genero_id, nome_genero) values ( 8, "Simulação de vida");
insert into genero ( genero_id, nome_genero) values ( 9, "Estrategia");
insert into genero ( genero_id, nome_genero) values ( 10, "Party");

insert into carrinho (carrinho_id, game_id) values ( null, 1); 
insert into carrinho (carrinho_id, game_id) values ( null, 2); 
insert into carrinho (carrinho_id, game_id) values ( null, 3); 
insert into carrinho (carrinho_id, game_id) values ( null, 4); 
insert into carrinho (carrinho_id, game_id) values ( null, 5); 
insert into carrinho (carrinho_id, game_id) values ( null, 6); 
insert into carrinho (carrinho_id, game_id) values ( null, 7); 
insert into carrinho (carrinho_id, game_id) values ( null, 8); 
insert into carrinho (carrinho_id, game_id) values ( null, 9); 
insert into carrinho (carrinho_id, game_id) values ( null, 10); 
insert into carrinho (carrinho_id, game_id) values ( null, 10); 
insert into carrinho (carrinho_id, game_id) values ( null, 10); 
insert into carrinho (carrinho_id, game_id) values ( null, 10); 
insert into carrinho (carrinho_id, game_id) values ( null, 1); 
insert into carrinho (carrinho_id, game_id) values ( null, 2); 
insert into carrinho (carrinho_id, game_id) values ( null, 3); 
insert into carrinho (carrinho_id, game_id) values ( null, 4); 
insert into carrinho (carrinho_id, game_id) values ( null, 5); 
insert into carrinho (carrinho_id, game_id) values ( null, 6); 
insert into carrinho (carrinho_id, game_id) values ( null, 7); 

insert into pedido (pedido_id, usuario_id, carrinho_id, data_compra) values (null, 1, 1, CURDATE( ) );
insert into pedido (pedido_id, usuario_id, carrinho_id, data_compra) values (null, 1, 2, CURDATE( ) );
insert into pedido (pedido_id, usuario_id, carrinho_id, data_compra) values (null, 2, 3, CURDATE( ) );
insert into pedido (pedido_id, usuario_id, carrinho_id, data_compra) values (null, 2, 4, CURDATE( ) );
insert into pedido (pedido_id, usuario_id, carrinho_id, data_compra) values (null, 3, 5, CURDATE( ) );
insert into pedido (pedido_id, usuario_id, carrinho_id, data_compra) values (null, 4, 6, CURDATE( ) );
insert into pedido (pedido_id, usuario_id, carrinho_id, data_compra) values (null, 5, 7, CURDATE( ) );
insert into pedido (pedido_id, usuario_id, carrinho_id, data_compra) values (null, 5, 8, CURDATE( ) );
insert into pedido (pedido_id, usuario_id, carrinho_id, data_compra) values (null, 6, 9, CURDATE( ) );
insert into pedido (pedido_id, usuario_id, carrinho_id, data_compra) values (null, 7, 10, CURDATE( ) ); 
insert into pedido (pedido_id, usuario_id, carrinho_id, data_compra) values (null, 7, 11, CURDATE( ) );
insert into pedido (pedido_id, usuario_id, carrinho_id, data_compra) values (null, 7, 12, CURDATE( ) );
insert into pedido (pedido_id, usuario_id, carrinho_id, data_compra) values (null, 8, 13, CURDATE( ) );
insert into pedido (pedido_id, usuario_id, carrinho_id, data_compra) values (null, 9, 14, CURDATE( ) );
insert into pedido (pedido_id, usuario_id, carrinho_id, data_compra) values (null, 10, 15, CURDATE( ) );
insert into pedido (pedido_id, usuario_id, carrinho_id, data_compra) values (null, 1, 16, CURDATE( ) );
insert into pedido (pedido_id, usuario_id, carrinho_id, data_compra) values (null, 2, 17, CURDATE( ) );
insert into pedido (pedido_id, usuario_id, carrinho_id, data_compra) values (null, 3, 18, CURDATE( ) );
insert into pedido (pedido_id, usuario_id, carrinho_id, data_compra) values (null, 4, 19, CURDATE( ) );
insert into pedido (pedido_id, usuario_id, carrinho_id, data_compra) values (null, 5, 20, CURDATE( ) ); 

select nome_game, nome_genero, valor_venda 
from game g
left join genero ge on ge.genero_id = g.genero_id ;

create or replace view pedido_finalizado as
select nome_usuario, data_compra, nome_game, nome_genero, valor_venda
from pedido pd
left join carrinho cr on pd.carrinho_id = cr.carrinho_id
left join game p on p.game_id = cr.game_id
left join usuario c on c.usuario_id= pd.usuario_id
left join genero g on g.genero_id = p.game_id
order by nome_usuario;

select * from pedido_finalizado;

create or replace view contagem_generos as
select  nome_genero, count(nome_genero) as quantidade
from pedido pd
left join carrinho cr on pd.carrinho_id = cr.carrinho_id
left join game p on p.game_id = cr.game_id
left join genero g on g.genero_id = p.game_id
group by nome_genero;

select * from contagem_generos;

