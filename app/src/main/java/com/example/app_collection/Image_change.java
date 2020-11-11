package com.example.app_collection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Image_change extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_change);
    }
    public void chenge (View v){
        ImageView mface = (ImageView) findViewById(R.id.IV_face);
        mface.setImageDrawable(getResources().getDrawable(R.drawable.linchiling));
    }
}