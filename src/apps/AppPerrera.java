package apps;

import java.util.ArrayList;
import java.util.Scanner;

import pojo.Perro;

/**
 * aplicacion para una perrera
 * 
 * @author Alexander Saiz
 *
 */

public class AppPerrera {
	// variables globales para esta Clase TODO hacer privadas

	static Scanner sc = null; // datos introducidos por teclado
	static ArrayList<Perro> lista = new ArrayList<Perro>(); // lista de perros
	static String opcion = ""; // opcion seleccionada en el menu por el usuario
	static final String LISTAR = "1", CREAR = "2", BAJA = "3", CAMBIAR = "4", SALIR = "s"; // opciones del menu
	static boolean salir = false;

	// main TODO capturar excepciones
	public static void main(String[] args) {

		System.out.println("***********  Bienvenido a PerroComponentes  **************");
		System.out.println("");
		sc = new Scanner(System.in);
		incializarDatos();

		do {
			pintarMenu();

			switch (opcion) {
			case LISTAR:
				listar();
				break;

			case CREAR:
				crearPerro();
				break;
			case BAJA:
				darBaja();
				break;
			case CAMBIAR:
				cambiarPerro();
				break;
			case "5":
				System.out.println("Sin Terminar");
				break;
			case SALIR:
				break;

			default:
				System.out.println("introduce una opcion valida");
				break;
			}

		} while (!SALIR.equalsIgnoreCase(opcion));

		System.out.println("*************************  FIN  **************************");
		sc.close();

	}// fin main

	// cambiarPerro
	private static void cambiarPerro() {
		String nombre = "";
		String nombreNuevo = "";
		System.out.println("introduce el nombre del perro que quieres cambiar");
		nombre = sc.nextLine();

		System.out.println("introduce el nuevo nombre del perro");
		nombreNuevo = sc.nextLine();

		/*
		 * recorremos la lista comprobando si el nombre introducido coincide con alguno
		 * de la lista
		 */
		if (!nombreNuevo.equals("")) {

			for (Perro perro : lista) {
				String p = perro.getNombre();

				// si el nombre coincide cambiamos el nombre del bicho
				if (p.equalsIgnoreCase(nombre)) {
					perro.setNombre(nombreNuevo);
					break;
				}
			}

		} else {
			System.out.println("debes introducir un nombre nuevo");
			System.out.println("");
		}

	}// fin cambiarPerro

	// dar baja a un perro FUNCIONA
	private static void darBaja() {
		String nombre = "";

		System.out.println("introduce el nombre del perro que quieres dar de baja");
		nombre = sc.nextLine();

		/*
		 * recorremos la lista comprobando si el nombre introducido coincide con alguno
		 * de la lista
		 */
		for (Perro perro : lista) {
			String p = perro.getNombre();

			// si el nombre coincide eliminamos el perro de la lista y salimos del bucle
			if (p.equalsIgnoreCase(nombre)) {
				lista.remove(perro);
				break;
			}
		}
	}// fin darBaja

	// funcion para crear perros y añadirlos a la lista FUNCIONA
	private static void crearPerro() {

		String nombre = "", raza = "";

		System.out.println("introduce el nombre del perro");
		nombre = sc.nextLine();

		System.out.println("introduce la raza del perro");
		raza = sc.nextLine();

		if (!nombre.equals("") || !raza.equals("")) {
			Perro p = new Perro();
			p.setNombre(nombre);
			p.setRaza(raza);
			lista.add(p);
		} else {
			System.out.println("debes introducir tanto el nombre como la raza del perro");
			System.out.println("");
		}
		/*
		 * for (Perro perro : lista) { System.out.println(perro.getNombre() + " " +
		 * perro.getRaza());
		 */

	}// fin crearPerro

	// funcion para listar, primera opcion del menu FUNCIONA
	private static void listar() {

		for (Perro perro : lista) {
			System.out.println(perro.getNombre() + " " + perro.getRaza());
		}

	}// fin listar

	// funcion para la inicializacion de datos FUNCIONA
	private static void incializarDatos() {

		lista.add(new Perro("kiss"));
		lista.add(new Perro("pretty"));
		lista.add(new Perro("megatron"));
		lista.add(new Perro("rex"));

	}// fin inicializarDatos

	// funcion para crear el menu de seleccion
	private static void pintarMenu() {

		System.out.println("************************************");
		System.out.println(LISTAR + " - Lista de todos los perros");
		System.out.println(CREAR + " - Crear un perro");
		System.out.println(BAJA + " - Dar de baja un Perro");
		System.out.println(CAMBIAR + " - Cambiar nombre del perro");
		System.out.println("5 - Otros");
		System.out.println("s - Salir");
		System.out.println("************************************");

		System.out.println("\n Selecciona una opcion del menu:");
		// TODO gestionar errores
		opcion = sc.nextLine();

	}// fin pintar menu

}// AppPerrera
