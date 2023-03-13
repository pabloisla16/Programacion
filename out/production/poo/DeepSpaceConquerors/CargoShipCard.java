package deepSpaceConquerors;

/**
 *	Clase de CargoShipCards
 */
public class CargoShipCard extends ShipsCards implements ITransportador, IAttackable {
	
	int capacity;
	int defensePoints = 4;
	String owner;
	
	/**
	 * Constructor de CargoShipsCards
	 * @param price  - Precio de la carta de nave.
	 */
	public CargoShipCard(int price) {
		super(price);
	}
	
	public String getOwner() {
		return owner;
	}

	@Override
	public void transport(String destiny, String[] materials, int[] amountOfMaterials) {
		// TODO Auto-generated method stub
		
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
	
	

