package Model;

public class ElfUnit extends MoveAbleUnit{
	private boolean isAttacker;

	public ElfUnit(String Name, int Rank) {
		super(Name, Rank);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void isValidMove(int x, int y) {
			
		
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
		this.setPositionX(x);
		this.setPositionY(y);
		
	}
	
}
