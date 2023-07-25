package com.sveri.exploreease;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class FoodListTwo extends AppCompatActivity {

    ImageButton btnfone , btnftwo , btnfthree , btnffour ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list_two);

        btnfone = findViewById(R.id.imageButtonFoodOne);
        btnftwo = findViewById(R.id.imageButtonFoodTwo);
        btnfthree = findViewById(R.id.imageButtonFoodThree);
        btnffour = findViewById(R.id.imageButtonFoodFour);

        btnfone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FoodListTwo.this, Atithi.class));
            }
        });

        btnftwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FoodListTwo.this, Radhesh.class));
            }
        });
        btnfthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FoodListTwo.this, Sadguru.class));
            }
        });

        btnffour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FoodListTwo.this, Annapurna.class));
            }
        });
    }
}