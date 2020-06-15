package aula4;
import java.util.Scanner;
public class Aula4 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int megasena [][]= new int [4][6];
        int i,j;
       
        
        System.out.println("MEGA-SENA");
        for (i = 0; i < 4; i++)   /*ou posso usar i<=3;  */  {
                       
            for (j = 0; j < 6; j++) /*ou posso usar i<notas[i].length;  */{
                
               megasena[i][j]= (int) (Math.random()*60)+1;
                             
            }
        }
                
        for (i = 0; i < 4; i++)   /*ou posso usar i<=3;  */  {
               System.out.println("");
               System.out.printf("\n Sorteio %d \n", i + 47);
               System.out.println("");
            
            for (j = 0; j < 6; j++) /*ou posso usar i<notas[i].length;  */{
              
                System.out.printf("%d \t  ", megasena[i][j]);
            }
        }
    }
    
}