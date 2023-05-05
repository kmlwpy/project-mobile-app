package com.example.brainlevel;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Locale;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class QuizworldwideActivity extends AppCompatActivity {
    public Button ans1,ans2,ans3,ans4;
    public TextView score,question;
    public Questionsworldwide mQuestions = new Questionsworldwide();
    public String mAnswer; //เก็บคำตอบที่ถูก
    public Random r;
    public int mQuestionsLength = mQuestions.mQuestion.length;
    public int mScore = 0; //เก็บคะแนน
    public int count = 1; //จำนวนข้อที่ทำ
    public AlertDialog.Builder builder; //เรียกใช้ AlertDailog
    SeekBar countdown1;
    int counter=0;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizworldwide);
        ans1 = (Button)findViewById(R.id.ans1);
        ans2 = (Button)findViewById(R.id.ans2);
        ans3 = (Button)findViewById(R.id.ans3);
        ans4 = (Button)findViewById(R.id.ans4);
        score = (TextView)findViewById(R.id.score);
        question = (TextView)findViewById(R.id.question);
        countdown1 = (SeekBar)findViewById(R.id.countdown1);



        long duration = TimeUnit.SECONDS.toMillis(30);
        final Timer t = new Timer();
        new CountDownTimer(duration, 300) {
            @Override
            public void onTick(long l) {
                counter++;
                countdown1.setProgress(counter);

                if(counter == 10)
                    t.cancel();
            }

            @Override
            public void onFinish() {
                gameOver();
            }
        }.start();


        r = new Random();
        updateQuestion(r.nextInt(mQuestionsLength));
    }

        public void updateQuestion(int num){
            question.setText(mQuestions.getQuestion(num));
            ans1.setText(mQuestions.getChoice1(num));
            ans2.setText(mQuestions.getChoice2(num));
            ans3.setText(mQuestions.getChoice3(num));
            ans4.setText(mQuestions.getChoice4(num));
            mAnswer = mQuestions.getCorrectAnswer(num);
        }//ปิดmethod update Question
   // Method ถ้าเลือกตัวเลือกที่ 1
    public void ans1 (View view){
        if(count <100) {
            if (ans1.getText().toString() == mAnswer) {
                mScore+=100;
                score.setText(mScore+"" );
                updateQuestion(r.nextInt(mQuestionsLength));
            } else {
                updateQuestion(r.nextInt(mQuestionsLength));
            }
        }//เช็คว่าทำครบ 3 ข้อยัง
        else{
            if (ans1.getText().toString() == mAnswer) {
                mScore+=100;
                score.setText(mScore+"");
                gameOver();
            }else{
                gameOver();
            }
        }
        count++;
    } //ปิด Method เลือก choice แรก


    //Method ถ้าเลือกตัวเลือกที่ 2
    public void ans2 (View view){
        if(count <100) {
            if (ans2.getText().toString() == mAnswer) {
                mScore+=100;
                score.setText(mScore+"" );
                updateQuestion(r.nextInt(mQuestionsLength));
            } else {
                updateQuestion(r.nextInt(mQuestionsLength));
            }
        }//เช็คว่าทำครบ 3 ข้อยัง
        else{
            if (ans2.getText().toString() == mAnswer) {
                mScore+=100;
                score.setText(mScore+"");
                gameOver();
            }else{
                gameOver();
            }
        }
        count++;
    } //ปิด Method เลือก choice สอง




    //Method ถ้าเลือกตัวเลือกที่ 3
    public void ans3 (View view){
        if(count <100) {
            if (ans3.getText().toString() == mAnswer) {
                mScore+=100;
                score.setText(mScore+"" );
                updateQuestion(r.nextInt(mQuestionsLength));
            } else {
                updateQuestion(r.nextInt(mQuestionsLength));
            }
        }//เช็คว่าทำครบ 3 ข้อยัง
        else{
            if (ans3.getText().toString() == mAnswer) {
                mScore+=100;
                score.setText(mScore+"");
                gameOver();
            }else{
                gameOver();
            }
        }
        count++;
    }//ปิด Method เลือก choice สาม

    //Method ถ้าเลือกตัวเลือกที่ 4
    public void ans4 (View view){
        if(count <100) {
            if (ans4.getText().toString() == mAnswer) {
                mScore+=100;
                score.setText(mScore+"" );
                updateQuestion(r.nextInt(mQuestionsLength));
            } else {
                updateQuestion(r.nextInt(mQuestionsLength));
            }
        }//เช็คว่าทำครบ 3 ข้อยัง
        else{
            if (ans4.getText().toString() == mAnswer) {
                mScore+=100;
                score.setText(mScore+"");
                gameOver();
            }else{
                gameOver();
            }
        }
        count++;
    }//ปิด Method เลือก choice สี่
    public void gameOver (){
        builder = new AlertDialog.Builder(this);
        builder.setTitle("Time's up");
        builder.setIcon(R.drawable.reward);
        builder.setMessage("Your done : " + count + " questions "+ "\n Scores : " + mScore+" Point");

        builder.setPositiveButton("Try again", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent refresh = new Intent(getApplicationContext(),QuizworldwideActivity.class);
                startActivity(refresh);
            }
        });
        builder.setNegativeButton("Back to menu", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent refresh = new Intent(getApplicationContext(),MenuquizActivity.class);
                startActivity(refresh);
            }
        });
        builder.setNeutralButton("Exit", new DialogInterface.OnClickListener() {
            @Override    public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        builder.show();
    }//ปิด method gameOver

    public void onBackPressed() {
        super.onBackPressed();
        Intent menuform = new Intent(this, MenuquizActivity.class);
        startActivity(menuform);
        finish(); //ปิ ดหน้าปัจจุบัน
    }



}