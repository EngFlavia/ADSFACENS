use seresvivos;
/*
Nome: Flavia Florentino de Almeida
Turma: ADS 2 
*/

-- 1) Conte quantos animais há no banco de dados.
select count(animal_id) from animais;

-- 2) Conte quantos animais amarelos há no banco de dados.
select count(cor) from animais where cor like 'amarelo';

-- 3) Conte quantos animais laranja há no banco de dados. Você já viu um animal laranja?
select count(cor) from animais where cor like 'amarelo';

-- 4) Conte os animais sagitariano. O que é um sagitariano?
select count(data_nasc	) from animais where data_nasc between '2012-11-22' and '2015-12-21';

-- 5) Mostre os animais taurinos. O que é um taurino? Seria hoje um dia de sorte para eles?
select count(data_nasc	) from animais where data_nasc between '2012-04-21' and '2015-05-20';

-- 6) Qual a média de peso de todos os animais?
select avg(peso) from animais;

-- 7) Qual a média de peso de todos os animais excluindo as baleias, os ratos e os gatos?
select
avg(peso)
from animais a
inner join especies e on a.especie_animal_id = e.especie_id 
where nome_especie not in ('baleias', 'ratos' ,'gatos');

-- 8) Se colocarmos todos esses animais empilhados em uma balança, qual será o peso?
select sum(peso) from animais;
