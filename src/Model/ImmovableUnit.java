package Model;
/**
 * This Class separates the Immovable Units from the rest of the Units
 * @author Stavros Argyrou AM:2962
 *
 */
public abstract class ImmovableUnit extends Unit{
	/**
	 * The Constructor of the Immovable unit entities that calls the constructor of the 
	 * Unit Class parsing in the Name and the Rank
	 * @param Name of the Unit
	 * @param Rank of the Unit(0-10)
	 */
	public ImmovableUnit(String Name, int Rank) {
		super(Name, Rank);
		// TODO Auto-generated constructor stub
	}

}
