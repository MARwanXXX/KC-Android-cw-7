package com.example.cw7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Items> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listView);
        Button cart = findViewById(R.id.cart);
        Bundle bundle = getIntent().getExtras();

       // AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);

        Items item1 = new Items("Cheese",2.500, R.drawable.cheese );
        Items item2 = new Items("Chocolate", 0.500, R.drawable.chocolate );
        Items item3 = new Items("Coffee", 1.600, R.drawable.coffee );
        Items item4 = new Items("Donut", 2.000, R.drawable.donut );
        Items item5 = new Items("Fries", 0.400, R.drawable.fries );
        Items item6 = new Items("Honey", 4.900, R.drawable.honey );


       items.add(item1);
       items.add(item2);
       items.add(item3);
       items.add(item4);
       items.add(item5);
       items.add(item6);

       ItemsAdapter itemsAdapter = new ItemsAdapter(this, 0, items);

       listView.setAdapter(itemsAdapter);

       cart.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               Intent intent = new Intent(MainActivity.this, MainActivity2.class);
               startActivity(intent);
           }
       });
    }
}