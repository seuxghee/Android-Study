package com.cookandroid.ch12_5_4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button button, button2, button3;
    FrameLayout frRed, frBlue, frGeen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

        frRed = (FrameLayout) findViewById(R.id.frRed);
        frBlue = (FrameLayout) findViewById(R.id.frBlue);
        frGeen = (FrameLayout) findViewById(R.id.frGreen);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               frRed.setVisibility(View.VISIBLE);
               frBlue.setVisibility(View.INVISIBLE);
               frGeen.setVisibility(View.INVISIBLE);


            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frRed.setVisibility(View.INVISIBLE);
                frBlue.setVisibility(View.VISIBLE);
                frGeen.setVisibility(View.INVISIBLE);


            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frRed.setVisibility(View.INVISIBLE);
                frBlue.setVisibility(View.INVISIBLE);
                frGeen.setVisibility(View.VISIBLE);


            }
        });

    }
}