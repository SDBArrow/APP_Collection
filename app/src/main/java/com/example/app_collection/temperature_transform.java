package com.example.app_collection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class temperature_transform extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature_transform);
        final EditText mCelsius = findViewById(R.id.ET_Celsius);
        final TextView mFahrenheit = findViewById(R.id.TV_Fahrenheit);
        Button mcount = findViewById(R.id.btn_count);
        mcount.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double Fahrenheit = 0;
                Fahrenheit = (Double.parseDouble(mCelsius.getText().toString()))*(9/5)+32;
                mFahrenheit.setText("Fahrenheit："+Fahrenheit);
            }
        });
    }
}