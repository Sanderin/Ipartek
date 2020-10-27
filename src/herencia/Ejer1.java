package herencia;

import pojo.Estudiante;
import pojo.Gato;
import pojo.GatoDomestico;
import pojo.Persona;
import pojo.Profesor;

public class Ejer1 {

	public static void main(String[] args) throws Exception {

		Persona p = new Persona();
		Estudiante estu = new Estudiante();
		Profesor pro = new Profesor();

		estu.setEdad(18);
		estu.setNombre("Pepe");
		estu.setNotaMedia(9.5f);

		// crear profesor bacterio
		pro.setEdad(70);
		pro.setNombre("Bacterio");
		pro.setClaseImpartida("cencia avanzada");

		Gato gato = new Gato("Garfiled");
		System.out.println(gato);

		GatoDomestico gMitxi = new GatoDomestico("Mitxi");
		System.out.println(gMitxi);

	}

}
