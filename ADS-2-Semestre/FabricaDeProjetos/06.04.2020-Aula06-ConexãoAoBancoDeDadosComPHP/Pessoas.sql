drop database if exists Pessoas;
create database Pessoas;
use Pessoas;


create table Pessoas (
	id 				integer primary key auto_increment,
    nome 			varchar(60),
    email			varchar(30),
    data_nasc 		date,
    cidade  		varchar(20)
);




select * from Pessoas;	



