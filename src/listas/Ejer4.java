package listas;

import java.util.ArrayList;

import pojo.Carta;

public class Ejer4 {

	/**
	 * Crear una lista que contenga las cuarenta cartas de una baraja. Para crear
	 * dicha lista se creara una clase de tipo carta, que tendrá un número entero
	 * para el valor de la carta, así como un string con el palo de la baraja
	 * (copas, espadas, oros, bastos). Crear la baraja con las cartas ordenadas por
	 * palos, y luego por números. Barajar dicha baraja y mostrar las cartas.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Carta> baraja = new ArrayList<Carta>();

		Carta c1 = new Carta(1, "bastos");
		Carta c2 = new Carta(2, "bastos");
		Carta c3 = new Carta(3, "bastos");
		Carta c4 = new Carta(4, "bastos");
		Carta c5 = new Carta(5, "bastos");
		Carta c6 = new Carta(6, "bastos");
		Carta c7 = new Carta(7, "bastos");
		Carta c8 = new Carta(8, "bastos");
		Carta c9 = new Carta(9, "bastos");
		Carta c10 = new Carta(10, "bastos");

		Carta c11 = new Carta(1, "oros");
		Carta c12 = new Carta(2, "oros");
		Carta c13 = new Carta(3, "oros");
		Carta c14 = new Carta(4, "oros");
		Carta c15 = new Carta(5, "oros");
		Carta c16 = new Carta(6, "oros");
		Carta c17 = new Carta(7, "oros");
		Carta c18 = new Carta(8, "oros");
		Carta c19 = new Carta(9, "oros");
		Carta c20 = new Carta(10, "oros");

		Carta c21 = new Carta(1, "copas");
		Carta c22 = new Carta(2, "copas");
		Carta c23 = new Carta(3, "copas");
		Carta c24 = new Carta(4, "copas");
		Carta c25 = new Carta(5, "copas");
		Carta c26 = new Carta(6, "copas");
		Carta c27 = new Carta(7, "copas");
		Carta c28 = new Carta(8, "copas");
		Carta c29 = new Carta(9, "copas");
		Carta c30 = new Carta(10, "copas");

		Carta c31 = new Carta(1, "espadas");
		Carta c32 = new Carta(2, "espadas");
		Carta c33 = new Carta(3, "espadas");
		Carta c34 = new Carta(4, "espadas");
		Carta c35 = new Carta(5, "espadas");
		Carta c36 = new Carta(6, "espadas");
		Carta c37 = new Carta(7, "espadas");
		Carta c38 = new Carta(8, "espadas");
		Carta c39 = new Carta(9, "espadas");
		Carta c40 = new Carta(10, "espadas");

		baraja.add(c1);
		baraja.add(c2);
		baraja.add(c3);
		baraja.add(c4);
		baraja.add(c5);
		baraja.add(c6);
		baraja.add(c7);
		baraja.add(c8);
		baraja.add(c9);
		baraja.add(c10);

		baraja.add(c11);
		baraja.add(c12);
		baraja.add(c13);
		baraja.add(c14);
		baraja.add(c15);
		baraja.add(c16);
		baraja.add(c17);
		baraja.add(c18);
		baraja.add(c19);
		baraja.add(c20);

		baraja.add(c21);
		baraja.add(c22);
		baraja.add(c23);
		baraja.add(c24);
		baraja.add(c25);
		baraja.add(c26);
		baraja.add(c27);
		baraja.add(c28);
		baraja.add(c29);
		baraja.add(c30);

		baraja.add(c31);
		baraja.add(c32);
		baraja.add(c33);
		baraja.add(c34);
		baraja.add(c35);
		baraja.add(c36);
		baraja.add(c37);
		baraja.add(c38);
		baraja.add(c39);
		baraja.add(c40);

	}

}
