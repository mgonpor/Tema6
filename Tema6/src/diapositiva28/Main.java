package diapositiva28;

import diapositiva47.Gestor;

public class Main {
	
	public static void main(String[] args) {

		CuentaCorriente cc1 = new CuentaCorriente("46546546X", "Vladi");
		
		Gestor g1 = new Gestor("Manolo", "666666661");
		
		CuentaCorriente cc2 = new CuentaCorriente("45645645T", "Pepe", 1000.0, g1);
		
		cc1.mostrarInformacion();
		cc2.mostrarInformacion();
		
	}

}
