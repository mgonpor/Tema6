package ejer2Vehiculo;

import java.util.List;

public class Coche extends Vehiculo {
	
	static List<Integer> listaCoches;
	
	public Coche() {
		super();
		listaCoches.add(this.getId());
	}
	public Coche(double kilometrajeAnterior) {
		super(kilometrajeAnterior);
		listaCoches.add(this.getId());
	}
	
	@Override
	public void anda() {
		System.out.print("\n*BRUM BRUM*");
	}
	
	public void quemaRueda() {
		System.out.print("\n*RFFFFFFFFF*");
	}
}
