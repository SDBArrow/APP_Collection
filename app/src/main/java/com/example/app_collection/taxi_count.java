package com.example.app_collection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class taxi_count extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taxi_count);
        final EditText mrate = findViewById(R.id.ET_rate);
        final EditText mdistance = findViewById(R.id.ET_distance);
        final TextView mPrice = findViewById(R.id.TV_price);
        Button mcount = findViewById(R.id.btn_count);
        mcount.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double price = 0;
                price = Double.parseDouble(mrate.getText().toString())+(Math.ceil((Double.parseDouble(mdistance.getText().toString()))/250))*5;
                mPrice.setText("價格："+price);
            }
        });
    }
}