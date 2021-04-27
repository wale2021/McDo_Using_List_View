package com.example.mcdonalds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewDetails extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_details);
        ListView itemListView = findViewById(R.id.list_view_items);

        String[] listOfFoods = {
                "apple dishes",
                "avocado dishes",
                "banana dishes",
                "cherry dishes",
                "grape dishes",
                "lemon dishes and beverages",
                "melon dishes",
                "plum dishes",
                "squash and pumpkin dishes"
        };
        // We need array Adapter to attached the list in the array to our ListView
        ArrayAdapter<String> listOfFoodsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,listOfFoods);
        itemListView.setAdapter(listOfFoodsAdapter);
    }
}