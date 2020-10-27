package listas;

import java.util.ArrayList;

public class Ejer1 {

	/**
	 * Crear una lista de nombres de alumnos, donde se guardaran con strings.
	 * Insertar diez nombres de alumnos en la lista Mostrar los diez nombres
	 * recorriendo la lista con un foreach
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// dinamicos, no tienen limite a diferencia del tipico array que son estaticos
		ArrayList<String> alumnos = new ArrayList<String>();

		// creamos los alumnos
		String a1 = new String("Alex");
		String a2 = new String("Carlos");
		String a3 = new String("Jon");
		String a4 = new String("Iñigo");
		String a5 = new String("Irene");
		String a6 = new String("Ortega");
		String a7 = new String("Edu");
		String a8 = new String("Aritz");

		// insertar
		alumnos.add(a1);
		alumnos.add(a2);
		alumnos.add(a3);
		alumnos.add(a4);
		alumnos.add(a5);
		alumnos.add(a6);
		alumnos.add(a7);
		alumnos.add(a8);

		for (String string : alumnos) {
			System.out.println(alumnos);
		}

	}

}
