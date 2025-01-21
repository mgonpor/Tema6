package personal;

import java.time.LocalDate;

public class JefeDeEstacion {

	private String nombre;
	private String dni;
	private LocalDate fechaNombramiento;
	
	public JefeDeEstacion(String nombre, String dni, LocalDate fechaNombramiento) {
		setNombre(nombre);
		setDni(dni);
		setFechaNombramiento(fechaNombramiento);
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
	
	public LocalDate getFechaNombramiento() {
		return fechaNombramiento;
	}
	private void setFechaNombramiento(LocalDate fechaNombramiento) {
		this.fechaNombramiento = fechaNombramiento;
	}
	
	
}
