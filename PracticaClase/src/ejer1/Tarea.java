package ejer1;

import java.time.LocalDate;

public class Tarea {

	private int codigoTarea;
	private Estado estado;
	private int numeroOrdenador;

	private String problema;
	private LocalDate fechaResolucion;
	private Persona persona;
	
	private static int ultimoCodigo = 1;
	
	public Tarea(int numeroOrdenador) {
		generaCodigoTarea();
		this.estado = Estado.PENDIENTE;
		setNumeroOrdenador(numeroOrdenador);
	}
	
	public int getCodigoTarea() {
		return this.codigoTarea;
	}
	public Estado getEstado() {
		return this.estado;
	}
	public int getNumeroOrdenador() {
		return this.numeroOrdenador;
	}
	public String getProblema() {
		if(this.estado == Estado.PENDIENTE) {
			throw new IllegalArgumentException("Tarea no resuelta");
		}
		return this.problema;
	}
	public LocalDate getFechaResolucion() {
		if(this.estado == Estado.PENDIENTE) {
			throw new IllegalArgumentException("Tarea no resuelta");
		}
		return this.fechaResolucion;
	}
	public Persona getPersona() {
		if(this.estado == Estado.PENDIENTE) {
			throw new IllegalArgumentException("Tarea no resuelta");
		}
		return this.persona;
	}
	
	public void generaCodigoTarea() {
		this.codigoTarea = ultimoCodigo++;
	}
	public void setNumeroOrdenador(int numeroOrdenador) {
		if(numeroOrdenador < 1) {
			throw new IllegalArgumentException("Di un numero de ordenador válido");
		}
		this.numeroOrdenador = numeroOrdenador;
	}
	public void setProblema(String problema) {
		this.problema = problema;
	}
	
	void resolverTarea(Persona persona, String problema) {
		this.persona = persona;
		setProblema(problema);
		this.fechaResolucion = LocalDate.now();
		this.estado = Estado.RESUELTA;
	}
	
	void getInfoTarea() {
		System.out.printf("\nCod: %d, Estado: %s", this.codigoTarea, this.estado.toString());
	}
}
