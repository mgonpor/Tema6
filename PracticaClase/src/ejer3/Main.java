package ejer3;

public class Main {

	public static void main(String[] args) {

		Cupon c1 = new Cupon(50);
		Cupon c2 = new Cupon(40);
		
		c1.mostrarInfoCupon();
		c2.mostrarInfoCupon();
		
		c1.gastarCupon(20);
		
		c1.mostrarInfoCupon();
		c2.mostrarInfoCupon();
		
		Cupon c3 = Cupon.fusionarCupones(c1, c2);
		
		c1.mostrarInfoCupon();
		c2.mostrarInfoCupon();
		c3.mostrarInfoCupon();
		
	}

}
