package exemplofuncaocomretornoeparametros;
import java.util.Scanner;

public class ExemploFuncaoComRetornoEParametros {

    
    public static void main(String[] args) {
        
        float n1, n2, n3, media;
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a primeira nota");
        n1 = ler.nextFloat();
        System.out.println("Informe a segunda nota");
        n2 = ler.nextFloat();
        System.out.println("Informe a terceira nota");
        n3 = ler.nextFloat();
        
        System.out.println("A média é " + calcularMedia ( n1, n2, n3 ));
         
        media  = calcularMedia ( n1, n2, n3 );  
        
          if ( media >= 5){
        
        System.out.println("APROVADO");
    }else {
            System.out.println("REPROVADO");
        }
        
        //vamos receber 3 notas
        //enviar essas notas para a função calcular Média
        //mostrar a média aritmética na função principal
    }
    
    static float calcularMedia( float nota1, float nota2, float nota3){
         
        float media;
        media = (nota1 + nota2 + nota3) / 3;
        return media;
    }
    
}
