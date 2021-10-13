package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class GetTicket extends AppCompatActivity {

    private Spinner stage,max;
    private Spinner stage2,max2;
    private Spinner stage3,max3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_ticket);

        stage = findViewById(R.id.stage);
        max = findViewById(R.id.max);

        stage2 = findViewById(R.id.stage2);
        max2 = findViewById(R.id.max2);

        stage3 = findViewById(R.id.stage3);
        max3 = findViewById(R.id.max3);

        final List<String> stag = new ArrayList<String>();
        stag.add("STAGE A");
        stag.add("STAGE B");
        stag.add("STAGE B");

        final List<String> ma = new ArrayList<String>();
        ma.add("1");
        ma.add("2");
        ma.add("3");

        final List<String> stag2 = new ArrayList<String>();
        stag2.add("STAGE A");
        stag2.add("STAGE B");
        stag2.add("STAGE B");

        final List<String> ma2 = new ArrayList<String>();
        ma2.add("1");
        ma2.add("2");
        ma2.add("3");

        final List<String> stag3 = new ArrayList<String>();
        stag3.add("STAGE A");
        stag3.add("STAGE B");
        stag3.add("STAGE B");

        final List<String> ma3 = new ArrayList<String>();
        ma3.add("1");
        ma3.add("2");
        ma3.add("3");

        ArrayAdapter<String> stagee = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, stag);
        stage.setAdapter(stagee);
        stagee.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> maa = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, ma);
        max.setAdapter(maa);
        maa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> stagee2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, stag2);
        stage2.setAdapter(stagee2);
        stagee2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> maa2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, ma2);
        max2.setAdapter(maa2);
        maa2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> stagee3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, stag3);
        stage3.setAdapter(stagee3);
        stagee3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> maa3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, ma3);
        max3.setAdapter(maa3);
        maa3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    }

    public void Jazz(View view) {
        Intent intent = new Intent(GetTicket.this, MainActivity.class);
        startActivity(intent);
    }

    public void Lineup(View view) {
        Intent intent = new Intent(GetTicket.this, Lineup.class);
        startActivity(intent);
    }

    public void Newsfeed(View view) {
        Intent intent = new Intent(GetTicket.this, Newsfeed.class);
        startActivity(intent);
    }

    public void Schedule(View view) {
        Intent intent = new Intent(GetTicket.this, Schedule.class);
        startActivity(intent);
    }

}