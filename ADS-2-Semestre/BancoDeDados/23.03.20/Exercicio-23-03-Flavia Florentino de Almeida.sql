use seresvivos;
/*
Nome: Flavia Florentino de Almeida
Turma: ADS 2 
*/
-- 1- Selecione todos os animais cujo nome não contenha a letra "A"
select * from animais where nome_animal not like '%a%';

-- 2 - Selecione todos os animais começando pelo mais leve até o mais pesado.
select nome_animal, cor, peso from animais order by peso;

-- 3 - Selecione todos os cachorros começando pelo mais pesado até o mais leve.
select * from animais inner join especies on animais.especie_animal_id=especies.especie_id where nome_especie like 'cachorro' order by peso desc;

-- 4 - Selecione todos os animais cujo nome termine com a letra "o".
select * from animais where nome_animal like '%o';

-- 5 - Selecione todos os animais cujo nome Comece com a letra "M".
select * from animais where nome_animal like 'm%';

-- 6 - Selecione todos os animais cujo nome contenha a letra "l"
select * from animais where nome_animal like '%l%';

-- 7 - Selecione todos os animais com mais o nome composto por mais de uma palavra. Por exemplo "Topo Giggio" e "Prof. Pardal"
select * from animais where nome_animal like '% %';

-- DESAFIO -- Liste todos os nomes de animais e o nome de suas respectivas especies.
select animais.nome_animal, especies.nome_especie from animais inner join especies on animais.especie_animal_id=especies.especie_id;
 
