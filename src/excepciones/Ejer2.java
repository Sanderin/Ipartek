package excepciones;

import java.util.Scanner;

public class Ejer2 {

	/**
	 * Realice un programa que nos solicite por teclado dos números, y leerlos
	 * usando la clase Scanner mediante la función nextLine(). Transformar ambos
	 * strings a números enteros usando la siguiente sentencia
	 * Integer.parseInt(numeroLeido). Agrupar el código entre un bloque try catch y
	 * procesar para que no se produzca una interrupción y finalización del programa
	 * si alguno de los números leídos no puede convertirse, retomando el control en
	 * el punto del fallo, hasta que se solucione
	 * 
	 * @author Alex
	 * @version 1.0
	 * @param args
	 */
	public static void main(String[] args) {
		int num1, num2, resultado;
		boolean error = false;

		try {
			Scanner sc = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);

			do {
				System.out.println("introduce un numero ");
				num1 = Integer.parseInt(sc.nextLine());
				error = false;

				System.out.println("introduce otro numero ");
				num2 = Integer.parseInt(sc.nextLine());
				error = false;

			} while (error);

			System.out.println("los numeros introducidos son " + num1 + " y " + num2);
		} catch (NumberFormatException e) {
			System.out.println("mete solo numeros cabezón");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
