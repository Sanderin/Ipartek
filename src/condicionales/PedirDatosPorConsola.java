package condicionales;

import java.util.Scanner;

/**
 * Ejercicio para pedir datos por consola con java.util.scanner pediremos la
 * edad, que la meta bien, entre 0 y 150 años
 * 
 * @author alex
 * @version 1.0
 */
public class PedirDatosPorConsola {

	static final int EDAD_MINIMA = 0;
	static final int EDAD_MAXIMA = 150;
	static final int MAXIMO_ERRORES = 3;

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int edad, cont = 0;

		do {
			if (cont >= MAXIMO_ERRORES) {
				System.out.println("¿sabes contar?");
			}
			System.out.println("introduce tu edad: ");
			edad = teclado.nextInt();
			cont++;

		} while (edad > EDAD_MAXIMA || edad < EDAD_MINIMA);
		System.out.println("tu edad es: " + edad);
	}

}
