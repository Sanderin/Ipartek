package entregas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {

	/**
	 * B) Crear un proyecto en modo consola que nos muestre un menú de 3 opciones
	 * Calcular la letra del dni Calcular medida de cm a pulgadas Salir Hacer que
	 * dicho menú se ejecute en bucle hasta que se pulse salir, y si el usuario
	 * escoge cada una de las funciones, que permita introducir los datos
	 * correspondientes por teclado para poder dar el resultado
	 * 
	 * @param args
	 */
	static Scanner sc = null; // datos introducidos por teclado
	static ArrayList<String> dni = new ArrayList<String>(); // numero dni
	static String opcion = ""; // opcion seleccionada en el menu por el usuario
	static final String LETRA = "1", MEDIDA = "2", SALIR = "s"; // opciones del menu

	/*
	 * main donde llamamos a las funciones para crear el menu, pedir el dni para
	 * calcular la letra y pedir la distancia en centimetros
	 */
	public static void main(String[] args) throws Exception {

		System.out.println("*************  MENU  ****************");
		System.out.println("");
		sc = new Scanner(System.in);

		do {
			menu();

			switch (opcion) {
			case LETRA:
				dni();
				break;

			case MEDIDA:
				medida();
				break;

			case SALIR:
				break;

			default:
				System.out.println("introduce una opcion valida");
				break;
			}

		} while (!SALIR.equalsIgnoreCase(opcion));

		System.out.println("*************  FIN MENU  ***************");
		sc.close();

	}

	private static void menu() { // creamos el menu de seleccion

		System.out.println("**********************************************");
		System.out.println(LETRA + " - Calcular letra DNI");
		System.out.println(MEDIDA + " - Calcular medida de cm a pulgadas");
		System.out.println("s - Salir");
		System.out.println("***********************************************");

		System.out.println("\n Selecciona una opcion del menu:");
		opcion = sc.nextLine();
	}

	private static void medida() { // calculamos la medida en pulgadas
		float distancia, resultado;

		System.out.println("introduce una distancia en cm");
		distancia = sc.nextFloat();

		resultado = distancia / 2.54f;
		System.out.println("la distancia " + distancia + " cm, equivale a: " + resultado + " pulgadas");
		System.out.println("");
		System.out.println("");

	}

	private static void dni() throws Exception { // pedimos el dni y calculamos la letra

		String numDni = "";

		System.out.println("introduce los numeros del DNI");
		numDni = sc.nextLine();

		char letraDni[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
				'H', 'L', 'C', 'K', 'E' };

		if (numDni == null) {
			throw new Exception("No puede ser null");
		}

		if (numDni.length() != 8) {
			throw new Exception("Los numeros de un dni son 8");
		}

		int calculoDni = Integer.parseInt(numDni) % 23;

		System.out.println("la letra del dni " + numDni + " es la " + letraDni[calculoDni]);
		// return letraDni[calculoDni];
	}
}
