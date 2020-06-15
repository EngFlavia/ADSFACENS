/*
	Nome  : Flávia Florentino de Almeida
	Turma : ADS 2
	Data  : 01.06.2020

*/



drop database if exists Logistica;
create database Logistica;

use Logistica;


drop table if exists Veiculos;

create table Veiculos (
	veiculos_id						int 			auto_increment		primary key,
	placa							varchar(50)		not null,			
	ano 							int				not null,
    modelo							varchar(50)		not null
);

drop table if exists Condutor;

create table Condutor (
	condutor_id						int 			auto_increment		primary key,
	nome_condutor					varchar(50)		not null,			
	cpf 							varchar(50)		not null,
    tel								varchar(50)		not null
);

drop table if exists Viagem;
create table Viagem (
	viagem_id						int 			auto_increment		primary key,
	cidade_origem					varchar(50)		not null,			
	cidade_destino 					varchar(50)		not null,
    data_entrega					varchar(50)		not null,
    condutor_id						int 			references Condutor(condutor_id),
    veiculos_id						int 			references Veiculos(veiculos_id)
);

insert into Veiculos (veiculos_id, placa, ano, modelo) values (null, "EDS 1990" , 2020 , "Renault KWID");
insert into Veiculos (veiculos_id, placa, ano, modelo) values (null, "EDS 2020" , 2011 , "Scania");
insert into Veiculos (veiculos_id, placa, ano, modelo) values (null, "EDS 2017" , 2015 , "CG 500");
insert into Veiculos (veiculos_id, placa, ano, modelo) values (null, "EDS 2098" , 2017 , "Fiorino");

insert into Condutor (condutor_id, nome_condutor, cpf, tel) values (null, "Paulo" ,"396.358.359-33", "(15)9999-999");
insert into Condutor (condutor_id, nome_condutor, cpf, tel) values (null, "Luiza" ,"397.365.348-44", "(15)8888-888");

insert into Viagem (viagem_id, cidade_origem, cidade_destino, data_entrega, condutor_id, veiculos_id ) values (null, "São Paulo" ,"Sorocaba", "15/06/2020", 1, 1);
insert into Viagem (viagem_id, cidade_origem, cidade_destino, data_entrega, condutor_id, veiculos_id ) values (null, "Piracicaba" ,"Barueri", "17/06/2020", 2, 4);

create or replace view viagem_cadastrada as
select cidade_origem, cidade_destino, data_entrega, nome_condutor, modelo, placa
from Viagem vg 
left join Veiculos ve on ve.veiculos_id = vg.veiculos_id
left join Condutor cd on cd.condutor_id = vg.condutor_id
order by data_entrega;


select * from viagem_cadastrada;
