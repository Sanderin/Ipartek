package mf0227;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ImplementarDao implements LibroDao, SingletonEntrega {
	private static HashMap<Integer, Libro> hmLibros = new HashMap<Integer, Libro>();
	private int indice;
	private static ImplementarDao INSTANCE = null;

	public ImplementarDao() {
		super();
		hmLibros.put(1, new Libro(1, "harry potter", 300));
		hmLibros.put(2, new Libro(2, "el señor de los anillos", 400));
		hmLibros.put(3, new Libro(3, "el nombre del viento", 350));
		hmLibros.put(4, new Libro(4, "rey blanco", 500));
		indice = 5;

	}

	public List<Libro> getAll() {

		return new ArrayList<>(hmLibros.values());

	}

	@Override
	public Libro getById(int id) {

		hmLibros.get(id);
		return (Libro) hmLibros.keySet();
	}

	@Override
	public boolean delete(int id) {

		if (hmLibros.containsKey(id)) {
			hmLibros.remove(id);
			return true;
		}
		return false;
	}

	@Override
	public boolean insert(Libro l) {
		Collection<Libro> valores = hmLibros.values();
		// comprobar que el nombre no existe
		boolean encontrado = false;
		for (Iterator<Integer> it = hmLibros.keySet().iterator(); it.hasNext();) {
			Integer clave = it.next();
			Libro valor = hmLibros.get(clave);

			if (l.getNombre().equals(valor.getNombre())) {
				encontrado = true;
				System.out.println("no puedes añadir un libro con el mismo nombre");
				break;
			}
		}
		if (!encontrado) {
			l.setId(indice);
			hmLibros.put(indice, l);
			indice++;
			return true;
		}
		return false;
	}

	public synchronized static ImplementarDao getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new ImplementarDao();
		}
		return INSTANCE;

	}

}
