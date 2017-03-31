package com.example.macbookpro.ob_wheels;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class TraditionalWheelActivity extends AppCompatActivity {

    ImageView imageInnerWheel;
    ImageView imageOuterWheel;
    Button buttonRotateRight;
    Button buttonRotateLeft;
    Button buttonZoomIn;
    Button buttonZoomOut;
    int rotationOffSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traditional_wheel);
        rotateRightWheel();
        rotateLeftWheel();
        zoomIn();
        zoomOut();
    }

    //logic to rotate inner wheel right
    public void rotateRightWheel() {
        imageInnerWheel = (ImageView) findViewById(R.id.imageInnerWheel);
        imageOuterWheel = (ImageView) findViewById(R.id.imageOuterWheel);
        buttonRotateRight = (Button) findViewById(R.id.buttonRotateRight);
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
    public void rotateLeftWheel() {
        imageInnerWheel = (ImageView) findViewById(R.id.imageInnerWheel);
        imageOuterWheel = (ImageView) findViewById(R.id.imageOuterWheel);
        buttonRotateLeft = (Button) findViewById(R.id.buttonRotateLeft);
        buttonRotateLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("DEBUG", "Rotate Left Clicked...!");
                rotationOffSet = rotationOffSet - 4;
                imageInnerWheel.setRotation(rotationOffSet);
            }
        });
    }

    public void zoomIn() {
        imageInnerWheel = (ImageView) findViewById(R.id.imageInnerWheel);
        imageOuterWheel = (ImageView) findViewById(R.id.imageOuterWheel);
        buttonZoomIn = (Button) findViewById(R.id.buttonZoomIn);
        buttonZoomIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imageOuterWheel.getLayoutParams().width < 1060) {
                    imageInnerWheel.getLayoutParams().width += 20;
                    imageInnerWheel.getLayoutParams().height += 20;
                    imageInnerWheel.requestLayout();
                    imageOuterWheel.getLayoutParams().width += 20;
                    imageOuterWheel.getLayoutParams().height += 20;
                    imageOuterWheel.requestLayout();
                    Toast.makeText(TraditionalWheelActivity.this, "Zoom In Clicked...! " + imageOuterWheel.getLayoutParams().width, Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void zoomOut() {
        imageInnerWheel = (ImageView) findViewById(R.id.imageInnerWheel);
        imageOuterWheel = (ImageView) findViewById(R.id.imageOuterWheel);
        buttonZoomOut = (Button) findViewById(R.id.buttonZoomOut);
        buttonZoomOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imageOuterWheel.getLayoutParams().width > 800) {
                    imageInnerWheel.getLayoutParams().width -= 20;
                    imageInnerWheel.getLayoutParams().height -= 20;
                    imageInnerWheel.requestLayout();
                    imageOuterWheel.getLayoutParams().width -= 20;
                    imageOuterWheel.getLayoutParams().height -= 20;
                    imageOuterWheel.requestLayout();
                    Toast.makeText(TraditionalWheelActivity.this, "Zoom Out Clicked...! " + imageOuterWheel.getLayoutParams().width, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
