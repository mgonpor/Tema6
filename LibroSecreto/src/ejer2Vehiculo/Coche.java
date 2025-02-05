package ejer2Vehiculo;

public class Coche extends Vehiculo {
	
	public Coche() {
		super();
	}
	public Coche(double kilometrajeAnterior) {
		super(kilometrajeAnterior);
	}
	
	@Override
	public void anda() {
		System.out.print("\n*BRUM BRUM*");
	}
	
	public void quemaRueda() {
		System.out.print("\n*RFFFFFFFFF*");
	}
}
