package com.example.cardproject;

import android.graphics.Bitmap;
import android.widget.ImageView;

public class Card {
	//What the card is called
	private String rank;
	//What the card is valued
	//Note: Current values reflect Blackjack values
	private int value;
	//Cards suite
	private String suite;
	//Whether or not card is considered face - possible use later, can use other logic to determine, may not need
	private boolean isFace;
	//added in version .3, needed for war game
	private int warValue;
	private Bitmap image;
	
	//default constructor
	public Card() {
		
	}
	
	//Main constructor for card object
	public Card(String rank, int value, boolean isFace, String suite, int warValue, Bitmap image)	{
		this.rank = rank;
		this.value = value;
		this.isFace = isFace;
		this.suite = suite;
		this.warValue = warValue;
		this.image = image;
	}

	public String getRank() 	{
		return rank;
	}
	public int getValue() {
		return value;
	}
	public int getWarValue() {
		return warValue;
	}
	public String getSuite() {
		return suite;
	}
	public Bitmap getImage() { return image;}
	public String getIsFace() {
		if(isFace) {
			return "true";
		} else {
			return "false";
		}
	}
	public String toString() {
		return rank + " of " + suite;
	}
}