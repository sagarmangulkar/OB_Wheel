package com.example.macbookpro.ob_wheels;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    public Button but1;
    public Button but2;
    public Button but3;

    //for first button click
    public void init(){
        but1 = (Button) findViewById(R.id.button1);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent firstClick = new Intent(MainActivity.this, CalenderActivity.class);
                startActivity(firstClick);
            }
        });

    //for second button click
        but2 = (Button) findViewById(R.id.button2);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent firstClick = new Intent(MainActivity.this, TraditionalWheelActivity.class);
                startActivity(firstClick);
            }
        });

    //for third button click
        but3 = (Button) findViewById(R.id.button3);
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent firstClick = new Intent(MainActivity.this, SettingEDDActivity.class);
                startActivity(firstClick);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
}
