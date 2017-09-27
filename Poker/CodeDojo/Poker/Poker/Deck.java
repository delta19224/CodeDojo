package Poker;

import java.util.Collections;
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
		Collections.shuffle(deck);
		return deck;
	}
	
	public Card get(int pos){
		return deck.get(pos);
	}
	
	public Stack<Card> getDeck(){
		return deck;
	}
	
	public Card deal(){
		return deck.pop();
	}
}
