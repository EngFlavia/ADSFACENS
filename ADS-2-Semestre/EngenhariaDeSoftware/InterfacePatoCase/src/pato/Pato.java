package pato;

public abstract class Pato {
	
	protected Padrao_Voaveis comportamento_pato;

	abstract String mostrar();
	
	public String nadar()
	{
		return "Pato Nadando.";		
	}	
	
	public void setComportamento(Padrao_Voaveis padrao )
	{
		comportamento_pato = padrao;		
	}
	
	public String comportamento_pato()
	{		
		return comportamento_pato.voar();		
	}
}
