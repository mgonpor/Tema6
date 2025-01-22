package main;

import maquinaria.*;
import personal.*;

public class Main {

	public static void main(String[] args) {

		Mecanico mec = new Mecanico("Manolo", "666888999", "FRENOS");
		Locomotora loc = new Locomotora(120, 1988, mec);
		Vagon vag = new Vagon(1000, 800, "GASES");
		Maquinista maq = new Maquinista("Pepe", "11112222T", 1500, null);
		Tren tren = new Tren(loc, maq);
		
		tren.anyadirVagon(vag);
		tren.getListaVagones();
		
		tren.retirarVagon(0);
		tren.getListaVagones();
	}

}
