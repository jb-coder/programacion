package empleados;

public class Contable extends Empleado {

	private int numeroingresos;
	private int numeroegresos;
	
	public Contable(String nombre, String direccion, int telefono, String fecha_nac, double sueldo, int numeroingresos,
			int numeroegresos) {
		super(nombre, direccion, telefono, fecha_nac, sueldo);
		this.numeroingresos = numeroingresos;
		this.numeroegresos = numeroegresos;
	}

	public int getNumeroingresos() {
		return numeroingresos;
	}

	public void setNumeroingresos(int numeroingresos) {
		this.numeroingresos = numeroingresos;
	}

	public int getNumeroegresos() {
		return numeroegresos;
	}

	public void setNumeroegresos(int numeroegresos) {
		this.numeroegresos = numeroegresos;
	}
	
}