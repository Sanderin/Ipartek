package herencia;

import java.util.ArrayList;
import java.util.Scanner;

import pojo.Electrodomesticos;
import pojo.Television;
import pojo.TelevisionPlana;

public class Ejer2 {

	/**
	 * Realizar las siguientes jerarquías de herencia: tendremos una clase padre que
	 * se llamara Electrodoméstico. Dicha clase contara con los atributos nombre y
	 * precio. Se realizaran todos los constructores, métodos get y set necesarios
	 * Una vez creada dicha clase, se creara una serie de clases hijas. La primera
	 * será la clase televisor. Dicha clase contara con el atributo pulgadas, así
	 * como con todos los constructores y métodos necesarios para rellenar sus
	 * atributos, incluidos los del padre También se creara una clase
	 * televisionPlana, que heredara de televisión, tendrá el atributo string tipo
	 * de pantalla ( tft, plasma,..) y constructores, métodos get y set para
	 * rellenar los datos de los objetos que se creen, incluyendo todos los
	 * atributos de los objetos de las clases padres de las que heredan Una vez
	 * creado esta jerarquía de herencia, realizar un programa que nos pida insertar
	 * televisiones planas dentro de un array de electrodomésticos. Dicho array
	 * constara de 5 electodomesticos, pero lo rellenaremos con objetos de tipo
	 * televisiónPlana.
	 * 
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

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

			TelevisionPlana tv = new TelevisionPlana(nombre);
			tv.setPrecio(precio);
			tv.setPulgadas(pulgadas);
			tv.setTipoPantalla(tipoPantalla);
			// System.out.println(tv);
			lista.add(tv);

			for (Electrodomesticos electrodomesticos : lista) {

				if (electrodomesticos instanceof Electrodomesticos) {
					System.out.println("\nnombre " + electrodomesticos.getNombre());
					System.out.println("precio " + electrodomesticos.getPrecio());
				}

				if (electrodomesticos instanceof Television) {

					// podemos castear usando (Television) y asi nos permite acceder a los metodos
					// de esa clase
					System.out.println("pulgadas " + ((Television) electrodomesticos).getPulgadas());
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
