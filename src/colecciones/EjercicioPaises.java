package colecciones;

import java.util.ArrayList;
import java.util.Iterator;

public class EjercicioPaises {

	/**
	 * ejercicio para aprender los metodos basicos de arraylist de java.util
	 * 
	 * @param args
	 */
	public static void main(String[] args)

	{
		// dinamicos, no tienen limite a diferencia del tipico array que son estaticos
		ArrayList<String> paises = new ArrayList<String>();

		// insertar
		paises.add("Brasil");
		paises.add("España");
		paises.add("Andorra");
		paises.add("Barakaldo");
		paises.add("Repelega");
		paises.add("Alemania");

		// insertar en una posicion
		paises.add(1, "Francia");

		// reemplazar
		paises.set(1, "EH");

		// eliminar por indice
		paises.remove(1);
		// eliminar por valor (Objeto)
		paises.remove("Barakaldo");

		// recuperar un objeto
		String s = paises.get(0);

		// longitud del arraylist
		paises.size();

		// obtener la posicion de un objeto
		int posicion = paises.indexOf("Repelega");

		// recorrer para mostrar
		for (Iterator<String> iterator = paises.iterator(); iterator.hasNext();) {

			String pais = (String) iterator.next();
			System.out.println(pais);
		}

	}

}
