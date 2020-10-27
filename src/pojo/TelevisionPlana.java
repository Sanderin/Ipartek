package pojo;

public class TelevisionPlana extends Television {

	String tipoPantalla;

	public TelevisionPlana(String nombre) {
		super(nombre);
		this.tipoPantalla = "plana";
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
