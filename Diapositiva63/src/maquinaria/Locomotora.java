package maquinaria;

import personal.Mecanico;

public class Locomotora {

	private String matricula;
	private double potenciaMotor;
	private int anyoFabricacion;
	private Mecanico mecanico;
	
	public Locomotora(String matricula, double potenciaMotor, int anyoFabricacion, Mecanico mecanico) {
		setMatricula(matricula);
		setPotenciaMotor(potenciaMotor);
		setAnyoFabricacion(anyoFabricacion);
		setMecanico(mecanico);
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public double getPotenciaMotor() {
		return potenciaMotor;
	}
	public void setPotenciaMotor(double potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}
	
	public int getAnyoFabricacion() {
		return anyoFabricacion;
	}
	public void setAnyoFabricacion(int anyoFabricacion) {
		this.anyoFabricacion = anyoFabricacion;
	}
	
	public Mecanico getMecanico() {
		return mecanico;
	}
	public void setMecanico(Mecanico mecanico) {
		this.mecanico = mecanico;
	}
	
	
	
}
