package com.example.brainlevel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void quizopen(View view) {
        Intent quizmenu = new Intent(this, MenuquizActivity.class);
        startActivity(quizmenu);
        finish(); //ปิ ดหน้าปัจจุบัน
    }
    public void jisawopen(View view) {
        Intent jisawmenu = new Intent(this, MenuJigsawActivity.class);
        startActivity(jisawmenu);
        finish(); //ปิ ดหน้าปัจจุบัน
    }
    public void matchopen(View view) {
        Intent matchmenu = new Intent(this, MenumatchingActivity.class);
        startActivity(matchmenu);
        finish(); //ปิ ดหน้าปัจจุบัน
    }
    public void developeropen(View view) {
        Intent developer = new Intent(this, DeveloperActivity.class);
        startActivity(developer);
        finish(); //ปิ ดหน้าปัจจุบัน
    }
}