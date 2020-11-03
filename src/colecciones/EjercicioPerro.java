package colecciones;

import java.util.ArrayList;

import pojo.Perro;

/**
 * Ejercicio para aprender los metodos b�sicos de java.util.ArrayList
 * 
 * @author ur00
 *
 */
public class EjercicioPerro {

	public static void main(String[] args) {

		ArrayList<Perro> lista = new ArrayList<Perro>();

		lista.add(new Perro("Bubba"));
		lista.add(new Perro("Laika"));
		lista.add(new Perro("Rintintin"));
		lista.add(new Perro("goffy"));

		// vamos a recorrer el array para buscar a "Rintintin"
		for (int i = 0; i < lista.size(); i++) {

			Perro pIteracion = lista.get(i);

			if ("Rintintin".equals(pIteracion.getNombre())) {
				lista.remove(i);
				break; // salir del for
			}

		} // for

		System.out.println("Agur Venur");

	}

}
