package engsoft;

public class Voar_Foguete implements Padrao_Voaveis{
	
	private double velocidade;
	
	public Voar_Foguete()
	{
		velocidade = 1000;	
	}
	
	public String voar() {
		return "Voando como um foguete. Velocidade: " + getVelocidade();		
	}

	public double getVelocidade() {
		return velocidade;
	}	
}
