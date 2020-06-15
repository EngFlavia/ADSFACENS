
package jogobichinhovirtual;
         
public class JogoBichinhoVirtual {

    public static void main(String[] args) {
        
        System.out.println("Jogo bichinho virtual \n");
        
        Tamagotchi Bichinho01 = new Tamagotchi("Quione", "biscoito", 1, "bolinha");
        
        try{
        
        System.out.println("O seu Tamagotchi é: " + Bichinho01.getNome() +
                "\nSua comida preferida é: " + Bichinho01.getComida() +
                "\nSeu peso é: " + Bichinho01.getPeso() + "KG" +
                "\nSeu brinquedo preferido é: " + Bichinho01.getEsportePreferido());
        System.out.println("\n");
        
        Bichinho01.alimentar();
        Bichinho01.alimentar();
        
        System.out.println("O seu Tamagotchi é: " + Bichinho01.getNome() +
                "\nSua comida preferida é: " + Bichinho01.getComida() +
                "\nSeu peso é: " + Bichinho01.getPeso() + "KG" +
                "\nSeu brinquedo preferido é: " + Bichinho01.getEsportePreferido());
        System.out.println("\n");
        
        Bichinho01.brincar();
        
        System.out.println("O seu Tamagotchi é: " + Bichinho01.getNome() +
                "\nSua comida preferida é: " + Bichinho01.getComida() +
                "\nSeu peso é: " + Bichinho01.getPeso() + "KG" +
                "\nSeu brinquedo preferido é: " + Bichinho01.getEsportePreferido());
        System.out.println("\n");
       
    }
        catch (Exception erro){
            System.out.println("ERRO" + erro.getMessage());
        }
    }
}
