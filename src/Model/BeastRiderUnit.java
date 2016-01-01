package Model;

public class BeastRiderUnit extends MoveAbleUnit{
	private boolean isAttacker;

	public BeastRiderUnit(String Name, int Rank) {
		super(Name, Rank);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void isValidMove(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void isValidAttack(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @return the isAttacker
	 */
	public boolean isAttacker() {
		return isAttacker;
	}

	/**
	 * @param isAttacker the isAttacker to set
	 */
	public void setAttacker(boolean isAttacker) {
		this.isAttacker = isAttacker;
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}
	
}
