using Pato;
using System;
using System.Collections.Generic;
using System.Text;

namespace JogoPato
{
	public class NaoVoa : IPadraoVoaveis
    {

		public NaoVoa()
		{

		}

		public String voar()
		{
			return "Esse pato não Voa. Velocidade: " + getVelocidade();
		}

		public double getVelocidade()
		{
			return 0;
		}
	}
}
