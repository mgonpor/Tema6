package ejer3;

import java.util.Random;

public class Cupon {

	Random rand = new Random();
	
	private int codigoCupon;
	private double saldo;
	
	public Cupon(double saldo) {
		generaCodigoCupon();
		setSaldo(saldo);
	}
	
	public int getCodigoCupon() {
		return this.codigoCupon;
	}
	public double getSaldo() {
		return this.saldo;
	}
	
	private void generaCodigoCupon() {
		this.codigoCupon = rand.nextInt(10000, 100000);
	}
	private void setSaldo(double saldo) {
		if(saldo < 0) {
			throw new IllegalArgumentException("No se puede poner un saldo negativo");
		}
		this.saldo = saldo;
	}
	
	public void gastarCupon(double cantidad) {
		if(Math.abs(cantidad) > this.saldo) {
			throw new IllegalArgumentException("No se puede gastar más que el saldo del cupón");
		}
		this.saldo -= Math.abs(cantidad);
	}
	
	public void mostrarInfoCupon() {
		System.out.printf("\nCod: %d, Saldo: %.02f", this.codigoCupon, this.saldo);
	}
	
	public static Cupon fusionarCupones(Cupon primerCupon, Cupon segundoCupon) {
		double cantidadTotal = primerCupon.saldo + segundoCupon.saldo;
		primerCupon.gastarCupon(primerCupon.saldo);
		segundoCupon.gastarCupon(segundoCupon.saldo);
		Cupon c = new Cupon(cantidadTotal);
		return c;
	}
	
}
