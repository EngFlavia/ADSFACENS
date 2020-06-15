/*
	Nome  : Flávia Florentino de Almeida	
	Turma : 2 ADS
	Data  : 23/04/2020

*/
use Empresa;
-- 1 - Gere um relatório informando quantos produtos cada marca possui.

create or replace view tabelaProdutosMarcas
as select p.nome_prod, p.valor, p.prod_id, m.marca_id, m.nome_marca	
from produtos p
inner join  marcas m on m.marca_id = p.marca_id;

select nome_marca, count(prod_id)
from tabelaProdutosMarcas 
group by nome_marca;

-- 2. Gere um relatório informando o preço médio dos produtos de cada marca.

select nome_marca, count(prod_id) , avg (valor)
from tabelaProdutosMarcas
group by nome_marca;
