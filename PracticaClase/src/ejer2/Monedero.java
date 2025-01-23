package ejer2;

import java.util.Random;

public class Monedero {
	
	Random rand = new Random();
	
	private long id;
	private double saldo;
	
	public Monedero(double saldo) {
		generaId();
		setSaldo(saldo);
	}
	public Monedero() {
		generaId();
		setSaldo(0);
	}
	
	public long getId() {
		return this.id;
	}
	public double getSaldo() {
		return this.saldo;
	}
	
	private void generaId() {
		this.id = rand.nextLong(100000000000L, 1000000000000L); 
	}
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void ingresar(double cantidad) {
		this.saldo += Math.abs(cantidad);
	}
	public void gastar(double cantidad) {
		this.saldo -= Math.abs(cantidad);
	}
	
	void transferencia(double cantidadAEnviar, Monedero monederoReceptor) {
		if(cantidadAEnviar > this.saldo) {
			throw new IllegalArgumentException("No puedes enviar más dinero del que tienes");
		}
		this.gastar(cantidadAEnviar);
		monederoReceptor.ingresar(cantidadAEnviar);
	}
	
	public void mostrarInfoMonedero() {
		System.out.printf("\nId: %d, Sueldo: %.02f", this.id, this.saldo);
	}
}
