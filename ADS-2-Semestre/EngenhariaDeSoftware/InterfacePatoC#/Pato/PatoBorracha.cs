using System;
using System.Collections.Generic;
using System.Text;

namespace JogoPato
{
	public class PatoBorracha : Pato
    {
		public PatoBorracha()
		{
			setComportamento(new NaoVoa());
		}

		public override string mostrar()
		{
			return "Olá, eu sou de Boarracha.";
		}
	}
}
