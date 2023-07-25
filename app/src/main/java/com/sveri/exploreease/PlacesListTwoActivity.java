package com.sveri.exploreease;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class PlacesListTwoActivity extends AppCompatActivity {

    ImageButton btnfive , btnsix , btnseven , btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_list_two);

        btnfive = findViewById(R.id.imageButtonPlaceFive);
        btnfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PlacesListTwoActivity.this,pundalik.class));
            }
        });
        btnsix = findViewById(R.id.imageButtonPlaceSix);
        btnsix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PlacesListTwoActivity.this,ChandraBhaga.class));
            }
        });
        btnseven = findViewById(R.id.imageButtonPlaceSeven);
        btnseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PlacesListTwoActivity.this,Tulasi.class));
            }
        });
        btnback = findViewById(R.id.imageButtonPlaceBack);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PlacesListTwoActivity.this,PlacesListActivity.class));
            }
        });

    }
}