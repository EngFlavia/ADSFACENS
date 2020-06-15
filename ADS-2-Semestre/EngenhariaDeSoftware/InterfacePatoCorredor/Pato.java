package engsoft;

public abstract class Pato {
	
	protected Padrao_Voaveis comportamento_pato;
        
        protected Padrao_Corredor corrida_pato;

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
            if (comportamento_pato != null)                        
                return comportamento_pato.voar();		

            if (corrida_pato != null) 
                return corrida_pato.correndo();

            return "Pato sem comportamento";
	}
        
        public void setComportamentoCorrida(Padrao_Corredor padrao )
	{
            corrida_pato = padrao;		
	}
	
	
}
