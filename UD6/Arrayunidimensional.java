import java.util.Scanner;
public class Arrayunidimensional {

	public static void main(String[] args) {
		
		//Objeto Scanner
		try(Scanner in=new Scanner(System.in)){
		
			//Se solicita al usuario la longitud del array
			System.out.println("Que longitud desea que tenga el array?");
		
			//Almacenamos el dato en la variable longitud
			int longitud=in.nextInt();

			//Creamos el array unidimensional con la longitud introducida
			//por el usuario
			int array[]=new int[longitud];
			
			//Creamos un bucle For para rellenar de numeros enteros aleatorios
			//del 1 al 10 con la funcion numeroAleatorio el array
			for(int i=0;i<=array.length;i++) {
				array[i]=numeroAleatorio(1,10);
				System.out.println("En la posición "+i+" del array se encuentra el dato: "+array[i]);
			}
			
		} catch (Exception e) {
			
		}
	}
	
	//Función numero aleatorio entre dos numeros enteros que le demos
    public static int numeroAleatorio(int minimo, int maximo){
        return (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
    }
    
    

}
