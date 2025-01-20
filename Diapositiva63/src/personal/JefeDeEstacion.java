package personal;

import java.text.SimpleDateFormat;

public class JefeDeEstacion {

	private String nombre;
	private String dni;
	private SimpleDateFormat fechaNombramiento;
	
	public JefeDeEstacion(String nombre, String dni, SimpleDateFormat fechaNombramiento) {
		setNombre(nombre);
		setDni(dni);
		setFechaNombramiento(fechaNombramiento);
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
	
	public SimpleDateFormat getFechaNombramiento() {
		return fechaNombramiento;
	}
	public void setFechaNombramiento(SimpleDateFormat fechaNombramiento) {
		this.fechaNombramiento = fechaNombramiento;
	}
	
	
}
