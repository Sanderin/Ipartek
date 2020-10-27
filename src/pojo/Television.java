package pojo;

public class Television extends Electrodomesticos {

	private int pulgadas;

	public Television(String nombre) {
		super(nombre);
		this.pulgadas = 0;

	}

	// canstructor sobrescrito con los atributos del padre y los propios de esta
	// clase
	public Television(String nombre, int precio, int pulgadas) {
		super(nombre);
		this.pulgadas = pulgadas;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	@Override
	public String toString() {
		return super.toString() + " Television [pulgadas = " + pulgadas + "]";
	}

}
