package com.example.ali.myapplication;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class MenuActivity extends Activity { // This is the main activity




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     //   requestWindowFeature(Window.FEATURE_NO_TITLE); //NO ACTION BAR
     //   getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_menu);

        Button mensButton;
        Button womensButton;
        Button discountsButton;
        Button bookmarksButton;


        mensButton = findViewById(R.id.mensButton);
        mensButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                openMens();

            }
        });  //Products button

        womensButton = findViewById(R.id.womensButton);
        womensButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                openWomens();

            }
        });  //Products button


        /*
        discountsButton = findViewById(R.id.discountsButton);
        discountsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
               openDiscounts();
            }
        });  //discounts button

        */


        bookmarksButton = findViewById(R.id.bookmarksButton);
        bookmarksButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openBookmarks();

            }
        });  //bookmarks button




    }

    private void openMens() {
        Intent intent = new Intent(this, MensActivity.class);
        startActivity(intent);
    }

    private void openWomens() {
        Intent intent = new Intent(this, WomensActivity.class);
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

