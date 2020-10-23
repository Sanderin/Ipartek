package modelo;

import java.util.Scanner;

import pojo.Serie;

public class PruebaFunciones implements IFunciones {

	public static void main(String[] args) {

	}

	@Override
	public String pedirNombre() throws Exception { // funciona
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce un nombre");
		String nombre = sc.nextLine();

		if (nombre.length() < 1) {
			throw new Exception("el nombre no puede tener menos de una letra");
		}

		for (int i = 0; i < nombre.length(); i++) {

			if (Character.isDigit(nombre.charAt(i)) == true) {
				throw new Exception("el nombre no puede contener numeros");

			}
		}
		return nombre;

	}

	@Override
	public void imprimirNumeroLoteria(int tipoLoteria) throws Exception {// funciona

		switch (tipoLoteria) {
		case LOTERIA_EUROMILLON:
			System.out.println("el numero premiado del euromillon es: 17108");
			break;

		case LOTERIA_QUINIELA:
			System.out.println(
					"el numero premiado de la quiniela es: 2 - 2 - X - 1 - 1 - 2 - 1 - X - 1 - 1 - 2 - 2 Pleno al 15: X");
			break;

		case LOTERIA_BONOLOTO:
			System.out.println("el numero premiado de la bonoloto es: 01 04 05 16 23 43 15 00");
			break;

		default:
			throw new Exception("introduce un valor valido");
		}

	}

	@Override
	public float calcularVueltas(float dineroEntregado, float precioProducto) throws Exception {

		float vueltas;

		vueltas = dineroEntregado - precioProducto;

		return vueltas;
	}

	@Override
	public Serie pedirDatosPorConsola() {

		return null;
	}

}
