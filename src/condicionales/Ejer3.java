package condicionales;

import java.util.Scanner;

public class Ejer3 {

	/**
	 * Pedir por teclado al usuario que introduzca una distancia en cm Una vez
	 * introducida, se solicitará que escoja a que unidad se van a convertir,
	 * introduciendo la opción por teclado A convertir a metros B: convertir a
	 * pulgadas C: convertir a pies D:convertir a yardas
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		float distancia = 0, resultado = 0;
		char conversion;

		System.out.println("introduce una distancia en cm");
		distancia = teclado.nextFloat();

		System.out.println("selecciona a que unidad la quieres convertir: ");
		System.out.println("A metros");
		System.out.println("B pulgadas");
		System.out.println("C pies");
		System.out.println("D yardas");
		// lee el primer caracter introducido
		conversion = teclado2.next().charAt(0);

		if (conversion == 'a' || conversion == 'A') {
			resultado = distancia / 100;
			System.out.println("la distancia " + distancia + " cm, equivale a: " + resultado + " metros");

		} else if (conversion == 'b' || conversion == 'B') {
			resultado = distancia / 2.54f;
			System.out.println("la distancia " + distancia + " cm, equivale a: " + resultado + " pulgadas");

		} else if (conversion == 'c' || conversion == 'C') {
			resultado = distancia / 30.48f;
			System.out.println("la distancia " + distancia + " cm, equivale a: " + resultado + " pies");

		} else if (conversion == 'd' || conversion == 'D') {
			resultado = distancia * 0.01094f;
			System.out.println("la distancia " + distancia + " cm, equivale a: " + resultado + " yardas");
		}

		else {
			System.out.println("introduce un valor valido");
		}

	}

}
