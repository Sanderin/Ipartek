package colecciones;

import java.util.ArrayList;
import java.util.Iterator;

import pojo.Perro;

public class EjerPerros {

	public static void main(String[] args) {

		// dinamicos, no tienen limite a diferencia del tipico array que son estaticos
		ArrayList<Perro> perros = new ArrayList<Perro>();

		// creamos los perros
		Perro p1 = new Perro("kiss");
		Perro p2 = new Perro("pretty");
		Perro p3 = new Perro("megatron");
		Perro p4 = new Perro("dogo");
		Perro p5 = new Perro("gandalf");
		Perro p6 = new Perro("snape");
		Perro p7 = new Perro("agallas");
		Perro p8 = new Perro("rex");

		// insertar
		perros.add(p1);
		perros.add(p2);
		perros.add(p3);
		perros.add(p4);
		perros.add(p5);
		perros.add(p6);

		// insertar objeto en posicion
		perros.add(2, p7);

		// reemplazar objeto en posicion
		perros.set(4, p8);

		// eliminar por indice
		perros.remove(5);

		// eliminar por valor (Objeto)
		perros.remove("megatron");

		// recuperar un objeto
		String s = perros.get(1).toString();

		// longitud del arraylist
		perros.size();

		// obtener la posicion de un objeto int posicion =
		perros.indexOf("kiss");

		// recorrer para mostrar
		for (Iterator<Perro> iterator = perros.iterator(); iterator.hasNext();) {

			String perro = iterator.next().toString();
			System.out.println(perro);
		}

	}

}
