using Pato;
using System;
using System.Collections.Generic;
using System.Text;

namespace JogoPato
{
	public class Correr : IPadraoCorredor
    {
		private double velocidade;

		public Correr()
		{
			velocidade = 10;
		}

		public String correndo()
		{
			return "Correndo. Velocidade: " + getVelocidade();
		}

		public double getVelocidade()
		{
			return velocidade;
		}
	}
}
