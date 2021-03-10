import java.util.Scanner;

public class Ordburbuja {

    public static void main(String[] args) {


        //Creamos el objeto de la clase Scanner
        Scanner in = new Scanner(System.in);

        System.out.println("Introduzca longitud del array: ");
        // Guardamos en la variable nn el número de elementos que va a tener nuestro array
        int longitud = in.nextInt();

        // Creamos el array con el tamaño que le hemos indicado
        int Array[] = new int[longitud];

        // Bucle para rellenar el array con números introducidos por teclado
        for (int i = 0; i < Array.length; i++) {
            System.out.println("Introduzca número para el elemento " + (i + 1) + ": ");
            Array[i] = in.nextInt();
        }
        
        // Mostramos primero el array sin ordenar
        System.out.println("*** Array sin Ordenar ****");
        // Llamada al método
        mostrarArray(Array);
        // Preguntamos si queremos ordenar
        System.out.println("¿Desea ordenar los números? S/N");
        Scanner in2 = new Scanner(System.in);
        /* Con esto capturamos lo que introducimos por teclado */
        String res = in2.nextLine();
        // Si es 'S' entra, si no sale
        if (res.equalsIgnoreCase("S")) {
            //Muestra el array ordenado
            System.out.println("***** Array Ordenado *****");
            //Llama al método para ordenar
            ordenaBurbuja(Array);
        }

    }
    
    // Método de ordenación mediante algoritmo de burbuja
    static void ordenaBurbuja(int Array[]) {
        // Bucle desde 0 hasta la longitud del array -1
        for (int i = 0; i < Array.length - 1; i++) {
            // Bucle anidado desde 0 hasta la longitud del array -1
            for (int j = 0; j < Array.length - 1; j++) { 
            	// Si el número almacenado en la posición j es mayor que el de la posición j+1 (el siguiente del array)
            	if (Array[j] > Array[j + 1]) {
                    // guardamos el número de la posicion j+1 en una variable (el menor)
                    int temp = Array[j + 1];
                    // Lo intercambiamos de posición
                    Array[j + 1] = Array[j];
                    Array[j] = temp;
                    // y volvemos al inicio para comparar los siguientes hasta que todos se hayan comparado
                    // de esta forma vamos dejando los números mayores al final del array en orden
                }
            }
        }
        // Llama al método mostrarArray, si ordena damos por hecho que lo quiere mostrar
        mostrarArray(Array);
    }
    
    // Método para mostrar el array
    static void mostrarArray(int Array[]) {
        System.out.println("");
        // Bucle para mostrar el array desde la posicion 0 hasta la longitud del array
        for (int i = 0; i < Array.length; i++) { System.out.print(" Elemento " + (i + 1) + " : " + Array[i] + "\n");
        }
        System.out.println("");
    }

}