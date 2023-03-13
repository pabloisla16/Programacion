package deepSpaceConquerors;

/**
 *	Clase de cartas.
 */
public abstract class Cards {

	private String nombre;
	private int price;
	
	/**
	 * Constructor de la clase Cartas.
	 * @param price - Precio de la carta.
	 */
	public Cards(int price) {
		this.price = price;
	}

}
