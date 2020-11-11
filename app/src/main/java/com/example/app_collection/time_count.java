package com.example.app_collection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class time_count extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_count);
        final EditText myear = findViewById(R.id.ET_year);
        final EditText mmonth = findViewById(R.id.ET_month);
        final EditText mday = findViewById(R.id.ET_day);
        final EditText mhour = findViewById(R.id.ET_hour);
        final EditText mminute = findViewById(R.id.ET_minute);
        final EditText msecond = findViewById(R.id.ET_second);
        final TextView mdate = findViewById(R.id.TV_date);
        Button mcount = findViewById(R.id.btn_count);
        mcount.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String bmi = myear.getText().toString()+"/"+mmonth.getText().toString()+"/"+mday.getText().toString()+"  "+mhour.getText().toString()+":"+mminute.getText().toString()+":"+msecond.getText().toString();
                mdate.setText("BMI："+bmi);
            }
        });
    }
}