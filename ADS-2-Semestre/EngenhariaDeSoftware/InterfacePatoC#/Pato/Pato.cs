using Pato;
using System;
using System.Collections.Generic;
using System.Text;

namespace JogoPato
{
    public abstract class Pato
    {
        protected IPadraoVoaveis comportamentoPato;

        protected IPadraoCorredor corridaPato;

        public abstract String mostrar();

        public String nadar()
        {
            return "Pato Nadando.";
        }

        public void setComportamento(IPadraoVoaveis padrao)
        {
            comportamentoPato = padrao;
        }

        public String ComportamentoPato()
        {
            if (comportamentoPato != null)
                return comportamentoPato.voar();

            if (corridaPato != null)
                return corridaPato.correndo();

            return "Pato sem comportamento";
        }

        public void setComportamentoCorrida(IPadraoCorredor padrao)
        {
            corridaPato = padrao;
        }
    }
}
