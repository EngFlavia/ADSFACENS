using System;
using System.Collections.Generic;
using System.Text;

namespace TesteRegex
{
    public class Poltrona
    {
        public Passageiro Passageiro { get; set; } = null;

        public string EstadoPoltrona ()
        {
            if (Passageiro == null)
                return "vazia";
            else
                return $"Ocupada {Passageiro.Nome} ";
        }
    }
}
