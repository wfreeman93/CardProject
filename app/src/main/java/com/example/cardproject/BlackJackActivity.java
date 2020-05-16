package com.example.cardproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class BlackJackActivity extends AppCompatActivity {

    int pScore, dScore;

    Deck gameDeck;
    ArrayList<Card> dealerHand, playerHand;
    TextView playerScoreBox, dealerScoreBox, gameText;
    ImageView dealerCardImage, playerCardImage;
    Button hitButton, stayButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_black_jack);
        //initialize variables
         playerScoreBox= (TextView)findViewById(R.id.playerScoreBox);
         dealerScoreBox= (TextView)findViewById(R.id.dealerScoreBox);
         gameText = (TextView) findViewById(R.id.gameText);
         dealerCardImage = (ImageView)findViewById(R.id.dealerFaceCard);
         playerCardImage = (ImageView)findViewById(R.id.playerFaceCard);
         hitButton = (Button) findViewById(R.id.hitButton);
         stayButton = (Button) findViewById(R.id.stayButton);
        gameDeck = new Deck();
        gameDeck.createBlackjackDeck();

        dealerHand = new ArrayList<>();
        playerHand = new ArrayList<>();
        pScore = 0;
        dScore = 0;

        //adds initial cards to each of the hands
        playerHand.add(gameDeck.drawCard());
        dealerHand.add(gameDeck.drawCard());
        playerHand.add(gameDeck.drawCard());
        dealerHand.add(gameDeck.drawCard());

        for(int j = 0; j < playerHand.size(); j++) {
            pScore += playerHand.get(j).getValue();
        }
        for(int j = 0; j < dealerHand.size(); j++) {
            dScore += dealerHand.get(j).getValue();
        }

        playerScoreBox.setText(String.valueOf(pScore));
        dealerScoreBox.setText(String.valueOf(dScore));


    }

    //starts a new game by resetting intent to create new blackjack activity
    public void startNewGameOnClick(View view) {
        Intent blackjack = new Intent(this, BlackJackActivity.class);
        startActivity(blackjack);
    }

    //main game logic, player will hit until they bust or decide to stay
    public void  hitOnClick(View view) {
        playerHand.add(gameDeck.drawCard());
        pScore += playerHand.get(playerHand.size() - 1).getValue();
        playerScoreBox.setText(String.valueOf(pScore));
        if(pScore > 21) {
            hitButton.setEnabled(false);
            stayButton.setEnabled(false);
            gameText.setText("You busted!");
        }
    }

    //other main game logic
    //clicking stay effectively activates the decision making for the dealer, and determines hand winner
    public void stayOnClick(View view) {
        while(dScore < 16) {
            dealerHand.add(gameDeck.drawCard());
            dScore += dealerHand.get(dealerHand.size() - 1).getValue();
            dealerScoreBox.setText(String.valueOf(dScore));
        }
        if(dScore > 21) {
            gameText.setText("Dealer busted!");
            hitButton.setEnabled(false);
            stayButton.setEnabled(false);
        } else if(dScore > pScore) {
            gameText.setText("Dealer wins!");
            hitButton.setEnabled(false);
            stayButton.setEnabled(false);
        } else if(pScore > dScore) {
            gameText.setText("You beat the dealer!");
            hitButton.setEnabled(false);
            stayButton.setEnabled(false);
        } else if(pScore == dScore) {
            gameText.setText("Dealer and player wash!");
            hitButton.setEnabled(false);
            stayButton.setEnabled(false);
        }
    }

    //returns intent to main menu
    public void returnToMenuClick(View view) {
        Intent menu = new Intent(this, MainActivity.class);
        startActivity(menu);
    }
}
