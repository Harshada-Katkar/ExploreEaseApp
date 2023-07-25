package com.sveri.exploreease;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class about1 extends AppCompatActivity {

    ImageButton imgbtnback ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about1);

        imgbtnback = findViewById(R.id.imageButtonFoodBack);
        imgbtnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(about1.this,AboutActivity.class));
            }
        });
    }
}