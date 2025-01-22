package maquinaria;

import java.time.LocalDate;

import personal.Mecanico;

public class Locomotora {

	private String matricula;
	private double potenciaMotor;
	private int anyoFabricacion;
	private Mecanico mecanico;
	
	private static int ultimaMatricula = 1;
	
	public Locomotora(double potenciaMotor, int anyoFabricacion, Mecanico mecanico) {
		setMatricula();
		setPotenciaMotor(potenciaMotor);
		setAnyoFabricacion(anyoFabricacion);
		setMecanico(mecanico);
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	private void setMatricula() {
		this.matricula = String.valueOf(ultimaMatricula);
		ultimaMatricula++;
	}
	
	public double getPotenciaMotor() {
		return potenciaMotor;
	}
	private void setPotenciaMotor(double potenciaMotor) {
		if(potenciaMotor < 100) {
			throw new IllegalArgumentException("La potencia mínima son 100 CV");
		}
		this.potenciaMotor = potenciaMotor;
	}
	
	public int getAnyoFabricacion() {
		return anyoFabricacion;
	}
	private void setAnyoFabricacion(int anyoFabricacion) {
		if(anyoFabricacion < 1980 || anyoFabricacion > LocalDate.now().getYear()) {
			throw new IllegalArgumentException("El año debe estar entre 1980 y este año");
		}
		this.anyoFabricacion = anyoFabricacion;
	}
	
	public Mecanico getMecanico() {
		return mecanico;
	}
	public void setMecanico(Mecanico mecanico) {
		if (mecanico == null) {
			throw new IllegalArgumentException("El mecánico no puede ser nulo");
		}
		this.mecanico = mecanico;
	}
	
	
	
}
