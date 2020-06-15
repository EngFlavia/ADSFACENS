use Empresa;
/*
Nome: Flavia Florentino de Almeida
Turma: ADS 2 
*/

-- 1. Crie e execute uma view que liste todos os campos da tabela produtos. Quantas tuplas foram selecionadas?
create or replace view tabelaProdutos as 
select *
from produtos;

select * from tabelaProdutos;

-- 2. Crie e execute uma view que liste todos os campos da tabela produtos mais o nome da sua respetiva
-- marca;
create or replace view tabelaProdutosMarcas -- esse não mostra os produtos sem marcas
as select p.*, m.nome_marca
from produtos p, marcas m
where p.prod_id=m.marca_id;

create or replace view tabelaProdutosMarcas2 as
select prod_id,	nome_prod, qtd_estoque, estoque_mim, data_fabricacao, perecivel, valor, nome_marca		
from produtos 
left join marcas 
on produtos.prod_id=marcas.marca_id;

select * from tabelaProdutosMarcas ;
select * from tabelaProdutosMarcas2 ;

-- 3. Crie e execute uma view que liste todos os campos da tabela produtos mais o nome do seu respctivo
-- fornecedor;

create or replace view tabelaProdutosFornecedor as
select prod_id,	nome_prod, qtd_estoque, estoque_mim, data_fabricacao, perecivel, valor, nome_forn		
from produtos 
left join fornecedores 
on produtos.prod_id=fornecedores.forn_id;

select * from tabelaProdutosFornecedor ;

-- 4. Crie e execute uma view que liste todos os campos da tabela produtos mais o nome da sua respetiva
-- marca e o nome do seu respctivo fornecedor;

create or replace view tabelaProdutosMarcaFornecedor 
as select prod_id,	nome_prod, qtd_estoque, estoque_mim, data_fabricacao, perecivel, valor, nome_marca, nome_forn
from produtos 
left join fornecedores 
on produtos.prod_id=fornecedores.forn_id	
left join marcas 
on marcas.marca_id=produtos.marca_id;

select * from tabelaProdutosMarcaFornecedor;

-- 5. Diga ao seu coleguinha que ainda não fez os exercícios, o quanto os bancos de dadas s~ao divertidos e como
-- as views são úteis;
-- :/ 

-- 6. Usando a view criada no item anterior, liste o nome do produto, quantidade em estoque, valor, sua
-- respectiva marca e respectivo fornecedor;

select nome_prod, qtd_estoque, valor, nome_marca, nome_forn from tabelaProdutosMarcaFornecedor;

-- 7. Crie e execute uma view com o nome prod_pereciveis para selecionar o ID, nome, fornecedor, marca e
-- data fabricacao de todos os produtos perecíveis;

create or replace view prod_pereciveis
as select prod_id, nome_prod, nome_forn, nome_marca, data_fabricacao, perecivel
from produtos 
left join fornecedores 
on produtos.prod_id=fornecedores.forn_id	
left join marcas 
on marcas.marca_id=produtos.marca_id
where perecivel like true ;

select * from prod_pereciveis;


-- 8. Crie e execute uma view com o nome prod_menores_qtd para selecionar o ID, nome, marca dos 15 produtos
-- com menores quantidades em estoque;

create or replace view prod_menores_qtd
as select prod_id, nome_prod, nome_forn, nome_marca, qtd_estoque
from produtos 
left join fornecedores 
on produtos.prod_id=fornecedores.forn_id	
left join marcas 
on marcas.marca_id=produtos.marca_id;

-- select TOP 15 nome_marca from prod_menores_qtd order by desc;
select * from prod_menores_qtd order by qtd_estoque limit 15;
