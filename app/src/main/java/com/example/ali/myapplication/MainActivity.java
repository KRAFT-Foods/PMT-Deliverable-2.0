package com.example.ali.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;


public class MainActivity extends Activity { // This is the main activity




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     //   requestWindowFeature(Window.FEATURE_NO_TITLE); //NO ACTION BAR
     //   getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        Button productsButton;
        Button discountsButton;
        Button bookmarksButton;


        productsButton = findViewById(R.id.productsButton);
        productsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                openProducts();

            }
        });  //Products button

        discountsButton = findViewById(R.id.discountsButton);
        discountsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
               openDiscounts();
            }
        });  //discounts button


        bookmarksButton = findViewById(R.id.bookmarksButton);
        bookmarksButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openBookmarks();

            }
        });  //bookmarks button




    }

    private void openProducts() {
        Intent intent = new Intent(this, ProductsActivity.class);
        startActivity(intent);
    }

    private void openDiscounts() {
        Intent intent = new Intent(this, DiscountsActivity.class);
        startActivity(intent);
    }

    private void openBookmarks() {
        Intent intent = new Intent(this,BookmarksActivity.class);
        startActivity(intent);
    }

}

