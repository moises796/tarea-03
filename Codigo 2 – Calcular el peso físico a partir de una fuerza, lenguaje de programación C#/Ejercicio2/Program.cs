using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ejercicio2
{
    class Program
    {
        static void Main(string[] args)
        {
            double gravedad=9.8;
            double fuerza,masa;
            Console.WriteLine("PROGRAMA PARA CALCULAR PESO DE MAQUINA DEL TIEMPO");
            Console.WriteLine("");
            Console.WriteLine("¿A CUANTA FUERZA EN NEWTON ES SOMETIDA LA MAQUINA DEL TIEMPO?");
            fuerza = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("");
            masa = fuerza / gravedad;
            Console.WriteLine("EL PESO DE LA MAQUINA DE TIEMPO ES DE: "+Math.Round(masa,2)+"kg");
            Console.ReadKey();

        }
    }
}
