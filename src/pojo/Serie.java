package pojo;

/**
 * nombre numTemporada duracion (minutos) plataforma el constructor debera pasar
 * siempre el nombre de forma obligatoria el resto de campos se inicializaran a
 * 0 y la plataforma a "internet"
 * 
 * @author alex saiz
 *
 */

public class Serie {

	private String nombre;
	private int numTemporada;
	private int duracion;
	private String plataforma;

	public Serie() {
		super();
		this.nombre = "sin nombre";
		this.numTemporada = 0;
		this.duracion = 0;
		this.plataforma = "internet";
	}

	public Serie(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumTemporada() {

		if (numTemporada < 0) {
			numTemporada = 0;
			return numTemporada;
		} else {
			return numTemporada;
		}
	}

	public void setNumTemporada(int numTemporada) {
		this.numTemporada = numTemporada;
	}

	public int getDuracion() {

		if (duracion < 0) {
			duracion = 0;
			return duracion;
		} else {
			return duracion;
		}

	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

}
