package personal;

public class Maquinista {

	private String nombre;
	private String dni;
	private double sueldo;
	private Rango rango;
	
	public Maquinista(String nombre, String dni, double sueldo, String rango) {
		setNombre(nombre);
		setDni(dni);
		setSueldo(sueldo);
		setRango(rango);
	}

	public String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDni() {
		return dni;
	}
	private void setDni(String dni) {
		this.dni = dni;
	}
	
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		if(sueldo < 1080) {
			throw new IllegalArgumentException("El sueldo no puede ser menor que el salario mínimo (1080)");
		}
		this.sueldo = sueldo;
	}
	
	public Rango getRango() {
		return rango;
	}
	public void setRango(String rango) {
		if(rango == null) {
			this.rango = Rango.RASO;
		}else {
			this.rango = Rango.valueOf(rango);
		}
	}
	
	
	
}
