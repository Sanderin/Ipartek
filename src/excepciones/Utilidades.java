package excepciones;

public class Utilidades
{

	static public char calcularLetraDni(String numeros) throws Exception
	{

		char letraDni[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
				'H', 'L', 'C', 'K', 'E' };

		if (numeros == null)
		{
			throw new Exception("No puede ser null");
		}

		if (numeros.length() != 8)
		{
			throw new Exception("Los numeros de un dni son 8");
		}

		int calculoDni = Integer.parseInt(numeros) % 23;

		return letraDni[calculoDni];
	}

}
