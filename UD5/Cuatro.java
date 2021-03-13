/*
5. Realice un programa cuatro.java que lea el archivo datos.txt
y genere un archivo de acceso aleatorio datosAleatorio.txt.
*/
import java.io.IOException;
import java.io.FileReader;
import java.io.RandomAccessFile;

public class Cuatro {
	public static void main(String[] args) throws IOException {
					
		try {
			
			FileReader fr = new FileReader ("C:\\EjerciciosStreams\\datos.txt");
			fr.read();
			
			RandomAccessFile escribe = new RandomAccessFile("C:\\EjerciciosStreams\\datosAleatorio.txt","rw");
			escribe.seek(escribe.length());
			String contenido ="";
			
			int c;
			while ((c = fr.read())!=-1) {
				contenido+=(char)c;
			}
			
			escribe.writeUTF(contenido);
			escribe.close();
			fr.close();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
