package com.example.brainlevel;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenumatchingActivity extends AppCompatActivity {
    public AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menumatching);
    }
    public void onBackPressed() {
        super.onBackPressed();
        Intent menuform = new Intent(this, MenuActivity.class);
        startActivity(menuform);
        finish(); //ปิ ดหน้าปัจจุบัน
    }
    public void ani (View view){
        builder = new AlertDialog.Builder(this,R.style.DialogThemeQuiz);
        builder.setTitle("สัตว์");
        builder.setIcon(R.drawable.animal);
        builder.setMessage("มีเวลา 1 นาที จับคู่ภาพ ถ้าภาพตรงกัน ได้ 100 คะแนน");

        builder.setPositiveButton("start", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent refresh = new Intent(getApplicationContext(),MatchAniActivity.class);
                startActivity(refresh);
            }
        });
        builder.setNeutralButton("back", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent refresh = new Intent(getApplicationContext(),MenumatchingActivity.class);
                startActivity(refresh);
            }
        });
        builder.show();
    }
    public void fruit (View view){
        builder = new AlertDialog.Builder(this,R.style.DialogThemeQuiz);
        builder.setTitle("ผลไม้");
        builder.setIcon(R.drawable.fruit);
        builder.setMessage("มีเวลา 1 นาที จับคู่ภาพ ถ้าภาพตรงกัน ได้ 100 คะแนน");

        builder.setPositiveButton("start", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent refresh = new Intent(getApplicationContext(),MatchFruitActivity.class);
                startActivity(refresh);
            }
        });
        builder.setNeutralButton("back", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent refresh = new Intent(getApplicationContext(),MenumatchingActivity.class);
                startActivity(refresh);
            }
        });
        builder.show();
    }
    public void flower (View view){
        builder = new AlertDialog.Builder(this,R.style.DialogThemeQuiz);
        builder.setTitle("ดอกไม้");
        builder.setIcon(R.drawable.color);
        builder.setMessage("มีเวลา 1 นาที จับคู่ภาพ ถ้าภาพตรงกัน ได้ 100 คะแนน");

        builder.setPositiveButton("start", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent refresh = new Intent(getApplicationContext(),MatchFlowerActivity.class);
                startActivity(refresh);
            }
        });
        builder.setNeutralButton("back", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent refresh = new Intent(getApplicationContext(),MenumatchingActivity.class);
                startActivity(refresh);
            }
        });
        builder.show();
    }
}