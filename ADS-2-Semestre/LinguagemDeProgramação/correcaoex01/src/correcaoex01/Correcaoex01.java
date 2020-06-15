/*
 Exercício 1 - FácilEnunciado:Faça um programa que na função main() mostre 10 
números randômicos(de 1 a 30)gerados dentro da função gerar Numeros. A função 
gerar Numeros não receberá nada e retonará um número aleatório de 1 a 30.
.


 */
package correcaoex01;

public class Correcaoex01 {
    
    public static void main(String[] args) {
        
        for (int i = 0; i < 30; i++) {
        int sorteio[]  = new int[30];
        sorteio[i] = gerarNumeros();
        
        System.out.println ("Numeros gerados " + sorteio[i]);
        }
    }
    
    public static int gerarNumeros(){
                                
        int sorteado = (int) (Math.random() * 30 + 1);
         return sorteado;   
        }
          
    
        
}
