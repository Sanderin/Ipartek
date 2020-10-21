package pojo.ejercicios;

import pojo.Perro;

/**
 * crear 8 perros mas famosos con su contructor y settear el nombre e historia
 * mostrar por pantalla sus nombres e historia
 * https://blog.patasbox.com/los-8-perros-mas-fomos-de-la-historia/
 * 
 * 
 * @author alex
 *
 */
public class Ejer1 {

	public static void main(String[] args) {

		/*
		 * Perro p1 = new Perro(); p1.setNombre("Snoppy"); p1.setPeso(12);
		 * 
		 * Perro p2 = new Perro(); p2.setNombre("Laika"); p2.setPeso(-56);
		 * 
		 * System.out.println(p1.getNombre() + " " + p1.getPeso() + " kg");
		 * System.out.println(p2.getNombre() + " " + p2.getPeso() + " kg");
		 */

		// creacion de los perros
		Perro p1 = new Perro();
		p1.setNombre("Laika");
		p1.setHistoria("Esta famosa perrita sovi�tica fue el primer ser vivo en viajar "
				+ "al espacio. En 1957 emprendi� su viaje y desafortunadamente muri� "
				+ "a las 5 horas de despegar por el estr�s y la falta de ox�geno. "
				+ "Este suceso puso en el punto de mira los experimentos con animales. "
				+ "Desde entonces Laika ha sido un icono en la historia.");

		Perro p2 = new Perro();
		p2.setNombre("Hachiko");
		p2.setHistoria("Pocos perros han sido tan famosos como �l, llegando incluso a "
				+ "traspasar la pantalla y hacernos soltar alguna que otra lagrimilla. "
				+ "Este perro de raza Akita conmocion� al mundo con su historia de "
				+ "lealtad y amor por su amo. Su historia se hizo famosa por estar "
				+ "durante 10 a�os esperando a su due�o en la estaci�n de metro, a pesar "
				+ "de que �ste hab�a muerto en uno de los trayectos.");

		Perro p3 = new Perro();
		p3.setNombre("Balto");
		p3.setHistoria("Este husky siberiano comand� a un grupo de perros para llevar "
				+ "vacunas a un pueblo que ten�a una epidemia de difteria y que se "
				+ "encontraba aislado a mil kil�metros de distancia del hospital m�s "
				+ "cercano. Se le considera el h�roe de los ni�os del pueblo Nome.");

		Perro p4 = new Perro();
		p4.setNombre("Rin tin tin");
		p4.setHistoria("Este pastor alem�n se hizo famoso por interpretar 27 peliculas "
				+ "mudas de Hollywood. En 1929 incluso recibi� varios votos para ser "
				+ "el ganador de un premio �scar, sin embargo la propia academia lo "
				+ "tuvo que denegar por no ser una persona.");

		Perro p5 = new Perro();
		p5.setNombre("Stubby");
		p5.setHistoria("El sargento Stubby fue un h�roe de la Primera Guerra Mundial. "
				+ "Era un  american pitbull terrier que acompa�� durante los a�os de "
				+ "guerra a las tropas americanas. Se encargaba de avisarles de peligros "
				+ "y de gases que puedieran afectarles. Fue condecorado por el gobierno "
				+ "franc�s y estadounidense.");

		Perro p6 = new Perro();
		p6.setNombre("Pancho");
		p6.setHistoria("Pancho ha sido sin duda uno de los perros m�s famosos en Espa�a. "
				+ "Lo vimos hacerse millonario jugando a la primitiva e irse de "
				+ "vacaciones al Caribe. Tambi�n comparti� pantalla con la loca comunidad "
				+ "de vecinos de �Aqu� no hay quien viva�. Su muerte fue un momento duro " + "para el cine espa�ol.");

		Perro p7 = new Perro();
		p7.setNombre("Greyfriars Bobby");
		p7.setHistoria("Es conocido por ser el perro m�s fiel del mundo. "
				+ "Para conocer su historia nos trasladamos hasta Edimburgo. "
				+ "Bobby fue acompa�ante durante varios a�os de un vigilante de "
				+ "seguridad. Despu�s de que �ste muriera Bobby pas� 14 a�os hasta " + "su muerte junto a su tumba.");

		Perro p8 = new Perro();
		p8.setNombre("Smoky");
		p8.setHistoria("Este peque�o Yorkshire fue encontrado por un soldado "
				+ "estadounidense en la Primera Guerra Mundial y le acompa�� en todas "
				+ "sus misiones. La historia cuenta que incluso ayud� a construir una "
				+ "base a�rea transportando cable. Fue tambi�n un perro terapia para "
				+ "las v�ctimas de la guerra que estaban hospitalizadas.");

		// usando el constructor sobrecargado con el atributo nombre
		Perro p9 = new Perro("Kiss");
		p9.setHistoria("el perro de la amuma");

		// mostrar nombres e historias

		System.out.println("el primer perro mas famoso es: " + p1.getNombre());
		System.out.println(" su historia es: " + p1.getHistoria());

		System.out.println("el segundo perro mas famoso es: " + p2.getNombre());
		System.out.println(" su historia es: " + p2.getHistoria());

		System.out.println("el tercer perro mas famoso es: " + p3.getNombre());
		System.out.println(" su historia es: " + p3.getHistoria());

		System.out.println("el cuarto perro mas famoso es: " + p4.getNombre());
		System.out.println(" su historia es: " + p4.getHistoria());

		System.out.println("el quinto perro mas famoso es: " + p5.getNombre());
		System.out.println(" su historia es: " + p5.getHistoria());

		System.out.println("el sexto perro mas famoso es: " + p6.getNombre());
		System.out.println(" su historia es: " + p6.getHistoria());

		System.out.println("el septimo perro mas famoso es: " + p7.getNombre());
		System.out.println(" su historia es: " + p7.getHistoria());

		System.out.println("el octavo perro mas famoso es: " + p8.getNombre());
		System.out.println(" su historia es: " + p8.getHistoria());

		System.out.println("el noveno perro mas famoso es: " + p9.getNombre());
		System.out.println(" su historia es: " + p9.getHistoria());
	}

}
