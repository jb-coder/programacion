/*
4. En el archivo tres.java, realice un programa que lea de un archivo datos.txt
los datos de un directorio telefónico y los muestre por pantalla.
*/
import java.io.IOException;
import java.io.FileReader;

public class Tres {
	public static void main(String[] args) throws IOException {
		
		try {
			
			FileReader fr = new FileReader ("C:\\EjerciciosStreams\\datos.txt");
			String contenido ="";
			int c;
			
			while ((c = fr.read())!=-1) {
				contenido+=(char)c;
			}
			System.out.println(contenido);
			
			fr.close();
		
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
