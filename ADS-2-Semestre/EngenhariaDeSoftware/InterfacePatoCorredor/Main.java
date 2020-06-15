package engsoft;

public class Main {

	public static void main(String[] args) {
		int corrida;
                 
                Pato pr = new Pato_Ruivo();
                Pato pc = new Pato_Corrredor();
                Pato pm = new Pato_Maratonista();
                Pato pb = new Pato_Bravo();
                Pato pbo = new Pato_Borracha();
                
               
                System.out.print(pr.mostrar());
                System.out.println(pr.comportamento_pato());
                
                System.out.print(pc.mostrar());
                System.out.println(pc.comportamento_pato());
                
                System.out.print(pm.mostrar());
                System.out.println(pm.comportamento_pato());
                
                System.out.print(pb.mostrar());
                System.out.println(pb.comportamento_pato());
                
                System.out.print(pbo.mostrar());
                System.out.println(pbo.comportamento_pato());
                
                
                //System.out.println(pr.nadar());
		//System.out.println(pr.comportamento_pato());
		
		//pr.setComportamento(new Voar_Foguete());
		
		//System.out.println(pr.comportamento_pato());
                System.out.println("\nInicio da corrida\n");
                
                for (int i = 1000; i >0; i-=100) {
                    
                    if (i<=200) {
                     
                        pm.setComportamentoCorrida(new Acelerar());  
                       
                    } 
                    System.out.print(String.format("Distância para chegada %d m ", i));
                    System.out.print(pm.mostrar());
                    System.out.println(pm.comportamento_pato());
                }
                
                System.out.println("\nFIM da Corrida");
                
               
	}

}
