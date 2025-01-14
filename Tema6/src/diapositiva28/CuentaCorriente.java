package diapositiva28;

import diapositiva47.Gestor;

public class CuentaCorriente {
	
	//Atributos
	String dni;
	public String nombre;
	private double saldo;
	private static String nombreDelBanco;
	Gestor gestor;
	
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
	
	//Get/Set
	public static void setNombreDelBanco(String nombreBancoNuevo) {
		if(nombreBancoNuevo.length()>3) {
			nombreDelBanco = nombreBancoNuevo;
		}
	}
	public static String getNombreDelBanco() {
		return nombreDelBanco;
	}
	
	public void setGestor() {
		
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
