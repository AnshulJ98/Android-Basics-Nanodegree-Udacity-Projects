package com.example.anshulj.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView about = findViewById(R.id.about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutIntent = new Intent(MainActivity.this, aboutActivity.class);
                startActivity(aboutIntent);
            }
        });

        TextView topAttractions = findViewById(R.id.toparrtactions);
        topAttractions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent topAttractionsIntent = new Intent(MainActivity.this, topAttractionsActivity.class);
                startActivity(topAttractionsIntent);
            }
        });

        TextView hotels = findViewById(R.id.hotels);
        hotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hotelsIntent = new Intent(MainActivity.this, hotelsActivity.class);
                startActivity(hotelsIntent);
            }
        });

        TextView cuisine = findViewById(R.id.cuisine);
        cuisine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cuisineIntent = new Intent(MainActivity.this, cuisineActivity.class);
                startActivity(cuisineIntent);
            }
        });

        TextView bars = findViewById(R.id.bars);
        bars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent barsIntent = new Intent(MainActivity.this, barsActivity.class);
                startActivity(barsIntent);
            }
        });

    }

}
