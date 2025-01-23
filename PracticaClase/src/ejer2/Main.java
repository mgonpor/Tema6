package ejer2;

public class Main {

	public static void main(String[] args) {
		
		Monedero m1 = new Monedero();
		Monedero m2 = new Monedero(1000);
		
		m1.mostrarInfoMonedero();
		m2.mostrarInfoMonedero();
		
		m2.transferencia(400, m1);
		
		m1.mostrarInfoMonedero();
		m2.mostrarInfoMonedero();
		
		m2.transferencia(600, m1);
		
		m1.mostrarInfoMonedero();
		m2.mostrarInfoMonedero();
	}

}
