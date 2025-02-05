package ejemploHerencia;

public class Gato extends Animal implements Mascota {
	
	private String raza;
	
	public Gato (Sexo s, String r) {
		super(s);
		raza = r;
	}
	public Gato (Sexo s) {
		super(s);
		raza = "siamés";
	}
	public Gato (String r) {
		super(Sexo.HEMBRA);
		raza = r;
	}
	public Gato () {
		super(Sexo.HEMBRA);
		raza = "siamés";
	}
	
	public String toString() {
		return super.toString()
		+ "Raza: " + this.raza
		+ "\n*************************\n";
	}
	
//	Hace que el gato maulle.
	public void maulla() {
		System.out.println("Miauuuu");
	}

//	Hace que el gato ronronee
	public void ronronea() {
		System.out.println("mrrrrrr");
	}
	
// Interface
	private String codigo;
	
	@Override
	public String getCodigo() {
		return this.codigo;
	}
	
//	Hace que el gato emita sonidos.
	@Override
	public void hazRuido() {
		this.maulla();
		this.ronronea();
	}

//	Hace que el gato coma.
//	A los gatos les gusta el pescado, si le damos otra comida
//	la rechazará.
//
//	@param comida la comida que se le ofrece al gato
	@Override
	public void come(String comida) {
		if (comida.equals("pescado")) {
			super.come();
			System.out.println("Hmmmm, gracias");
		} else {
			System.out.println("Lo siento, yo solo como pescado");
		}
	}
	
//	Pone a pelear dos gatos.
//	Solo se van a pelear dos machos entre sí.
//	
//	@param contrincante es el gato contra el que pelear
	@Override
	public void peleaCon(Animal contrincante) {
		if (this.getSexo() == Sexo.HEMBRA) {
			System.out.println("no me gusta pelear");
		} else {
			if (contrincante.getSexo() == Sexo.HEMBRA) {
				System.out.println("no peleo contra hembras");
			} else {
				System.out.println("ven aquí que te vas a enterar");
			}
		}
	}
}