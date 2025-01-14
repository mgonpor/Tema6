package diapositiva47;

public class Gestor {

	//Atributos
	private String nombre;
	private String telefono;
	private int importeMaximo;
	
	//Constructores
	public Gestor(String nombre, String telefono, int importeMaximo) {
		if(nombre == null || nombre.isBlank()) {
			throw new IllegalArgumentException("El nombre no puede ser vacío, ni en blanco, ni nulo");
		}
		if(telefono.length() != 9 || telefono.matches("[0-9]*")) {
			throw new IllegalArgumentException("Introduce un teléfono válido");
		}
		if(importeMaximo < 1) {
			throw new IllegalArgumentException("El importe ha de ser mayor que 1 euro");
		}
		
		this.nombre = nombre;
		this.telefono = telefono;
		this.importeMaximo = importeMaximo;
	}
	public Gestor(String nombre, String telefono) {
		if(nombre == null || nombre.isBlank()) {
			throw new IllegalArgumentException("El nombre no puede ser vacío, ni en blanco, ni nulo");
		}
		if(telefono.length() != 9 || telefono.matches("[0-9]*")) {
			throw new IllegalArgumentException("Introduce un teléfono válido");
		}
		
		this.nombre = nombre;
		this.telefono = telefono;
		this.importeMaximo = 10000;
	}
	
	//Set/Get
	public String getTelefono() {
		return telefono;
	}
	
	public void setNombre(String nombre) {
		if(nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}
	public String getNombre() {
		return nombre;
	}
	
	public void setImporteMaximo(int importeMaximo) {
		if(importeMaximo > 1) {
			this.importeMaximo = importeMaximo;
		}
	}
	public int getImporteMaximo() {
		return importeMaximo;
	}
	
}
