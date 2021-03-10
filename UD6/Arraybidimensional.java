import java.util.Scanner;
public class Arraybidimensional {

	public static void main(String[] args) {
		
		//Objeto Scanner
		try(Scanner in=new Scanner(System.in)){
		
			//Se solicita al usuario la longitud de las filas del array
			System.out.println("Cuantas filas desea que tenga el array?");
			
			//Almacenamos el dato en la variable filas
			int filas=in.nextInt();
			
			//Se solicita al usuario la longitud de las columnas del array
			System.out.println("Cuantas columnas desea que tenga el array?");
					
			//Almacenamos el dato en la variable filas
			int columnas=in.nextInt();
			
			//Creamos el array bidimensional con la longitud introducida
			//por el usuario
			int array[][]=new int[filas][columnas];
			
			//Creamos un bucle For anidado para rellenar de numeros enteros aleatorios
			//del 1 al 10 con la funcion numeroAleatorio el array
			
			for(int i=0;i<filas;i++) {
				
				for(int j=0;j<columnas;j++) {
					
					array[i][j]=numeroAleatorio(1,10);
					System.out.println("Fila "+i+" Columna "+j+" Contenido: "+array[i][j]);
				}
				
			}
			
			} catch (Exception e) {			
		}
	}
	
	//Función numero aleatorio entre dos numeros enteros que le demos
    public static int numeroAleatorio(int minimo, int maximo){
        return (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
    }

}
