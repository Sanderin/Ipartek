package sqlite;

import modelo.PerroDAOSqlite;
import pojo.Perro;

public class Ejercicio2 {

	public static void main(String[] args) throws Exception {

		// Este DAO se encarga de realizara la operaciones de CRUD contra la bbdd
		PerroDAOSqlite dao = new PerroDAOSqlite();

		/*
		 * System.out.println(dao.recuperar(1)); System.out.println(dao.recuperar(2));
		 * 
		 * Perro pNuevo = new Perro("snoopy", "callejero", 2); try { dao.crear(pNuevo);
		 * // insert } catch (Exception e) {
		 * System.out.printf("** el nombre del perro %s ya existe \n",
		 * pNuevo.getNombre()); }
		 */

		// dao.eliminar(4);

		for (Perro p : dao.listar()) {
			System.out.println(p);
		}

		System.out.println("terminamos");

	}

}