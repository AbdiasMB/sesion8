package com.example.alumno.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.alumno.myapplication.activities.LoginActivity;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent x = new Intent (this, LoginActivity.class);
        startActivity(x);
        finish();
    }
}
