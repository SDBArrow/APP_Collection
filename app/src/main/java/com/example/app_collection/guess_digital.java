package com.example.app_collection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class guess_digital extends AppCompatActivity {
    static int Answer = 0;
    static int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess_digital);
        randommake();
    }
    public void click1(View v) {
        final TextView mchose = findViewById(R.id.TV_chose);
        mchose.setText("1");
    }
    public void click2(View v) {
        final TextView mchose = findViewById(R.id.TV_chose);
        mchose.setText("2");
    }
    public void click3(View v) {
        final TextView mchose = findViewById(R.id.TV_chose);
        mchose.setText("3");
    }
    public void click4(View v) {
        final TextView mchose = findViewById(R.id.TV_chose);
        mchose.setText("4");
    }
    public void click5(View v) {
        final TextView mchose = findViewById(R.id.TV_chose);
        mchose.setText("5");
    }
    public void click6(View v) {
        final TextView mchose = findViewById(R.id.TV_chose);
        mchose.setText("6");
    }
    public void click7(View v) {
        final TextView mchose = findViewById(R.id.TV_chose);
        mchose.setText("7");
    }
    public void click8(View v) {
        final TextView mchose = findViewById(R.id.TV_chose);
        mchose.setText("8");
    }
    public void click9(View v) {
        final TextView mchose = findViewById(R.id.TV_chose);
        mchose.setText("9");
    }
    public void check(View v) {
        final TextView mchose = findViewById(R.id.TV_chose);
        if (Integer.parseInt(mchose.getText().toString())!=0){
            count++;
            Intent intent = new Intent(this, guess_digital_show.class);
            Bundle bundle = new Bundle();
            if(Integer.parseInt(mchose.getText().toString())==Answer){
                bundle.putString("anstempor","0");
            }else if(Integer.parseInt(mchose.getText().toString())<Answer){
                bundle.putString("anstempor","1");
            }else if(Integer.parseInt(mchose.getText().toString())>Answer){
                bundle.putString("anstempor","2");
            }
            bundle.putString("ans", String.valueOf(Answer));
            bundle.putString("count",String.valueOf(count));
            intent.putExtras(bundle);
            startActivity(intent);
        }else{
            showToast("請選擇一個數字");
        }
    }
    public void restart(View v) {
        Answer = (int)(Math.random()*9)+1;
        count = 0;
        showToast("已重新計算");
    }
    private void randommake(){
        Bundle bundle = this.getIntent().getExtras();
        if(bundle != null) {
            String lastans = bundle.getString("lastans");
            Answer = Integer.parseInt(lastans);
            String lastcount = bundle.getString("lastcount");
            count = Integer.parseInt(lastcount);
        }else{
            Answer = (int)(Math.random()*9)+1;
            count = 1;
        }
    }
    private void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}