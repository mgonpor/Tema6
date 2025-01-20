package personal;

public class Maquinista {

	private String nombre;
	private String dni;
	private double sueldo;
	private Rango rango;
	
	public Maquinista(String nombre, String dni, double sueldo, Rango rango) {
		setNombre(nombre);
		setDni(dni);
		setSueldo(sueldo);
		setRango(rango);
	}	

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public Rango getRango() {
		return rango;
	}
	public void setRango(Rango rango) {
		if(rango == null) {
			this.rango = Rango.RASO;
		}else {
			this.rango = rango;
		}
	}
	
	
	
}
