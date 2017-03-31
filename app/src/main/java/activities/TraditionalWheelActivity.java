package activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.macbookpro.ob_wheels.R;

public class TraditionalWheelActivity extends AppCompatActivity {

    ImageView imageInnerWheel;
    ImageView imageOuterWheel;
    Button buttonRotateRight;
    Button buttonRotateLeft;
    int rotationOffSet = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traditional_wheel);
        initViews();
        rotateRightWheel();
        rotateLeftWheel();
        //final ZoomableFrameLayout zoomableFrameLayout = (ZoomableFrameLayout) findViewById(R.id.parent_frame);
        //zoomableFrameLayout.setWillNotDraw(false);
    }

    private void initViews() {
        imageInnerWheel = (ImageView) findViewById(R.id.imageInnerWheel);
        imageOuterWheel = (ImageView) findViewById(R.id.imageOuterWheel);
        buttonRotateLeft = (Button) findViewById(R.id.buttonRotateLeft);
        buttonRotateRight = (Button) findViewById(R.id.buttonRotateRight);
    }

    //logic to rotate inner wheel right
    public void rotateRightWheel() {
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
        buttonRotateLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("DEBUG", "Rotate Left Clicked...!");
                rotationOffSet = rotationOffSet - 4;
                imageInnerWheel.setRotation(rotationOffSet);
            }
        });
    }

    /*public void zoomIn() {
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
    }*/
}
