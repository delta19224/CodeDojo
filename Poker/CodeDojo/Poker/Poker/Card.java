package Poker;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Card {
	//this is a test
	final Rank rank;
	final Suit suit;
	
	private final static Map<String, Card> cardCache = initValue();

	Card(Rank rank, Suit suit){
		this.rank = rank;
		this.suit = suit;
	}

	private static Map<String, Card> initValue() {
		
		final Map<String, Card> cardCache = new HashMap<>();
		
		for(Suit suit : Suit.values()){
			for(Rank rank : Rank.values()){
				cardCache.put(cardKey(rank, suit), new Card(rank, suit));
			}
		}
		return Collections.unmodifiableMap(cardCache);
	}
	
	private static String cardKey(Rank rank, Suit suit) {
		return (rank + " of " + suit);
	}	
	
	public static Card getCard(Rank rank, Suit suit) {
		
		final Card card = cardCache.get(cardKey(rank, suit));
		
		if(card != null){
			return card;
		}else{
			throw new RuntimeException("Invalid Card: " + rank + suit);
		}		
	}

	@Override
	public String toString(){
		return String.format("%s of %s", this.rank, this.suit);
	}
}
