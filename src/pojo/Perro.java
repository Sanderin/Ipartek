package pojo;

public class Perro extends Mamifero {
	// atributos
	private int id;
	private String raza;
	private float peso;
	private boolean vacunado;
	private String historia;

	// constructores
	public Perro(String nombre) {
		super(nombre);
		this.raza = "cruce";
		this.peso = 0f;
		this.vacunado = false;
		this.historia = "";
	}

//getters y setters

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
		return "Perro [nombre=" + getNombre() + "]";
	}

}
