package ejer2Vehiculo;

public class Bicicleta extends Vehiculo {
	
	public Bicicleta() {
		super();
	}
	public Bicicleta(double kilometrajeAnterior) {
		super(kilometrajeAnterior);
	}
	
	@Override
	public void anda() {
		System.out.print("\n*TICK TICK TICK*");
	}
	
	public void hacerCaballito() {
		System.out.print("\n*HOP HOP TICK TICK*");
	}
}
