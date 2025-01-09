package diapositiva28;

public class Main {

	public static void main(String[] args) {

		CuentaCorriente c1 = new CuentaCorriente("12345678T", "miguel");
		CuentaCorriente c2 = new CuentaCorriente("98765432G", "maria", 100);
		
		c1.mostrarInformacion();
		c2.mostrarInformacion();
		
		c1.ingresarDinero(500);
		c1.mostrarInformacion();
		
		c2.retirarDinero(90);
		c2.mostrarInformacion();
		
	}

}
