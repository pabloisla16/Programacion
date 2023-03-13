package deepSpaceConquerors;

/**
 *	Clase de las cartas de nave.
 */
public abstract class ShipsCards extends Cards implements IRepairable, IImprovable, IAttackable {

	
	String owner;
	
	/**
	 * Constructor de la clase ShipsCards.
	 * @param price - Precio de la carta de nave.
	 */
	public ShipsCards(int price) {
		super(price);
	}
	
	/**
	 * Cambia el propietario de la nave.
	 * @param owner - Nombre del jugador.
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	/**
	 * M�todo que devuelve el propietario de la nave.
	 * @return owner - Nombre del jugador propietario de la nave
	 */
	public String getOwner() {
		return owner;
	}
	
	/**
	 * M�todo que devuelve los puntos de defensa de la nave.
	 * @return defensePoints - Puntos de defensa.
	 */
	public int getDefensePoints() {
		return getDefensePoints();
	}
	
	@Override
	public void repairObject() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void improveObject() {
		// TODO Auto-generated method stub
		
	}

}
