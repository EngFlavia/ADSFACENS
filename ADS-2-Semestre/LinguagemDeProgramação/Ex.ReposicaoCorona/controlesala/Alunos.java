package controlesala;

import java.util.Scanner;


public class Alunos {
    
    private String nome;
    private double nota;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    
    public Alunos (String nome, double nota){
        
        setNome(nome);
        setNota(nota);      
                      
    }
    
   public String detalhes() {
        return "Nome : " + nome + "\nnota : " + nota + "\n";
    }                 
   
 
}
 