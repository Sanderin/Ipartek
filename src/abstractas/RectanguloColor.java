package abstractas;

public class RectanguloColor extends Rectangulo {

	String color;

	@Override
	void dibujar() {
		System.out.println("dinujo un rectangulo del color" + color);

	}

}
