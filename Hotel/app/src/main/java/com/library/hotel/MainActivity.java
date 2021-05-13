package com.library.hotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView upcoming,fav,finished;
    LinearLayout linear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        upcoming = (TextView) findViewById(R.id.upcoming);
        finished = (TextView) findViewById(R.id.finished);
        fav = (TextView) findViewById(R.id.fav);
        linear = (LinearLayout) findViewById(R.id.ll1);

        upcoming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                upcoming.setTextColor(Color.BLUE);
                fav.setTextColor(Color.parseColor("#545252"));
                finished.setTextColor(Color.parseColor("#545252"));
            }
        });

        fav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fav.setTextColor(Color.BLUE);
                upcoming.setTextColor(Color.parseColor("#545252"));
                finished.setTextColor(Color.parseColor("#545252"));
            }
        });

        finished.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finished.setTextColor(Color.BLUE);
                upcoming.setTextColor(Color.parseColor("#545252"));
                fav.setTextColor(Color.parseColor("#545252"));
            }
        });

        linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,BookSlot.class);
                startActivity(intent);
                finish();
            }
        });
    }
}