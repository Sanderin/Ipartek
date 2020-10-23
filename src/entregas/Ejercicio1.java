package entregas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * A) Realizar un programa en java que realice la siguiente función: Crear un
 * array de 5 notas que almacenara en formato double. Una vez creado dicho array
 * se rellenaran dichos elementos leyéndolo desde el teclado. Una vez creado el
 * contenido, se calculara la media de las notas así como se mostraran las notas
 * más altas y más bajas de dicho array.
 * 
 * @author Alexander Saiz
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		double nota, notaAlta = 0, notaBaja, media, suma = 0;
		ArrayList<Double> listaNotas = new ArrayList<Double>();
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i <= 4; i++) {// introducimos las notas por teclado en el Array
			System.out.println("introduce la nota numero: " + (i + 1));
			nota = sc.nextDouble();

			if (nota >= 0) {
				notaAlta = nota;
				listaNotas.add(nota);
				suma += nota;
			} else {
				System.out.println("introduce notas validas");
			}
		}

		System.out.println("las notas introducidas son las siguientes: ");// mostramos las notas
		for (int i = 0; i <= 4; i++) {
			System.out.println(listaNotas.get(i));
		}

		notaBaja = notaAlta;
		for (int i = 0; i <= 4; i++) {// calculamos la nota mas alta
			if (listaNotas.get(i) >= notaAlta) {
				notaAlta = listaNotas.get(i);
			}
		}

		for (int i = 0; i <= 4; i++) {// calculamos la nota mas baja
			if (listaNotas.get(i) <= notaBaja) {
				notaBaja = listaNotas.get(i);
			}
		}

		// mostramos la nota mas baja y mas alta
		System.out.println("la nota mas baja es " + notaBaja + " y la mas alta es " + notaAlta);

		// calculamos la media
		media = suma / listaNotas.size();

		System.out.println("la nota media es: " + media);
	}

}
