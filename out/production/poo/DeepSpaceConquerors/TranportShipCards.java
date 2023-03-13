package deepSpaceConquerors;

/**
 * @author Juanmi
 *	Método TransportShipCards
 */
public class TranportShipCards extends ShipsCards implements ITransportable, IAttackable{
	
	int defensePoints = 4;
	int price = 2;
	
	/**
	 * Constructor de la clase TransportShipCards.
	 * @param price - Precio de la nave.
	 */
	public TranportShipCards(int price) {
		super(price);
	}
	
	public String getOwner() {
		return owner;
	}
	
	@Override
	public void transport(String destiny, int numberOfPeople) {
		
		
	}
	
	/**
	 * Método que determina la capacidad de la nave de transporte.
	 * @return capacity - Capacidad de la nave de transporte.
	 */
	public int determinateCapacity() {
		int capacity = 0;
		
		return capacity;
	}

	@Override
	public void beAttacked(int attackPoints) {
		
		defensePoints -= attackPoints;
		
	}

	@Override
	public int getDefensePoints() {
		
		return defensePoints;
	}
}
