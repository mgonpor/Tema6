package ejemploHerencia;

public class Pinguino extends Ave {
	public Pinguino() {
		super();
	}
	public Pinguino(String s) {
		super(s);
	}
	public Pinguino(Sexo s) {
		super(s);
	}
	
	//El pingüino se siente triste porque no puede volar.
	@Override
	public void vuela() {
		System.out.println("No puedo volar");
	}
}