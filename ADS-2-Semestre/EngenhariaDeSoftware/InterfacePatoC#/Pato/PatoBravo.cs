using Pato;
using System;
using System.Collections.Generic;
using System.Text;

namespace JogoPato
{
	public class PatoBravo : Pato, IPadraoGrasnar
    {
		public PatoBravo()
		{
			setComportamento(new VoaveisAsa());
		}

		public String grasnar()
		{
			return "Que-Que. Grrrrrrrrr.";
		}

		public override string mostrar()
		{
			return "Eu sou o Pato Bravo.";
		}
	}
}
