package excepciones;

import java.util.Scanner;

public class Ejer3
{
	/**
	 * Realice un m�todo que reciba como argumento un String y un n�mero y muestre
	 * la letra de la posici�n indicada. Ll�melo pasando como par�metro un String
	 * sin inicializar. Dicha llamada se encontrara dentro de un bloque try catch,
	 * que en caso de producirse una excepci�n por un paso de par�metros a null, no
	 * acabe con la ejecuci�n del programa. As� mismo, se controlara tambi�n que si
	 * el numero pasado es mayor que el tama�o del string, capturara el error y nos
	 * solicitara meter un numero valido, indic�ndonos los valores en los que puede
	 * estar comprendido (para este apartado se le pasa como string la cadena de
	 * texto �La lluvia en Sevilla no es una maravilla�)
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
			System.out.println("no has introducido un numero mel�n");
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
