package pato;
import java.util.Scanner;

public class Main {
     public static int escolhaPato;
     public static int escolhaVelocidade;

	public static void main(String[] args) {
            
            Scanner ler = new Scanner(System.in);
            
            System.out.println("Escolha o seu pato \n1- Pato de borracha\n2- Pato Bravo\n3- Pato Ruivo\n");
            escolhaPato = ler.nextInt();
            
		Pato pt = null;//new Pato_Ruivo();
                
                switch(escolhaPato)
                {
                    case 1:
                        pt = new Pato_Borracha(); 
                        break;
                    case 2:
                        pt = new Pato_Bravo();
                        break;
                    case 3:                                                                   
                        pt = new Pato_Ruivo();                                   
                        break;                      
                    default:
                        pt = new Pato_NaoValido();
                        break;

                }
                
		System.out.println(pt.mostrar());
		System.out.println(pt.nadar());
		System.out.println(pt.comportamento_pato());
		
		//pt.setComportamento(new Voar_Foguete());
		
		//System.out.println(pt.comportamento_pato());
                System.out.println("\nDeseja:\n1 - Pausar o pato\n2 - Acelerar o Pato\n3 - Ligar o turbo no Pato\n4 - Manter a velocidade atual\n");
                escolhaVelocidade = ler.nextInt();
                
                switch(escolhaVelocidade)
                {
                    case 1:
                        pt.setComportamento(new Nao_Voa()); 
                        break;
                    case 2:
                        pt.setComportamento(new Voar_acelerado()); 
                        break;
                    case 3:                                                                   
                        pt.setComportamento(new Voar_Foguete());                                   
                        break;                      
                    default:
                        pt.setComportamento(new Voaveis_Asa()); 
                        break;
                }
                System.out.println(pt.mostrar());
		System.out.println(pt.nadar());
                System.out.println(pt.comportamento_pato());
                
	}

}
