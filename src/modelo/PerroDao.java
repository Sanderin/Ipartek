package modelo;

import java.util.ArrayList;

import pojo.Perro;

/**
 * DAO para definir las operaciones de CRUD
 * 
 * @author Alex
 *
 */
public interface PerroDao {
	/**
	 * lista perros
	 * 
	 * @return todos los perros o array vacio no null
	 */
	ArrayList<Perro> listar();

	/**
	 * recupera el perro
	 * 
	 * @param id identificador
	 * @return perro con sus datos o null si no encuentra por su id
	 */
	Perro recuperar(int id);

	/**
	 * 
	 * @param p perro con los datos para guardar
	 * @return perro con id actualizado
	 * @throws Exception si el nombre del perro ya existe
	 */
	Perro crear(Perro p) throws Exception;

	/**
	 * modificar perro
	 * 
	 * @param p perro con datos nuevos
	 * @return perro modificado
	 * @throws Exception si no encuentra el perro o el nombre ya existe
	 */
	Perro modificar(Perro p) throws Exception;

	/**
	 * elimina perro por id
	 * 
	 * @param id
	 * @return true si elimina, false en caso contrario
	 */
	boolean eliminar(int id) throws Exception;

}
