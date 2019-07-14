package com.alc.androidchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button aboutALCButton = findViewById(R.id.btn_about_alc);
        Button myProfileButton =  findViewById(R.id.btn_my_profile);

        aboutALCButton.setOnClickListener(view -> {
            Intent openAboutALCIntent = new Intent(MainActivity.this, AboutALCActivity.class);
            startActivity(openAboutALCIntent);
        });

        myProfileButton.setOnClickListener(view -> {
            Intent openMyProfileIntent = new Intent(MainActivity.this, ProfileActivity.class);
            startActivity(openMyProfileIntent);
        });
    }
}
