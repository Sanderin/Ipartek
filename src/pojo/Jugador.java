package pojo;

/**
 * Crear una lista de jugadores de futbol. En dicha lista se guardaran objetos
 * de la clase Jugador, que tendr� los atributos nombre, de tipo Sting y dorsal
 * de tipo int. Solicitar los datos de los jugadores por teclado, y una vez
 * introducido el primero, se insertara en la lista y se preguntara si se desea
 * introducir otro m�s, para lo cual el usuario escribir� S o N. En caso
 * afirmativo se volver� a pedir otro m�s, hasta que el usuario escriba N
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
