package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer1 {
	/**
	 * Implemente un programa que lea un número ‘a’ y otro número ‘b’ y luego
	 * calcule “a/b”. Pruebe a introducir b=0 y ver que hace el programa con la
	 * división por cero. Pruebe a introducir b=”Carlos” para ver cómo se comporta
	 * el programa. Añada excepciones para recoger estas excepciones y avisar del
	 * problema al usuario
	 * 
	 * @author Alex
	 * @param args
	 */
	public static void main(String[] args) {

		int numero, numero2, resultado;
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		try {
			System.out.println("introduce un numero ");
			numero = sc.nextInt();

			System.out.println("introduce un segundo numero ");
			numero2 = sc2.nextInt();

			resultado = numero / numero2;

			System.out.println("el resultado es de la division de ambos numeros es: " + resultado);
		}

		catch (ArithmeticException e) {
			System.out.println("no dividas entre 0 melón");

		} catch (InputMismatchException e) {
			System.out.println("introduce un numero");

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			sc.close();
			sc2.close();
		}
	}
}
