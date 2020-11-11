 package com.example.app_collection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
     public void button_application(View v) {
         Intent intent = new Intent(this, button_application.class);
         startActivity(intent);
     }
     public void bmi_count(View v) {
         Intent intent = new Intent(this, bmi_count.class);
         startActivity(intent);
     }
     public void temperature_transform(View v) {
         Intent intent = new Intent(this, temperature_transform.class);
         startActivity(intent);
     }
     public void taxi_count(View v) {
         Intent intent = new Intent(this, taxi_count.class);
         startActivity(intent);
     }
     public void time_count(View v) {
         Intent intent = new Intent(this, time_count.class);
         startActivity(intent);
     }
     public void Activity_jump(View v) {
         Intent intent = new Intent(this, Activity_jump.class);
         startActivity(intent);
     }
     public void Activity_post(View v) {
         Intent intent = new Intent(this, Activity_post.class);
         startActivity(intent);
     }
     public void Activity_detect(View v) {
         Intent intent = new Intent(this, bmi_detect.class);
         startActivity(intent);
     }
     public void guess_digital(View v) {
         Intent intent = new Intent(this, guess_digital.class);
         startActivity(intent);
     }
     public void TRL_Redeem(View v) {
         Intent intent = new Intent(this, TRL_Redeem.class);
         startActivity(intent);
     }
     public void gopage2(View v) {
         Intent intent = new Intent(this, MainActivity2.class);
         startActivity(intent);
     }
}