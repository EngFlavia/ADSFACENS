using System;
using System.Text.RegularExpressions;

namespace TesteRegex
{
    class Program
    {
       

        static void Main(string[] args)
        {
            //Console.WriteLine("Hello World!");
            //var cel = "(15) 98923-2323";

            //cel = Regex.Replace(cel, "[^0-9]+", string.Empty);

            //Console.WriteLine(cel);

            Onibus onibus = new Onibus();
            onibus.NumeroDePontronasOcupadas();

            onibus.EntrarPassageiro(new Passageiro("Flavia"));
            onibus.EntrarPassageiro(new Passageiro("Victor"));
            onibus.EntrarPassageiro(new Passageiro("João"));
            onibus.EntrarPassageiro(new Passageiro("Bruna"));
            onibus.EntrarPassageiro(new Passageiro("Eduardo"));            
            onibus.ObterNomePassageirosNasPoltronas();
            onibus.NumeroDePontronasOcupadas();

            onibus.EntrarPassageiro(new Passageiro("Roberto"));

            onibus.SairPassageiro("João");
            onibus.SairPassageiro("Lucas");
            onibus.ObterNomePassageirosNasPoltronas();
            onibus.NumeroDePontronasOcupadas();


            onibus.EntrarPassageiro(new Passageiro("Pedro"));
            onibus.ObterNomePassageirosNasPoltronas();
            onibus.NumeroDePontronasOcupadas();

        }

        

    }
}
