using Pato;
using System;
using System.Collections.Generic;
using System.Text;

namespace JogoPato
{
    public class VoaveisAsa : IPadraoVoaveis
    {
		private double velocidade;

		public VoaveisAsa()
		{
			velocidade = 10;
		}

		public String voar()
		{
			return "Voando. Velocidade: "
					+ getVelocidade();
		}

		public double getVelocidade()
		{
			return velocidade;
		}
	}
}
