package Poker;

public enum Suit {
	DIAMOND("D"),
	HEARTS("H"),
	CLUBS("C"),
	SPADES("S");
	
	private final String suitValue;
	
	Suit(final String suitValue){
		this.suitValue = suitValue;
	}
	
	public String getSuitValue(){
		return suitValue;
	}
}
