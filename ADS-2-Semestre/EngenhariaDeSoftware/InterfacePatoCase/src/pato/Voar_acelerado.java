package pato;


public class Voar_acelerado implements Padrao_Voaveis {

	private double velocidade;

	public Voar_acelerado() {
		
	}

	public String voar() {
		return "Voando como um pássaro que voa. Velocidade: "
				+ getVelocidade();
	}

	public double getVelocidade() {
		return velocidade = 20;
	}

}
