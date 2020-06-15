/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto2funcaoreferencia;

/**
 *
 * @author Flavia Florentino
 */
public class Projeto2funcaoreferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       // char letra= 'A'; //65
        int valDecLetra;
        String texto = "Vocês estão quietos";
        char textoChar[] = texto.toCharArray();
        for (int i = 0; i < textoChar.length; i++) {
            valDecLetra = (int) textoChar[i];
            System.out.printf("\nValor dec %d - %c caracter", valDecLetra, textoChar[i]);
        }
        trocar(textoChar);
        for (int i = 0; i < textoChar.length; i++) {
               System.out.printf("%c",textoChar[i]);
        }
    }//fim da funÃ§Ã£o main()
    
    static void trocar(char v[])
    {
        for (int i = 0; i < v.length; i++)
        {
            if (v[i] == 'o')  //97
            {
                v[i] = 'u';  //99  - a b c //'a'+ 2
            }
         }
    }
    
}//fim da classe