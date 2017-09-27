package Poker;

import java.util.stream.IntStream;

public class Main {

	final static int deckSize = 52;
	
	public static void main(String [] args){
		final Deck deck = new Deck();
		IntStream.range(0, deckSize).forEach(value -> System.out.println(deck.deal()));
	}
}
