package com.example.cardproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playBlackjackOnClick(View view) {
        Intent blackjack = new Intent(this, BlackJackActivity.class);
        startActivity(blackjack);
    }

    public void playWarOnClick(View view) {
        Intent war = new Intent(this, WarActivity.class);
        startActivity(war);
    }
}
