package excepciones;

import java.util.ArrayList;
import java.util.Scanner;

import pojo.Persona;

public class Ejer4 {

	/**
	 * Crea una clase Persona con los atributos nombre y edad. En el método setEdad
	 * lanzar una excepción si la edad introducida es menor que 0 o mayor que 120.
	 * Realiza un programa que al comienzo cree una lista de personas haciendo uso
	 * del constructor vacío, y lea los datos por teclado y los asigne a los objetos
	 * creados. Solo introducirá las personas en la lista si están en el rango de
	 * edad indicado, comprobándolo mediante el uso de excepciones
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int contador = 0, edad = 0;
		boolean error = false;
		String nombre = "";
		Scanner sc = new Scanner(System.in);
		// Lo que aparece entre <> se llama CASTEAR y sirve para indicar el tipo de
		// Objetos que tenemos dentro del Array
		ArrayList<Persona> lista = new ArrayList<Persona>();

		do {

			try {
				/*
				 * Persona p1 = new Persona(); p1.setNombre("pepe"); p1.setEdad(56);
				 * 
				 * lista.add(p1);
				 * 
				 * Persona p2 = new Persona(); p2.setNombre("Matusalem"); p2.setEdad(300);
				 * 
				 * // CUIDADO lanza una Exception y va directo al Catch, no ejecuta las lineas
				 * de // abajo lista.add(p2);
				 * 
				 * Persona p3 = new Persona(); p3.setNombre("Manolo"); p3.setEdad(-10);
				 * 
				 * lista.add(p3);
				 */
				System.out.println("introduce el nombre de la persona numero " + (contador + 1) + ": ");
				nombre = sc.nextLine();

				System.out.println("introduce la edad de la persona numero " + (contador + 1) + ": ");
				edad = Integer.parseInt(sc.nextLine());

				Persona p = new Persona();
				p.setNombre(nombre);
				p.setEdad(edad);

				lista.add(p);
				contador++;

			} catch (Exception e) {
				System.out.println(e.getMessage());
				error = true;

			} finally {

				// foreach para iterar sobre el ArrayList<Perona>
				for (Persona p : lista) {
					System.out.println(p);
					System.out.println("");
				}

			}
		} while (error == false);
	}
}
