package Poker;

import java.util.Stack;

public class Player {
	
	final static int handSize = 5;

	Card [] playerOneHand = new Card [handSize];
	Card [] playerTwoHand = new Card [handSize];
	
	final Stack<Card> deck;
	
	Player(Stack<Card> deck){
		this.deck = deck;
		this.playerOneHand = initializeHand(playerOneHand);
		this.playerTwoHand = initializeHand(playerTwoHand);
	}

	private Card[] initializeHand(Card [] playerHand) {

		for(int i = 0;i < handSize; i++){
			playerHand[i] = deck.pop();
		}
		
		return playerHand;
	}

	public Card[] getPlayerOneHand() {
		return playerOneHand;
	}

	public Card[] getPlayerTwoHand() {
		return playerTwoHand;
	}
	
	public void printHand(Card [] playerHand){
		System.out.println(playerHand[0] + " " + playerHand[1] + " " + playerHand[2] + " " + playerHand[3] + " " + playerHand[4]);
	}
	
	public void countRanks(Card [] playerHand, Rank rank, Suit suit){
		
		for(int i = 0;i < playerHand.length;i++){
		
			playerHand[i].getRankValue();
		}
		
	}
}
