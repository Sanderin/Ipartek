package pojo;

public class Perro {
	// atributos
	private int id;
	private String nombre;
	private String raza;
	private float peso;
	private boolean vacunado;
	private String historia;

	// constructores
	public Perro() {
		super();
		this.nombre = "sin nombre";
		this.raza = "cruce";
		this.peso = 0f;
		this.vacunado = false;
		this.historia = "";
	}

	// constructor sobrecargado
	public Perro(String nombre, String raza) {
		this(); // llama al constructor por defecto, pulsar control + clic
		this.nombre = nombre;
		this.raza = raza;
	}

	public Perro(String nombre) {
		this(); // llama al constructor por defecto, pulsar control + clic
		this.nombre = nombre;
	}

//getters y setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public float getPeso() {
		if (peso < 0) {
			peso = 0;
			return peso;
		} else {
			return peso;
		}
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public boolean isVacunado() {
		return vacunado;
	}

	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + "]";
	}

}
