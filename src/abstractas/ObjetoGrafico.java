package abstractas;

public abstract class ObjetoGrafico {

	// posicion x e y del objeto grafico

	int x, y;

	/**
	 * todos los graficos que hereden se moveran igual
	 * 
	 * @param x
	 * @param y
	 */
	void mover(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * al no saber como se van a dibujar lo declaramos como abstracto, al igual que
	 * la clase
	 */
	abstract void dibujar();
}
