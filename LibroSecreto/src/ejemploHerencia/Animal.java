package ejemploHerencia;

public abstract class Animal {
	
	private Sexo sexo;
	
	public Animal () {
		sexo = Sexo.MACHO;
	}
	public Animal (Sexo s) {
		this.sexo = s;
	}
	public Animal (String s) {
		setSexo(s);
	}
	
	public Sexo getSexo() {
		return sexo;
	}
	
	public void setSexo(String s) {
		this.sexo = Sexo.valueOf(s);
	}
	
	public String toString() {
		return "Sexo: " + this.sexo.toString() + "\n";
	}
	
	//Hace que el animal se eche a dormir.
	public void duerme() {
		System.out.println("Zzzzzzz");
	}
	
	public void come() {
		System.out.println("Ñam ñam");
	}
}