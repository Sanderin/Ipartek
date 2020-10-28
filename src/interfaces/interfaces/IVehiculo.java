package interfaces.interfaces;

/**
 * interfaz de vehiculos
 * 
 * @author Alexander Saiz
 *
 */

public interface IVehiculo {
	int VEL_MAX_COCHE = 150;
	int VEL_MAX_BICI = 50;
	int VEL_MAX_PATINETE = 80;

	void arrancar();

	void acelerar(int invrementoVel);

	void frenar(int decrementoVel);

	void apagar() throws Exception;

}
