use seresvivos;
/*
Nome: Flavia Florentino de Almeida
Turma: ADS 2 
*/
-- 1 - Baixe o arquivo animais.sql e execute o script no MySQL Workbench
-- 2 - Selecione todos os grupos
select * from grupos;

-- 3 - Selecione todos as espécies
select * from especies;

-- 4 - Selecione todos os animais
select * from animais;

-- 5 - Selecione todos os animais que pesam menos que 50
select * from animais where peso < 50 ;

-- 6 - Selecione todos nasceram entre fevereiro e dezembro de 2015
select * from animais where data_nasc between '2015-2-1' and '2015-12-31' ;

-- 7 - Selecione nome, cor e peso de todos cujo nome comece com 'Mi'
select nome_animal, cor, peso from animais where nome_animal like 'Mi%'; 

-- 8 - Selecione nome, cor e peso de todos com cor vermelha, amarela, marrom e laranja
select nome_animal, cor, peso from animais where cor in ('vermelho' , 'amarelo' , 'marrom' , 'laranja');

-- 9 - Selecione nome, cor, data de nascimento e peso de todos ordenados pelos mais jovens
select nome_animal, cor, data_nasc, peso from animais order by data_nasc;

-- 10 - Selecione nome, cor e peso e especie de todos os animais
select nome_animal, cor, peso, nome_especie 
from animais 
inner join especies on animais.especie_animal_id=especies.especie_id;

-- 11 - Selecione nome, cor e peso e especie e grupo de todos os animais mamíferos
select 
a.nome_animal, 
a.cor, 
a.peso, 
e.nome_especie, 
e.grupo,
g.nome_grupo
from animais a
inner join especies e 
on a.especie_animal_id = e.especie_id 
inner join grupos g on g.grupo_id = e.grupo
where nome_grupo like 'mamífero';

