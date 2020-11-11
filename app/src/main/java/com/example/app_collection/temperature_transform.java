package com.example.app_collection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class temperature_transform extends AppCompatActivity {
    static boolean change = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature_transform);
        final EditText mbefor = findViewById(R.id.ET_befor);
        final TextView mb = findViewById(R.id.TV_befor);
        final TextView mafter = findViewById(R.id.TV_after);
        Button mcount = findViewById(R.id.btn_count);
        Button mchange = findViewById(R.id.btn_change);
        mcount.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(change){
                    double Fahrenheit = 0;
                    Fahrenheit = (Double.parseDouble(mbefor.getText().toString()))*9/5+32;
                    mafter.setText("Fahrenheit："+Fahrenheit);
                }else{
                    double Fahrenheit = 0;
                    Fahrenheit = ((Double.parseDouble(mbefor.getText().toString()))-32)*5/9;
                    mafter.setText("Celsius："+Fahrenheit);
                }
            }
        });
        mchange.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(change){
                    mb.setText("Fahrenheit：");
                    mafter.setText("Celsius：");
                    change = false;
                }else{
                    mb.setText("Celsius：");
                    mafter.setText("Fahrenheit：");
                    change = true;
                }
            }
        });
    }
}