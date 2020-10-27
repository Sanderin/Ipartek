package herencia;

import java.util.ArrayList;
import java.util.Scanner;

import pojo.Electrodomesticos;
import pojo.Television;
import pojo.TelevisionPlana;

public class Ejer3 {

	/**
	 * lo mismo que el anterior ejercicio pero con constructores con los parametros
	 * de los padres
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		ArrayList<Electrodomesticos> lista = new ArrayList<Electrodomesticos>();
		Scanner sc = new Scanner(System.in);
		String nombre;
		String precioU;
		String pulgadasU;
		int precio;
		int pulgadas;
		String tipoPantalla;
		String decision;

		do {
			System.out.println("introduce el nombre del televisor");
			nombre = sc.nextLine();

			System.out.println("introduce el precio");
			precioU = sc.nextLine();
			precio = Integer.parseInt(precioU);

			System.out.println("introduce las pulgadas del televisor");
			pulgadasU = sc.nextLine();
			pulgadas = Integer.parseInt(pulgadasU);

			System.out.println("introduce el tipo de pantalla");
			tipoPantalla = sc.nextLine();

			TelevisionPlana tv = new TelevisionPlana(nombre, precio, pulgadas, tipoPantalla);
			// System.out.println(tv);
			lista.add(tv);

			for (Electrodomesticos electrodomesticos : lista) {

				if (electrodomesticos instanceof Electrodomesticos) {
					System.out.println("\nnombre " + electrodomesticos.getNombre());
					System.out.println("precio " + electrodomesticos.getPrecio());
				}

				if (electrodomesticos instanceof Television) {

					Television tvs = (Television) electrodomesticos;
					System.out.println("pulgadas " + tvs.getPulgadas());
				}

				if (electrodomesticos instanceof TelevisionPlana) {

					// tambien podemos castear y asignarlo a una variable nueva
					TelevisionPlana tvp = (TelevisionPlana) electrodomesticos;
					System.out.println("tipo pantalla " + tvp.getTipoPantalla());
				}

			}

			System.out.println("\n ¿quieres introducir otro televisior plano? s/n");
			decision = sc.nextLine();

		} while (!decision.equalsIgnoreCase("n"));

		System.out.println("fin");
	}

}
