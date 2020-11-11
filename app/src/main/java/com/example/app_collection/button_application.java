package com.example.app_collection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class button_application extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_application);
        final Button loginout = (Button) findViewById(R.id.button_loginout);
        loginout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                loginout.setText("logout");
                Toast.makeText(getBaseContext(), "logout", Toast.LENGTH_SHORT).show();
            }
        });
    }
}