package projetocalculomateriais;

import java.util.Scanner;

public class CalculoPintura extends CalculoMetragem{

    
    private double demaos;
    private double metragemTotalPintada;
    private double rendimentoTinta;
    private double totalTintaUsada;
    private double totalTintaComprar;
    private double tamanhoLatao;
    private double totalLatoesComprar;
    
    Scanner ler = new Scanner(System.in);
    
            
    public void ExecutaPassoParaCalcularPintura(){
        
        System.out.println("Quantas demãos de tinta pretende pintar: ");
        demaos = ler.nextDouble();
        
        System.out.println("Quantos m2 rende 1L da tinta que pretende utilizar (Obs. valor informado no rotulo da lata): ");
        rendimentoTinta = ler.nextDouble();
        
        System.out.println("Quantos litros possui o latão de tinta que deseja comprar");
        tamanhoLatao = ler.nextDouble();
        RealizarCalculoPintura();
    }
    
    private void RealizarCalculoPintura(){
        
        setMetragemTotalPintada (this.getMetragemParede()* demaos);
        //System.out.println("metragem pintada" + getMetragemTotalPintada());
        totalTintaUsada = metragemTotalPintada / rendimentoTinta;
       // System.out.println("total de litros de tinta usada " + totalTintaUsada);
        
        setTotalTintaComprar (totalTintaUsada *1.15);
       // System.out.println("total de tinta para comprar" + totalTintaComprar);
        
        totalLatoesComprar =  (totalTintaComprar / tamanhoLatao);
        setTotalLatoesComprar(Math.ceil(totalLatoesComprar));
        //System.out.println("total de latões para comprar" + totalLatoesComprar);
              
        
    }
    
    public double getMetragemTotalPintada() {
        return metragemTotalPintada;
    }

    public void setMetragemTotalPintada(double metragemTotalPintada) {
        this.metragemTotalPintada = metragemTotalPintada;
    }

    public double getRendimentoTinta() {
       
        return rendimentoTinta;
    }

    public void setRendimentoTinta(double rendimentoTinta) {
        this.rendimentoTinta = rendimentoTinta;
    }

    public double getTotalTintaUsada() {
        
        return totalTintaUsada;
    }

    public void setTotalTintaUsada(double totalTintaUsada) {
        this.totalTintaUsada = totalTintaUsada;
    }

    public double getTotalTintaComprar() {
        return totalTintaComprar;
    }

    public void setTotalTintaComprar(double totalTintaComprar) {
        this.totalTintaComprar = totalTintaComprar;
    }

    public double getTamanhoLatao() {
        return tamanhoLatao;
    }

    public void setTamanhoLatao(double tamanhoLatao) {
        this.tamanhoLatao = tamanhoLatao;
    }

    public double getTotalLatoesComprar() {
        return totalLatoesComprar;
    }

    public void setTotalLatoesComprar(double totalLatoesComprar) {
        this.totalLatoesComprar = totalLatoesComprar;
    }
    
    
    
    
}

