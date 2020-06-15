/*
Nome: Flavia Florentino de Almeida
RA: 090477
Turma: ADS 2 
*/

drop database if exists producao;
create database producao;

use producao;

drop table if exists minerios;
drop table if exists pais;
drop table if exists relacionamentoMinerioPais;

create table minerios (
	minerio_id				int					auto_increment 		primary key,
	nome_minerio			varchar(50)			not null,
	valor					float   			not null,
    estado_fisico			varchar(50)			not null,
    combustivel_fossil	    varchar(50)			not null
);

create table paises (
	pais_id				int				auto_increment 		primary key,
    nome_pais			varchar(50)				not null,
	continente			varchar(50)				not null,
	populacao			int		        		not null,
    capital_pais		varchar(50)				not null   
   );
  
  create table relacionamentoMinerioPais (
	relacionamento_id   int				auto_increment 		primary key,
	minerio				int						references minerios(minerio_id),
	pais		    	int						references pais(pais_id)
   );
   
    
   
   insert into minerios (minerio_id, nome_minerio, valor, estado_fisico, combustivel_fossil ) values (1, 'Manganês', 320000, 'Solido', 'Não combustível');
   insert into minerios (minerio_id, nome_minerio, valor, estado_fisico, combustivel_fossil ) values (2, 'Alumínio', 400000, 'Sólido', 'Não combustível');
   insert into minerios (minerio_id, nome_minerio, valor, estado_fisico, combustivel_fossil ) values (3, 'Cobre', 57000, 'Sólido', 'Não combustível');
   insert into minerios (minerio_id, nome_minerio, valor, estado_fisico, combustivel_fossil ) values (5, 'Hematita', 232000, 'Sólido', 'Não combustivel');
   insert into minerios (minerio_id, nome_minerio, valor, estado_fisico, combustivel_fossil ) values (6, 'Gas Natural', 8000, 'Gasoso', 'Combustivel');
   insert into minerios (minerio_id, nome_minerio, valor, estado_fisico, combustivel_fossil ) values (7, 'Mercurio', 375000, 'Liquido', 'Não combustivel');
   insert into minerios (minerio_id, nome_minerio, valor, estado_fisico, combustivel_fossil ) values (8, 'Ouro', 68750000, 'Sólido', 'Não combustivel');
   insert into minerios (minerio_id, nome_minerio, valor, estado_fisico, combustivel_fossil ) values (9, 'Prata', 3900000, 'Sólido', 'Não combustivel');
   insert into minerios (minerio_id, nome_minerio, valor, estado_fisico, combustivel_fossil ) values (10, 'Estanho', 28800, 'Sólido', 'Não combustivel');
   insert into minerios (minerio_id, nome_minerio, valor, estado_fisico, combustivel_fossil ) values (11, 'Ferro', 200000, 'Sólido', 'Não combustivel');
   insert into minerios (minerio_id, nome_minerio, valor, estado_fisico, combustivel_fossil ) values (12, 'Pirita', 775000, 'Sólido', 'Não combustivel');
   insert into minerios (minerio_id, nome_minerio, valor, estado_fisico, combustivel_fossil ) values (13, 'Carvão Mineral', 2975, 'Sólido', 'Combustivel');
   insert into minerios (minerio_id, nome_minerio, valor, estado_fisico, combustivel_fossil ) values (14, 'Magnetita', 50000, 'Sólido', 'Não combustivel');
   insert into minerios (minerio_id, nome_minerio, valor, estado_fisico, combustivel_fossil ) values (15, 'Dolomita', 2000, 'Sólido', 'Não combustivel');

   
   insert into paises (pais_id, nome_pais, continente, populacao, capital_pais ) values (1, 'Brasil','America', '209,3','Brasilia');
   insert into paises (pais_id, nome_pais, continente, populacao, capital_pais ) values (2, 'EUA','America', '327,2','Washington');
   insert into paises (pais_id, nome_pais, continente, populacao, capital_pais ) values (3, 'China','Asia', '1.386','Pequim');
   insert into paises (pais_id, nome_pais, continente, populacao, capital_pais ) values (4, 'Australia','Oceania', '24,6','Camberra');
   insert into paises (pais_id, nome_pais, continente, populacao, capital_pais ) values (5, 'Russia','Europa', '144,5',' ‎Moscou‎');
   
   insert into relacionamentoMinerioPais (minerio, pais) values( 11,1);
   insert into relacionamentoMinerioPais (minerio, pais) values( 11,2); 
   insert into relacionamentoMinerioPais (minerio, pais) values( 11,3); 
   insert into relacionamentoMinerioPais (minerio, pais) values( 11,4); 
   insert into relacionamentoMinerioPais (minerio, pais) values( 11,5); 
   insert into relacionamentoMinerioPais (minerio, pais) values( 1,1); 
   insert into relacionamentoMinerioPais (minerio, pais) values( 2,1); 
   insert into relacionamentoMinerioPais (minerio, pais) values( 3,1); 
   insert into relacionamentoMinerioPais (minerio, pais) values( 4,1); 
   insert into relacionamentoMinerioPais (minerio, pais) values( 5,1); 
   insert into relacionamentoMinerioPais (minerio, pais) values( 6,1); 
   insert into relacionamentoMinerioPais (minerio, pais) values( 7,1); 
   insert into relacionamentoMinerioPais (minerio, pais) values( 8,1); 
   insert into relacionamentoMinerioPais (minerio, pais) values( 13,2); 
   insert into relacionamentoMinerioPais (minerio, pais) values( 13,3); 
   insert into relacionamentoMinerioPais (minerio, pais) values( 13,4); 
   insert into relacionamentoMinerioPais (minerio, pais) values( 13,5); 
   
   
   select* 
   from relacionamentoMinerioPais r 
   inner join minerios m on r.minerio = m.minerio_id
   inner join paises p on r.pais = p.pais_id
