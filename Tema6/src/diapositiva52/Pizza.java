package diapositiva52;

public class Pizza {

	private Tamanyo tamanyo;
	private Tipo tipo;
	private Estado estado;
	
	private static int pedidas;
	private static int servidas;
	
	public Pizza(String tamanyo, String tipo) {
		setTamanyo(tamanyo);
		setTipo(tipo);
		this.estado = Estado.PEDIDA;
		Pizza.pedidas++;
	}

	//SetGet
	public void setTamanyo(String tamanyo) {
		this.tamanyo = Tamanyo.valueOf(tamanyo);
	}
	public String getTamanyo() {
		return tamanyo.toString();
	}
	
	public void setTipo(String tipo) {
		this.tipo = Tipo.valueOf(tipo);
	}
	public String getTipo() {
		return tipo.toString();
	}
	
	public String getEstado() {
		return estado.toString();
	}

	public static int getPedidas() {
		return Pizza.pedidas;
	}
	public static int getServidas() {
		return Pizza.servidas;
	}

	//Métodos
	void servir() {
		if(this.estado.equals(Estado.SERVIDA)) {
			throw new IllegalStateException("La pizza ya estaba servida");
		}
		this.estado = Estado.SERVIDA;
		Pizza.servidas++;
	}
}
