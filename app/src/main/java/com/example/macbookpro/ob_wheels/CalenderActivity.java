package com.example.macbookpro.ob_wheels;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

//import android.icu.util.Calendar;

public class CalenderActivity extends AppCompatActivity implements View.OnClickListener {

    public Button editDate1;
    public Button editDate2;
    public Button editDate3;
    public Button editDate4;
    public Button editDate5;
    public Button editDate6;
    public EditText editWeel1;
    public EditText editWeel2;
    public EditText editWeel3;
    public EditText editDays1;
    public EditText editDays2;
    public EditText editDays3;
    int year_x, month_x, day_x;

    private DatePickerDialog datePickerDialog1;
    private DatePickerDialog datePickerDialog2;
    private DatePickerDialog datePickerDialog3;
    private DatePickerDialog datePickerDialog4;
    private DatePickerDialog datePickerDialog5;
    private DatePickerDialog datePickerDialog6;
    private DatePickerDialog.OnDateSetListener dPickerListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            year_x = year;
            month_x = month + 1;    //added 1 because month starts from 0 not from 1
            day_x = dayOfMonth;
            if (view == datePickerDialog1.getDatePicker()) {
               // Log.d("DEBUG", "1. first date picker");
                editDate1.setText(month_x + "-" + day_x + "-" + year_x, TextView.BufferType.EDITABLE);
                Toast.makeText(CalenderActivity.this, month_x + "-" + day_x + "-" + year_x, Toast.LENGTH_LONG).show();


                //setting date to EDD
                String dateTemp = month_x + "-" + day_x + "-" + year_x;
                SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
                Calendar cTemp = Calendar.getInstance();
                Calendar cTemp1 = Calendar.getInstance();
                try{
                    cTemp.setTime(sdf.parse(dateTemp));
                    cTemp1.setTime(sdf.parse(dateTemp));
                }
                catch (ParseException e){
                    e.printStackTrace();
                }
                cTemp.add(Calendar.DATE, 280);
                String outputDate = sdf.format(cTemp.getTime());
                editDate3.setText(outputDate, TextView.BufferType.EDITABLE);

                //seeting weeks and days to EGA
                long msDiff = Calendar.getInstance().getTimeInMillis() - cTemp1.getTimeInMillis();
                long daysDiff = TimeUnit.MILLISECONDS.toDays(msDiff);
                editWeel2.setText(String.valueOf(daysDiff/7), TextView.BufferType.EDITABLE);
                editDays2.setText(String.valueOf(daysDiff%7 - 1), TextView.BufferType.EDITABLE);

            }
            else if (view == datePickerDialog2.getDatePicker()) {
                //Log.d("DEBUG", "2. second date picker");
                editDate2.setText(month_x + "-" + day_x + "-" + year_x, TextView.BufferType.EDITABLE);
                Toast.makeText(CalenderActivity.this, month_x + "-" + day_x + "-" + year_x, Toast.LENGTH_LONG).show();

                //setting date to EDD
                String dateTemp = month_x + "-" + day_x + "-" + year_x;
                SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
                Calendar cTemp = Calendar.getInstance();
                Calendar cTemp1 = Calendar.getInstance();
                try{
                    cTemp.setTime(sdf.parse(dateTemp));
                    cTemp1.setTime(sdf.parse(dateTemp));
                }
                catch (ParseException e){
                    e.printStackTrace();
                }
                cTemp.add(Calendar.DATE, 280);
                String outputDate = sdf.format(cTemp.getTime());
                editDate4.setText(outputDate, TextView.BufferType.EDITABLE);

                //seeting weeks and days to EGA
                long msDiff = Calendar.getInstance().getTimeInMillis() - cTemp1.getTimeInMillis();
                long daysDiff = TimeUnit.MILLISECONDS.toDays(msDiff);
                editWeel3.setText(String.valueOf(daysDiff/7), TextView.BufferType.EDITABLE);
                editDays3.setText(String.valueOf(daysDiff%7 - 1), TextView.BufferType.EDITABLE);
            }
            else if (view == datePickerDialog3.getDatePicker()) {
                // Log.d("DEBUG", "1. first date picker");
                editDate3.setText(month_x + "-" + day_x + "-" + year_x, TextView.BufferType.EDITABLE);
                Toast.makeText(CalenderActivity.this, month_x + "-" + day_x + "-" + year_x, Toast.LENGTH_LONG).show();
            }
            else if (view == datePickerDialog4.getDatePicker()) {
                //Log.d("DEBUG", "2. second date picker");
                editDate4.setText(month_x + "-" + day_x + "-" + year_x, TextView.BufferType.EDITABLE);
                Toast.makeText(CalenderActivity.this, month_x + "-" + day_x + "-" + year_x, Toast.LENGTH_LONG).show();
            }
            else if (view == datePickerDialog5.getDatePicker()) {
                // Log.d("DEBUG", "1. first date picker");
                editDate5.setText(month_x + "-" + day_x + "-" + year_x, TextView.BufferType.EDITABLE);
                Toast.makeText(CalenderActivity.this, month_x + "-" + day_x + "-" + year_x, Toast.LENGTH_LONG).show();
            }
            else if (view == datePickerDialog6.getDatePicker()) {
                //Log.d("DEBUG", "2. second date picker");
                editDate6.setText(month_x + "-" + day_x + "-" + year_x, TextView.BufferType.EDITABLE);
                Toast.makeText(CalenderActivity.this, month_x + "-" + day_x + "-" + year_x, Toast.LENGTH_LONG).show();
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);

        init();

        //assigning current date to variables
        final Calendar calendar = Calendar.getInstance();
        year_x = calendar.get(calendar.YEAR);
        month_x = calendar.get(calendar.MONTH);
        day_x = calendar.get(calendar.DAY_OF_MONTH);
        showDialogOnEditText();
    }

    public void init(){
        findViewById(R.id.buttonSettingEDDInCalender).setOnClickListener(this);    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.buttonSettingEDDInCalender:
                startActivity(new Intent(this, SettingEDDActivity.class));
                break;
        }
    }

    public void showDialogOnEditText() {
        datePickerDialog1 = new DatePickerDialog(CalenderActivity.this, dPickerListener, year_x, month_x, day_x);
        datePickerDialog2 = new DatePickerDialog(CalenderActivity.this, dPickerListener, year_x, month_x, day_x);
        datePickerDialog3 = new DatePickerDialog(CalenderActivity.this, dPickerListener, year_x, month_x, day_x);
        datePickerDialog4 = new DatePickerDialog(CalenderActivity.this, dPickerListener, year_x, month_x, day_x);
        datePickerDialog5 = new DatePickerDialog(CalenderActivity.this, dPickerListener, year_x, month_x, day_x);
        datePickerDialog6 = new DatePickerDialog(CalenderActivity.this, dPickerListener, year_x, month_x, day_x);

        //for first datePicker
        editDate1 = (Button) findViewById(R.id.edit_text_date1);
        editDate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datePickerDialog1.show();
            }
        });

        //for second datePicker
        editDate2 = (Button) findViewById(R.id.edit_text_date2);
        editDate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datePickerDialog2.show();
            }
        });

        //for third datePicker
        editDate3 = (Button) findViewById(R.id.edit_text_date3);
        editDate3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datePickerDialog3.show();
            }
        });

        //for forth datePicker
        editDate4 = (Button) findViewById(R.id.edit_text_date4);
        editDate4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datePickerDialog4.show();
            }
        });

        //for fifth datePicker
        editDate5 = (Button) findViewById(R.id.edit_text_date5);
        editDate5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datePickerDialog5.show();
            }
        });

        //for sixth datePicker
        editDate6 = (Button) findViewById(R.id.edit_text_date6);
        editDate6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datePickerDialog6.show();
            }
        });

        //for first week edit text
        editWeel1 = (EditText)findViewById(R.id.edit_text_week1);
        editWeel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editWeel1.setText("touched...!", TextView.BufferType.EDITABLE);
            }
        });

        //for first week edit text
        editWeel2 = (EditText)findViewById(R.id.edit_text_week2);
        editWeel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editWeel2.setText("touched...!", TextView.BufferType.EDITABLE);
            }
        });

        //for first week edit text
        editWeel3 = (EditText)findViewById(R.id.edit_text_week3);
        editWeel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editWeel3.setText("touched...!", TextView.BufferType.EDITABLE);
            }
        });


        //for first week edit text
        editDays1 = (EditText)findViewById(R.id.edit_text_day1);
        editDays1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editDays1.setText("touched...!", TextView.BufferType.EDITABLE);
            }
        });

        //for first week edit text
        editDays2 = (EditText)findViewById(R.id.edit_text_day2);
        editDays2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editDays2.setText("touched...!", TextView.BufferType.EDITABLE);
            }
        });

        //for first week edit text
        editDays3 = (EditText)findViewById(R.id.edit_text_day3);
        editDays3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editDays3.setText("touched...!", TextView.BufferType.EDITABLE);
            }
        });
    }

}
