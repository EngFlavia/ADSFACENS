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
     testado 					boolean  		not null,
    confirmado                  boolean  		not null,   
	falescido					boolean		    not null,
    cidade_id		            int  references cidade(cidade_id)
);

create table cidade (
	cidade_id		            int 			auto_increment		primary key,
    nome_cidade					varchar(50)		not null,
    cidade_habitantes			int				not null,
    estado_id		            int  references estado(estado_id)
);

create table estado (
	estado_id		            int 			auto_increment		primary key,
    nome_estado 				varchar(50)		not null,
    estado_habitantes			int				not null,
    pais_id			            int  references pais (pais_id	)
);

create table pais (
	pais_id		            int 			auto_increment		primary key,
    nome_pais 				varchar(50)		not null,
    habitantes				int			not null
);
                        -- nome, data inicio sintomas, nascimento,   doença, testado, conf, falesc,
insert into paciente values (null, 'Paulo', '23/03/2020', '29/02/1952', True, True, True, True, 1  );
insert into paciente values (null, 'Ricardo', '12/04/2020', '27/03/1941', False, True, True, True, 2 );
insert into paciente values (null, 'Pamela', '24/03/2020', '02/08/1965', True, True, True, False, 3 );
insert into paciente values (null, 'Iris', '14/04/2020', '04/03/1969', True, False, False, False, 4 );
insert into paciente values (null, 'Brendon', '18/03/2020', '15/07/1977', False, False, False, False, 5 );
insert into paciente values (null, 'Marcia', '30/03/2020', '18/04/1988', True, False, False, True, 6 );
insert into paciente values (null, 'Luana', '27/03/2020', '27/12/1991', True, False, False, False, 1 );
insert into paciente values (null, 'Cauan', '18/03/2020', '17/11/1983', False, False, False, False, 2 );
insert into paciente values (null, 'Victoria', '04/04/2020', '15/02/1978', True, True, True, True, 3 );
insert into paciente values (null, 'Lucas', '07/04/2020', '02/06/1999', False, False, False, False, 4 );
insert into paciente values (null, 'Darci', '12/03/2020', '07/07/2012', True, False, False, True, 5 );


insert into cidade values (1,'Sorocaba', 644.919, 1 );
insert into cidade values (2,'Tatui', 102.256, 1 );
insert into cidade values (3,'Barueri', 262.275, 1 );
insert into cidade values (4,'São Paulo', 12180000, 1);
insert into cidade values (5, 'Rio de Janeiro', 6320000, 2);
insert into cidade values (6, 'São Gonçalo',1084839, 2);

insert into estado values (1, 'São Paulo', 44040.000, 1 );
insert into estado values (2, 'Rio de Janeiro', 16460.000, 1 );

insert into pais values (1, 'Brasil', 209500.000 );







