package com.sveri.exploreease;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class PlacesListActivity extends AppCompatActivity {

    ImageButton btnone , btntwo , btnthree , btnfour  , btnforward;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_list);

        btnone = findViewById(R.id.imageButtonPlaceOne);
        btnone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PlacesListActivity.this,VitthalTemple.class));
            }
        });
        btntwo = findViewById(R.id.imageButtonPlaceTwo);
        btntwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PlacesListActivity.this,IskconTemple.class));
            }
        });
        btnthree = findViewById(R.id.imageButtonPlaceThree);
        btnthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PlacesListActivity.this,Gajanan.class));
            }
        });
        btnfour = findViewById(R.id.imageButtonPlaceFour);
        btnfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PlacesListActivity.this, MainActivityKaikadi.class));
            }
        });
        btnforward = findViewById(R.id.imagePlaceNext);
        btnforward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PlacesListActivity.this,PlacesListTwoActivity.class));
            }
        });
    }
}