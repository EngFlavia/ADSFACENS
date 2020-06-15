package projetocalculomateriais;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OrcamentoAzulejo extends CalculoAzulejo {

    private double CustoAzulejo;
    private double CustoFinalAzulejo;
    private double CustoRejunte;
    private double CustoFinalRejunte;
    Scanner ler = new Scanner(System.in);

    public OrcamentoAzulejo() {

    }

    public void ExecutaPassoParaOrcarAzulejo() {
        try {
            System.out.println("Qual o custo por m2 do azulejo?");
            CustoAzulejo = ler.nextFloat();
            System.out.println("Qual o custo por kg do rejunte?");
            CustoRejunte = ler.nextFloat();

            getCustoFinalAzulejo();
            getCustoFinalRejunte();
            RealizarCalculoOrcamentoAzulejo();
        } catch (InputMismatchException erro) {
            System.out.println("Erro de tipo, digite um número.");
        }
    }

    private void RealizarCalculoOrcamentoAzulejo() {
        CustoFinalAzulejo = this.getMetragemTotalComprada() * CustoAzulejo;

        CustoFinalRejunte = this.getQuantidadeRejunteFinal() * CustoRejunte;
        System.out.println(CustoFinalAzulejo);
        System.out.println(CustoFinalRejunte);
    }

    public double getCustoAzulejo() {

        return CustoAzulejo;
    }

    public void setCustoAzulejo(float CustoAzulejo) {
        this.CustoAzulejo = CustoAzulejo;
    }

    public double getCustoFinalAzulejo() {

        return CustoFinalAzulejo;
    }

    public void setCustoFinalAzulejo(float CustoFinalAzulejo) {
        this.CustoFinalAzulejo = CustoFinalAzulejo;
    }

    public double getCustoRejunte() {

        return CustoRejunte;
    }

    public void setCustoRejunte(float CustoRejunte) {
        this.CustoRejunte = CustoRejunte;
    }

    public double getCustoFinalRejunte() {

        return CustoFinalRejunte;
    }

    public void setCustoFinalRejunte(float CustoFinalRejunte) {
        this.CustoFinalRejunte = CustoFinalRejunte;
    }

}
