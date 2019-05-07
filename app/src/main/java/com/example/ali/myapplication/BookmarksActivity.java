package com.example.ali.myapplication;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class BookmarksActivity extends AppCompatActivity {


    boolean wisEnable =true;
    boolean wisEnable1 =true;
    boolean isEnable = true;
    boolean isEnable1 = true;
    boolean isEnable2 = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookmarks);


        final ImageButton ButtonStar = (ImageButton) findViewById(R.id.favorite_button);
        ButtonStar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isEnable){
                    ButtonStar.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),android.R.drawable.btn_star_big_off));
                    CardView card1 = (CardView) findViewById(R.id.card1);
                    card1.setVisibility(View.GONE);
                }else{
                    ButtonStar.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),android.R.drawable.btn_star_big_on));
                }
                isEnable = !isEnable;
            }
        });

        final ImageButton ButtonStar1 = (ImageButton) findViewById(R.id.favorite_button1);
        ButtonStar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isEnable1){
                    ButtonStar1.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),android.R.drawable.btn_star_big_off));
                    CardView card2 = (CardView) findViewById(R.id.card2);
                    card2.setVisibility(View.GONE);
                }else{
                    ButtonStar1.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),android.R.drawable.btn_star_big_on));
                }
                isEnable1= !isEnable1;
            }
        });

        final ImageButton ButtonStar2 = (ImageButton) findViewById(R.id.favorite_button2);
        ButtonStar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isEnable2){
                    ButtonStar2.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),android.R.drawable.btn_star_big_off));
                    CardView card3 = (CardView) findViewById(R.id.card3);
                    card3.setVisibility(View.GONE);
                }else{
                    ButtonStar2.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),android.R.drawable.btn_star_big_on));
                }
                isEnable2 = !isEnable2;
            }
        });

        final ImageButton wButtonStar = (ImageButton) findViewById(R.id.wwfavorite_button);
        wButtonStar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (wisEnable){
                   wButtonStar.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),android.R.drawable.btn_star_big_off));
                    CardView wcard1 = (CardView) findViewById(R.id.wcard1);
                    wcard1.setVisibility(View.GONE);
                }else{
                    wButtonStar.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),android.R.drawable.btn_star_big_on));
                }
                wisEnable = !wisEnable;
            }
        });

        final ImageButton wButtonStar1 = (ImageButton) findViewById(R.id.wwfavorite_button1);
        wButtonStar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (wisEnable1){
                    wButtonStar1.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),android.R.drawable.btn_star_big_off));
                    CardView wcard2 = (CardView) findViewById(R.id.wcard2);
                    wcard2.setVisibility(View.GONE);
                }else{
                    wButtonStar1.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),android.R.drawable.btn_star_big_on));
                }
                wisEnable1 = !wisEnable1;
            }
        });


        TextView mLink = (TextView) findViewById(R.id.wwwlinktext1);
        if (mLink != null) {
            mLink.setMovementMethod(LinkMovementMethod.getInstance());
        }

        TextView mLink1 = (TextView) findViewById(R.id.wwwlinktext2);
        if (mLink1 != null) {
            mLink1.setMovementMethod(LinkMovementMethod.getInstance());
        }

        TextView mLink3 = (TextView) findViewById(R.id.linktext1);
        if (mLink3 != null) {
            mLink3.setMovementMethod(LinkMovementMethod.getInstance());
        }

        TextView mLink2 = (TextView) findViewById(R.id.linktext2);
        if (mLink2 != null) {
            mLink2.setMovementMethod(LinkMovementMethod.getInstance());
        }

        TextView mLink4 = (TextView) findViewById(R.id.linktext3);
        if (mLink4 != null) {
            mLink4.setMovementMethod(LinkMovementMethod.getInstance());
        }


    }
}
