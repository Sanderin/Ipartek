package pojo;

public class Persona {

	private static final int EDAD_MIN = 0;
	private static final int EDAD_MAX = 120;

	private String nombre;
	private int edad;

	// constructores
	public Persona() {

		super();
		this.nombre = "";
		this.edad = EDAD_MIN;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {

		return edad;
	}

	public void setEdad(int edad) throws Exception {
		if (edad < EDAD_MIN || edad > EDAD_MAX) {
			throw new Exception(String.format("error, la edad debe estar entre %s y %s", EDAD_MIN, EDAD_MAX));
		} else {
			this.edad = edad;
		}

	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}

}
