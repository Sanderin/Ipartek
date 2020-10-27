package listas;

import java.util.ArrayList;
import java.util.Scanner;

import pojo.Jugador;

public class Ejer2 {

	/**
	 * Crear una lista de jugadores de futbol. En dicha lista se guardaran objetos
	 * de la clase Jugador, que tendr� los atributos nombre, de tipo Sting y dorsal
	 * de tipo int. Solicitar los datos de los jugadores por teclado, y una vez
	 * introducido el primero, se insertara en la lista y se preguntara si se desea
	 * introducir otro m�s, para lo cual el usuario escribir� S o N. En caso
	 * afirmativo se volver� a pedir otro m�s, hasta que el usuario escriba N
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Jugador> lista = new ArrayList<Jugador>();
		Scanner sc = new Scanner(System.in);
		String respuesta = "";
		String nombre = "";
		int dorsal = 0;
		boolean salir = false;

		do {
			System.out.println("introduce el nombre del jugador");
			nombre = sc.nextLine();

			System.out.println("introduce su dorsal");
			dorsal = sc.nextInt();

			Jugador j = new Jugador();
			j.setNombre(nombre);
			j.setDorsal(dorsal);
			lista.add(j);

			System.out.println("�quieres introducir otro jugador? S/N");
			respuesta = sc.nextLine();
			if (respuesta == "N") {
				salir = true;
			}

		} while (!salir);

	}

}
