import Model.*;
import View.*;
/**
 * The main class of the Game responsible to bridge together, the View(Graphics of the Game) 
 * and the Model(Logic part of the Game)
 * @author Stavros Argyrou AM:2962 Year 2015 Project: Stratego Ice vs Fire
 *
 */
public class GameController {
	private int turnCount = 0;//Turn counter
	private Player[] players;//An array of players to iterate through as the turns change
	private View gameView;
	private static BoardModel theBoard = new BoardModel();
	private static  Player p1 = new Player("Player RED", 0);
	private static Player p2 = new Player("Player BLUE", 1);
	
	/**
	 * The main Method that starts everything!
	 * @param args will not be used in this game
	 */
	public static void main(String[] args){
		System.out.println("Game Started!");
		p1.createUnits();
		p2.createUnits();
		theBoard.fillBoard(p1.getPlayerUnits(), p2.getPlayerUnits());
		if((theBoard.getBoardArea()[0][0])instanceof ElfUnit){
			theBoard.getBoardArea()[0][0].move(3,1);
		}
	}
	/**
	 * This method will be used only at the start of the game
	 * to create and populate the Board visually with the Units based on the 
	 * parameter that holds the actual Unit objects
	 * @param BoardArea the Object units to be represented visually on the board
	 */
	public void populateBoard(Unit[][] BoardArea){}
	
	/**
	 * This is the method that will check that everything is created correctly and then start the game
	 * this will run until a winner is found
	 */
	public void startGame(){}
	/**
	 * This method will return true if a player is defeated or has no more moves so the game
	 * has a winner
	 * @return if there is a winner or not
	 */
	public boolean gameWon(){ return false;}
	/**
	 * This method will remove the unit in the X,Y position if a valid attack is made
	 * @param defeated the defeated unit 
	 * @param x the row of the unit on the board
	 * @param y the column of the unit on the board
	 */
	public void killUnit(Unit defeated,int x, int y){}
	/**
	 * This method is responsible to handleClicks from the user and map the to 
	 * the Units
	 * @param x mouse X position
	 * @param y mouse Y position
	 */
	public void handleClick(int x, int y){}
	/**
	 * when the player clicks  the Pause button this method will pause
	 * the game
	 */
	public void handlePause(){}
}
