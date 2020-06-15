using System;

namespace JogoPato
{
    public class JogoPato
    {
        public static void Main(string[] args)
        {
            // Console.WriteLine("Hello World!");

            int corrida;

            Pato pr = new PatoRuivo();
            Pato pc = new PatoCorrredor();
            Pato pm = new PatoMaratonista();
            Pato pb = new PatoBravo();
            Pato pbo = new PatoBorracha();


            Console.Write(pr.mostrar());
            Console.WriteLine(pr.ComportamentoPato());
            Console.WriteLine();

            Console.Write(pc.mostrar());
            Console.WriteLine(pc.ComportamentoPato());
            Console.WriteLine();

            Console.Write(pm.mostrar());
            Console.WriteLine(pm.ComportamentoPato());
            Console.WriteLine();

            Console.Write(pb.mostrar());
            Console.WriteLine(pb.ComportamentoPato());
            Console.WriteLine();

            Console.Write(pbo.mostrar());
            Console.WriteLine(pbo.ComportamentoPato());
            Console.WriteLine();

            Console.WriteLine("\nInicio da corrida\n");

            for (int i = 1000; i > 0; i -= 100)
            {

                if (i <= 200)
                {

                    pm.setComportamentoCorrida(new Acelerar());

                }
                Console.Write($"Distância para chegada {i} m ");
                Console.Write(pm.mostrar());
                Console.WriteLine(pm.ComportamentoPato());
            }

            Console.WriteLine("\nFIM da Corrida");
        }
    }
}
