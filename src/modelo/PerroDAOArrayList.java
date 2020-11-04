package modelo;

import java.util.ArrayList;

import pojo.Perro;

public class PerroDAOArrayList implements PerroDao {

	private ArrayList<Perro> lista = new ArrayList<Perro>();
	private int id = 0;
	private static PerroDAOArrayList INSTANCE = null;

	// constructor privado para el singleton
	private PerroDAOArrayList() {
		super();
		lista.add(new Perro(1, "Bubba"));
		lista.add(new Perro(2, "Laika"));
		lista.add(new Perro(3, "Rintintin"));
		lista.add(new Perro(4, "goffy"));

		// simular indice
		id = 5;
	}// fin constructor

	@Override
	public ArrayList<Perro> listar() {

		return lista;
	}

	@Override
	public Perro recuperar(int id) {
		// hacer for y buscar por id
		for (Perro perro : lista) {

		}
		return null;
	}

	@Override
	public Perro crear(Perro p) throws Exception {
		p.setId(id);
		lista.add(p);
		id++;
		return p;
	}

	@Override
	public Perro modificar(Perro p) throws Exception {
		// hacer for, buscar por id y cambiarlo
		for (Perro perro : lista) {

		}
		return null;
	}

	@Override
	public boolean eliminar(int id) throws Exception {
		// hacer for, buscar por id y eliminar la posicion elegida
		for (Perro perro : lista) {

		}
		return false;
	}

	public synchronized static PerroDAOArrayList getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new PerroDAOArrayList();
		}
		return INSTANCE;

	}
}
