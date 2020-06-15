/*
4)   Tabela Nutricional  (Prova)Faça um programa que monitore as quantidades de
calorias consumidas nos 7 dias da semana.  O  programa  deverá  receber  as  
quantidades  em  gramas  de  proteínas  e carboidrato consumidos por dia, 
conforme o exemplo ilustrado abaixo: Exemplo:             
Após as  entradas  dos  valores  consumidos  na  semana  o  programa  mostrará 
o  total consumida  de  carboidratos  e  de  proteínas.     
Ao  final  do  programa  deverá  exibir  a quantidade total de Calorias 
Consumidas. Para saber a quantidade de calorias deve-se multiplicar o total 
consumido de carboidratos por 4 e o de proteínas por 3
*/
package ex03_listaaula_remota_27_03;
import java.util.Scanner;

public class Ex03_ListaAula_Remota_27_03 {
    

    public static void main(String[] args) {
        
        try {
        
            int carboidrato []  = new int[7];
            int proteina[] = new int[7];
            int somaCarboidrato = 0;
            int somaProteina = 0;
            int calorias;

            for (int i = 0; i < 7 ; i++) {

                Scanner ler = new Scanner(System.in);

                System.out.println("Total de Carboidratos consumidos no " +(i+1)+ " dia");
                carboidrato [i] = ler.nextInt();

                System.out.println("Total de Proteínas consumidas no " + (i+1) + " dia");
                proteina [i] = ler.nextInt();

                somaCarboidrato = somaCarboidrato + carboidrato [i];
                somaProteina = somaProteina + proteina [i];

            }

            calorias = (somaCarboidrato * 4) + (somaProteina * 3);

            System.out.println("O total de calorias consumidas na semana foi de : " + calorias);

        }
        catch(Exception erro){
            System.out.println("Erro de entrada de valores "+ erro.getMessage());
          }
    }
}
