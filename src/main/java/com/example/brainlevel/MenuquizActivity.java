package com.example.brainlevel;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MenuquizActivity extends AppCompatActivity {
    public AlertDialog.Builder builder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuquiz);

    }
    public void onBackPressed() {
        super.onBackPressed();
        Intent menuform = new Intent(this, MenuActivity.class);
        startActivity(menuform);
        finish(); //ปิ ดหน้าปัจจุบัน
    }

    public void worldwide (View view){
        builder = new AlertDialog.Builder(this,R.style.DialogThemeQuiz);
        builder.setTitle("ความรู้รอบตัว");
        builder.setIcon(R.drawable.worldwide);
        builder.setMessage("ภายในระยะเวลา 30 วินาที ตอบคำถามให้ได้คะแนนมากที่สุด ตอบถูก 1 ข้อ ได้ 100 คะแนน");

        builder.setPositiveButton("start", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent refresh = new Intent(getApplicationContext(),QuizworldwideActivity.class);
                startActivity(refresh);
            }
        });
        builder.setNeutralButton("back", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent refresh = new Intent(getApplicationContext(),MenuquizActivity.class);
                startActivity(refresh);
            }
        });
        builder.show();
    }

    public void math (View view){
        builder = new AlertDialog.Builder(this,R.style.DialogThemeQuiz);
        builder.setTitle("คิดเลขเร็ว");
        builder.setIcon(R.drawable.maths);
        builder.setMessage("ภายในระยะเวลา 30 วินาที ตอบคำถามให้ได้คะแนนมากที่สุด ตอบถูก 1 ข้อ ได้ 100 คะแนน");

        builder.setPositiveButton("start", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent refresh = new Intent(getApplicationContext(),QuizmathActivity.class);
                startActivity(refresh);
            }
        });
        builder.setNeutralButton("back", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent refresh = new Intent(getApplicationContext(),MenuquizActivity.class);
                startActivity(refresh);
            }
        });
        builder.show();
    }

    public void vocab (View view){
        builder = new AlertDialog.Builder(this,R.style.DialogThemeQuiz);
        builder.setTitle("ทายคำศัพท์");
        builder.setIcon(R.drawable.abc);
        builder.setMessage("ภายในระยะเวลา 30 วินาที ตอบคำถามให้ได้คะแนนมากที่สุด ตอบถูก 1 ข้อ ได้ 100 คะแนน");

        builder.setPositiveButton("start", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent refresh = new Intent(getApplicationContext(),QuizvocabularyActivity.class);
                startActivity(refresh);
            }
        });
        builder.setNeutralButton("back", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent refresh = new Intent(getApplicationContext(),MenuquizActivity.class);
                startActivity(refresh);
            }
        });
        builder.show();
    }
}