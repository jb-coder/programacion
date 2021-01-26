package empleados;

public class Administrativo extends Empleado {
	
	private int numerollamadas;
	private double tiempototalllamadas;
	
	public Administrativo(String nombre, String direccion, int telefono, String fecha_nac, double sueldo,
			int numerollamadas, double tiempoTotalllamadas) {
		super(nombre, direccion, telefono, fecha_nac, sueldo);
		this.numerollamadas = numerollamadas;
		this.tiempototalllamadas = tiempoTotalllamadas;
	}

	public int getNumerollamadas() {
		return numerollamadas;
	}

	public void setNumerollamadas(int numerollamadas) {
		this.numerollamadas = numerollamadas;
	}

	public double getTiempototalllamadas() {
		return tiempototalllamadas;
	}

	public void setTiempototalllamadas(double tiempototalllamadas) {
		this.tiempototalllamadas = tiempototalllamadas;
	}

}