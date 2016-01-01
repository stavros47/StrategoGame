package Model;
/**
 * This class represends the Units that are able to move but also
 * have a Special ability (something extra) they can do
 * @author Stavros Argyrou AM:2962
 *
 */
public abstract class SpecialMoveAbleUnit extends MoveAbleUnit{
	/**
	 * The Constructor of the class that calls upon the Unit constructor
	 * parsing the name and rank of the unit to be created - instantiated
	 * @param Name of the new Unit
	 * @param Rank of the new Unit
	 */
	public SpecialMoveAbleUnit(String Name, int Rank) {
		super(Name, Rank);
		// TODO Auto-generated constructor stub
	}
	/**
	 * Concrete method Attack is responsible for the Units attack and will be used by all
	 * of the children classes to be able to attack the units
	 * @param x the position X of the unit to attack
	 * @param y the position Y of the Unit to attack
	 */
	public void attack(){
		//TODO: Create the body of attack method (CONCRETE)
	}
	/**
	 * Abstract method Move is responsible for the Units move and must be implemented
	 * by all the children classes to be able to move on the board
	 * @param x the position X of the tile to move
	 * @param y the position Y of the tile to move
	 */
	public abstract void move(int x, int y);
	/**
	 * Will check if a move isValid 
	 * @param x the position X of the tile to move
	 * @param y the position Y of the tile to move
	 */
	public abstract void isValidMove(int x, int y); 
	/**
	 * This method will check if the attack is valid
	 * @param x position of the enemy unit
	 * @param y position of the enemy unit
	 */
	public abstract void isValidAttack(int x, int y);
	/**
	 * This abstract method is responsible for doing the Units special ability e.x the Dwarf instance can disarm Traps
	 */
	public abstract void specialAbility();
	
}
