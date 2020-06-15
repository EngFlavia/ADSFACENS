package aula24.pkg04.arrayvetor;
import java.util.Scanner;

public class Aula2404ArrayVetor {

    public static void main(String[] args) {
       int vetor[] = new int[6];
       Scanner ler = new Scanner(System.in);
       
        System.out.println("Informe os valores");
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = ler.nextInt();
        }
        
        for (int i = 0; i < 6; i++) {
            System.out.printf("\nVetor [%d] = %d", i , vetor[i]);
            
        }
    }
    
    
}
