/*
    03)Faça um programa que receba três notas de um determinado aluno.  
Crie uma função para consistir essas notas (somente aceitando nota entre 0 e 10)
Crie uma função para calcular a média e outra função para verificar a situação 
do aluno. Se o aluno tiver média menor que 2, deve aparecer a mensagem 
“Reprovado”, senão, se a média for entre 3 e 5, deve aparecer a mensagem 
“Aluno em Exame”. Para os que tiverem média maior ou igual a 5 deve aparecer 
“Aprovado”. 
 */
package ex03funcoesaula.pkg17.pkg04;
import java.util.Scanner;


public class Ex03FuncoesAula1704 {

    public static double nota[] = new double [3];
    public static double somaNota;
    static Scanner ler = new Scanner (System.in); 
    
    public static void main(String[] args) {
        
        declararNota();
                
        System.out.println("O valor da media do aluno é de: " + calcularMedia());
        
        verificarAprovacao();
        
    }
    
    public static double declararNota(){
    for (int i = 0; i < 3; i++) {
               
            System.out.println("\n\nForneça a " + (i+1) + " nota");
                nota [i] = ler.nextDouble();
               
                if ( nota [i] > 10 ) {
                System.out.println("Esse valor não é valida, forneça um valor de 0 a 10 ");
            } else {
                    somaNota += nota[i];
                }
                
        }
        return somaNota;
    }
    
    public static double calcularMedia(){
        return (somaNota / 3);
        
    }
    
    public static double verificarAprovacao(){
        
        if (calcularMedia() <= 2){
            System.out.println("REPROVADO");
            
        } else if ( calcularMedia() <= 5) {
            System.out.println("Aluno em EXAME");
            
        } else{
            System.out.println("APROVADO");
        }
        return 0;
    }
    
}
