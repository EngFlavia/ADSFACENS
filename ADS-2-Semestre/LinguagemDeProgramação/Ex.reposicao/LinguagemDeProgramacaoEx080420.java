package linguagemdeprogramacao.ex.pkg08.pkg04.pkg20;
import java.util.Scanner;

import javafx.animation.Animation;

public class LinguagemDeProgramacaoEx080420 {
    
    private static String nome;
    private static String dataDeAniversario;
    private static String cargo;

    public static void main(String[] args) {
                      
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Forneça o nome: ");
        nome = ler.nextLine();
        
        System.out.println("Forneça a data de nascimento: ");
        dataDeAniversario = ler.nextLine();
        
        System.out.println("Forneça o cargo: ");
        cargo = ler.nextLine();
              
        FuncionarioExercicio Funcionario01 = new FuncionarioExercicio(nome,dataDeAniversario,cargo);
        Funcionario01.Status();
        
    }

   
    
}
