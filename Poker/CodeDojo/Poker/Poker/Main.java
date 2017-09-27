package Poker;

public class Main {

	final static int deckSize = 52;
	
	public static void main(String [] args){
		final Deck deck = new Deck();

		System.out.println("Player 1 Hand");
		Player players = new Player(deck.getDeck());
		players.printHand(players.getPlayerOneHand());
		System.out.println(" ");
		
		System.out.println("Player 2 Hand");
		players.printHand(players.getPlayerTwoHand());
		System.out.println(" ");
	}
}
