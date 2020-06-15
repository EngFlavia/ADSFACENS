package ex01.funcoes.aula.pkg17.pkg04;
import java.util.Scanner;
/*
01)Faça um programa que receba duas idades que estejam entre 1 e 120 (inclusive)
Crie uma função para fazer a consistência da idade digitada, de forma que ao 
receber a idade verifique se ele está ou não no intervalo de 1 a 100. Exiba uma 
mensagem informando. ** Deve ser enviada uma idade por vez para a função.
*/

public class Ex01FuncoesAula1704 {
    
    
    public static void main(String[] args) {
        
        int id []  = new int[2];
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Deve ser enviada uma idade por vez para a função");
        System.out.println("\n\n=============================================");
        
        for (int i = 0; i < 2; i++) {
               
            System.out.println("\n\nForneça a " + (i+1) + " idade com valores entre de 1 à 100 anos");
            id [i] = ler.nextInt();
         
            if ( id [i] > 100 ) {
                System.out.println("Esse valor não está dentro da margem especificda ");
            } 
        }
    }
}
