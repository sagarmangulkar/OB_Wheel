package com.example.macbookpro.ob_wheels;

import android.app.DatePickerDialog;
//import android.icu.util.Calendar;
import android.app.Dialog;
import android.app.DialogFragment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.app.DatePickerDialog;
import android.widget.DatePicker;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalenderActivity extends AppCompatActivity {

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
    public EditText editDate1;
    int year_x, month_x, day_x;
    static final int DIALOG_ID = 0;

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

    public void showDialogOnEditText(){
        editDate1 = (EditText) findViewById(R.id.editText);
        editDate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(DIALOG_ID);
            }
        });
    }


    @Override
    protected Dialog onCreateDialog(int id){
        if (DIALOG_ID == id){
            return new DatePickerDialog(this, dPickerListener, year_x, month_x, day_x);
        }
        return null;
    }

    private DatePickerDialog.OnDateSetListener dPickerListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            year_x = year;
            month_x = month + 1;
            day_x = dayOfMonth;
            Toast.makeText(CalenderActivity.this, year_x + "/" + month_x + "/" + day_x, Toast.LENGTH_LONG).show();
            editDate1.setText(year_x + "/" + month_x + "/" + day_x, TextView.BufferType.EDITABLE);
        }
    };

}
