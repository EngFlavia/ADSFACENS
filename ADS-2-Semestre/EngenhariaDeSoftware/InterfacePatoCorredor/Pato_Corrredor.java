package engsoft;

public class Pato_Corrredor extends Pato implements  Padrao_Grasnar{
   
    public Pato_Corrredor()	
	{
		setComportamentoCorrida(new Correr());		
	}
	
	public String mostrar() {		
		return "Eu sou o Pato Corredor.";
	}

	public String grasnar() {
		return "Que-Que. Grrrrrrrrr.";
	}
}
