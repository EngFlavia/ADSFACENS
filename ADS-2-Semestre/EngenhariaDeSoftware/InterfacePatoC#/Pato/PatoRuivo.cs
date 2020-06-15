using Pato;
using System;
using System.Collections.Generic;
using System.Text;

namespace JogoPato
{
    public class PatoRuivo : Pato, IPadraoGrasnar
    {
		public PatoRuivo()
		{
			setComportamento(new VoaveisAsa());
		}

		public String grasnar()
		{
			// TODO Auto-generated method stub
			return "Que-Que.";

		}

		public override string mostrar()
		{
			return "Eu sou o Pato Ruivo.";
		}
	}
}
