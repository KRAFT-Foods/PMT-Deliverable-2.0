package com.example.ali.myapplication;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class WomensActivity extends AppCompatActivity {

    boolean isEnable=false;
    boolean isEnable1=false;
    boolean isEnable2=false;
    boolean isEnable3=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_womens);

        final ImageButton ButtonStar = (ImageButton) findViewById(R.id.wwfavorite_button);
        ButtonStar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isEnable){
                    ButtonStar.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),android.R.drawable.btn_star_big_off));
                }else{
                    ButtonStar.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),android.R.drawable.btn_star_big_on));
                }
                isEnable = !isEnable;
            }
        });

        final ImageButton ButtonStar1 = (ImageButton) findViewById(R.id.wwfavorite_button1);
        ButtonStar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isEnable1){
                    ButtonStar1.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),android.R.drawable.btn_star_big_off));
                }else{
                    ButtonStar1.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),android.R.drawable.btn_star_big_on));
                }
                isEnable1= !isEnable1;
            }
        });

        final ImageButton ButtonStar2 = (ImageButton) findViewById(R.id.wwfavorite_button2);
        ButtonStar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isEnable2){
                    ButtonStar2.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),android.R.drawable.btn_star_big_off));
                }else{
                    ButtonStar2.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),android.R.drawable.btn_star_big_on));
                }
                isEnable2 = !isEnable2;
            }
        });

        final ImageButton ButtonStar3 = (ImageButton) findViewById(R.id.wwfavorite_button3);
        ButtonStar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isEnable3){
                    ButtonStar3.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),android.R.drawable.btn_star_big_off));
                }else{
                    ButtonStar3.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),android.R.drawable.btn_star_big_on));
                }
                isEnable3 = !isEnable3;
            }
        });



        TextView mLink = (TextView) findViewById(R.id.wwlinktext1);
        if (mLink != null) {
            mLink.setMovementMethod(LinkMovementMethod.getInstance());
        }

        TextView mLink1 = (TextView) findViewById(R.id.wwlinktext2);
        if (mLink1 != null) {
            mLink1.setMovementMethod(LinkMovementMethod.getInstance());
        }

        TextView mLink2 = (TextView) findViewById(R.id.wwlinktext3);
        if (mLink2 != null) {
            mLink2.setMovementMethod(LinkMovementMethod.getInstance());
        }

        TextView mLink3 = (TextView) findViewById(R.id.wwlinktext4);
        if (mLink3 != null) {
            mLink3.setMovementMethod(LinkMovementMethod.getInstance());
        }




    }
}
