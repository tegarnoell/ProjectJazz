package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Newsfeed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newsfeed);
    }

    public void Jazz(View view) {
        Intent intent = new Intent(Newsfeed.this, MainActivity.class);
        startActivity(intent);
    }

    public void Getticket(View view) {
        Intent intent = new Intent(Newsfeed.this, GetTicket.class);
        startActivity(intent);
    }

    public void Lineup(View view) {
        Intent intent = new Intent(Newsfeed.this, Lineup.class);
        startActivity(intent);
    }

    public void Schedule(View view) {
        Intent intent = new Intent(Newsfeed.this, Schedule.class);
        startActivity(intent);
    }

}