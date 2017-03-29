package com.example.macbookpro.ob_wheels;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    public void init() {
        findViewById(R.id.button_cal).setOnClickListener(this);
        findViewById(R.id.button_wheel).setOnClickListener(this);
        findViewById(R.id.button_setting_edd).setOnClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_cal:
                startActivity(new Intent(this, CalenderActivity.class));
                break;

            case R.id.button_wheel:
                startActivity(new Intent(this, TraditionalWheelActivity.class));
                break;

            case R.id.button_setting_edd:
                startActivity(new Intent(this, SettingEDDActivity.class));
                break;
        }
    }
}
