package mf0227;

public class Libro {
	private int id = 0;
	private String nombre = "";
	private int paginas = 0;

	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Libro(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public Libro(int id, String nombre, int paginas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.paginas = paginas;
	}

	public Libro(String nombre, int paginas) {
		super();
		this.nombre = nombre;
		this.paginas = paginas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", nombre=" + nombre + ", paginas=" + paginas + "]";
	}

}
