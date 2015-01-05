package streetFighter;

import java.util.Random;
//this class has the moves for the fight sequence
public class Moves {
	
	int moveValue;
	String moveName;
	
	public Moves(int moveValue,	String moveName)
	{
		this.moveValue = moveValue;
		this.moveName = moveName;
	}
	public int getMoveValue() {
		return moveValue;
	}

	public void setMoveValue(int moveValue) {
		this.moveValue = moveValue;
	}

	public String getMoveName() {
		return moveName;
	}

	public void setMoveName(String moveName) {
		this.moveName = moveName;
	}
	
	public char[] randomCompMoveSelection() {
		// TODO Auto-generated method stub
		return null;
	}
		
	
}
