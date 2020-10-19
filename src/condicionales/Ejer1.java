package condicionales;

public class Ejer1 {

	/**
	 * Realizar un programa que realice la siguiente funcionalidad Se crearan 5
	 * variables enteras con los nombres a, b, c, d y e con los valores 6, 8, 0, 8 y
	 * 9 Comparar las variables a y c, indicar por consola cual es mayor Indicar
	 * cual de las variables es la que tiene menor valor y la de mayor valor Compara
	 * las variables b y d y comprueba si son iguales Comprobar si se puede realizar
	 * la división de a/c si no se puede realizar indicarlo, en caso contrario
	 * realizar la división
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int a, b, c, d, e, div;

		a = 6;
		b = 8;
		c = 0;
		d = 8;
		e = 9;

		if (a > c) {
			System.out.println("la variable A es mayor que C");
		} else {
			System.out.println("la variable C es mayor que A");
		}

		if (a > b && a > c && a > d && a > e) {
			System.out.println("la variable A es la mayor");

		} else if (b > a && b > c && b > d && b > e) {
			System.out.println("la variable B es la mayor");
		} else if (c > a && c > b && c > d && c > e) {
			System.out.println("la variable C es la mayor");
		}

		else if (d > a && d > b && d > c && d > e) {
			System.out.println("la variable D es la mayor");
		}

		else {
			System.out.println("la variable E es la mayor");
		}

		if (b == d) {
			System.out.println("las variables son iguales");
		} else {
			System.out.println("las variables son diferentes");
		}

		if (c != 0) {
			div = a / c;
			System.out.println("la division da: " + div);
		} else {
			System.out.println("no se puede dividir");

		}

	}

}
