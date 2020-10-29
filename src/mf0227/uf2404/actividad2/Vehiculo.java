package mf0227.uf2404.actividad2;

public class Vehiculo implements IConducible {

	String color;
	String matricula;
	boolean isArrancado = false;
	boolean isParado = true;

	public Vehiculo() {
		super();
		this.color = "";
		this.matricula = "";

	}

	public Vehiculo(String color, String matricula) {
		super();
		this.color = color;
		this.matricula = matricula;
	}

	// metodos de la interfaz
	@Override
	public void arrancar() {

		if (this.isArrancado) {
			System.out.println("brum brum");
		} else {
			System.out.println("no esta arrancado");
		}
	}

	@Override
	public void parar() {

		if (this.isParado) {
			System.out.println("el vehiculo esta parado");
		} else {
			System.out.println("el vehiculo esta en marcha");
		}

	}

	// getters y setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Vehiculo color=" + color + ", matricula=" + matricula + "";
	}

}
