package projetocalculomateriais;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculoMetragem {

    private double comprimentoParede;
    private double LarguraParede;
    private double comprimentoJanela;
    private double LarguraJanela;
    private double comprimentoPorta;
    private double LarguraPorta;
    private double metragemParede;
    private double metragemJanela = 0;
    private double metragemPorta = 0;
    private double metragemFinal;
    private int respostaPorta;
    private int respostaJanela;
    private boolean temPorta;
    private boolean temJanela;
    private double metragensDisconto;

    Scanner ler = new Scanner(System.in);

    public void ExecutaPassoParaCalcularParede() {
        try {
            System.out.println("Comprimento da parede em metros: ");
            String cParede = ler.next();
            setComprimentoParede(Double.parseDouble(cParede));

            System.out.println("Largura da parede em metros: ");
            String lParede = ler.next();
            setLarguraParede(Double.parseDouble(lParede));

            System.out.println("Essa parede possui uma porta? \n1-Sim \n2-Não");
            int temPortaAux = ler.nextInt();
            while (temPortaAux > 2 || temPortaAux < 1) {
                System.out.println("\nEscolha uma resposta válida: \n1-Sim \n2-Não");
                temPortaAux = ler.nextInt();
            }
            if (temPortaAux == 1) {
                temPorta = true;

                System.out.println("Comprimento da porta em metros: ");
                String cPorta = ler.next();
                setComprimentoPorta(Double.parseDouble(cPorta));

                System.out.println("Largura da porta em metros: ");
                String lPorta = ler.next();
                setLarguraPorta(Double.parseDouble(lPorta));
            }

            System.out.println("Essa parede possui uma janela? \n1-Sim \n2-Não");
            int temJanelaAux = ler.nextInt();
            while (temJanelaAux > 2 || temJanelaAux < 1) {
                System.out.println("\nEscolha uma resposta válida: \n1-Sim \n2-Não");
                temJanelaAux = ler.nextInt();
            }
            if (temJanelaAux == 1) {
                temJanela = true;

                System.out.println("Comprimento da janela em metros: ");
                String cJanela = ler.next();
                setComprimentoJanela(Double.parseDouble(cJanela));

                System.out.println("Largura da janela em metros: ");
                String lJanela = ler.next();
                setLarguraJanela(Double.parseDouble(lJanela));
            }

            RealizarCalculo();
        } catch (InputMismatchException erro) {
            System.out.println("Erro de tipo, digite um número.");
        }
    }

    private void RealizarCalculo() {
        metragemParede = getComprimentoParede() * getLarguraParede();

        if (temPorta) {

            double mporta = getComprimentoPorta() * getLarguraPorta();

            metragemParede -= mporta;

        }

        if (temJanela) {
            double mjanela = getComprimentoJanela() * getLarguraJanela();

            metragemParede -= mjanela;

        }

    }

    public double getMetragemParede() {
        return metragemParede;
    }

    public void setMetragemParede(double metragemParede) {
        this.metragemParede = metragemParede;
    }

    public double getComprimentoParede() {

        return comprimentoParede;
    }

    public void setComprimentoParede(double comprimentoParede) {
        this.comprimentoParede = comprimentoParede;
    }

    public double getLarguraParede() {

        return LarguraParede;
    }

    public void setLarguraParede(double LarguraParede) {
        this.LarguraParede = LarguraParede;
    }

    public double getComprimentoJanela() {

        return comprimentoJanela;
    }

    public void setComprimentoJanela(double comprimentoJanela) {
        this.comprimentoJanela = comprimentoJanela;
    }

    public double getLarguraJanela() {

        return LarguraJanela;
    }

    public void setLarguraJanela(double LarguraJanela) {
        this.LarguraJanela = LarguraJanela;
    }

    public double getComprimentoPorta() {

        return comprimentoPorta;
    }

    public void setComprimentoPorta(double comprimentoPorta) {
        this.comprimentoPorta = comprimentoPorta;
    }

    public double getLarguraPorta() {
        return LarguraPorta;
    }

    public void setLarguraPorta(double LarguraPorta) {
        this.LarguraPorta = LarguraPorta;
    }

    public double getMetragemPorta() {
        return metragemPorta;
    }

    public void setMetragemPorta(double metragemPorta) {
        this.metragemPorta = metragemPorta;
    }

    public double getMetragemJanela() {
        return metragemJanela;
    }

    public void setMetragemJanela(double metragemJanela) {
        this.metragemJanela = metragemJanela;
    }

    public void setMetragemFinal(double metragemFinal) {
        this.metragemFinal = metragemFinal;
    }
}
