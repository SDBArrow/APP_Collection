package com.example.app_collection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void Activity_Lifecycle(View v) {
        Intent intent = new Intent(this, Activity_Lifecycle.class);
        startActivity(intent);
    }
    public void Image_change(View v) {
        Intent intent = new Intent(this, Image_change.class);
        startActivity(intent);
    }
    public void Image_array(View v) {
        Intent intent = new Intent(this, Image_array.class);
        startActivity(intent);
    }
    public void gopage1(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}