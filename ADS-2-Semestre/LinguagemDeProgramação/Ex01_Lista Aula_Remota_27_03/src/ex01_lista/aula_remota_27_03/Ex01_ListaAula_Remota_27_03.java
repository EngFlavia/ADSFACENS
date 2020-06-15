package ex01_lista.aula_remota_27_03;
import java.util.Scanner;


public class Ex01_ListaAula_Remota_27_03 {

    public static float n1;
    public static float n2;
    public static String operacao;
        
    public static void main(String[] args) {
        try{
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Forneça o primeiro valor ");
        n1 = Integer.parseInt(entrada.nextLine());
        
        System.out.println("Forneça o primeiro valor ");
        n2 = Integer.parseInt(entrada.nextLine());
        
        System.out.println("Digite o numero de qual operação deseja executar:"
              + "\n1 - SOMA \n2 - SUBTRACAO \n3 - MULTIPLICACAO \n4 - DIVISÃO");
        operacao = entrada.nextLine();

               
        switch (operacao) {
            case "1":
                System.out.println("O resultado é : " + soma( n1, n2));
                break;
            case "2":
                System.out.println("O resultado é : " + subtracao( n1, n2));
                break;
            case "3":
                System.out.println("O resultado é : " +multiplicacao( n1, n2));
                break;
            case "4":
                System.out.println("O resultado é : " +divisao(n1, n2));
                break;
            default:
                
                System.out.println("Opção de operação invalida");
    }            
        }
        catch (ArithmeticException erro){
            System.out.println("Erro de divisão por zero"+ erro.getMessage()); 
                }
          catch(Exception erro){
            System.out.println("Erro de entrada de valores "+ erro.getMessage());
          }
        finally {
            System.out.println("Finalizado o programa");
           
        }
        
    }
    public static float soma(float n1, float n2 ){
               
        return n1+n2;
    }
     public static float subtracao(float n1, float n2 ){
               
        return n1-n2;
    }
      public static float multiplicacao(float n1, float n2 ){
               
        return n1*n2;
    }
       public static float divisao(float n1, float n2 ){
               
        return n1/n2;
    }
}
