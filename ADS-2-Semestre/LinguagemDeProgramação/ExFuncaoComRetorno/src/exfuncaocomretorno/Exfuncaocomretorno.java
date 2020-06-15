
package exfuncaocomretorno;

public class Exfuncaocomretorno {

    public static void main(String[] args) {
        System.out.println(gerarNumero()); //ela precisa retornar um número de 1 a 10
        int n1 = gerarNumero();
        int n2 = gerarNumero();
        int n3 = gerarNumero();
        System.out.printf("\nOs valores sorteados foram %d %d %d ", n1 , n2, n3);
        
    }
    
    public static int gerarNumero(){ //funcao com retorno
      
        int sorteio;
        sorteio = (int)(Math.random() * 60+1);
        return sorteio; // retorno de um valor inteiro
    }
}
