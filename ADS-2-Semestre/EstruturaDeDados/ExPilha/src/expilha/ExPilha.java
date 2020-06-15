package expilha;

public class ExPilha {

    int pilha[];
    int topo;
    
    public void criar(int tamanho){
       pilha = new int [tamanho];
       topo = -1;          
    }
    
    public void empilhar(int elemento){
        
        if(verificaCheio()){ //verifica se é true por natureza
            System.out.println("Pilha Cheia");
        }else {       
        topo ++;
        pilha[topo] = elemento;
        System.out.println("Empilhei: " + pilha[topo]);
        }
    }
    
       public int desempilhar(){
       int elemento = 0;       
       if(verificaVazio() == true){
          System.out.println("Desempilhei: Pilha Vazia"); 
       } else{
        elemento = pilha[topo];
        pilha[topo] = 0;
        topo--;
        System.out.println("Desempilhei: " + elemento);
       }       
       return elemento;
    }

    
    public boolean verificaCheio(){
        if(topo == pilha.length - 1){
           return true; // está cheio
           
        } else{
            return false; // não está cheio
            
        }
        
    }
    public boolean verificaVazio(){
        if (topo == -1){
            return true; // está vazia
        } else {
            return false; // não está vazia
        }        
    }
    public void mostraTopo(){
        if (verificaCheio()){
            System.out.println("Pilha Cheia - Valor de Topo: " + topo);
        } else if(verificaVazio()){
            System.out.println("Pilha Vazia - Valor do topo: " + topo);
        } else{
            System.out.println("Topo: " + pilha[topo]);
            //return pilha[topo];
        }
    }    
    
    public int imprimePilha(){
        System.out.println("---------------");
        System.out.println("Pilha atual: ");
        for(int i = 0; i < pilha.length; i++){
            System.out.printf("Pilha[%d]: %d", i, pilha[i]);
            System.out.println(" ");
        }
        System.out.println("---------------");
        return 0;
    }
 
    public static void main(String[] args) {
       
        ExPilha pilha = new ExPilha();
        pilha.criar(5);
        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.mostraTopo();
        
        pilha.mostraTopo();
        pilha.empilhar(30);
        pilha.empilhar(40);
        pilha.empilhar(50);
        pilha.empilhar(60);
        pilha.desempilhar();
        pilha.desempilhar();
        pilha.desempilhar();
        pilha.desempilhar();
        pilha.desempilhar();
        pilha.desempilhar();
        
        
    }    
    
}
