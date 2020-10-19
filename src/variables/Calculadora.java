package variables;

public class Calculadora {
	/**
	 * Realizar una pequeña calculadora. Para ello se crearan 10 variables de
	 * distintos tipos numéricos. Una vez creadas dichas variables y asignadas desde
	 * código valores (se recomienda valores entre -10 y 10) realizar las siguientes
	 * operaciones:
	 * 
	 * La suma de todos los números La resta de todos los números La media de todos
	 * los números
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		float a, b, c, d, e, f, g, h, i, j, suma, resta, media, auxiliar, mediasemana = 0;
		a = 1;
		b = 2;
		c = 3;
		d = 4;
		e = 5;
		f = 6;
		g = 7;
		h = 8;
		i = 9;
		j = 10;

		suma = a + b + c + d + e + f + g + h + i + j;
		resta = a - b - c - d - e - f - g - h - i - j;
		media = (a + b + c + d + e + f + g + h + i + j) / 10F;

		System.out.println("el total es " + suma + " la resta es " + resta + " la media es " + media);

		int temperatura[] = { 13, 41, 21, 42, 20, 13, 17 };
		String diasSemana[] = { "lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo" };

		for (int m = 0; m < temperatura.length; m++) {
			System.out.println("el dia " + diasSemana[m] + " hace " + temperatura[m] + " grados");
		}
		System.out.println("media de la semana es: " + (mediasemana / temperatura.length));

	}

}
