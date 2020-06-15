package aula4.pkg1;

import java.util.Scanner;
public class Aula41 {

    public static void main(String[] args) {
        
        float notas [][]= new float [2][3],soma,media=0;
        String disciplinas[]= new String [notas[0].length];
        
        int quatidadeDeNotas = notas[0].length - 1;
        int quantidadeDeDisciplina = notas[0].length - 1;
        int colunaDaMedia = notas[0].length - 1;
                
        System.out.println(quatidadeDeNotas);
        
        Scanner ler = new Scanner(System.in);
        
        
        
        for (int o = 0; o < quantidadeDeDisciplina; o++) {
            System.out.println("\n Informe o nome da disciplina");
            disciplinas[o]= ler.nextLine();
        }  
        //System.out.println("Os nome das disciplinas são: " + disciplinas[0] + ", " + 
         //       disciplinas[1] + " e " + disciplinas[2] + ".");/*ou soutf("Discplinas %s-%s%s",
        //discplinas[0], disciplinas[1], disciplinas[2)*/
        
        System.out.println("Faça o lançamentos das notas");
        
            
        for (int i = 0; i < quantidadeDeDisciplina; i++)   /*ou posso usar i<3;  */  {
            //System.out.printf("\nDisciplina %d", i + 1);
            System.out.printf("\n Diciplina %s ", disciplinas[i]);
            soma = 0;
            
            
            for (int j = 0; j < quatidadeDeNotas; j++) /*ou posso usar i<notas[i].length;  */{
                
                System.out.printf("\n\nInsira a nota: disciplna[%d] atividade [%d]", i+1,j+1);
                notas[i][j] = ler.nextFloat();
                soma = soma + notas[i][j];
            }
            
            media = soma/quatidadeDeNotas;
            notas[i][colunaDaMedia] = media;
        }
        
        for (int i = 0; i < quantidadeDeDisciplina; i++) {
            System.out.printf("\n A média da disciplina %s foi %.2f ", disciplinas[i], notas[i][colunaDaMedia]);
            
        }
        
    }
}