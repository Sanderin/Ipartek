package excepciones;

import java.util.Scanner;

public class Ejer3
{
	/**
	 * Realice un método que reciba como argumento un String y un número y muestre
	 * la letra de la posición indicada. Llámelo pasando como parámetro un String
	 * sin inicializar. Dicha llamada se encontrara dentro de un bloque try catch,
	 * que en caso de producirse una excepción por un paso de parámetros a null, no
	 * acabe con la ejecución del programa. Así mismo, se controlara también que si
	 * el numero pasado es mayor que el tamaño del string, capturara el error y nos
	 * solicitara meter un numero valido, indicándonos los valores en los que puede
	 * estar comprendido (para este apartado se le pasa como string la cadena de
	 * texto “La lluvia en Sevilla no es una maravilla”)
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		boolean error = false;
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		String texto;
		int numero;
		char letra;

		try
		{
			do
			{
				System.out.println("introduce un texto");
				texto = sc.nextLine();
				error = false;
			} while (error);

			do
			{
				System.out.println("introduce un numero");
				numero = Integer.parseInt(sc.nextLine());
				error = false;
			} while (error);
			lluviaSevilla(texto, numero);

		} catch (NumberFormatException e)
		{
			System.out.println("no has introducido un numero melón");
		}

		catch (StringIndexOutOfBoundsException e)
		{
			System.out.println("te has pasado de letras");
		}

	}

	static public String lluviaSevilla(String texto, int numero)
	{
		String letra;

		letra = texto.substring(numero - 1, numero);

		System.out.println("la letra es la " + letra);

		return letra;

	}

}
