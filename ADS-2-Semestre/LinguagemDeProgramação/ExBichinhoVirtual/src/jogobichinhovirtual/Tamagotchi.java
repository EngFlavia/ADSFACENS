
package jogobichinhovirtual;

public class Tamagotchi {
    
    private String nome;
    private String comida;
    private int peso;
    private String esportePreferido;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getEsportePreferido() {
        return esportePreferido;
    }

    public void setEsportePreferido(String esportePreferido) {
        this.esportePreferido = esportePreferido;
    }
    
    public Tamagotchi (String nomeU, String comidaU,int pesoU, String esportePreferidoU){
        this.nome = nomeU;
        this.comida = comidaU;
        this.peso = pesoU;
        this.esportePreferido = esportePreferidoU;
        
    }
    
    public void alimentar (){
        ++ peso;
    }
    
    public void brincar (){
        -- peso;
        
    }
}
