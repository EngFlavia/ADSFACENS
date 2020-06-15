/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engsoft;

/**
 *
 * @author Flavia Florentino
 */
public class Acelerar implements Padrao_Corredor{
     private double velocidade;
	
	public Acelerar()
	{
		velocidade = 20;	
	}
	
	public String correndo() {
		return "Correndo. Velocidade: " + getVelocidade();		
	}

	public double getVelocidade() {
		return velocidade;
	}	
}
