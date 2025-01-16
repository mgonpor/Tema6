package diapositiva53;

public class RadioFM {

	private double frecuencia;
	
	public RadioFM(double frecuencia) {
		setFrecuencia(frecuencia);
	}
	public RadioFM() {
		setFrecuencia(80);
	}
	
	//SetGet
	public void setFrecuencia(double frecuencia) {
		if(frecuencia < 80 || frecuencia > 108) {
			throw new IllegalArgumentException("Frecuencia fuera de límites");
		}
		this.frecuencia = frecuencia;
	}
	public double getFrecuencia() {
		return this.frecuencia;
	}
	
	//Métodos
	void display() {
		System.out.println(this.frecuencia + " MHz");
	}
	void up() {
		if(this.frecuencia == 108) {
			this.frecuencia = 80;
		}
		else {
			this.frecuencia += 0.5;
		}
	}
	void down() {
		if(this.frecuencia == 80) {
			this.frecuencia = 108;
		}
		else {
			this.frecuencia -= 0.5;
		}
	}

}
