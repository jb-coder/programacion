using System;
using System.Collections.Generic;

namespace cchar
{
    class Lista
    {
        static void Main(string[] args)
        {

            //Creamos la Lista llamada "Tareas"
            List<string> Tareas = new List<string>();

            //Con Add insertamos elementos a la lista
            Tareas.Add("Ejercicios_programacion");
            Tareas.Add("Ejercicios_bd");
            Tareas.Add("Ejercicios_entornos");  

            //Mostramos cada elemento de la lista
            Console.WriteLine(Tareas[0]);
            Console.WriteLine(Tareas[1]);
            Console.WriteLine(Tareas[2]);           
        }
    }
}
