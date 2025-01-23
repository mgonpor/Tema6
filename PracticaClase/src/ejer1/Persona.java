package ejer1;

public class Persona {
	
	private String nombre;
	private String apellido;
	private int codigoEmpleado;

	private static int ultimoCodigo = 1;
	
	public Persona(String nombre, String apellido) {
		setNombre(nombre);
		setApellido(apellido);
		generaCodigoEmpleado();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public String getApellido() {
		return this.apellido;
	}
	public int getCodigoEmpleado() {
		return this.codigoEmpleado;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void generaCodigoEmpleado() {
		this.codigoEmpleado = ultimoCodigo++;
	}
	
	void getInfoPersona() {
		System.out.printf("\nCod: %d, Nombre: %s %s", this.codigoEmpleado, this.nombre, this.apellido);
	}
}
