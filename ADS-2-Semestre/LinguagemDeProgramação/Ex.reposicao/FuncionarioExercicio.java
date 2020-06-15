package linguagemdeprogramacao.ex.pkg08.pkg04.pkg20;
import java.util.Scanner;


public class FuncionarioExercicio {
    
    private String nome;
    private String dataDeAniversario;
    private String cargo;
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeAniversario() {
        return dataDeAniversario;
    }

    public void setDataDeAniversario(String dataDeAniversario) {
        this.dataDeAniversario = dataDeAniversario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public FuncionarioExercicio(String nome, String dataDeAniversario, String cargo){
        setNome(nome);
        setDataDeAniversario(dataDeAniversario);
        setCargo(cargo);
        
    }
    
    public void Status(){
        System.out.println("\n\nNome: "+ nome +"\nData de Nascimento: " + dataDeAniversario + "\nCargo: " + cargo + "\n");
        
    }
    
}
