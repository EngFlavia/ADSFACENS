package projetocalculomateriais;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculoAzulejo extends CalculoMetragem {

    private String modelo;

    private double metragemVendidoPorCaixa;
    private double quantidadeCaixasFinal;
    private double quantidadeRejunteFinal;
    private double metragemTotalComprada;

    Scanner ler = new Scanner(System.in);

    public void ExecutaPassoParaCalcularAzulejo() {
        try {
            System.out.println("Forneça o modelo (Nome / código) do seu acabamento: ");
            setModelo(ler.nextLine());

            System.out.println("Quantos metros são fornecidos por caixa: ");
            setMetragemVendidoPorCaixa(ler.nextDouble());

            RealizarCalculoAzulejo();

        } catch (InputMismatchException erro) {
            System.out.println("Erro de tipo.");
        }
    }

    private void RealizarCalculoAzulejo() {

        quantidadeCaixasFinal = (this.getMetragemParede() * 1.2) / getMetragemVendidoPorCaixa();

        setQuantidadeCaixasFinal(Math.ceil(quantidadeCaixasFinal));

        quantidadeRejunteFinal = (this.getMetragemParede() * 1.2) / 3;
        setQuantidadeRejunteFinal(Math.ceil(quantidadeRejunteFinal));

        setMetragemTotalComprada(quantidadeCaixasFinal * metragemVendidoPorCaixa);

    }

    public String getModelo() {

        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getMetragemVendidoPorCaixa() {

        return metragemVendidoPorCaixa;
    }

    public void setMetragemVendidoPorCaixa(double metragemVendidoPorCaixa) {
        this.metragemVendidoPorCaixa = metragemVendidoPorCaixa;
    }

    public double getQuantidadeCaixasFinal() {
        return quantidadeCaixasFinal;
    }

    public void setQuantidadeCaixasFinal(double quantidadeCaixasFinal) {
        this.quantidadeCaixasFinal = quantidadeCaixasFinal;
    }

    public double getQuantidadeRejunteFinal() {

        return quantidadeRejunteFinal;
    }

    public void setQuantidadeRejunteFinal(double quantidadeRejunteFinal) {
        this.quantidadeRejunteFinal = quantidadeRejunteFinal;
    }

    public double getMetragemTotalComprada() {

        return metragemTotalComprada;
    }

    public void setMetragemTotalComprada(double metragemTotalComprada) {
        this.metragemTotalComprada = metragemTotalComprada;
    }

}
