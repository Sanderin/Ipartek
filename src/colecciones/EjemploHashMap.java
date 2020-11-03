package colecciones;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import pojo.Perro;

public class EjemploHashMap {

	public static void main(String[] args) {
		// Definir un HashMap
		// Definir un HashMap
		HashMap<String, String> global = new HashMap<String, String>();

		// Insertar valores "key"-"value" al HashMap
		global.put("Laura", "667895789");
		global.put("Pepe", "645895756");
		global.put("Abelardo", "55895711");
		global.put("Daniel", "667111788");
		global.put("Arturo", "667598623");

		// probar a meter un duplicado
		global.put("Arturo", "666555444");

		// recuperar el value por la Key
		String telefonoPepe = global.get("Pepe");

		// obtener todas las Keys
		Set<String> keys = global.keySet();

		// obtener todos los values
		Collection<String> values = global.values();

		// Definir Iterator para extraer o imprimir valores
		for (Iterator<String> it = global.keySet().iterator(); it.hasNext();) {
			String key = (String) it.next();
			String value = (String) global.get(key);
			System.out.println("Alumno: " + key + " - " + "Telefono: " + value);
		}

		// definir una hashamp con perros la key ser� su id(int) y el value(Perro)
		HashMap<Integer, Perro> hmPerros = new HashMap<Integer, Perro>();

		Perro p1 = new Perro("kiss");
		Perro p2 = new Perro("pretty");
		Perro p3 = new Perro("snoopy");

		// meter 2 perros
		hmPerros.put(p1.getId(), p1);
		hmPerros.put(p2.getId(), p2);
		hmPerros.put(p3.getId(), p3);

		// obtener todas las Keys
		Set<Integer> keys2 = hmPerros.keySet();

		// obtener todos los values
		Collection<Perro> values2 = hmPerros.values();

		// recorrer con un Iterator
		for (Iterator<Integer> it2 = hmPerros.keySet().iterator(); it2.hasNext();) {
			Integer key2 = it2.next();
			Perro value = (Perro) hmPerros.get(key2);
			System.out.println("ID: " + key2 + " - " + "Perro: " + value);
		}
	}

}
