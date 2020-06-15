/*
 Desenvolver um programa contendo uma função para calcular o valor da potência 
de um número qualquer, ou seja, ao ser passado para a função o valor da base e 
do expoente ela deverá calcular e retornar o valor resultante da exponenciação. 
O resultado deve ser apresentado na função principal.  Por exemplo, se for feita
a chamada a função calculaPotencia (2,3) ela deverá retornar o valor 8 para 
função principal.
 */

package ex02.funcoesaula.pkg17.pkg04;
import java.util.Scanner;

public class Ex02FuncoesAula1704 {

     public static double base;
     public static double expoente;
     public static double resultado;
    
     static Scanner ler = new Scanner (System.in);

    public static void main(String[] args) {
        
        fornecerValor();
        
        calcularExponenciacao();
        
        System.out.println("O resultado de " + base + " elevado a exponencial " + expoente + " é : " + resultado );
        
    }
    
    public static double fornecerValor(){
        
        System.out.println("Forneça o valor de base que deseja calcular ");
        base = ler.nextDouble();
                
        System.out.println("Forneça o valor do expoente que deseja calcular ");
        expoente = ler.nextDouble();
        
        return 0;
    }
    
    public static double calcularExponenciacao(){
                
        return (Math.pow(base , expoente));
    }
    
}
