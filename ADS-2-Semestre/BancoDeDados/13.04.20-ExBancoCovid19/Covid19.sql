/*
	Nome  : Flávia Florentino de Almeida
	Turma : ADS 2
	Data  : 13/04/2020

*/
drop database if exists Covid_19;
create database Covid_19;

use Covid_19;

drop table if exists paciente;
drop table if exists cidade;
drop table if exists estado;
drop table if exists pais;


create table paciente (
	paciente_id		            int 			auto_increment		primary key,
    nome_paciente   			varchar(50)		not null,
    data_inicio_sintomas		varchar(50)		not null,
    data_nascimento				varchar(50)		not null,
    doença_pre_existente		boolean  		not null,
    confirmado                  boolean  		not null,
	falescido					boolean		    not null
);

create table cidade (
	cidade_id		            int 			auto_increment		primary key,
    nome_cidade					varchar(50)		not null,
    cidade_habitantes			int				not null
);

create table estado (
	estado_id		            int 			auto_increment		primary key,
    nome_estado 				varchar(50)		not null,
    estado_habitantes			int				not null
);

create table pais (
	pais_id		            int 			auto_increment		primary key,
    nome_pais 				varchar(50)		not null,
    habitantes					int			not null
);

insert into paciente values (null, 'Paulo', '23/03/2020', '29/02/1952', True, True, True );
insert into paciente values (null, 'Ricardo', '12/03/2020', '27/03/1941', False, True, False );
insert into paciente values (null, 'Pamela', '24/03/2020', '02/08/1965', True, False, True );

insert into cidade values (null, 'Sorocaba', 644.919 );
insert into cidade values (null, 'Tatui', 102.256 );
insert into cidade values (null, 'Barueri', 262.275 );

insert into estado values (null, 'São Paulo', 44,040.000 );
insert into estado values (null, 'Rio de Janeiro', 16,460.000 );

insert into pais values (null, 'Brasil', 209,500.000 );







