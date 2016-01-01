package Model;

/**
 * The UNIT class represents the base Units class, but if required unit varietions will extend
 * upon this class according to the needs of the game
 * @author Stavros Argyrou AM:2962
 *
 */
public abstract class Unit {
	protected int positionX; // Positions will hold the X,Y coordinates of a Unit, only childs can access
	protected int positionY;
	private String Name; //Obvious Variables are obvious
	private int Rank;
	
	/**
	 * Constructor of the Units that constructs and initializes the name and the Rank of the unit
	 * @param Name of the Unit
	 * @param Rank the Unit's Rank (0-10)
	 */
	public Unit(String Name, int Rank){
		this.Name = Name;
		this.Rank = Rank;
	}

	
	/**
	 * This method can access the positionX value
	 * @return the integer value of position X
	 */
	public int getPositionX() {
		return positionX;
	}
	/**
	 * This method sets the position of the Unit's X coordinate
	 * @param positionX the X coordinate position
	 */
	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}
	/**
	 * This method can access the positionY value
	 * @return the integer value of position Y
	 */
	public int getPositionY() {
		return positionY;
	}
	/**
	 * This method sets the position of the Unit's Y coordinate
	 * @param positionY the Y coordinate position
	 */
	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}
	/**
	 * This method can access the name of the Unit
	 * @return the String that contains the name of the Unit
	 */
	public String getName() {
		return this.Name;
	}
	/**
	 * This method can set the name of the Unit based on the parameter given
	 * @param name will be set as the Name of the Unit
	 */
	public void setName(String name) {
		this.Name = name;
	}
	/**
	 * This method can access the Rank of a Unit 
	 * @return the Rank of the Unit
	 */
	public int getRank() {
		return Rank;
	}
	/**
	 * THis method can set the Rank of the unit based on the parameter given
	 * @param rank will be set as the Rank of teh Unit
	 */
	public void setRank(int rank) {
		Rank = rank;
	}
}
