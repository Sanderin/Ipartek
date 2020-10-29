package mf0227.uf2404.actividad2;

import java.util.ArrayList;
import java.util.Scanner;

public class Entrega2 {

	// matricula, marca, modelo, color, potencia, cilindrada
	public static void main(String[] args) {

		ArrayList<Vehiculo> lista = new ArrayList<Vehiculo>();
		Scanner sc = new Scanner(System.in);

		String decision = "";
		String matricula = "";
		String marca = "";
		String modelo = "";
		String color = "";
		String potencia_ = "";
		String cilindrada_ = "";
		int potencia = 0;
		float cilindrada = 0;
		boolean error = false;

		do {
			System.out.println("+++++++ CREAR COCHE +++++++++");
			do {
				System.out.println("introduce la matricula del coche");
				matricula = sc.nextLine();
				error = false;
				if (matricula.equals("")) {
					System.out.println("debes introducir una matricula");
					error = true;
				}
			} while (error);
			do {
				System.out.println("introduce la marca del coche");
				marca = sc.nextLine();
				error = false;
				if (marca.equals("")) {
					System.out.println("debes introducir una marca");
					error = true;
				}
			} while (error);
			do {
				System.out.println("introduce el modelo del coche");
				modelo = sc.nextLine();
				error = false;
				if (modelo.equals("")) {
					System.out.println("debes introducir un modelo");
					error = true;
				}
			} while (error);
			do {
				System.out.println("introduce el color del coche");
				color = sc.nextLine();
				error = false;
				if (color.equals("")) {
					System.out.println("debes introducir un color");
					error = true;
				}
			} while (error);

			do {
				try {
					System.out.println("introduce la potencia del coche");
					potencia_ = sc.nextLine();
					potencia = Integer.parseInt(potencia_);
					error = false;
				} catch (NumberFormatException e) {
					System.out.println("debes introducir la potencia con un numero");
					error = true;
				}
			} while (error);

			do {
				try {
					System.out.println("introduce la cilindrada del coche");
					cilindrada_ = sc.nextLine();
					cilindrada = Float.parseFloat(cilindrada_);
					error = false;
				} catch (NumberFormatException e) {
					System.out.println("debes introducir la cilindrada con un numero");
					error = true;
				}
			} while (error);

			Coche c = new Coche(matricula, marca, modelo, color, potencia, cilindrada);
			lista.add(c);

			System.out.println("\n ¿quieres introducir otro coche? s/n");
			decision = sc.nextLine();

		} while (!decision.equalsIgnoreCase("n"));

		System.out.println("\ncoches introducidos");
		for (Vehiculo vehiculo : lista) {
			if (vehiculo instanceof Coche) {
				Coche cs = (Coche) vehiculo;
				System.out.println("\nmarca " + cs.getMarca());
				System.out.println("modelo " + cs.modelo);
				System.out.println("potencia " + cs.potencia);
				System.out.println("cilindrada " + cs.cilindrada);
			}

			if (vehiculo instanceof Vehiculo) {
				System.out.println("color " + vehiculo.getColor());
				System.out.println("matricula " + vehiculo.getMatricula());

				if (vehiculo.isArrancado) {
					System.out.println("esta arrancado");
				} else {
					System.out.println("no esta arrancado");
				}

				if (vehiculo.isParado) {
					System.out.println("esta parado");
				} else {
					System.out.println("no esta parado");
				}
			}
		}

		System.out.println("fin del programa");
	}
}
