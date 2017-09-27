package Poker;

public enum Rank {

	TWO(2, '2'),
	THREE(3, '3'),
	FOUR(4, 'F'),
	FIVE(5, 'F'),
	SIX(6, 'S'),
	SEVEN(7, 'S'),
	EIGHT(8, 'E'),
	NINE(9, 'N'),
	TEN(10, 'T'),
	JACK(11, 'J'),
	QUEEN(12, 'Q'),
	KING(13, 'K'),
	ACE(14, 'A');
	
	private final int rankValue;
	
	public int [] allRankValues;
	
	private final char cardLabel;

	Rank(final int rankValue, final char cardLabel){
		this.rankValue = rankValue;
		this.cardLabel = initializeCardLabel();
		this.allRankValues = initializeAllRankValues();
	}
	
	public int [] initializeAllRankValues(){
		for(int i = 0;i < Rank.values().length; i++){
			allRankValues[i] = Rank.values()[i].getRankValue();
		}
		return allRankValues;
	}
	
	public int [] getAllRankValues(){
		return allRankValues;
	}

	public int getRankValue() {
		return rankValue;
	}
	
	public char initializeCardLabel() {
		if(rankValue > 10 && rankValue < 14){
			return cardLabel;
		}else{
			return (char) rankValue;
		}
	}
}
