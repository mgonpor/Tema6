package ejer1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean dentroDelMenu = true;
		List<Tarea> tareas = new ArrayList<Tarea>();
		List<Persona> personas = new ArrayList<Persona>();
		
		while(dentroDelMenu) {
			System.out.printf("\n\n1. Crear tarea"
					+ "\n2. Crear Persona"
					+ "\n3. Resolver tarea"
					+ "\n4. Mostrar listas"
					+ "\n0. Salir del menú \n");
			int eleccion = input.nextInt();
			
			switch (eleccion) {
				case 0: 
					System.out.printf("\nSaliendo...");
					dentroDelMenu = false;
					break;
					
				case 1:
					System.out.printf("\nIndique el número de ordenador: ");
					int nOrdenador = input.nextInt();	
					Tarea t = new Tarea(nOrdenador);
					tareas.add(t);
					break;
					
				case 2: 
					System.out.printf("\nIndique el nombre:");
					String nombre = input.next();
					System.out.println("\nIndique el apellido: ");
					String apellidos = input.next();
					Persona p = new Persona(nombre, apellidos);
					personas.add(p);
					break;
					
				case 3:
					System.out.printf("\nIndique el código de la tarea que desea resolver: ");
					int codTarea = input.nextInt();
					System.out.printf("\nIndique el código de la persona que la resuelve: ");
					int codPersona = input.nextInt();
					Tarea tt = null;
					Persona pp = null;
					for(Tarea elem : tareas) {
						if(elem.getCodigoTarea() == codTarea && elem.getEstado() == Estado.PENDIENTE) {
							tt = elem;
							break;
						}
					}
					for(Persona elem : personas) {
						if(elem.getCodigoEmpleado() == codPersona) {
							pp = elem;
							break;
						}
					}
					if(tt == null) {
						System.out.printf("\nNo se ha encontrado la tarea o ya está resuelta.");
					}else if(pp == null) {
						System.out.printf("\nNo se ha encontrado la persona.");
					}else {
						System.out.printf("\nIndique la solución o lo que ha fallado (una palabra): ");
						String problema = input.next();
						tt.resolverTarea(pp, problema);
					}
					break;
					
				case 4:
					if(tareas.size() == 0) {
						System.out.printf("\nLa lista 'tareas' está vacía.");
					}else {
						System.out.printf("\nTareas: ");
						for(Tarea elem : tareas) {
							elem.getInfoTarea();
						}
					}
					if(personas.size() == 0) {
						System.out.printf("\nLa lista 'personas' está vacía.");
					}else {
						System.out.printf("\nPersonas: ");
						for(Persona elem : personas) {
							elem.getInfoPersona();
						}
					}
					break;
					
				default:
					System.out.printf("\nOpción no válida, inténtelo de nuevo.\n");
			}
		}
		input.close();
	}

}
