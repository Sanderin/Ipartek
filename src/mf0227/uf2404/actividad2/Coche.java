package mf0227.uf2404.actividad2;

public class Coche extends Vehiculo {
	String marca;
	String modelo;
	int potencia;
	float cilindrada;

	public Coche() {
		super();

	}

	public Coche(String matricula, String marca, String modelo, String color, int potencia, float cilindrada) {
		super(color, matricula);
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = potencia;
		this.cilindrada = cilindrada;
	}

	public Coche(String marca, String modelo, int potencia, int cilindrada) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = potencia;
		this.cilindrada = cilindrada;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public float getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "Coche marca=" + marca + ", modelo=" + modelo + ", potencia=" + potencia + ", cilindrada=" + cilindrada
				+ "";
	}

}
