package Poker;

import java.util.Optional;
import java.util.Stack;

public class Deck {

	private final Stack<Card> deck;
	
	Deck(){
		this.deck = initializeDeck();
	}
	
	private Stack<Card> initializeDeck(){
		
		Stack<Card> deck = new Stack<>();
		
		for(Suit suit : Suit.values()){
			for(Rank rank : Rank.values()){
				deck.push(Card.getCard(rank, suit));
			}
		}
		return deck;
	}
	
	public Optional<Card> deal(){
		if(deck.isEmpty()){
			return Optional.empty();
		}else{
			return Optional.of(deck.pop());
		}
	}
}
