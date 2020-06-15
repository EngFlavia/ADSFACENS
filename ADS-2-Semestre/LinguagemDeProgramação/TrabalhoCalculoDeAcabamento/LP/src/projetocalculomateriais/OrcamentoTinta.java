package projetocalculomateriais;

import java.util.InputMismatchException;

public class OrcamentoTinta extends CalculoPintura {

    private double CustoLataoTinta;
    private double CustoFinalTinta;

    public void OrcamentoPintura() {

    }

    public void ExecutaPassoParaOrcarTinta() {
        try {
            System.out.println("Qual o valor por latão de tinta que deseja comprar: ");
            CustoLataoTinta = ler.nextDouble();

            RealizarCalculoOrcamentoAzulejo();
        } catch (InputMismatchException erro) {
            System.out.println("Erro de tipo, digite um número.");
        }
    }

    private void RealizarCalculoOrcamentoAzulejo() {
        CustoFinalTinta = this.getTotalLatoesComprar() * CustoLataoTinta;
    }

    public double getCustoLataoTinta() {
        return CustoLataoTinta;
    }

    public void setCustoLataoTinta(double CustoLataoTinta) {
        this.CustoLataoTinta = CustoLataoTinta;
    }

    public double getCustoFinalTinta() {
        return CustoFinalTinta;
    }

    public void setCustoFinalTinta(double CustoFinalTinta) {
        this.CustoFinalTinta = CustoFinalTinta;
    }

}
