package controlesala;
import java.util.Scanner;


public class ControleSala {
    
    public int tam;
    public static String nome;
    public static double nota;
    public static double media;
    
    public static void main(String[] args) {
        
        Alunos [] a = new Alunos[5];
                 
        for (int i = 0; i < 5 ; i++) {
                        
            Scanner ler = new Scanner(System.in);
        
            System.out.println("Forneça o nome: ");
            nome = ler.nextLine();
        
            System.out.println("Forneça a nota: ");
            nota = ler.nextDouble();
            a[i] = new Alunos (nome,nota);
                        
            //n[i].SomatoriaNota();
            System.out.println("\n");
            
            
        }
                
        for (int i = 0; i < 5 ; i++) {  
            System.out.println( a[i].detalhes());
            media+=a[i].getNota();
                        
        } 
        media /= 5;
        
        System.out.println("A média final da sala é : " +media);
        
    }
  
}
