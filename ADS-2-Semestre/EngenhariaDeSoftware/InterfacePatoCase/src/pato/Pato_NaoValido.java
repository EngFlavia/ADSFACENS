package pato;

public class Pato_NaoValido extends Pato {

	public Pato_NaoValido()
	{
		setComportamento(new Nao_Voa());		
	}
	
	public String mostrar() {
		return "Pato não valido.";
	}
        
        @Override
        public String nadar(){
            return "não nado";
        }
	
}
