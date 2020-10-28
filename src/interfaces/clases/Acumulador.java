package interfaces.clases;

import interfaces.interfaces.IModificacion;

public class Acumulador implements IModificacion {

	private int valor = 0;

	public Acumulador(int valor) {
		super();
		this.valor = valor;
	}

	public int daValor() {
		return this.valor;
	}

	public void incremento(int a) {
		this.valor += a;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Acumulador [valor=" + valor + "]";
	}

}
