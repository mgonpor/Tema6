package ejer4;

public class Slither {

	private int tamanyo;
	
	public Slither() {
		this.tamanyo = 5;
	}
	
	public int getTamanyo() {
		return this.tamanyo;
	}
	
	private void subirTamanyo(int cantidad) {
		this.tamanyo += Math.abs(cantidad) - 1;
	}
	
	public void comer(String comida) {
		switch (Comida.valueOf(comida.toUpperCase())) {
			case ROJO: 
				subirTamanyo(2);
				break;
			case NARANJA:
				subirTamanyo(5);
				break;
			case VERDE:
				subirTamanyo(10);
				break;
			default:
				System.out.print("\nNo es una comida");
		}
	}
	
	public void comer(Slither slither) {
		if(slither == null) {
			System.out.print("\nNo hay slither que comerse");
		}
		else if(slither.tamanyo < this.tamanyo) {
			this.subirTamanyo(slither.tamanyo);
			slither.tamanyo = 1;
		}
		else {
			slither.subirTamanyo(this.tamanyo);
			this.tamanyo = 1;
		}
	}
}
