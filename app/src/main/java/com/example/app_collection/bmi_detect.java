package com.example.app_collection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class bmi_detect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_detect);
        TV_show();
    }
    public void count(View v) {
        final EditText mHeight = findViewById(R.id.ET_Height);
        final EditText mWeight = findViewById(R.id.ET_Weight);
        double bmi = 0;
        bmi = (Math.round((Double.parseDouble(mWeight.getText().toString()))/Math.pow(Double.parseDouble(mHeight.getText().toString()),2)*100));
        bmi = bmi/100;
        Intent intent = new Intent(this, bmi_show.class);
        Bundle bundle = new Bundle();
        bundle.putString("key", String.valueOf(bmi));
        intent.putExtras(bundle);
        startActivity(intent);
    }
    private void TV_show(){
        final TextView mvalue = findViewById(R.id.TV_value);
        Bundle bundle = this.getIntent().getExtras();
        if(bundle != null) {
            String key = bundle.getString("key2");
            mvalue.setText(key);
        }
    }
}