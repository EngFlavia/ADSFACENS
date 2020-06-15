
package apparquivotexto1;
import java.io.*;
import java.util.Scanner;

public class AppArquivoTexto1 {

   
    public static void main(String[] args) {
         String caminho = gravarArquivo();
         leituraArquivo(caminho);
    }
    


    static String gravarArquivo() {
        String nome;
        String cidade;
        float valor = 8000;
        String caminho = "";
        try {
            Scanner ler = new Scanner(System.in);
            String nomearquivo;
            System.out.println("Qual o nome do arquivo: ");
            nomearquivo = ler.nextLine() + ".txt";
            //"C:\\Users\\Flavia Florentino\\Desktop\\"+nomearquivo
            caminho = "C:\\Users\\Flavia Florentino\\Desktop\\ " + nomearquivo;
            PrintWriter arqGravar = new PrintWriter(caminho);
            
            System.out.println("Informe seu nome: ");
            nome = ler.nextLine();
            System.out.println("Informe sua cidade: ");
            cidade = ler.nextLine();
            
            arqGravar.println("------------------------");
            arqGravar.println("|       Cadastro       |");
            arqGravar.println("------------------------");
            arqGravar.printf("Nome: %s \n", nome);
            arqGravar.printf("Cidade: %s \n", cidade);
            arqGravar.printf("Valor: %.2f \n", valor);
            arqGravar.println("------------------------");
            arqGravar.close();

        } catch (IOException erro) {
            System.out.println("Erro: " + erro.getMessage());
        }
        
        return caminho;
    }
    
    static  void leituraArquivo(String caminho){
        try {
            
        FileReader objLerArq = new FileReader (caminho);
        BufferedReader arqLido = new BufferedReader(objLerArq);
        String linha = arqLido.readLine();
        
        while (linha != null){
            System.out.printf("%s \n", linha);
            linha = arqLido.readLine();
            
        }
        
         }
        catch ( IOException erro){
            System.out.println("Erro de arquivo");
        }
    }
    static void gerarArquivo(){
        System.out.println("Qual o nomer do arquivo");
               
    }
}