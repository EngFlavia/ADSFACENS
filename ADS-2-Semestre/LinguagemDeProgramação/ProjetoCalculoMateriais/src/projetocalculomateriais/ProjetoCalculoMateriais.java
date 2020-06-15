package projetocalculomateriais;

import java.util.Scanner;


public class ProjetoCalculoMateriais {
    
    public static void main(String[] args) {
             
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Programa para calculo e orçamento de materiais de acabamento ");
        System.out.println("Qual acabamento deseja calcular: \n1 - Azulejo e acabamentos frios \n2 - Pintura");
        int escolhaCliente = ler.nextInt();
             
        
        
        
        
        if (escolhaCliente == 1) {
            
            OrcamentoAzulejo orcamentoAzulejo = new OrcamentoAzulejo();
            orcamentoAzulejo.ExecutaPassoParaCalcularParede();
            orcamentoAzulejo.ExecutaPassoParaCalcularAzulejo();
            orcamentoAzulejo.ExecutaPassoParaOrcarAzulejo();
            
            System.out.printf("\n\nAzulejos");    
            System.out.printf("\n\n\nPara os " + orcamentoAzulejo.getMetragemParede() + "m2 a serem cobertos considerando um acrescimo de 20 porcento de perda, serão necessários: " );
            System.out.printf("\nTotal de "+orcamentoAzulejo.getMetragemTotalComprada()+ " m2 de azulejos a serem comprados: " );
            System.out.printf("\nTotal de caixas a serem compradas: "+orcamentoAzulejo.getQuantidadeCaixasFinal()+" do modelo "+ orcamentoAzulejo.getModelo());
            System.out.printf("\nCusto final de azulejos a serem comprados: R$ " + orcamentoAzulejo.getCustoFinalAzulejo() );
            System.out.printf("\n\nRejunte");
            System.out.printf("\nTotal de "+orcamentoAzulejo.getQuantidadeRejunteFinal()+"Kg de rejunte a serem comprados: ");
            System.out.printf("\nCusto final de rejunte a ser comprapo: "+orcamentoAzulejo.getCustoFinalRejunte());
            System.out.println("\n===============================================");
            System.out.printf("Custo final da compra: R$ "+ (orcamentoAzulejo.getCustoFinalAzulejo( )+orcamentoAzulejo.getCustoFinalRejunte()+"\n"));
            
        } else if (escolhaCliente == 2){
            
            OrcamentoTinta orcamentoPintura = new OrcamentoTinta();
            orcamentoPintura.ExecutaPassoParaCalcularParede();
            orcamentoPintura.ExecutaPassoParaCalcularPintura();
            orcamentoPintura.ExecutaPassoParaOrcarTinta();
            
            OrcamentoTinta orcamentoTinta = new OrcamentoTinta();
            System.out.printf("\n\nTinta");
            System.out.printf("\nPara os "+ orcamentoPintura.getMetragemParede() +"m2 a serem cobertos considerando um acrescimo de 15 porcento de perda, serão necessários: "  );
            System.out.printf("\nTotal de "+orcamentoPintura.getTotalTintaComprar()+" litros de tinta a serem comprados: " );
            System.out.printf("\nTotal de latões a serem compradas: "+orcamentoPintura.getTotalLatoesComprar()+" com "+orcamentoPintura.getTamanhoLatao()+" litros de tinta por latão");
            System.out.println("\n===============================================");
            System.out.printf("\nCusto final de tinta a ser comprada: R$ "+ orcamentoPintura.getCustoFinalTinta()+"\n");
            
        }else{
            System.out.println("Esta não é uma opção válida");
        }
        
    }
    
}
