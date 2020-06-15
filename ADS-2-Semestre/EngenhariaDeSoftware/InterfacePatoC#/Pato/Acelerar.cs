using System;
using System.Collections.Generic;
using System.Text;

namespace JogoPato
{
    public class Acelerar : IPadraoCorredor
    {
		private Double velocidade;

		//public int MyProperty { get; set; } //prop tab tab
		public Acelerar()
		{
			velocidade = 20;
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
