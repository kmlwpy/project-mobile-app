package com.example.brainlevel;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Random;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class Jigsaw4Activity extends AppCompatActivity {
    public ImageView imgmatch1,imgmatch2,imgmatch3,imgmatch4;
    public TextView Target1,Target2,Target3,Target4,Question,ShowScore;
    public QuestionsJigsaw4 MatQ = new QuestionsJigsaw4();
    public Integer MatImageC1,MatImageC2,MatImageC3,MatImageC4; //เก็บตัวเลือกของแต่ละเโจทย์ค ำถำม
    public int MatAnswer1,MatAnswer2,MatAnswer3,MatAnswer4;
    public int MatQuestionsLength = MatQ.QuestionImagesMat.length;
    public Random r;
    public int score= 0;
    public AlertDialog.Builder builder; //เรียกใช้ AlertDailog
    public void next4(View view){
        Target1.setBackgroundResource(0);
        Target1.setBackgroundColor(Color.WHITE);
        Target2.setBackgroundResource(0);
        Target2.setBackgroundColor(Color.WHITE);
        Target3.setBackgroundResource(0);
        Target3.setBackgroundColor(Color.WHITE);
        Target4.setBackgroundResource(0);
        Target4.setBackgroundColor(Color.WHITE);
        updateQuestion4(r.nextInt(MatQuestionsLength));
    }//ปิด Method Next
    SeekBar countdown1;
    int counter=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jigsaw4);
        imgmatch1 = (ImageView)findViewById(R.id.imgmat1);
        imgmatch2 = (ImageView)findViewById(R.id.imgmat2);
        imgmatch3 = (ImageView)findViewById(R.id.imgmat3);
        imgmatch4 = (ImageView)findViewById(R.id.imgmat4);
        Target1 = (TextView)findViewById(R.id.TargetMat1);
        Target2 = (TextView)findViewById(R.id.TargetMat2);
        Target3 = (TextView)findViewById(R.id.TargetMat3);
        Target4 = (TextView)findViewById(R.id.TargetMat4);
        Question = (TextView)findViewById(R.id.txtMatQuestion);
        ShowScore  = (TextView)findViewById(R.id.txtScore);
        r = new Random();
        updateQuestion4(r.nextInt(MatQuestionsLength));

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



        View.OnTouchListener touchListener = new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                ClipData data = ClipData.newPlainText("","");
                View.DragShadowBuilder myShadowBuider = new
                        View.DragShadowBuilder(view);
                view.startDrag(data,myShadowBuider,view,0);
                return false;
            }
        };

        imgmatch1.setOnTouchListener(touchListener);
        imgmatch2.setOnTouchListener(touchListener);
        imgmatch3.setOnTouchListener(touchListener);
        imgmatch4.setOnTouchListener(touchListener);

        View.OnDragListener dragListener1 = new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {
                int dragEvent = event.getAction();
                switch (dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED :
                        final View view = (View)event.getLocalState();
                        if(view.getId() == MatAnswer1){
                            Target1.setText("");
                            score += 100;
                            ShowScore.setText(" " + score);
                            if(R.id.imgmat1 ==MatAnswer1){
                                Target1.setBackgroundResource(MatImageC1);
                                imgmatch1.setImageResource(0);}
                            else if (R.id.imgmat2 == MatAnswer1){
                                Target1.setBackgroundResource(MatImageC2);
                                imgmatch2.setImageResource(0);}
                            else if (R.id.imgmat3 == MatAnswer1){
                                Target1.setBackgroundResource(MatImageC3);
                                imgmatch3.setImageResource(0);}
                            else if (R.id.imgmat4 == MatAnswer1){
                                Target1.setBackgroundResource(MatImageC4);
                                imgmatch4.setImageResource(0);}

                        }else{
                            Target1.setText("");

                        }
                        break;
                    case DragEvent.ACTION_DRAG_EXITED:
                        break;
                    case DragEvent.ACTION_DROP:
                        break;
                }
                return true;
            }
        };//ตำแหน่งที่ 1

        View.OnDragListener dragListener2 = new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {
                int dragEvent = event.getAction();
                switch (dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED :
                        final View view = (View)event.getLocalState();
                        if(view.getId() == MatAnswer2){
                            Target2.setText("");
                            score += 100;
                            ShowScore.setText(" " + score);
                            if(R.id.imgmat1 ==MatAnswer2){
                                Target2.setBackgroundResource(MatImageC1);
                                imgmatch1.setImageResource(0);}
                            else if (R.id.imgmat2 == MatAnswer2){
                                Target2.setBackgroundResource(MatImageC2);
                                imgmatch2.setImageResource(0);}
                            else if (R.id.imgmat3 == MatAnswer2){
                                Target2.setBackgroundResource(MatImageC3);
                                imgmatch3.setImageResource(0);}
                            else if (R.id.imgmat4 == MatAnswer2){
                                Target2.setBackgroundResource(MatImageC4);
                                imgmatch4.setImageResource(0);}

                        }else{
                            Target2.setText("");

                        }
                        break;
                    case DragEvent.ACTION_DRAG_EXITED:
                        break;
                    case DragEvent.ACTION_DROP:
                        break;
                }
                return true;
            }
        };//ตำแหน่งที่ 2

        View.OnDragListener dragListener3 = new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {
                int dragEvent = event.getAction();
                switch (dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED :
                        final View view = (View)event.getLocalState();
                        if(view.getId() == MatAnswer3){
                            Target3.setText("");
                            score += 100;
                            ShowScore.setText(" " + score);
                            if(R.id.imgmat1 ==MatAnswer3){
                                Target3.setBackgroundResource(MatImageC1);
                                imgmatch1.setImageResource(0);}
                            else if (R.id.imgmat2 == MatAnswer3){
                                Target3.setBackgroundResource(MatImageC2);
                                imgmatch2.setImageResource(0);}
                            else if (R.id.imgmat3 == MatAnswer3){
                                Target3.setBackgroundResource(MatImageC3);
                                imgmatch3.setImageResource(0);}
                            else if (R.id.imgmat4 == MatAnswer3){
                                Target3.setBackgroundResource(MatImageC4);
                                imgmatch4.setImageResource(0);}

                        }else{
                            Target3.setText("");

                        }
                        break;
                    case DragEvent.ACTION_DRAG_EXITED:
                        break;
                    case DragEvent.ACTION_DROP:
                        break;
                }
                return true;
            }
        };//ตำแหน่งที่ 3

        View.OnDragListener dragListener4 = new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {
                int dragEvent = event.getAction();
                switch (dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED :
                        final View view = (View)event.getLocalState();
                        if(view.getId() == MatAnswer4){
                            Target4.setText("");
                            score += 100;
                            ShowScore.setText(" " + score);
                            if(R.id.imgmat1 ==MatAnswer4){
                                Target2.setBackgroundResource(MatImageC1);
                                imgmatch1.setImageResource(0);}
                            else if (R.id.imgmat2 == MatAnswer4){
                                Target4.setBackgroundResource(MatImageC2);
                                imgmatch2.setImageResource(0);}
                            else if (R.id.imgmat3 == MatAnswer4){
                                Target4.setBackgroundResource(MatImageC3);
                                imgmatch3.setImageResource(0);}
                            else if (R.id.imgmat4 == MatAnswer4){
                                Target4.setBackgroundResource(MatImageC4);
                                imgmatch4.setImageResource(0);}

                        }else{
                            Target4.setText("");

                        }
                        break;
                    case DragEvent.ACTION_DRAG_EXITED:
                        break;
                    case DragEvent.ACTION_DROP:
                        break;
                }
                return true;
            }
        };//ตำแหน่งที่ 4



        Target1.setOnDragListener(dragListener1);
        Target2.setOnDragListener(dragListener2);
        Target3.setOnDragListener(dragListener3);
        Target4.setOnDragListener(dragListener4);

    }
    public void updateQuestion4(int num){
        Question.setText(MatQ.getQuestion(num));
        imgmatch1.setImageResource(MatQ.getChoice1(num));
        imgmatch2.setImageResource(MatQ.getChoice2(num));
        imgmatch3.setImageResource(MatQ.getChoice3(num));
        imgmatch4.setImageResource(MatQ.getChoice4(num));
        Target1.setText(MatQ.getQuestionText1(num));
        Target2.setText(MatQ.getQuestionText2(num));
        Target3.setText(MatQ.getQuestionText3(num));
        Target4.setText(MatQ.getQuestionText4(num));
        MatAnswer1 = MatQ.getCorrectAnswer1(num);
        MatAnswer2 = MatQ.getCorrectAnswer2(num);
        MatAnswer3 = MatQ.getCorrectAnswer3(num);
        MatAnswer4 = MatQ.getCorrectAnswer4(num);
        MatImageC1 = MatQ.getChoice1(num);
        MatImageC2 = MatQ.getChoice2(num);
        MatImageC3 = MatQ.getChoice3(num);
        MatImageC4 = MatQ.getChoice4(num);


    }
    public void onBackPressed() {
        super.onBackPressed();
        Intent menuform = new Intent(this, MenuActivity.class);
        startActivity(menuform);
        finish(); //ปิ ดหน้าปัจจุบัน
    }
    public void gameOver (){
        builder = new AlertDialog.Builder(this);
        builder.setTitle("Time's up");
        builder.setIcon(R.drawable.reward);
        builder.setMessage("\n Scores : " + score+" Point");

        builder.setPositiveButton("Try again", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent refresh = new Intent(getApplicationContext(),Jigsaw4Activity.class);
                startActivity(refresh);
            }
        });
        builder.setNegativeButton("Back to menu", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent refresh = new Intent(getApplicationContext(),MenuJigsawActivity.class);
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


}