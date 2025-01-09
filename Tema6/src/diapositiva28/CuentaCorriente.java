package diapositiva28;

public class CuentaCorriente {
	
	//Atributos
	String dni;
	String nombre;
	double saldo;
	
	//Constructores
	public CuentaCorriente(String dni, String nombre, double saldo) {
		if(dni==null || dni.length() != 9) {
			throw new IllegalArgumentException("El DNI debe tener 9 carácteres");
		}
		if(nombre == null || nombre.isBlank()) {
			throw new IllegalArgumentException("El nombre no puede ser vacío, ni en blanco, ni nulo");
		}
		if(saldo < 0) {
			throw new IllegalArgumentException("El saldo inicial debe ser positivo");
		}
		
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = saldo;
	}
	public CuentaCorriente(String dni, String nombre) {
		if(dni==null || dni.length() != 9) {
			throw new IllegalArgumentException("El DNI debe tener 9 carácteres");
		}
		if(nombre == null || nombre.isBlank()) {
			throw new IllegalArgumentException("El nombre no puede ser vacío, ni en blanco, ni nulo");
		}
		
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = 0.0;
	}
	
	//Métodos
	void ingresarDinero(double ingreso) {
		if(ingreso < 0) {
			throw new IllegalArgumentException("No puedes ingresar cantidades negativas");
		}
		
		this.saldo += ingreso;
	}
	void retirarDinero(double retirada) {
		if(retirada > this.saldo) {
			throw new IllegalArgumentException("No puedes retirar más dinero del que hay");
		}
		
		this.saldo -= retirada;
	}
	void mostrarInformacion() {
		System.out.println("\nDueño: " + this.nombre);
		System.out.println("DNI: " + this.dni);
		System.out.println("Saldo: " + this.saldo);
	}
	
}
