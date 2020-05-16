package com.example.cardproject;

import java.util.ArrayList;
import java.util.Scanner;

public class War {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Game mode: War");
		System.out.println("Continue? (Y/N)");
		if(scan.next().equalsIgnoreCase("n")) {
			System.out.println("come again soon! ");
			scan.close();
			return;
		} else {
			System.out.println("Welcome... \nBeat your opponent in a game of war!");
		}
		
		//main game loop
		boolean inProgress = true;
		while(inProgress) {
			int dealerScore = 0;
			int playerScore = 0;
			Deck gameDeck = new Deck();
			gameDeck.shuffleDeck();
			
			ArrayList<Card> compareDeck = new ArrayList<>();
			
			compareDeck.add(gameDeck.drawCard());
			compareDeck.add(gameDeck.drawCard());
			System.out.println(compareDeck.get(0));
			System.out.println(compareDeck.get(1));
			
			//This logic just compares the two drawn cards, dealer first then player, and figures out which is higher
			//This is super simple way of playing War, since we will not worry about adding won cards to decks
			if(compareDeck.get(0).getWarValue() > compareDeck.get(1).getWarValue()) {
				System.out.println("Dealer card was higher!");
				dealerScore++;
				System.out.println("Dealer score is " + dealerScore);
				System.out.println("Player score is " + playerScore);
			} else if(compareDeck.get(0).getWarValue() < compareDeck.get(1).getWarValue()) {
				System.out.println("Players card was higher!");
				playerScore++;
				System.out.println("Dealer score is " + dealerScore);
				System.out.println("Player score is " + playerScore);
			}
			//Doing one initial loop for testing
			inProgress = false;
			scan.close();
		}

	}

}
