package pojo;

public class TelevisionPlana extends Television {

	String tipoPantalla;

	public TelevisionPlana(String nombre) {
		super(nombre);
		this.tipoPantalla = "plana";
	}

	// constructor sobreescrito con los atributos de electrodomesticos, television y
	// los propios
	public TelevisionPlana(String nombre, int precio, int pulgadas, String tipoPantalla) {
		// el super debe llevar los atributos del padre, del abuelo etc
		super(nombre, precio, pulgadas);
		this.tipoPantalla = tipoPantalla;
	}

	public String getTipoPantalla() {
		return tipoPantalla;
	}

	public void setTipoPantalla(String tipoPantalla) {
		this.tipoPantalla = tipoPantalla;
	}

	@Override
	public String toString() {
		return super.toString() + " TelevisionPlana [tipoPantalla = " + tipoPantalla + "]";
	}

}
