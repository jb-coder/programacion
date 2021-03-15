using System;
using System.Collections.Generic;

namespace cchar
{
    class Colas
    {
        static void Main(string[] args)
        {
            Queue <int> nums=new Queue<int>();

            //Agregar elementos a la cola

            foreach (int nums in new int[5] {2, 4, 6, 8, 10}){
                nums.Enqueue(nums);
            }

            //Recorriendo la cola

            Console.WriteLine("recorriendo el Queue");

            foreach (int nums in nums){
                Console.WriteLine(nums);
            }

            //Eliminar el primer elemento de la cola
            Console.WriteLine("Eliminando elementos");

            foreach(int nums in nums){
                Console.WriteLine(nums);
            }
        }
    }
}
