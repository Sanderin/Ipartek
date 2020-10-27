package abstractas;

/**
 * como no implementa el metodo dibujar del padre se tiene que declarar abstract
 * puede tener atributos y nuevos metodos implementados, si una clase es
 * abstracta no se pueden crear instancias de esa clase
 * 
 * @author danil
 *
 */
public abstract class Rectangulo extends ObjetoGrafico {

	int lado;
	int altura;

	int calcularArea() {
		return x * y * lado * altura;
	}

}
