package engsoft;

public class Pato_Borracha extends Pato {

	public Pato_Borracha()
	{
		setComportamento(new Nao_Voa());		
	}
	
	public String mostrar() {
		return "Olá, eu sou de Boarracha.";
	}
	
}
