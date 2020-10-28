package listas;

public class Baraja {

	private String palo;
	private int numero;

	public static void Baraja() {

	}

	public Baraja(int numero, String palo) {
		this.numero = numero;
		this.palo = palo;
	}

	public String getPalo() {
		return this.palo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
