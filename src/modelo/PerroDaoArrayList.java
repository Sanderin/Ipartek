package modelo;

import java.util.ArrayList;

import pojo.Perro;

public class PerroDaoArrayList implements PerroDao {

	private ArrayList<Perro> lista = new ArrayList<Perro>();

	@Override
	public ArrayList<Perro> listar() {// inicio listar

		if (lista != null && lista.isEmpty()) {

			lista.add(new Perro("Bubba"));
			lista.add(new Perro("Laika"));
			lista.add(new Perro("Rintintin"));
			lista.add(new Perro("goffy"));
		}

		return lista;
	}// fin listar

	@Override
	public Perro recuperar(int id) {// inicio recuperar

		return null;
	}// fin recuperar

	@Override
	public Perro crear(Perro p) throws Exception {// inicio crear

		return null;
	}// fin crear

	@Override
	public Perro modificar(Perro p) throws Exception {// inicio modificar

		return null;
	}// fin modificar

	@Override
	public boolean eliminar(int id) throws Exception {// inicio eliminar

		return false;
	}// fin eliminar

}