using System;
using System.Collections.Generic;
using System.Text;

namespace TesteRegex
{
  
    public class Onibus
    {
        private Poltrona[] poltronas;

        public Onibus()
        {
            CriarPoltronas();
        }

        public void EntrarPassageiro(Passageiro passageiro)
        {
            bool retorno = false;

            for (int i = 0; i < poltronas.Length; i++)
            {
                if (poltronas[i].Passageiro == null)
                {
                    poltronas[i].Passageiro = passageiro;
                    retorno = true;
                    break;
                }
            }

            if (!retorno)
                Console.WriteLine($"Onibus lotado, o passageiro {passageiro.Nome} não pode entrar");            
        }

        public void SairPassageiro(string nome)
        {
            bool retorno = false;

            for (int i = 0; i < poltronas.Length; i++)
            {
                if (poltronas[i].Passageiro != null && poltronas[i].Passageiro.Nome == nome)
                {
                    poltronas[i].Passageiro = null;
                    retorno = true;
                    break;
                }
            }

            if(!retorno)
                Console.WriteLine($"O passageiro {nome} não se encontra no onibus");
        }

        private void CriarPoltronas()
        {
            poltronas = new Poltrona[5];
            for (int i = 0; i < poltronas.Length; i++)
            {
                poltronas[i] = new Poltrona();
            }
        }

        public void ObterNomePassageirosNasPoltronas()
        {           
            for (int i = 0; i < poltronas.Length; i++)
            {
                if (poltronas[i].Passageiro == null)
                    Console.WriteLine($"Poltrona {i} : vazio");
                else
                    Console.WriteLine($"Poltrona {i} : {poltronas[i].Passageiro.Nome}");
            }
         
        }

        public void NumeroDePontronasOcupadas()
        {
            int contar = 0;
            for (int i = 0; i < poltronas.Length; i++)
            {
                if (poltronas[i].Passageiro != null)
                    contar++;
            }
            Console.WriteLine($"Poltronas ocupadas {contar}");            
        }
    }

   
}
