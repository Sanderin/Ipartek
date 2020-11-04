package mf0227;

import java.util.ArrayList;
import java.util.Scanner;

public class Entrega3 extends AppGestion {
	static LibroDao modelo = ImplementarDao.getInstance();
	static boolean salir = false;
	static Scanner sc = new Scanner(System.in);
	static String opcion = "";

	public static void main(String[] args) {

		do {

			pintarMenu("libro");

			System.out.println("\n Selecciona una opcion del menu:");
			opcion = sc.nextLine();

			switch (opcion) {
			case OP_LISTAR:
				listar();
				break;

			case OP_CREAR:

				break;

			case OP_ELIMINAR:

				break;
			case OP_MODIFICAR:
				System.out.println("esta opcion aun no esta implementada \n");
				break;

			case OP_SALIR:
				salir = true;
				System.out.println("***********  ADIOS, nos vemos pronto   **************");
				break;

			default:
				System.out.println(" ** por favor selecciona una opción valida ** ");
				break;
			}

		} while (!salir);

	}

	private static void listar() {

		ArrayList<Libro> libros = (ArrayList<Libro>) modelo.getAll();
		System.out.println("\nlistado \n");

		for (Libro libro : libros) {
			System.out.println("id: " + libro.getId() + " nombre: " + libro.getNombre());
		}
		System.out.println("\n");
	}

	private static void crear() {

	}

	private static void eliminar() {

	}

	private static void modificar() {// siguiente version

		System.out.println("aun no esta implementado");
	}

}
