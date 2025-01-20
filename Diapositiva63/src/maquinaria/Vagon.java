package maquinaria;

public class Vagon {
	
	private int numId;
	private double cargaMaximaKg;
	private double cargaActual;
	private Mercancia mercancia;
	
	public Vagon(int numId, double cargaMaximaKg, double cargaActual, Mercancia mercancia) {
		setNumId(numId);
		setCargaMaximaKg(cargaMaximaKg);
		setCargaActual(cargaActual);
		setMercancia(mercancia);
	}
	
	public int getNumId() {
		return numId;
	}
	public void setNumId(int numId) {
		this.numId = numId;
	}
	
	public double getCargaMaximaKg() {
		return cargaMaximaKg;
	}
	public void setCargaMaximaKg(double cargaMaximaKg) {
		this.cargaMaximaKg = cargaMaximaKg;
	}
	
	public double getCargaActual() {
		return cargaActual;
	}
	public void setCargaActual(double cargaActual) {
		this.cargaActual = cargaActual;
	}
	
	public Mercancia getMercancia() {
		return mercancia;
	}
	public void setMercancia(Mercancia mercancia) {
		this.mercancia = mercancia;
	}
	
	
	
}
