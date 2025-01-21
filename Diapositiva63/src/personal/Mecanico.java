package personal;

public class Mecanico {

	private String nombre;
	private String telefonoUrgencia;
	private Especialidad especialidad;
	
	public Mecanico(String nombre, String telefonoUrgencia, String especialidad) {
		setNombre(nombre);;
		setTelefonoUrgencia(telefonoUrgencia);;
		setEspecialidad(especialidad);
	}
	
	public String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getTelefonoUrgencia() {
		return telefonoUrgencia;
	}
	public void setTelefonoUrgencia(String telefonoUrgencia) {
		if(telefonoUrgencia.matches("*.[0-9].*")) {
			throw new IllegalArgumentException("El teléfono debe tener solo números");
		}
		this.telefonoUrgencia = telefonoUrgencia;
	}
	
	public Especialidad getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = Especialidad.valueOf(especialidad);
	}
	
}
