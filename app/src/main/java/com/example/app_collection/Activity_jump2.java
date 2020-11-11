package com.example.app_collection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity_jump2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jump2);
    }
    public void gojump(View v) {
        Intent intent = new Intent(this, Activity_jump.class);
        startActivity(intent);
    }
}