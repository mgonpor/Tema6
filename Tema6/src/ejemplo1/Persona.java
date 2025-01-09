package ejemplo1;

public class Persona {
	
	//Atributos
	int id;
	String nombre;
	int edad;
	double estatura;
	Coche coche;
	
	//Atributos estáticos
	static int contadorId = 1;
	static String diaSemana = "lunes";
	
	//Constructores
	public Persona(String nombre, int edad, double estatura){
		if(nombre.isBlank() || nombre == null) {
			throw new IllegalArgumentException("El nombre no puede ser vacío, ni en blanco, ni nulo"); 
		}
		if(edad < 18) {
			throw new IllegalArgumentException("La edad no puede menor de 18 años");
		}
		if(estatura < 1.0) {
			throw new IllegalArgumentException("La estatura no puede ser menor de 1 metro");
		}
		
		this.id = Persona.contadorId++;
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
	}
	public Persona(String nombre){
		if(nombre.isBlank() || nombre == null) {
			throw new IllegalArgumentException("El nombre no puede ser vacío, ni en blanco, ni nulo"); 
		}
		
		this.id = Persona.contadorId++;
		this.nombre = nombre;
		this.edad = 18;
		this.estatura = 1.0;
	}
	public Persona(){
		this.id = Persona.contadorId++;
		this.nombre = "Desconocido";
		this.edad = 18;
		this.estatura = 1.0;
	}
	
	//Métodos
	void saludar(){
		System.out.println("Hola. Mi nombre es " + this.nombre);
		System.out.println("Encantado de conocerte");
	}
	void cumplirAnyos(){
		this.edad++;
	}
	void crecer() {
		this.estatura += 0.01;
	}	
	void crecer(double estatura){
		this.estatura += estatura;
	}
	void presentarse() {
		System.out.println("Mi nombre es " + this.nombre);
		System.out.println("Mi id es " + this.id);
		System.out.println("Tengo "+ this.edad + " años");
		System.out.println("Mido " + this.estatura + "m");
		System.out.println("El contador está " + Persona.contadorId);
	}
	
	//Métodos estáticos
	
}
