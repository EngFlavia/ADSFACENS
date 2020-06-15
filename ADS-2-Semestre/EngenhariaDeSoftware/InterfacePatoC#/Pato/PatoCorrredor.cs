using Pato;
using System;
using System.Collections.Generic;
using System.Text;

namespace JogoPato
{
	public class PatoCorrredor: Pato,IPadraoGrasnar
    {
		public PatoCorrredor()
		{
			setComportamentoCorrida(new Correr());
		}

		public String grasnar()
		{
			return "Que-Que. Grrrrrrrrr.";
		}

		public override string mostrar()
		{
			return "Eu sou o Pato Corredor.";
		}
	}
}
