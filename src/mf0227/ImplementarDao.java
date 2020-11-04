package mf0227;

import java.util.ArrayList;
import java.util.HashMap;
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

		return null;
	}

	@Override
	public boolean delete(int id) {

		return false;
	}

	@Override
	public boolean insert(Libro l) {

		// comprobar que el nombre no existe

		l.setId(indice);
		hmLibros.put(indice, l);
		indice++;

		return false;
	}

	public synchronized static ImplementarDao getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new ImplementarDao();
		}
		return INSTANCE;

	}

}
