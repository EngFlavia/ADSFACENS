
package correcaoex03;

import java.util.Scanner;

public class Correcaoex03 {

    public static void main(String[] args) {
        int num1, num2, num3, num4, media;

        num1 = consistencia();
        num2 = consistencia();
        num3 = consistencia();
        num4 = consistencia();

        media = (num1 + num2 + num3 + num4) / 4;

        if (media > 5) {
            System.out.println("Aprovado! Média: " + media);
        } else if (media < 3) {
            System.out.println("Reprovado! Média: " + media);
        } else if (media < 5) {
            System.out.println("Recuperação! Média: " + media);
        }
    }

    static int consistencia() {
        Scanner scan = new Scanner(System.in);
        int nota = 0;
        return 0;
    }
    do{
        System.out.println("Digite uma nota maior ou igual a 0 e menor/igual a 10!");
        nota = scan.nextInt();
        } while (nota < 0 || nota > 10);
        return nota;

}    
