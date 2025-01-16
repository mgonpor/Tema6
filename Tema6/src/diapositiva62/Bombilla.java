package diapositiva62;

public class Bombilla {

	private boolean estadoBombilla;
	
	private static boolean interruptorGeneral = true;
	
	public Bombilla(boolean estadoBombilla) {
		this.estadoBombilla = estadoBombilla;
	}
	public Bombilla() {
		this.estadoBombilla = false;	//Por defecto, cada bombilla nueva estará apagada
	}
	
//	public boolean getEstadoBombilla() {
//		return this.estadoBombilla;
//	}
//	public static boolean getInterruptorGeneral() {
//		return Bombilla.interruptorGeneral;
//	}
	
	//Métodos
	static void pulsarInterruptorGeneral() {
		interruptorGeneral = !interruptorGeneral;
	}
	
	void pulsarInterruptor() {
		estadoBombilla = !estadoBombilla;
	}
	void mostrarEstado() {
		if(estadoBombilla && interruptorGeneral) {
			System.out.println("Encendida");
		}
		else {
			System.out.println("Apagada");
		}
	}
}
