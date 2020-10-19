package condicionales;

import java.util.Scanner;

public class Ejer2 {

	/**
	 * Realiza un programa que pida un numero por consola. En caso de que el numero
	 * sea mayor que 50, o menor que 0, indicar que el numero introducido no es
	 * valido
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int numero, cont = 0;

		do {
			System.out.println("introduce un numero: ");
			numero = teclado.nextInt();

			if (numero > 50 || numero < 0) {
				System.out.println("el numero introducido no es valido ");
				cont++;
				if (cont >= 3) {
					System.out.println("¿sabes contar?");
				}
			}
		}

		while (numero > 50 || numero < 0);
		System.out.println("el numero introducido es: " + numero);

	}
}
