package com.example.cardproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class WarActivity extends AppCompatActivity {

    int pScore, dScore;

    Deck gameDeck;
    ArrayList<Card> compareDeck;
    TextView playerScoreBox, dealerScoreBox, playerCard, dealerCard, gameText;
    Button drawButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_war);
        playerCard = (TextView)findViewById(R.id.playerCard);
        dealerCard = (TextView)findViewById(R.id.dealerCard);
        playerScoreBox = (TextView)findViewById(R.id.playerScoreBox);
        dealerScoreBox = (TextView)findViewById(R.id.dealerScoreBox);
        gameText = (TextView)findViewById(R.id.gameText);
        gameDeck = new Deck();
        gameDeck.shuffleDeck();
        compareDeck = new ArrayList<>();
        drawButton = (Button)findViewById(R.id.drawCard);
    }

    //returns intent to main menu
    public void returnToMenuClick(View view) {
        Intent menu = new Intent(this, MainActivity.class);
        startActivity(menu);
    }

    //main game logic for the War game
    //clicking the button draws the cards and compares them, and updates score as necessarry
    public void drawCardClick(View view) {
        compareDeck.add(gameDeck.drawCard());
        compareDeck.add(gameDeck.drawCard());
        playerCard.setText("You drew " + compareDeck.get(0).toString());
        dealerCard.setText("Dealer drew " + compareDeck.get(1).toString());
        if(compareDeck.get(0).getWarValue() > compareDeck.get(1).getWarValue()) {
            pScore++;
            playerScoreBox.setText(String.valueOf(pScore));
            gameText.setText("Your card beat the dealer!");
        } else if (compareDeck.get(0).getWarValue() < compareDeck.get(1).getWarValue()){
            dScore++;
            dealerScoreBox.setText((String.valueOf(dScore)));
            gameText.setText("The dealers card was higher!");
        } else if (compareDeck.get(0).getWarValue() == compareDeck.get(1).getWarValue()) {
            gameText.setText("Your cards tied!");
        }
        if(gameDeck.isEmpty()) {
            if(pScore > dScore) {
                gameText.setText("Game is over, you win!");
                drawButton.setEnabled(false);
            } else if(pScore < dScore) {
                gameText.setText("Game is over, dealer wins!");
                drawButton.setEnabled(false);
            } else if(pScore == dScore) {
                gameText.setText("Game is over, you tied!");
                drawButton.setEnabled(false);
            }
        }
        compareDeck.clear();

    }

    //resets the intent to start War over
    public void resetOnClick(View view) {
        Intent reset = new Intent(this, WarActivity.class);
        startActivity(reset);
        }
    }

