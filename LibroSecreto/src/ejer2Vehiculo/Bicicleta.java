package ejer2Vehiculo;

import java.util.List;

public class Bicicleta extends Vehiculo {

	static List<Integer> listaBicicletas;
	
	public Bicicleta() {
		super();
		listaBicicletas.add(this.getId());
	}
	public Bicicleta(double kilometrajeAnterior) {
		super(kilometrajeAnterior);
		listaBicicletas.add(this.getId());
	}
	
	@Override
	public void anda() {
		System.out.print("\n*TICK TICK TICK*");
	}
	
	public void hacerCaballito() {
		System.out.print("\n*HOP HOP TICK TICK*");
	}
}
