package pojo;

public class Television extends Electrodomesticos {

	private int pulgadas;

	public Television(String nombre) {
		super(nombre);
		this.pulgadas = 0;

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
