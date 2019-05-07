package com.example.ali.myapplication;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MensActivity extends AppCompatActivity {

    boolean isEnable=false;
    boolean isEnable1=false;
    boolean isEnable2=false;
    boolean isEnable3=false;
    boolean isEnable4=false;
    boolean isEnable5=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mens);

        final ImageButton ButtonStar = (ImageButton) findViewById(R.id.favorite_button);
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

        final ImageButton ButtonStar1 = (ImageButton) findViewById(R.id.favorite_button1);
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

        final ImageButton ButtonStar2 = (ImageButton) findViewById(R.id.favorite_button2);
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

        final ImageButton ButtonStar3 = (ImageButton) findViewById(R.id.favorite_button3);
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

        final ImageButton ButtonStar4 = (ImageButton) findViewById(R.id.favorite_button4);
        ButtonStar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isEnable4){
                    ButtonStar4.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),android.R.drawable.btn_star_big_off));
                }else{
                    ButtonStar4.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),android.R.drawable.btn_star_big_on));
                }
                isEnable4 = !isEnable4;
            }
        });

        final ImageButton ButtonStar5 = (ImageButton) findViewById(R.id.favorite_button5);
        ButtonStar5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isEnable5){
                    ButtonStar5.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),android.R.drawable.btn_star_big_off));
                }else{
                    ButtonStar5.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),android.R.drawable.btn_star_big_on));
                }
                isEnable5 = !isEnable5;
            }
        });


        TextView mLink = (TextView) findViewById(R.id.linktext1);
        if (mLink != null) {
            mLink.setMovementMethod(LinkMovementMethod.getInstance());
        }

        TextView mLink1 = (TextView) findViewById(R.id.linktext2);
        if (mLink1 != null) {
            mLink1.setMovementMethod(LinkMovementMethod.getInstance());
        }

        TextView mLink2 = (TextView) findViewById(R.id.linktext3);
        if (mLink2 != null) {
            mLink2.setMovementMethod(LinkMovementMethod.getInstance());
        }

        TextView mLink3 = (TextView) findViewById(R.id.linktext4);
        if (mLink3 != null) {
            mLink3.setMovementMethod(LinkMovementMethod.getInstance());
        }

        TextView mLink4 = (TextView) findViewById(R.id.linktext5);
        if (mLink4 != null) {
            mLink4.setMovementMethod(LinkMovementMethod.getInstance());
        }

        TextView mLink5 = (TextView) findViewById(R.id.linktext6);
        if (mLink5 != null) {
            mLink5.setMovementMethod(LinkMovementMethod.getInstance());
        }


    }
}
