package Model;

public class DwarfUnit extends SpecialMoveAbleUnit{
	private boolean isAttacker;

	public DwarfUnit(String Name, int Rank) {
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
	public void specialAbility() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}
	
}
