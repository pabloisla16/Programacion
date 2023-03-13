package deepSpaceConquerors;

/**
 *	Clase AttackShipCard
 */
public class AttackShipCard extends ShipsCards implements IAttacker, IAttackable {
	
	int attackPoints = 3;
	int defensePoints = 7;
	int price = 5;
	String owner;
	
	/**
	 * M�todo constructor de la clase AttackShipCard
	 * @param price - Precio de la nave
	 */
	public AttackShipCard(int price) {
		super(price);
	}
	
	public String getOwner() {
		return owner;
	}
	
	/**
	 * Devuelve los puntos de ataque de la nave.
	 * @return
	 */
	public int getAttackPoints() {
		return attackPoints;
	}
	
	@Override
	public void attack(IAttackable attackable) {
		attackable.beAttacked(attackPoints);
	}

	@Override
	public void beAttacked(int attackPoints) {
		
		defensePoints -= attackPoints;
		
	}

	@Override
	public int getDefensePoints() {
		// TODO Auto-generated method stub
		return defensePoints;
	}

}
