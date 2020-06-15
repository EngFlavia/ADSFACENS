using Pato;
using System;
using System.Collections.Generic;
using System.Text;

namespace JogoPato
{
    public class PatoMaratonista : Pato, IPadraoGrasnar
    {
		public PatoMaratonista()
		{

			setComportamentoCorrida(new Correr());
		}

		public String grasnar()
		{
			return "Que-Que. Grrrrrrrrr.";
		}

		public override string mostrar()
		{
			return "Eu sou o Pato Maratonista.";
		}
	}
}
