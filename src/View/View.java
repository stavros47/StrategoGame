package View;
/**
 * The class that will represent the game in a graphical way
 * @author Stavros Argyrou AM:2962
 *
 */
import java.awt.event.ActionListener;
import javax.swing.*;


public abstract class View extends JFrame{
	
	private static final long serialVersionUID = 1L;
	/**
	 * This method will be used to update the graphics on the screen
	 */
	abstract void Render();
}
