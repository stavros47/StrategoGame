package Model;

import java.util.ArrayList;
import java.util.Collections;

/**
 * This class represends the Board of the game, and it will hold all the Units
 * that are in the game until they die in which case the Player class takes hold
 * of the defeated Units The Class is also responsible to populate the Board
 * with the Units and also remove units.
 * 
 * @author Stavros Argyrou AM:2962
 *
 */
public class BoardModel {
	// Used to instantiate a Board - Using a 2D array as a field
	private Unit[][] BoardArea;

	/**
	 * The Constructor of the Board! It initializes with an empty 2 Dimensional
	 * array of type Unit that represents the game Board where the Units will be
	 * placed and the game will be played upon
	 */
	public BoardModel() {
		// TODO: initialize the Board with 8x10 Dimensions
		BoardArea = new Unit[8][10];
	}

	/**
	 * Puts the Units given by the players on the board before the game starts
	 * 
	 * @param player1Units
	 *            the Units of the first Player - Array
	 * @param player2Units
	 *            the Units of the Second Player - Array
	 */
	public void fillBoard(ArrayList<Unit> player1Units, ArrayList<Unit> playerUnits2) {
		int x, y, count = 0;
		// Shuffle the PlayerUnits Array then put the units on the board.

		Collections.shuffle(player1Units);
		Collections.shuffle(playerUnits2);
	
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 10; j++) {
				BoardArea[i][j] = player1Units.get(count);
				count++;
			}			
		}
		System.out.println("Player 1 Units Positioned");

		for (int i = 0; i < 3; i++) {
			System.out.println();
			for (int j = 0; j < 10; j++) {
				// System.out.printf(" %s ", BoardArea[i][j].getName());
				System.out.printf(" %s %d,%d", (BoardArea[i][j]).getName(), i , j);
			}			
		}
		//Player 2
		count = 0;
		for (int i = 5; i < 8; i++) {
			for (int j = 0; j < 10; j++) {
				BoardArea[i][j] = playerUnits2.get(count);
				count++;
			}			
		}
		System.out.println("\n\nPlayer 2 Units Positioned");

		for (int i = 5; i < 8; i++) {
			System.out.println();
			for (int j = 0; j < 10; j++) {
				// System.out.printf(" %s ", BoardArea[i][j].getName());
				System.out.printf(" %s %d,%d", (BoardArea[i][j]).getName(), i, j);
			}			
		}
		
	}

	/**
	 * Once a unit is defeated it is removed from the board and moved to the
	 * players defeated units
	 * 
	 * @param defeated
	 *            the Unit that is defeated
	 * @param playerDefeatedUnits
	 *            the Units array of the Player that lost the unit
	 */
	public void removeUnit(Unit defeated, Unit[] playerDefeatedUnits) {
	}

	/**
	 * Can access and return the whole game Board array that holds the Units
	 * 
	 * @return the Game Board array
	 */
	public Unit[][] getBoardArea() {
		return BoardArea;
	}

	/**
	 * Sets the board array to be the same as the array given as a parameter
	 * 
	 * @param boardArea
	 *            game Board array to replace the current game board
	 */
	public void setBoardArea(Unit[][] boardArea) {
		BoardArea = boardArea;
	}

}
