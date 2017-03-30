package com.example.macbookpro.ob_wheels;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class TraditionalWheelActivity extends AppCompatActivity {

    ImageView imageInnerWheel;
    ImageView imageOuterWheel;
    Button buttonRotateRight;
    Button buttonRotateLeft;
    int rotationOffSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traditional_wheel);
        rotateRightWheel();
        rotateLeftWheel();
    }

    //logic to rotate inner wheel right
    public void rotateRightWheel(){
        imageInnerWheel = (ImageView)findViewById(R.id.imageInnerWheel);
        imageOuterWheel = (ImageView)findViewById(R.id.imageOuterWheel);
        buttonRotateRight = (Button)findViewById(R.id.buttonRotateRight);
        buttonRotateRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("DEBUG", "Rotate Right Clicked...!");
                rotationOffSet = rotationOffSet + 4;
                imageInnerWheel.setRotation(rotationOffSet);
            }
        });
    }

    //logic to rotate inner wheel left
    public void rotateLeftWheel(){
        imageInnerWheel = (ImageView)findViewById(R.id.imageInnerWheel);
        imageOuterWheel = (ImageView)findViewById(R.id.imageOuterWheel);
        buttonRotateLeft = (Button)findViewById(R.id.buttonRotateLeft);
        buttonRotateLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("DEBUG", "Rotate Left Clicked...!");
                rotationOffSet = rotationOffSet - 4;
                imageInnerWheel.setRotation(rotationOffSet);
            }
        });
    }
}
