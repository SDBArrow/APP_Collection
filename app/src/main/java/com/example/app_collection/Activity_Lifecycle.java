package com.example.app_collection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Activity_Lifecycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__lifecycle);
        showToast("lifecycle_onCreate");
    }
    @Override
    protected void onStop() {
        super.onStop();
        showToast("lifecycle_onStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        showToast("lifecycle_onDestroy");
    }
    @Override
    protected void onPause() {
        super.onPause();
        showToast("lifecycle_onPause");
    }
    @Override
    protected void onResume() {
        super.onResume();
        showToast("lifecycle_onResume");
    }
    @Override
    protected void onStart() {
        super.onStart();
        showToast("lifecycle_onStart");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        showToast("lifecycle_onRestart");
    }
    private void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
    public void go_lifecycle2(View v) {
        Intent intent = new Intent(this, Activity_Lifecycle2.class);
        startActivity(intent);
    }
}