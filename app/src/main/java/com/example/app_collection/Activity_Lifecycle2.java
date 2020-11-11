package com.example.app_collection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Activity_Lifecycle2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__lifecycle2);
        showToast("lifecycle2_onCreate");
    }
    @Override
    protected void onStop() {
        super.onStop();
        showToast("lifecycle2_onStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        showToast("lifecycle2_onDestroy");
    }
    @Override
    protected void onPause() {
        super.onPause();
        showToast("lifecycle2_onPause");
    }
    @Override
    protected void onResume() {
        super.onResume();
        showToast("lifecycle2_onResume");
    }
    @Override
    protected void onStart() {
        super.onStart();
        showToast("lifecycle2_onStart");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        showToast("lifecycle2_onRestart");
    }
    public void go_lifecycle(View v) {
        Intent intent = new Intent(this, Activity_Lifecycle.class);
        startActivity(intent);
    }
    private void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}