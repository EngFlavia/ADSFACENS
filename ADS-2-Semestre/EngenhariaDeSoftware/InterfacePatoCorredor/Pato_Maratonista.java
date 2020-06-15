package engsoft;


public class Pato_Maratonista extends Pato implements  Padrao_Grasnar{
    
    public Pato_Maratonista()	
	{
		
            setComportamentoCorrida(new Correr());		
	}
	
	public String mostrar() {		
		return "Eu sou o Pato Maratonista.";
	}

	public String grasnar() {
		return "Que-Que. Grrrrrrrrr.";
	}
}
