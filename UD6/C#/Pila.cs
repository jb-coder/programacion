using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Collections;

namespace cchar
{
    class Pila
    {
        static void Main(string[] args)
        {
            string palabra;
            
            //Con Stack creamos una pila
            Stack miPila = new Stack();
            //Insertamos elementos a la pila con push
            miPila.Push("hola");
            miPila.Push("buenos");
            miPila.Push("días");

            //Creamos un bucle para ver los elementos almacenados en la pila
            for (byte i = 0; i < 3; i++)
            {
                palabra = (string)miPila.Pop();
                Console.WriteLine(palabra);
            }

            Console.ReadKey();
        }
    }
}
