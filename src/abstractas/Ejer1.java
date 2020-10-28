package abstractas;

public class Ejer1 {

	public static void main(String[] args) {

		/*
		 * no se pueden instanciar las clases abstractas, pero los hijos si y pueden
		 * implementar las funciones del padre.
		 */

		Linea l1 = new Linea();
		LineaColor lc1 = new LineaColor();
		RectanguloColor rc = new RectanguloColor();

		l1.mover(0, 100);
		lc1.mover(45, 88);
		rc.mover(78, 100);

		l1.dibujar();
		lc1.dibujar();
		rc.dibujar();

	}

}
