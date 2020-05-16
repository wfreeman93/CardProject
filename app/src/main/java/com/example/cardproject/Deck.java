package com.example.cardproject;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	private ArrayList<Card> cards = new ArrayList<>();
	
	
	//Constructor that will create a deck of 52 cards, all in order
	public Deck()	{
			cards.add(new Card("2", 2, false, "Clubs", 2,  BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.two_of_clubs)));
			cards.add(new Card("3", 3, false, "Clubs", 3, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.three_of_clubs)));
			cards.add(new Card("4", 4, false, "Clubs", 4, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.four_of_clubs)));
			cards.add(new Card("5", 5, false, "Clubs", 5, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.five_of_clubs)));
			cards.add(new Card("6", 6, false, "Clubs", 6, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.six_of_clubs)));
			cards.add(new Card("7", 7, false, "Clubs", 7, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.seven_of_clubs)));
			cards.add(new Card("8", 8, false, "Clubs", 8, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.eight_of_clubs)));
			cards.add(new Card("9", 9, false, "Clubs", 9, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.nine_of_clubs)));
			cards.add(new Card("10", 10, false, "Clubs", 10, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.ten_of_clubs)));
			cards.add(new Card("Jack", 10, true, "Clubs", 11, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.jack_of_clubs)));
			cards.add(new Card("Queen", 10, true, "Clubs", 12, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.queen_of_clubs)));
			cards.add(new Card("King", 10, true, "Clubs", 13, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.king_of_clubs)));
			cards.add(new Card("Ace", 11, false, "Clubs", 14, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.ace_of_clubs)));

			cards.add(new Card("2", 2, false, "Diamonds", 2, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.twp_of_diamonds)));
			cards.add(new Card("3", 3, false, "Diamonds", 3, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.three_of_diamonds)));
			cards.add(new Card("4", 4, false, "Diamonds", 4, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.four_of_diamonds)));
			cards.add(new Card("5", 5, false, "Diamonds", 5, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.five_of_diamonds)));
			cards.add(new Card("6", 6, false, "Diamonds", 6, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.six_of_diamonds)));
			cards.add(new Card("7", 7, false, "Diamonds", 7, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.seven_of_diamonds)));
			cards.add(new Card("8", 8, false, "Diamonds", 8, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.eight_of_diamonds)));
			cards.add(new Card("9", 9, false, "Diamonds", 9, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.nine_of_diamonds)));
			cards.add(new Card("10", 10, false, "Diamonds", 10, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.ten_of_diamonds)));
			cards.add(new Card("Jack", 10, true, "Diamonds", 11, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.jack_of_diamonds)));
			cards.add(new Card("Queen", 10, true, "Diamonds", 12, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.queen_of_diamonds)));
			cards.add(new Card("King", 10, true, "Diamonds", 13, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.king_of_diamonds)));
			cards.add(new Card("Ace", 11, false, "Diamonds", 14, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.ace_of_diamonds)));

			cards.add(new Card("2", 2, false, "Hearts", 2, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.two_of_hearts)));
			cards.add(new Card("3", 3, false, "Hearts", 3, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.three_of_hearts)));
			cards.add(new Card("4", 4, false, "Hearts", 4, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.four_of_hearts)));
			cards.add(new Card("5", 5, false, "Hearts", 5, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.five_of_hearts)));
			cards.add(new Card("6", 6, false, "Hearts", 6, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.six_of_hearts)));
			cards.add(new Card("7", 7, false, "Hearts", 7, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.seven_of_hearts)));
			cards.add(new Card("8", 8, false, "Hearts", 8, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.eight_of_hearts)));
			cards.add(new Card("9", 9, false, "Hearts", 9, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.nine_of_hearts)));
			cards.add(new Card("10", 10, false, "Hearts", 10, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.ten_of_hearts)));
			cards.add(new Card("Jack", 10, true, "Hearts", 11, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.jack_of_hearts)));
			cards.add(new Card("Queen", 10, true, "Hearts", 12, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.queen_of_hearts)));
			cards.add(new Card("King", 10, true, "Hearts",13, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.king_of_hearts)));
			cards.add(new Card("Ace", 11, false, "Hearts", 14, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.ace_of_hearts)));

			cards.add(new Card("2", 2, false, "Spades", 2, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.two_of_spades)));
			cards.add(new Card("3", 3, false, "Spades", 3, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.three_of_spades)));
			cards.add(new Card("4", 4, false, "Spades", 4, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.four_of_spades)));
			cards.add(new Card("5", 5, false, "Spades", 5, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.five_of_spades)));
			cards.add(new Card("6", 6, false, "Spades", 6, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.six_of_spades)));
			cards.add(new Card("7", 7, false, "Spades", 7, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.seven_of_spades)));
			cards.add(new Card("8", 8, false, "Spades", 8, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.eight_of_spades)));
			cards.add(new Card("9", 9, false, "Spades", 9, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.nine_of_spades)));
			cards.add(new Card("10", 10, false, "Spades", 10, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.ten_of_spades)));
			cards.add(new Card("Jack", 10, true, "Spades", 11, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.jack_of_spades)));
			cards.add(new Card("Queen", 10, true, "Spades", 12, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.queen_of_spades)));
			cards.add(new Card("King", 10, true, "Spades", 13, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.king_of_spades)));
			cards.add(new Card("Ace", 11, false, "Spades", 14, BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.ace_of_spades)));
	}
	
	//Shuffles deck using Collections built in shuffle
	public void shuffleDeck() {
		Collections.shuffle(cards);
		}
	
	//added isEmpty method for Deck object
	public boolean isEmpty() {
		if (cards.isEmpty()) {
			return true;
		}
		return false;
	}
	
	//This method will just create 4 deck objects, add them together, then shuffle them. Blackjack
	// is normally played with several decks shuffled together, start at 4
	public void createBlackjackDeck() {
		Deck tempDeck = new Deck();
		Deck tempDeck1 = new Deck();
		Deck tempDeck2 = new Deck();
		cards.addAll(tempDeck.cards);
		cards.addAll(tempDeck1.cards);
		cards.addAll(tempDeck2.cards);
		Collections.shuffle(cards);
		
	}
	
	
	//Draw method is intended to replicate drawing a card from the top of a deck
	//will remove and then return the first card in the cards array
	public Card drawCard() {
		Card topCard = new Card();
		topCard = cards.get(0);
		cards.remove(0);
		return topCard;
	}
	
	
	// useful method to print out our deck objects
	// the count at the end will show us exactly how many cards our deck has for testing purposes
	public String toString() {
		int cardCount = 1;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < cards.size(); i++) {
			sb.append("[Rank: " + cards.get(i).getRank() + "]" + ", [Value: " + cards.get(i).getValue() + "]" + ", [Face: "
					+ cards.get(i).getIsFace() + "]" + ", [Suite: " + cards.get(i).getSuite() + "]" + " " + cardCount);
			sb.append("\n");
			cardCount++;
		}
		return sb.toString();
	}
}



