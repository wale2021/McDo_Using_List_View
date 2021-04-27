package com.example.mcdonalds;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CardView cardViewAssessing = findViewById(R.id.card_view_2);
        cardViewAssessing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent movingToNextViewIntent = new Intent(MainActivity.this,ListViewDetails.class);
                startActivity(movingToNextViewIntent);
            }
        });
    }
}