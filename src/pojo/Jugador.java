package pojo;

/**
 * Crear una lista de jugadores de futbol. En dicha lista se guardaran objetos
 * de la clase Jugador, que tendrá los atributos nombre, de tipo Sting y dorsal
 * de tipo int. Solicitar los datos de los jugadores por teclado, y una vez
 * introducido el primero, se insertara en la lista y se preguntara si se desea
 * introducir otro más, para lo cual el usuario escribirá S o N. En caso
 * afirmativo se volverá a pedir otro más, hasta que el usuario escriba N
 * 
 * @param args
 */
public class Jugador {
	private String nombre;
	private int dorsal;

	public Jugador() {
		super();
		this.nombre = "";
		this.dorsal = 0;
	}

	public Jugador(String nombre, int dorsal) {
		super();
		this.nombre = nombre;
		this.dorsal = dorsal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

}
