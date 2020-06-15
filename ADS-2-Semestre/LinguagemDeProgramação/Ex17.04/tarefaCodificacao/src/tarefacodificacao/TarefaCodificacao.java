
package tarefacodificacao;
import java.util.Scanner;

//Grupo Flavia, Murilo, Nader e Bruna.
  

public class TarefaCodificacao {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        int opc;
        String frase;
         
        System.out.println("Forneça a sua frase: ");
                frase = scan.nextLine();
                                
        System.out.println("O que deseja fazer: "
                + "\n1- Criptografar"
                + "\n2 - Descriptografar");
        
        opc = scan.nextInt();
        
        
         switch (opc) {
            case 1:
                String fraseCodificada = Codificar(frase);
                System.out.println(fraseCodificada);
                break;
                
            case 2:
                String fraseDecodificada = Decodificar(frase);
                System.out.println(fraseDecodificada);
                break;
                
            default:
                System.out.println("Finalizado.");
        }

    }
    
    public static String Codificar(String frase){
        
        char Array [] = frase.toCharArray();
        String fraseAux = "";
        
        for (int i = 0; i < Array.length; i++) {
              
            fraseAux +=Codificador(Array[i]);
        }
         
        return fraseAux;
        
    }
    
    private static char Codificador (char cod){
        return (char) ((int)cod+3);
        
    }
    
    public static String Decodificar(String frase){
        
        char Array [] = frase.toCharArray();
        String fraseAux = "";
        
        for (int i = 0; i < Array.length; i++) {
              
            fraseAux +=Decodificador(Array[i]);
        }
         
        return fraseAux;
        
    }
    
    private static char Decodificador (char cod){
        return (char) ((int)cod-3);
        
    }
}
