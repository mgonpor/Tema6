package diapositiva62;

public class Main62 {

	public static void main(String[] args) {

		Bombilla b1 = new Bombilla();
		Bombilla b2 = new Bombilla(true);
		
		b1.mostrarEstado();
		b2.mostrarEstado();
		
		Bombilla.pulsarInterruptorGeneral();

		System.out.println();
		b1.mostrarEstado();
		b2.mostrarEstado();
		
		Bombilla.pulsarInterruptorGeneral();

		System.out.println();
		b1.mostrarEstado();
		b2.mostrarEstado();
		
		b1.pulsarInterruptor();
		b2.pulsarInterruptor();

		System.out.println();
		b1.mostrarEstado();
		b2.mostrarEstado();

	}

}
