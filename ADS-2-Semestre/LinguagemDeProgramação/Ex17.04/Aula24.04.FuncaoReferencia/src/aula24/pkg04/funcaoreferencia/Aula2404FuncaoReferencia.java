
package aula24.pkg04.funcaoreferencia;


public class Aula2404FuncaoReferencia {

    
    public static void main(String[] args) {
      int valDeLetra;
      String texto = "Vocês estão quietos";
      char textoChar [] = texto.toCharArray();
      
      for (int i = 0; i < textoChar.length; i++){
          
          valDeLetra = (int) textoChar[i];
          System.out.printf("\nValor dec %d - %c caracter"+ valDeLetra+ textoChar);
          
        }
      
      trocar (textoChar);
      
        for (int i = 0; i < textoChar.length; i++) {
            System.out.printf("%c"+ textoChar[i]);
        } 
    }   
    
    static void trocar (String v[]){
            for (int i = 0; i < v.length; i++) {
                if(v[i] == "o"){
                    v[i] = "u";
                }
                
            }
        }
}
