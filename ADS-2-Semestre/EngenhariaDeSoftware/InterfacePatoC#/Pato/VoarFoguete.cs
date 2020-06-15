using Pato;
using System;
using System.Collections.Generic;
using System.Text;

namespace JogoPato
{
    public class VoarFoguete : IPadraoVoaveis
    {
		private double velocidade;

		public VoarFoguete()
		{
			velocidade = 1000;
		}

		public String voar()
		{
			return "Voando como um foguete. Velocidade: " + getVelocidade();
		}

		public double getVelocidade()
		{
			return velocidade;
		}
	}
}
