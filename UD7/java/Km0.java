//Subclase de Producto
public class Km0 extends Producto {
	
	//Atributos
	
	private int nkm;
	
	//Metodo Constructor
	
	public Km0(String Matricula, String Modelo, String Color, int nkm) {
		super(Matricula, Modelo, Color);
		this.nkm=nkm;
	}
	
	//Getter y Setter
	
	public int getNkm() {
		return nkm;
	}


	public void setNkm(int nkm) {
		this.nkm = nkm;
	}

	//Metodo para visualizar la información de los atributos y herencia
	//del metodo creado en la clase Producto

	public void mostrarInfokm0() {
		
		mostrarInfoGeneral();
		
		System.out.println("Informacion Km0\n"
				          +"-------------------\n"
				          +"Numero de kilometros: "+nkm+ " kilometros\n"
						  +"-------------------\n");
	}
}
