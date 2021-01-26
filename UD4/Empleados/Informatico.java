package empleados;

public class Informatico extends Empleado {
	
	private int numeroSoportes;
	
	public Informatico(String nombre, String direccion, int telefono, String fecha_nac, double sueldo,int numeroSoportes) {
		super(nombre, direccion, telefono, fecha_nac, sueldo);
		this.numeroSoportes = numeroSoportes;
	}

	public int getNumeroSoportes() {
		return numeroSoportes;
	}

	public void setNumeroSoportes(int numeroSoportes) {
		this.numeroSoportes = numeroSoportes;
	}
	
	
}
