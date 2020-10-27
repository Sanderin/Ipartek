package pojo;

public class Gato extends Mamifero {

	public Gato(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return "Gato [nombre = " + getNombre() + ", patas = " + getPatas() + "]";
	}

}