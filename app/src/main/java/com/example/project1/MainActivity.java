package com.example.project1;

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
    public void Getticket(View view) {
        Intent intent = new Intent(MainActivity.this, GetTicket.class);
        startActivity(intent);
    }

    public void Lineup(View view) {
        Intent intent = new Intent(MainActivity.this, Lineup.class);
        startActivity(intent);
    }

    public void Ads(View view) {
        Intent intent = new Intent(MainActivity.this, Advertisement.class);
        startActivity(intent);
    }
}