package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListEjemplos {

	public static void main(String[] args) {
		// LinkedList
		List<String> lista1 = new LinkedList<String>();

		// A�adimos nodos y creamos un Iterator
		lista1.add("Valencia");
		lista1.add("Sevilla");
		lista1.add("Madrid");

		Collections.sort(lista1);
		Iterator iterador = lista1.iterator();

		// Recorremos y mostramos la lista
		while (iterador.hasNext()) {
			String elemento = (String) iterador.next();
			System.out.print(elemento + " ");
		}
		System.out.println("--LinkedList--");

		// ArrayList
		List<String> lista2 = new ArrayList<String>();

		// A�adimos nodos y creamos un Iterator
		lista2.add("Madrid");
		lista2.add("Sevilla");
		lista2.add("Valencia");

		// la api de Collections tiene metodos para ordenar listas
		Collections.reverse(lista2);
		Iterator iterador2 = lista2.iterator();

		// Recorremos y mostramos la lista
		while (iterador2.hasNext()) {
			String elemento = (String) iterador2.next();
			System.out.print(elemento + " ");
		}
		System.out.println("--ArrayList--");

	}

}
