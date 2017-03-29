package com.example.macbookpro.ob_wheels;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import java.util.Calendar;

//import android.icu.util.Calendar;

public class CalenderActivity extends AppCompatActivity {

    static final int DIALOG_ID = 0;
    public Button editDate1;
    public Button editDate2;
    int year_x, month_x, day_x;

    /*
    public EditText editDate1;
    java.util.Calendar myCalendar = java.util.Calendar.getInstance();

    DatePickerDialog.OnDateSetListener date1 = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            myCalendar.set(year, month, dayOfMonth);
        }
    };

    public void init(){
        editDate1 = (EditText) findViewById(R.id.editText);

        editDate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editDate1.setText("Sagar", TextView.BufferType.EDITABLE);
                DatePickerDialog dialog = new DatePickerDialog(getApplicationContext(), date1, 2015, 12, 27);
                dialog.show();
            }
        });
    }

*/
    private DatePickerDialog datePickerDialog1;
    private DatePickerDialog datePickerDialog2;
    private DatePickerDialog.OnDateSetListener dPickerListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            if (view == datePickerDialog1.getDatePicker()) {
                Log.d("DEBUG", "1");
            } else if (view == datePickerDialog2.getDatePicker()) {
                Log.d("DEBUG", "2");
            }
            /*year_x = year;
            month_x = month + 1;
            day_x = dayOfMonth;
            Toast.makeText(CalenderActivity.this, year_x + "/" + month_x + "/" + day_x + " : " + view.getId() + " == " + R.id.editText + " | " + R.id.editText2, Toast.LENGTH_LONG).show();
            if (view.getId() == R.id.editText) {
                editDate1.setText(year_x + "/" + month_x + "/" + day_x, TextView.BufferType.EDITABLE);
            } else if (view.getId() == R.id.editText2) {
                editDate2.setText(year_x + "/" + month_x + "/" + day_x, TextView.BufferType.EDITABLE);
            }*/
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);
        //init();

        final Calendar calendar = Calendar.getInstance();
        year_x = calendar.get(calendar.YEAR);
        month_x = calendar.get(calendar.MONTH);
        day_x = calendar.get(calendar.DAY_OF_MONTH);
        showDialogOnEditText();
    }


    /*@Override
    protected Dialog onCreateDialog(int id){
        if (DIALOG_ID == id){
            return new DatePickerDialog(this, dPickerListener, year_x, month_x, day_x);
        }
        return null;
    }*/

    public void showDialogOnEditText() {
        editDate1 = (Button) findViewById(R.id.edit_text_date1);
        datePickerDialog1 = new DatePickerDialog(CalenderActivity.this, dPickerListener, year_x, month_x, day_x);
        datePickerDialog2 = new DatePickerDialog(CalenderActivity.this, dPickerListener, year_x, month_x, day_x);

        editDate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datePickerDialog1.show();
                /*new DatePickerDialog(CalenderActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        Toast.makeText(CalenderActivity.this,
                                year_x + "/" + month_x + "/" + day_x + " : " +
                                        view.getId() + " == " + R.id.editText + " | " + R.id.editText2, Toast.LENGTH_LONG)
                                .show();
                    }
                }, year_x, month_x, day_x).show();*/
            }
        });

        //for second datePicker
        editDate2 = (Button) findViewById(R.id.edit_text_date2);
        editDate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datePickerDialog2.show();
                /*new DatePickerDialog(CalenderActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        Toast.makeText(CalenderActivity.this,
                                year_x + "/" + month_x + "/" + day_x + " : " +
                                        view.getId() + " == " + R.id.editText + " | " + R.id.editText2, Toast.LENGTH_LONG)
                                .show();
                    }
                }, year_x, month_x, day_x).show();*/
            }
        });
    }

}
