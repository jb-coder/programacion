//Subclase de km0 que hereda atributos y metodos de Producto y km0
public class SegundaMano extends Km0{

	//Atributos
	
	private String NombrePropietario;
	
	//Metodo Constructor
	
	public SegundaMano(String Matricula, String Modelo, String Color, int nkm, String NombrePropietario) {
		super(Matricula, Modelo, Color, nkm);
		this.NombrePropietario=NombrePropietario;
	}

	
	//Getter y Setter

	public String getNombrePropietario() {
		return NombrePropietario;
	}

	public void setNombrePropietario(String nombrePropietario) {
		NombrePropietario = nombrePropietario;
	}

	
	//Metodo para visualizar la información de los atributos y herencia
	//del metodo creado en la clase km0

	public void mostrarInfoSegundaMano() {
		
		mostrarInfokm0();
		
		System.out.println("Informacion Segunda Mano\n"
		          +"-------------------\n"
		          +"Nombre del propietario: "+NombrePropietario+"\n"
				  +"-------------------\n");
	}



}
