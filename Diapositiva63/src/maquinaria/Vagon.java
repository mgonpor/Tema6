package maquinaria;

public class Vagon {
	
	private int numId;
	private double cargaMaximaKg;
	private double cargaActual;
	private Mercancia mercancia;
	
	private static int ultimoId = 1;
	
	public Vagon(double cargaMaximaKg, double cargaActual, String mercancia) {
		this.numId = ultimoId++;
		setCargaMaximaKg(cargaMaximaKg);
		setCargaActual(cargaActual);
		setMercancia(mercancia);
	}
	
	public int getNumId() {
		return numId;
	}
	
	public double getCargaMaximaKg() {
		return cargaMaximaKg;
	}
	private void setCargaMaximaKg(double cargaMaximaKg) {
		if(cargaMaximaKg < 0) {
			throw new IllegalArgumentException("La carga máxima debe ser mayor de 0");
		}
		this.cargaMaximaKg = cargaMaximaKg;
	}
	
	public double getCargaActual() {
		return cargaActual;
	}
	public void setCargaActual(double cargaActual) {
		if(cargaActual > this.cargaMaximaKg || cargaActual<0) {
			throw new IllegalArgumentException("No puede llevar más carga de la máxima");
		}
		this.cargaActual = cargaActual;
	}
	
	public Mercancia getMercancia() {
		return mercancia;
	}
	public void setMercancia(String mercancia) {
		this.mercancia = Mercancia.valueOf(mercancia);
	}
	
	
}
