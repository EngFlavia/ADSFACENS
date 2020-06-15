use Vendas;

select *, 2 as  valor_total_produto from pedido; 
select * from pedido;

create or replace view pedido_finalizado as
select nome_cliente, nome_produto, valor_venda, quantidade_produto_comprado, (valor_venda*quantidade_produto_comprado) as valor_total_produto
from pedido pd
left join carrinho cr on pd.carrinho_id = cr.carrinho_id
left join produto p on p.produto_id = cr.produto_id
left join cliente c on c.cliente_id= pd.cliente_id

 

create or replace view

create or replace view pedido_finalizado as
select nome_cliente, nome_produto,  valor_venda , quantidade_produto_comprado
from pedido
right join cliente 
on 


select * from pedido_finalizado;

create or replace view tabelaProdutosFornecedor as
select prod_id,	nome_prod, qtd_estoque, estoque_mim, data_fabricacao, perecivel, valor, nome_forn		
from produtos 
left join fornecedores 
on produtos.prod_id=fornecedores.forn_id;

select * from tabelaProdutosFornecedor ;