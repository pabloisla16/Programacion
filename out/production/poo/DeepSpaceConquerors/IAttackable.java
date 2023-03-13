package deepSpaceConquerors;

/**
 *	Intefaz implementada en los objetos que son atacables.
 */
public interface IAttackable {
	
	/**
	 * M�todo ser atacado.
	 * @param attackPoints
	 */
	public void beAttacked(int attackPoints);
	
	/**
	 * M�todo que devuelve los puntos de defensa.
	 * @return
	 */
	public int getDefensePoints();
	
}
