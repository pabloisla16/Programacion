package deepSpaceConquerors;

/**
 *	Clase dado.
 */
public class Dice implements IThrowable{
	
	int diceFaces;
	int diceMinValue;
	int diceMaxValue;
	
	
	/**
	 * Constructor de la clase dado.
	 * @param diceFaces - Caras del dado.
	 * @param diceMinValue - Valor m�nimo del dado.
	 * @param diceMaxValue - Valor m�ximo del dado.
	 */
	public Dice(int diceFaces, int diceMinValue, int diceMaxValue) {
		this.diceFaces = diceFaces;
		this.diceMinValue = diceMinValue;
		this.diceMaxValue = diceMaxValue;
	}
	
	public int throwDace() {
		int diceValue = 0;
		
		diceValue = (int) (Math.round((Math.random() * (diceMaxValue - diceMinValue) + diceMinValue)));
		
		return diceValue;
	}
	
	/**
	 * Devuelve el valor m�ximo del dado.
	 * @return diceMaxValue - Valor m�ximo del dado.
	 */
	public int getMax() {
		return diceMaxValue;
	}
	
	/**
	 * Devuelve el valor m�nimo del dado.
	 * @return diceMinValue - Devuelve m�nimo del dado.
	 */
	public int getMin() {
		return diceMinValue;
	}
	
}
