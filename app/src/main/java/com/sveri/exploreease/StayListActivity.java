package com.sveri.exploreease;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class StayListActivity extends AppCompatActivity {

    ImageButton imgbtnForward ;
    ImageButton btnOne , btnTwo , btnThree , btnFour ;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stay_list);

        imgbtnForward = findViewById(R.id.imageButtonForward);
        btnOne = findViewById(R.id.imageButtonOne);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StayListActivity.this , PrabhuRes.class));
            }
        });
        btnTwo = findViewById(R.id.imageButtonTwo);
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StayListActivity.this , Balaji.class ));
            }
        });
        btnThree = findViewById(R.id.imageButtonThree);
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StayListActivity.this , Pandharinath.class));
            }
        });
        btnFour = findViewById(R.id.imageButtonFour);
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StayListActivity.this , VitthalInn.class ));
            }
        });

        imgbtnForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StayListActivity.this, StayListActivityTwo.class));
            }
        });
    }
}