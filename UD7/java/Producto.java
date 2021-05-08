//Superclase
public abstract class Producto {

	//Atributos
	
	private String Matricula;
	private String Modelo;
	private String Color;
	
	//Metodo constructor 
	
	public Producto(String Matricula, String Modelo, String Color) {
		this.Matricula=Matricula;
		this.Modelo=Modelo;
		this.Color=Color;
	}
	
	//Getters y Setters
	
	public String getMatricula() {
		return Matricula;
	}



	public void setMatricula(String matricula) {
		Matricula = matricula;
	}



	public String getModelo() {
		return Modelo;
	}



	public void setModelo(String modelo) {
		Modelo = modelo;
	}



	public String getColor() {
		return Color;
	}



	public void setColor(String color) {
		Color = color;
	}

	//Metodo para visualizar la información de los atributos

	public void mostrarInfoGeneral(){
		
		System.out.println("Informacion general "+Modelo+ "\n"
						 + "-------------------\n"
						 + "Matricula: "+Matricula+"\n"
						 + "Modelo: "+Modelo+"\n"
						 + "Color: "+Color+"\n"
						 + "-------------------\n");
	}
	
}











