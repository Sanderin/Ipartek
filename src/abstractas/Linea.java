package abstractas;

public class Linea extends ObjetoGrafico {

	int longitud;

	/**
	 * implementamos el metodo del padre que ha declarado abstracto
	 */
	@Override
	void dibujar() {
		// TODO Auto-generated method stub
		System.out.println("dibujamos una linea de longitud " + longitud);
	}

}
