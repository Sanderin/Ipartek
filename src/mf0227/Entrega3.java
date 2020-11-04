package mf0227;

import java.util.ArrayList;
import java.util.Scanner;

public class Entrega3 extends AppGestion {
	static LibroDao modelo = ImplementarDao.getInstance();
	static boolean salir = false;
	static Scanner sc = new Scanner(System.in);
	static String opcion = "";

	public static void main(String[] args) {

		System.out.println("********  LIBRERIA  ********");
		do {

			pintarMenu("libro");

			System.out.println("\n Selecciona una opcion del menu:");
			opcion = sc.nextLine();

			switch (opcion) {
			case OP_LISTAR:
				listar();
				break;

			case OP_CREAR:
				crear();
				break;

			case OP_ELIMINAR:
				eliminar();
				break;
			case OP_MODIFICAR:
				System.out.println("esta opcion aun no esta implementada \n");
				break;

			case OP_SALIR:
				salir = true;
				System.out.println("ADIOS");
				break;

			default:
				System.out.println(" ** por favor selecciona una opción valida ** ");
				break;
			}

		} while (!salir);
	}

	private static void listar() {// listar

		ArrayList<Libro> libros = (ArrayList<Libro>) modelo.getAll();
		System.out.println("\nlistado \n");

		for (Libro libro : libros) {
			System.out.println("id: " + libro.getId() + " nombre: " + libro.getNombre());
		}
		System.out.println("\n");
	}// fin listar

	private static void crear() {// crear libro
		String nombre = "";
		int paginas = 0;
		System.out.println("introduce el nombre del libro");
		nombre = sc.nextLine();

		try {
			System.out.println("introduce las paginas del libro");
			paginas = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("introduce un numero");
		}
		Libro l = new Libro(nombre, paginas);
		modelo.insert(l);

	}// fin crear libro

	private static void eliminar() {// eliminar
		int id;
		System.out.println("introduce el id del libro a borrar");
		id = Integer.parseInt(sc.nextLine());

		if (modelo.delete(id) == false) {
			System.out.println("no existe ese id");
		} else {
			System.out.println("libro eliminado");
		}

	}// fin eliminar

	private static void modificar() {// siguiente version

		System.out.println("aun no esta implementado");
	}

}
