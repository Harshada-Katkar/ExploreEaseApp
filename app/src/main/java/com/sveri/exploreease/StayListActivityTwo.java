package com.sveri.exploreease;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class StayListActivityTwo extends AppCompatActivity {

    ImageButton btnFive , btnSix  ;

    ImageButton imgbtnBack ;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stay_list_two);

        btnFive = findViewById(R.id.imageButtonFive);
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StayListActivityTwo.this , Dhanashree.class ));
            }
        });
        btnSix = findViewById(R.id.imageButtonSix);
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StayListActivityTwo.this , Dreamland.class ));
            }
        });

        imgbtnBack = findViewById(R.id.imageButtonBack);

        imgbtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StayListActivityTwo.this, StayListActivity.class));

            }
        });

    }
}