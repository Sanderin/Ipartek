package pojo;

public class Electrodomesticos {

	private String nombre;
	private int precio;

	public Electrodomesticos(String nombre) {
		super();
		this.nombre = nombre;
		this.precio = 0;

	}

	public Electrodomesticos(String nombre, int precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Electrodomesticos [nombre=" + nombre + ", precio=" + precio + "]";
	}

}
