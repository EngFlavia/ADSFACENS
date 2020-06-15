/*
 Exercício 2 - MédioEnunciado:Faça um programa que receba na função main() um 
número inteiro e o envie para a função calcular Quadrado. A função calcular 
Quadrado fará a multiplicação do númerorecebido por ele mesmo e depois retornará o resultado 
para afunçãoqueachamou.Ao final deverá ser mostrado o resultado do quadrado d
onúmero na função principal.
 */
package correcaoex02.java;
import java.util.Scanner;

public class Correcaoex02Java {
   
    public static void main(String[] args) {
        
        int recebido;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Forneça um valor");
        recebido = ler.nextInt();
        
        System.out.println("O quadrado do valor fornecido é: " + CalcularQuadrado(recebido));
          
    }
    
    public static int CalcularQuadrado(int recebido){
        
        return recebido * recebido;
        
    }
    
}
