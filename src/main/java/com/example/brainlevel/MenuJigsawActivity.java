package com.example.brainlevel;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuJigsawActivity extends AppCompatActivity {
    public AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_jigsaw);
    }

    public void onBackPressed() {
        super.onBackPressed();
        Intent menuform = new Intent(this, MenuActivity.class);
        startActivity(menuform);
        finish(); //ปิ ดหน้าปัจจุบัน
    }

    public void jigsaw4(View view) {
        builder = new AlertDialog.Builder(this, R.style.DialogThemeQuiz);
        builder.setTitle("2x2");
        builder.setIcon(R.drawable.four);
        builder.setMessage("ต่อภาพภายในระยะเวลา 30 วินาที วางรูปตรงตำแหน่ง 1 ตำแหน่ง ได้ 100 คะแนน");

        builder.setPositiveButton("start", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent refresh = new Intent(getApplicationContext(), Jigsaw4Activity.class);
                startActivity(refresh);
            }
        });
        builder.setNeutralButton("back", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent refresh = new Intent(getApplicationContext(), MenuJigsawActivity.class);
                startActivity(refresh);
            }
        });
        builder.show();
    }

    public void jigsaw9(View view) {
        builder = new AlertDialog.Builder(this, R.style.DialogThemeQuiz);
        builder.setTitle("3x3");
        builder.setIcon(R.drawable.nine);
        builder.setMessage("ต่อภาพภายในระยะเวลา 1 นาที วางรูปตรงตำแหน่ง 1 ตำแหน่ง ได้ 100 คะแนน");

        builder.setPositiveButton("start", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent refresh = new Intent(getApplicationContext(), Jigsaw9Activity.class);
                startActivity(refresh);
            }
        });
        builder.setNeutralButton("back", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent refresh = new Intent(getApplicationContext(), MenuJigsawActivity.class);
                startActivity(refresh);
            }
        });
        builder.show();
    }
}
