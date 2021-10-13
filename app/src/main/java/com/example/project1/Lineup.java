package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Lineup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lineup);
    }

    public void Jazz(View view) {
        Intent intent = new Intent(Lineup.this, MainActivity.class);
        startActivity(intent);
    }

    public void Getticket(View view) {
        Intent intent = new Intent(Lineup.this, GetTicket.class);
        startActivity(intent);
    }

    public void Newsfeed(View view) {
        Intent intent = new Intent(Lineup.this, Newsfeed.class);
        startActivity(intent);
    }

    public void Schedule(View view) {
        Intent intent = new Intent(Lineup.this, Schedule.class);
        startActivity(intent);
    }
}