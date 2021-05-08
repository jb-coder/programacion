
public class Principal {
	public static void main(String[] args) {
		
		//Creamos los objetos
		
		Km0 Coche1 = new Km0("3465-KMN","SEAT IBIZA","AZUL",1200);
		SegundaMano Coche2 = new SegundaMano("2345-FLZ","BMW SERIE 3","BLANCO",98000,"Javier Baena");
		Nuevo Coche3 = new Nuevo("6789-LZD","VOLKSWAGEN TIGUAN","GRIS");
		
		//Instanciamos Objetos
		
		Coche1.mostrarInfokm0();
		System.out.println();
		
		Coche2.mostrarInfoSegundaMano();
		System.out.println();
		
		Coche3.mostrarInfoNuevo();
	}
}
