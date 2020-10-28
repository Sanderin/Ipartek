package listas;

import java.util.ArrayList;
import java.util.Random;

import pojo.Carta;

public class Ejer3 {

	private static String nombreCarta = "";
	private static final String CARTA_AS = "as";
	private static final int CARTA_VALOR_AS = 1;
	private static final String CARTA_SOTA = "sota";
	private static final int CARTA_VALOR_SOTA = 8;
	private static final String CARTA_CABALLO = "caballo";
	private static final int CARTA_VALOR_CABALLO = 9;
	private static final String CARTA_REY = "rey";
	private static final int CARTA_VALOR_REY = 10;

	private static int NUM_CARTAS = 10;
	private static final String PALOS[] = { "Oros", "Copas", "Bastos", "Espadas" };
	private static ArrayList<Carta> listaCartas = new ArrayList<Carta>();

	public static void main(String[] args) {// main

		crearBaraja();

		for (Carta carta : listaCartas) {
			pintarCarta(carta);
		}

		barajear();
	}// fin main

	private static void crearBaraja() {// crear baraja

		for (int i = 0; i < PALOS.length; i++) {
			for (int j = 0; j < NUM_CARTAS; j++) {
				Carta c = new Carta(j + 1, PALOS[i]);
				listaCartas.add(c);
			}
		}
	}// fin crearBaraja

	private static void barajear() {// barajear
		System.out.println("barajeamos");
		Random rnd = new Random();
		for (int i = 0; i < listaCartas.size(); i++) {
			int azar = rnd.nextInt(listaCartas.size());
			Carta c = listaCartas.remove(azar);
			listaCartas.add(c);
		}
	}// fin barajear

	private static void pintarCarta(Carta carta) {// pintar carta
		switch (carta.getValor()) {
		case CARTA_VALOR_AS: {
			nombreCarta = CARTA_AS;
			break;
		}
		case CARTA_VALOR_SOTA: {
			nombreCarta = CARTA_SOTA;
			break;
		}
		case CARTA_VALOR_CABALLO: {
			nombreCarta = CARTA_CABALLO;
			break;
		}
		case CARTA_VALOR_REY: {
			nombreCarta = CARTA_REY;
			break;
		}
		default:
			nombreCarta = String.valueOf(carta.getValor());
		}

		System.out.printf("%s de %s\n", nombreCarta, carta.getPalo());
	}// fin pintar carta

}