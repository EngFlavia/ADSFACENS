package pato;

public class Voar_Foguete implements Padrao_Voaveis{
	
	private double velocidade;
	
	public Voar_Foguete()
	{
			
	}
	
	public String voar() {
		return "Voando como um foguete. Velocidade: " + getVelocidade();		
	}

	public double getVelocidade() {
		return velocidade = 1000;
	}	
}
