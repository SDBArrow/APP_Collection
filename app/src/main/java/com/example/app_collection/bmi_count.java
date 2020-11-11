package com.example.app_collection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class bmi_count extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_count);
        final EditText mHeight = findViewById(R.id.ET_Height);
        final EditText mWeight = findViewById(R.id.ET_Weight);
        final TextView mBMI = findViewById(R.id.TV_BMI);
        Button mcount = findViewById(R.id.btn_count);
        mcount.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double bmi = 0;
                bmi = (Double.parseDouble(mWeight.getText().toString()))/Math.pow(Double.parseDouble(mHeight.getText().toString()),2);
                mBMI.setText("BMI："+bmi);
            }
        });
    }
}