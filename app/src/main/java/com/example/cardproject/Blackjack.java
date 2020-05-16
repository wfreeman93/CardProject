package com.example.cardproject;
import java.util.Scanner;
import java.util.ArrayList;


public class Blackjack{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Game mode: Blackjack");
		System.out.println("Continue? (Y/N)");
		if(scan.next().equalsIgnoreCase("n")) {
			System.out.println("come again soon! ");
			scan.close();
			return;
		} else {
			System.out.println("Welcome... \nGet to 21! 1: hit, 2: stay, 3: quit");
		}
		
		//initialize variables
		boolean inProgress = true;
		
		//main game loop
		while(inProgress) {
			Deck gameDeck = new Deck();
			gameDeck.createBlackjackDeck();
			
			ArrayList<Card> dealerHand = new ArrayList<>();
			ArrayList<Card> playerHand = new ArrayList<>();
			int pScore = 0;
			int dScore = 0;
			boolean playerStay = false;
			
			//adds initial cards to each of the hands
			playerHand.add(gameDeck.drawCard());
			dealerHand.add(gameDeck.drawCard());
			playerHand.add(gameDeck.drawCard());
			dealerHand.add(gameDeck.drawCard());
			
			//this loop is a single 3 round game. it ends when both players stay or one busts
			for(int i = 0; i < 3; i++) {
				System.out.print("Your hand contains: ");
				for(int j = 0; j < playerHand.size(); j++) {
					System.out.print(playerHand.get(j) + ", ");
				}
				System.out.println("");
				
				//totaling scores
				pScore = 0;
				dScore = 0;
				for(int j = 0; j < playerHand.size(); j++) {
					pScore += playerHand.get(j).getValue();
				}
				for(int j = 0; j < dealerHand.size(); j++) {
					dScore += dealerHand.get(j).getValue();
				}
				
				System.out.println("your score is " + pScore);
				
				//player decision input 
				if(!(playerStay)) {
					System.out.println("1: hit 2: stay 3: fold ");
					int temp = scan.nextInt();
					if(temp == 1) {
						Card tempCard = gameDeck.drawCard();
						playerHand.add(tempCard);
						pScore += tempCard.getValue();
					} else if(temp == 2){
						playerStay = true;
					}else if(temp == 3){
						System.out.println("Quitting game. ");
						break;
					} else {
						System.out.println("invalid input, quitting. ");
						break;
					}
				}
				
				//dealer decision making
				if(dScore < 11) {
					System.out.println("the dealer hits ");
					Card tempCard = gameDeck.drawCard();
					dealerHand.add(tempCard);
					dScore += tempCard.getValue();
					
				} 

				if(pScore > 21 || dScore > 21) {
					break;
				}
			}
			
			//totaling scores again
			pScore = 0;
			dScore = 0;
			boolean pBust = false;
			boolean dBust = false;
			for(int j = 0; j < playerHand.size(); j++) {
				pScore += playerHand.get(j).getValue();
				if(pScore > 21)
					pBust = true;
			}
			for(int j = 0; j < dealerHand.size(); j++) {
				dScore += dealerHand.get(j).getValue();
				if(dScore > 21)
					dBust = true;
			}
			System.out.println("Game Over, the scores are... ");
			System.out.println("Dealer: " + dScore + " Player: " + pScore);
			
			//outputting the results
			if(pBust && dBust) {
				System.out.println("Both players busted...");
				
			} else if(pBust) {
				System.out.println("You went over 21. You lose ");
			} else if(dBust) {
				System.out.println("The dealer busted, you win! ");
			} else if(pScore == dScore){
				System.out.println("Its a tie");
			} else if(pScore > dScore){
				System.out.println("You were closer to 21. You win! ");
			} else if(pScore < dScore) {
				System.out.println("The dealer was closer to 21. You lose ");
			}
			
			System.out.println("Play again? (Y/N)");
			if(scan.next().equalsIgnoreCase("n")) {
				inProgress = false;
			}
		}
		System.out.println("Play again soon! ");
		scan.close();
	}
}