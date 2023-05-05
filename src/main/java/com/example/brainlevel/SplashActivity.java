package com.example.brainlevel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class SplashActivity extends AppCompatActivity {
    public static int SPLASH_TIME_OUT = 4000 ; // =Delay 4 วินาที


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            public void run(){
                Intent HomeIntent = new
                        Intent(getApplicationContext(),MenuActivity.class);
                Toast.makeText(getApplicationContext(),"Welcome",Toast.LENGTH_SHORT)
                        .show();
                startActivity(HomeIntent);
                finish();
            }
        },SPLASH_TIME_OUT);

    }
}