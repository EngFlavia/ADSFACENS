/*
 04)Crie um programa para uma Indústria Alimentícia para gerenciamento da 
pesagem.  Neste programa deve ter a função verificxarPESO() que: 
a)Receba o peso do produto 
b)Depois verifique se este produto está no peso padrão exigido: 
(de 490g à 510g produto) 
Se estiver exiba a mensagem “Produto OK”, senão, exiba a mensagem 
“Produto Recusado”. 
c)O programa encerrará quando forem registrados 6 produtos com peso padrão. 
Depois de encerrado deve ser mostrado na função principal quantos produtos f
oram recusados. 
 */
package ex04.funcoes.aula1704;
import java.util.Scanner;
import java.util.ArrayList;

public class Ex04FuncoesAula1704 {
 
    public static double peso;
    public static int totalProdutosAceitos;
    public static int totalProdutosRecusados;
    
    static ArrayList<Double> produtoRecusado = new ArrayList();
    static ArrayList<Double> pesoProduto = new ArrayList();
    
    static Scanner ler = new Scanner (System.in);
    
    public static void main(String[] args) {
        
        verificxarPESO();
        System.out.println("Total de produtos recusados : " + totalProdutosRecusados);
                
    }
    
    public static double verificxarPESO(){
        
        while (pesoProduto.size() < 6 ){
             
            System.out.println("Forneça o peso do  produto: ");
                peso = ler.nextDouble();
                
                if (peso >= 490 && peso <= 510 ){
                   pesoProduto.add(peso); 
                    System.out.println("Produto OK ");
                    
                } else {
                    System.out.println("Produto Recusado");
                    //\produtoRecusado[] = peso;
                    produtoRecusado.add(peso);
                }
                        
        }
        
        totalProdutosAceitos = pesoProduto.size();
        totalProdutosRecusados = produtoRecusado.size();
        return 0;
    }
    
}
