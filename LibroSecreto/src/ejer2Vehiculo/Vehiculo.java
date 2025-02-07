package ejer2Vehiculo;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehiculo {
	
	private static double kilometrosTotales;
	static List<Vehiculo> vehiculosCreados = new ArrayList<Vehiculo>();
	private static int ultimoId = 1;
	
	private double kilometrosRecorridos;
	private int id;
	
	public Vehiculo() {
		id = ultimoId++;
		kilometrosRecorridos = 0;
		vehiculosCreados.add(this);
	}
	public Vehiculo(double kilometrosAnteriores) {
		id = ultimoId++;
		kilometrosRecorridos = kilometrosAnteriores;
		vehiculosCreados.add(this);
	}
	
	public double getKilometrosRecorridos() {
		return kilometrosRecorridos;
	}
	public int getId() {
		return id;
	}
	
	public String toString() {
		return "\nId: "+id+", Kilometraje: " + kilometrosRecorridos;
	}
	
	public void addVehiculo() {
		
	}
	
	public static void actualizarKilometrosTotales() {
		kilometrosTotales = 0;
		for(Vehiculo elem:vehiculosCreados) {
			kilometrosTotales += elem.kilometrosRecorridos;
		}
	}
	
	public static void verKilometrosTotales() {
		actualizarKilometrosTotales();
		System.out.println("\nKilometros totales: "+kilometrosTotales);
	}
	
	public static void mostrarCoches() {
		System.out.print("\nCOCHES: ");
		for(Vehiculo elem:vehiculosCreados) {
			if(elem instanceof Coche) {
				elem.toString();
			}
		}
		System.out.println("--------------");
	}
	public static void mostrarBicicletas() {
		System.out.print("\nBICICLETAS: ");
		for(Vehiculo elem:vehiculosCreados) {
			if(elem instanceof Bicicleta) {
				elem.toString();
			}
		}
		System.out.println("--------------");
	}
	
	public void verKilometraje() {
		System.out.printf("\nLleva %.02f km encima", kilometrosRecorridos);
	}
	
	public void anda() {
		System.out.print("\nAndando...");
	}
}
