/*
2) Faça um programa que receba 3 nomes com suas respectivas idades e 
depois mostre qual o nome da pessoa que tem a maior idade. Uma matriz para 
receber os nomes e outra (matriz unidirecional – vetor) para receber as idades

*/


package ex02_listaaula_remota_27_03;
import java.util.Scanner;


public class Ex02_ListaAula_Remota_27_03 {

    public static void main(String[] args) {
        
        try{
         
        String nome []  = new String[3];
        int idade[] = new int[3];
        int menor = idade[0]; 
        int maior = idade[0];
        String maisVelha = nome[0];
        
                 
        for (int i = 0; i < 3 ; i++) {
                        
            Scanner ler = new Scanner(System.in);
        
            System.out.println("Forneça o nome: ");
            nome [i] = ler.nextLine();
        
            System.out.println("Forneça a sua idade: ");
            idade[i] = ler.nextInt();
            //a[i] = new Pessoa (nome,idade);
            
        
            if (idade[i] < menor){
                menor = idade[i];
            }
            if (idade[i] > maior){
                maior = idade[i];
                maisVelha = nome[i];
            }
        }
        System.out.println("A pessoa mais velha é " + maisVelha + " com " + maior +" de idade ");
        }
        catch(Exception erro){
            System.out.println("Erro de entrada de valores "+ erro.getMessage());
          }
    }
}                 
       


        