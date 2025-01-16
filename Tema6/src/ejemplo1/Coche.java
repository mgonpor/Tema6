package ejemplo1;

public class Coche {
	
	private String matricula;
	private TipoCombustible combustible;
	private int kilometraje;
	
	public Coche(String matricula, String combustible, int kilometraje) {
		
		setMatricula(matricula);
		setCombustible(combustible);
		setKilometraje(kilometraje);
		
	}
	
	public void setMatricula(String matricula) {
		if(matricula == null || matricula.length() != 7) {
			throw new IllegalArgumentException("Matrícula incorrecta");
		}
		this.matricula = matricula;
	}
	
	
	public String getCombustible() {
		return this.combustible.toString();
	}
	public void setCombustible(String combustible) {
		this.combustible = TipoCombustible.valueOf(combustible);
	}
	
	public void setKilometraje(int kilometraje) {
		if(kilometraje < 0) {
			throw new IllegalArgumentException("No puede haber kilometraje negativo");
		}
		this.kilometraje = kilometraje;
	}
}
