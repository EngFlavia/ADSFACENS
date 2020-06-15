package pato;

public class Pato_Ruivo extends Pato implements Padrao_Grasnar{

	public Pato_Ruivo()
	{
		setComportamento(new Voaveis_Asa());		
	}
	
	public String mostrar() {
		return "Eu sou o Pato Ruivo." ;
	}

	public String grasnar() {
		// TODO Auto-generated method stub
		return 	"Que-Que.";
	
	}

}
