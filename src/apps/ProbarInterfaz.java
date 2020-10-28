package apps;

import java.util.Scanner;

import modelo.PruebaFunciones;

/**
 * 
 * @author Alexander Saiz
 *
 */

public class ProbarInterfaz {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int num = 0;
		float dineroEntregado, precio;
		PruebaFunciones fun = new PruebaFunciones();

		// nombre
		String nombre = fun.pedirNombre();
		System.out.println("tu nombre es " + nombre);
		System.out.println("fin pedir nombre");

		// loteria
		System.out.println("");
		System.out.println("introduce el tipo de loteria que quieres imprimir");
		System.out.println("1 - euromillon");
		System.out.println("2 - quiniela");
		System.out.println("3 - bonoloto");
		fun.imprimirNumeroLoteria(num);

		// vueltas
		System.out.println("introduce el dinero entregado");
		dineroEntregado = sc.nextFloat();
		System.out.println("introduce el precio del producto");
		precio = sc.nextFloat();
		fun.calcularVueltas(dineroEntregado, precio);

	}

}
