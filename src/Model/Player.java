package Model;

import java.util.ArrayList;

/**
 * This class represents the Player instances and hold all their
 * attributes along with the necessary methods.
 * @author Stavros Argyrou AM:2962
 *
 */
public class Player {
	
	private boolean isDefeated;
	private String Name;
	private int team; // 0 = RED , 1 = Blue
	private boolean myTurn;
	private ArrayList<Unit> playerUnits;// this will hold all the units of the player
	private Unit[] defeatedUnits;// this will hold all the units that are defeated
	
/**
 * This is the Constructor of the Player method that creates a player with a Name, and a Team
 * @param Name this represents the name of the Player
 * @param team this represents the Team of the player (RED = 0,Blue = 1)
 */
	public Player(String Name, int team) {
		this.Name = Name;
		this.team = team;
		this.myTurn = false;
		this.isDefeated = false;
	}
	/**
	 * This method creates the units of the player, and fills the playerUnits array
	 */
	public void createUnits(){
		playerUnits = new ArrayList<Unit>();
		playerUnits.add(new DragonUnit("Dragon", 10));
		playerUnits.add(new MageUnit("Mage", 9));
		playerUnits.add(new KnightUnit("Knight", 8));
		playerUnits.add(new KnightUnit("Knight", 8));
		playerUnits.add(new BeastRiderUnit("Beast Rider", 7));
		playerUnits.add(new BeastRiderUnit("Beast Rider", 7));
		playerUnits.add(new BeastRiderUnit("Beast Rider", 7));
		playerUnits.add(new SorceressUnit("Sorceress", 6));
		playerUnits.add(new SorceressUnit("Sorceress", 6));
		//Lava Yeti unit differ only to the name
		if(this.team == 0){
			playerUnits.add(new LavaYetiUnit("Lava Beast", 5));
			playerUnits.add(new LavaYetiUnit("Lava Beast", 5));
		}else{
			playerUnits.add(new LavaYetiUnit("Yeti", 5));
			playerUnits.add(new LavaYetiUnit("Yeti", 5));
		}
		playerUnits.add(new ElfUnit("Elf", 4));
		playerUnits.add(new ElfUnit("Elf", 4));
		playerUnits.add(new DwarfUnit("Dwarf", 3));
		playerUnits.add(new DwarfUnit("Dwarf", 3));
		playerUnits.add(new DwarfUnit("Dwarf", 3));
		playerUnits.add(new DwarfUnit("Dwarf", 3));
		playerUnits.add(new DwarfUnit("Dwarf", 3));
		playerUnits.add(new ScoutUnit("Scout", 2));
		playerUnits.add(new ScoutUnit("Scout", 2));
		playerUnits.add(new ScoutUnit("Scout", 2));
		playerUnits.add(new ScoutUnit("Scout", 2));
		playerUnits.add(new SlayerUnit("Slayer", 1));
		playerUnits.add(new TrapUnit("Trap", 0));
		playerUnits.add(new TrapUnit("Trap", 0));
		playerUnits.add(new TrapUnit("Trap", 0));
		playerUnits.add(new TrapUnit("Trap", 0));
		playerUnits.add(new TrapUnit("Trap", 0));
		playerUnits.add(new TrapUnit("Trap", 0));
		playerUnits.add(new FlagUnit("Flag", 0));
		
	}
	
	
	/**
	 * This method is used to access the methods private boolean field
	 * isDefeated, which will be true if the player lost, and false when the player is still in game
	 * @return the value of the isDefeated boolean indicating if the player lost or not.
	 */
	public boolean isDefeated() {
		return isDefeated;
	}
	/**
	 * This method changes the value of isDefeated according to the parameter it gets(true or false)
	 * @param isDefeated hold either true or false in order to change the value of the variable
	 */
	public void setDefeated(boolean isDefeated) {
		this.isDefeated = isDefeated;
	}
	/**
	 * this method can access the name of the player
	 * @return a String holding the name of the player
	 */
	public String getName() {
		return Name;
	}
	/**
	 * Changes - Sets the name of the player
	 * @param name the value that the name will change to
	 */
	public void setName(String name) {
		Name = name;
	}
	/**
	 * Gets the Team of the Player
	 * @return the integer value of the player's team
	 */
	public int getTeam() {
		return team;
	}
	/**
	 * Sets the Team of the player according to the integer given as a parameter
	 * @param team holds the integer value of the players team. Must be either 0 (RED) or 1 (BLUE)
	 */
	public void setTeam(int team) {
		this.team = team;
	}
	/**
	 * This method can access the MyTurn variable when we need to see if is this player's turn
	 * @return the value of the isMyTurn boolean to see its the player's turn to play.
	 */
	public boolean isMyTurn() {
		return myTurn;
	}
	/**
	 * This method can change the value of the variable myTurn with the given parameter
	 * @param myTurn the value the variable is going to take(true or false)
	 */
	public void setMyTurn(boolean myTurn) {
		this.myTurn = myTurn;
	}
	/**
	 * This method is responsible to access the array that holds the player's units and return it
	 * as an array when called.
	 * @return an array that holds all the player's units currently in game
	 */
	public ArrayList<Unit> getPlayerUnits() {
		return playerUnits;
	}
	/**
	 * This gives the player its Units when the game starts and also updates its units when a unit is
	 * lost - defeated
	 * @param playerUnits an array of Units that are currently in game for this player
	 */
	public void setPlayerUnits(ArrayList<Unit> playerUnits) {
		this.playerUnits = playerUnits;
	}
	/**
	 * Gets the player's Units that are currently defeated
	 * @return the array holding the defeated Units
	 */
	public Unit[] getDefeatedUnits() {
		return defeatedUnits;
	}
	
	/**
	 * Sets the array of defeated units using the given array of Units as parameter
	 * @param defeatedUnits changes the array of defeated units with this one
	 */
	public void setDefeatedUnits(Unit[] defeatedUnits) {
		this.defeatedUnits = defeatedUnits;
	}

}
