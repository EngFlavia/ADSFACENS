package apparquivotexto1prof;

import java.io.*; //contém as classe para se trabalhar com File Input Output
import java.util.Scanner;

public class AppArquivoTexto1Prof {

  
    public static void main(String[] args) {
          gravarArquivo();//chamando a função de escrever no arquivo
        leituraArquivo();//chamada a função de ler o arquivo
    
    } //fim da main()
    
    static void  gravarArquivo()
    {
        try
        {
           /*File arquivoN = new File("C:\\Users\\Dell Vostro\\Desktop\\fichamedica.txt"); 
            if (!arquivoN.exists())
            {
                arquivoN.createNewFile();
            }
            else
                System.out.println("Arquivo existe");
            */
            Scanner leia = new Scanner(System.in);
            String nomearquivo;
            System.out.println("Qual o nome do arquivo ");
            nomearquivo= leia.nextLine();
            PrintWriter arqGravar = new PrintWriter("C:\\Users\\Dell Vostro\\Desktop\\"+nomearquivo+".txt"); 
            String nome, cidade;
            System.out.println("Informe seu nome: ");
            nome= leia.nextLine();
            System.out.println("Informe sua cidade: ");
            cidade = leia.nextLine();
            float valor= 8000;
            arqGravar.println("--------------------------");
            arqGravar.println("|    Cadastro            |");
            arqGravar.println("--------------------------");
            arqGravar.printf("Nome: %s \n", nome);
            arqGravar.printf("Cidade: %s \n", cidade);
            arqGravar.printf("Valor %.2f \n", valor);
            arqGravar.close();
        }
        catch (IOException erro )
        {
            System.out.println("Erro na criação do arquivo ");
        }
        
    }//fim da função gravarArquivo
    
    static void leituraArquivo()
    {
        try
        {
            //fichamedica.txt
            FileReader objLerArq = new FileReader("fichamedica.txt");
            BufferedReader arqLido = new BufferedReader( objLerArq); 
            String linha=  arqLido.readLine();
            while (linha != null )
            {
                System.out.printf("%s \n", linha);
                linha = arqLido.readLine();
            }
            objLerArq.close();
        }
        catch(IOException erro)
        {
            System.out.println("Erro de arquivo");
        }
    }//fim da função leitura
    
    
}
