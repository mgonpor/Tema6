package ejer2Vehiculo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		menu(sc);

	}

	public static void menu(Scanner sc) {
		int opcion;
		do {
			System.out.print("\nVEHICULOS"
					+ "\n==========="
					+ "\n1. Anda con la bicicleta"
					+ "\n2. Haz el caballito con la bicicleta"
					+ "\n3. Anda con el coche"
					+ "\n4. Quema rueda con el coche"
					+ "\n5. Ver kilometraje de la bicicleta"
					+ "\n6. Ver kilometraje del coche"
					+ "\n7. Ver kilometraje total"
					+ "\n8. Salir"
					+ "\nElige una opción (1-8): ");
			opcion = sc.nextInt();
			switch (opcion) {
				case 1: 
					queBicicleta(sc).anda();
					break;
				case 2: 
					queBicicleta(sc).hacerCaballito();
					break;
				case 3: 
					queCoche(sc).anda();
					break;
				case 4: 
					queCoche(sc).quemaRueda();
					break;
				case 5: 
					queBicicleta(sc).verKilometraje();
					break;
				case 6: 
					queCoche(sc).verKilometraje();
					break;
				case 7: 
					Vehiculo.verKilometrosTotales();
					break;
				case 8: 
					System.out.println("¡Hasta pronto!");
					break;
				default:
					System.out.printf("\nRecuerda, las opciones son del 1 al 8");
			}
			System.out.println();
		}while(opcion != 8);
	}
	
	public static Coche queCoche(Scanner sc) {
		Coche result = null;
		int opcion;
		Vehiculo.mostrarCoches();
		do {
			System.out.print("\nElige: ");
			opcion = sc.nextInt();
			for(int i=0; i<Vehiculo.vehiculosCreados.size(); i++) {
				if(Vehiculo.vehiculosCreados.get(i) instanceof Coche && Vehiculo.vehiculosCreados.get(i).getId() == opcion) {
					result = (Coche) Vehiculo.vehiculosCreados.get(i);
					result.toString();
				}
			}
		}while(result == null);
		return result;
	}
	
	public static Bicicleta queBicicleta(Scanner sc) {
		Bicicleta result = null;
		int opcion;
		Vehiculo.mostrarBicicletas();
		do {
			System.out.print("\nElige: ");
			opcion = sc.nextInt();
			for(int i=0; i<Vehiculo.vehiculosCreados.size(); i++) {
				if(Vehiculo.vehiculosCreados.get(i) instanceof Bicicleta && Vehiculo.vehiculosCreados.get(i).getId() == opcion) {
					result = (Bicicleta) Vehiculo.vehiculosCreados.get(i);
					result.toString();
				}
			}
		}while(result == null);
		return result;
	}
}
