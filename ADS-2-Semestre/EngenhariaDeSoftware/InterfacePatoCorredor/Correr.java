package engsoft;


public class Correr implements Padrao_Corredor{
    
    private double velocidade;
	
	public Correr()
	{
		velocidade = 10;	
	}
	
	public String correndo() {
		return "Correndo. Velocidade: " + getVelocidade();		
	}

	public double getVelocidade() {
		return velocidade;
	}	
}
