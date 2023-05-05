package com.example.brainlevel;

import androidx.annotation.ColorInt;
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

public class Jigsaw9Activity extends AppCompatActivity {
    public ImageView imgmatch91,imgmatch92,imgmatch93,imgmatch94,imgmatch95,imgmatch96,imgmatch97,imgmatch98,imgmatch99;
    public TextView Target1,Target2,Target3,Target4,Target5,Target6,Target7,Target8,Target9,Question,ShowScore;
    public QuestionsJigsaw9 MatQ = new QuestionsJigsaw9();
    public Integer MatImageC1,MatImageC2,MatImageC3,MatImageC4,MatImageC5,MatImageC6,MatImageC7,MatImageC8,MatImageC9; //เก็บตัวเลือกของแต่ละเโจทย์ค ำถำม
    public int MatAnswer1,MatAnswer2,MatAnswer3,MatAnswer4,MatAnswer5,MatAnswer6,MatAnswer7,MatAnswer8,MatAnswer9;
    public int MatQuestionsLength = MatQ.QuestionImagesMat.length;
    public Random r;
    public int MatchScore= 0;
    public AlertDialog.Builder builder; //เรียกใช้ AlertDailog
    SeekBar countdown1;
    int counter=0;
    public void next9(View view){
        Target1.setBackgroundResource(0);
        Target1.setBackgroundColor(Color.WHITE);
        Target2.setBackgroundResource(0);
        Target2.setBackgroundColor(Color.WHITE);
        Target3.setBackgroundResource(0);
        Target3.setBackgroundColor(Color.WHITE);
        Target4.setBackgroundResource(0);
        Target4.setBackgroundColor(Color.WHITE);
        Target5.setBackgroundResource(0);
        Target5.setBackgroundColor(Color.WHITE);
        Target6.setBackgroundResource(0);
        Target6.setBackgroundColor(Color.WHITE);
        Target7.setBackgroundResource(0);
        Target7.setBackgroundColor(Color.WHITE);
        Target8.setBackgroundResource(0);
        Target8.setBackgroundColor(Color.WHITE);
        Target9.setBackgroundResource(0);
        Target9.setBackgroundColor(Color.WHITE);

        updateQuestion9(r.nextInt(MatQuestionsLength));
    }//ปิด Method Next

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jigsaw9);
        imgmatch91 = (ImageView) findViewById(R.id.imgmat91);
        imgmatch92 = (ImageView) findViewById(R.id.imgmat92);
        imgmatch93 = (ImageView) findViewById(R.id.imgmat93);
        imgmatch94 = (ImageView) findViewById(R.id.imgmat94);
        imgmatch95 = (ImageView) findViewById(R.id.imgmat95);
        imgmatch96 = (ImageView) findViewById(R.id.imgmat96);
        imgmatch97 = (ImageView) findViewById(R.id.imgmat97);
        imgmatch98 = (ImageView) findViewById(R.id.imgmat98);
        imgmatch99 = (ImageView) findViewById(R.id.imgmat99);
        Target1 = (TextView) findViewById(R.id.TargetMat91);
        Target2 = (TextView) findViewById(R.id.TargetMat92);
        Target3 = (TextView) findViewById(R.id.TargetMat93);
        Target4 = (TextView) findViewById(R.id.TargetMat94);
        Target5 = (TextView) findViewById(R.id.TargetMat95);
        Target6 = (TextView) findViewById(R.id.TargetMat96);
        Target7 = (TextView) findViewById(R.id.TargetMat97);
        Target8 = (TextView) findViewById(R.id.TargetMat98);
        Target9 = (TextView) findViewById(R.id.TargetMat99);
        Question = (TextView) findViewById(R.id.txtMatQuestion);
        ShowScore = (TextView) findViewById(R.id.txtScore);
        r = new Random();
        updateQuestion9(r.nextInt(MatQuestionsLength));

        countdown1 = (SeekBar)findViewById(R.id.countdown1);
        long duration = TimeUnit.SECONDS.toMillis(60);
        final Timer t = new Timer();
        new CountDownTimer(duration, 600) {
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
                ClipData data = ClipData.newPlainText("", "");
                View.DragShadowBuilder myShadowBuider = new
                        View.DragShadowBuilder(view);
                view.startDrag(data, myShadowBuider, view, 0);
                return false;
            }
        };

        imgmatch91.setOnTouchListener(touchListener);
        imgmatch92.setOnTouchListener(touchListener);
        imgmatch93.setOnTouchListener(touchListener);
        imgmatch94.setOnTouchListener(touchListener);
        imgmatch95.setOnTouchListener(touchListener);
        imgmatch96.setOnTouchListener(touchListener);
        imgmatch97.setOnTouchListener(touchListener);
        imgmatch98.setOnTouchListener(touchListener);
        imgmatch99.setOnTouchListener(touchListener);

        View.OnDragListener dragListener1 = new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {
                int dragEvent = event.getAction();
                switch (dragEvent) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        final View view = (View) event.getLocalState();
                        if (view.getId() == MatAnswer1) {
                            Target1.setText("");
                            MatchScore += 100;
                            ShowScore.setText("  " + MatchScore);
                            if (R.id.imgmat91 == MatAnswer1) {
                                Target1.setBackgroundResource(MatImageC1);
                                imgmatch91.setImageResource(0);
                            } else if (R.id.imgmat92 == MatAnswer1) {
                                Target1.setBackgroundResource(MatImageC2);
                                imgmatch92.setImageResource(0);
                            } else if (R.id.imgmat93 == MatAnswer1) {
                                Target1.setBackgroundResource(MatImageC3);
                                imgmatch93.setImageResource(0);
                            } else if (R.id.imgmat94 == MatAnswer1) {
                                Target1.setBackgroundResource(MatImageC4);
                                imgmatch94.setImageResource(0);
                            } else if (R.id.imgmat95 == MatAnswer1) {
                                Target1.setBackgroundResource(MatImageC5);
                                imgmatch95.setImageResource(0);
                            } else if (R.id.imgmat96 == MatAnswer1) {
                                Target1.setBackgroundResource(MatImageC6);
                                imgmatch96.setImageResource(0);
                            } else if (R.id.imgmat97 == MatAnswer1) {
                                Target1.setBackgroundResource(MatImageC7);
                                imgmatch97.setImageResource(0);
                            } else if (R.id.imgmat98 == MatAnswer1) {
                                Target1.setBackgroundResource(MatImageC8);
                                imgmatch98.setImageResource(0);
                            } else if (R.id.imgmat99 == MatAnswer1) {
                                Target1.setBackgroundResource(MatImageC9);
                                imgmatch99.setImageResource(0);
                            }

                        } else {
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
                switch (dragEvent) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        final View view = (View) event.getLocalState();
                        if (view.getId() == MatAnswer2) {
                            Target2.setText("");
                            MatchScore += 100;
                            ShowScore.setText("  " + MatchScore);
                            if (R.id.imgmat91 == MatAnswer2) {
                                Target2.setBackgroundResource(MatImageC1);
                                imgmatch91.setImageResource(0);
                            } else if (R.id.imgmat92 == MatAnswer2) {
                                Target2.setBackgroundResource(MatImageC2);
                                imgmatch92.setImageResource(0);
                            } else if (R.id.imgmat93 == MatAnswer2) {
                                Target2.setBackgroundResource(MatImageC3);
                                imgmatch93.setImageResource(0);
                            } else if (R.id.imgmat94 == MatAnswer2) {
                                Target2.setBackgroundResource(MatImageC4);
                                imgmatch94.setImageResource(0);
                            } else if (R.id.imgmat95 == MatAnswer2) {
                                Target2.setBackgroundResource(MatImageC5);
                                imgmatch95.setImageResource(0);
                            } else if (R.id.imgmat96 == MatAnswer2) {
                                Target2.setBackgroundResource(MatImageC6);
                                imgmatch96.setImageResource(0);
                            } else if (R.id.imgmat97 == MatAnswer2) {
                                Target2.setBackgroundResource(MatImageC7);
                                imgmatch97.setImageResource(0);
                            } else if (R.id.imgmat98 == MatAnswer2) {
                                Target2.setBackgroundResource(MatImageC8);
                                imgmatch98.setImageResource(0);
                            } else if (R.id.imgmat99 == MatAnswer2) {
                                Target2.setBackgroundResource(MatImageC9);
                                imgmatch99.setImageResource(0);
                            }

                        } else {
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
                switch (dragEvent) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        final View view = (View) event.getLocalState();
                        if (view.getId() == MatAnswer3) {
                            Target3.setText("");
                            MatchScore += 100;
                            ShowScore.setText("  " + MatchScore);
                            if (R.id.imgmat91 == MatAnswer3) {
                                Target3.setBackgroundResource(MatImageC1);
                                imgmatch91.setImageResource(0);
                            } else if (R.id.imgmat92 == MatAnswer3) {
                                Target3.setBackgroundResource(MatImageC2);
                                imgmatch92.setImageResource(0);
                            } else if (R.id.imgmat93 == MatAnswer3) {
                                Target3.setBackgroundResource(MatImageC3);
                                imgmatch93.setImageResource(0);
                            } else if (R.id.imgmat94 == MatAnswer3) {
                                Target3.setBackgroundResource(MatImageC4);
                                imgmatch94.setImageResource(0);
                            } else if (R.id.imgmat95 == MatAnswer3) {
                                Target3.setBackgroundResource(MatImageC5);
                                imgmatch95.setImageResource(0);
                            } else if (R.id.imgmat96 == MatAnswer3) {
                                Target3.setBackgroundResource(MatImageC6);
                                imgmatch96.setImageResource(0);
                            } else if (R.id.imgmat97 == MatAnswer3) {
                                Target3.setBackgroundResource(MatImageC7);
                                imgmatch97.setImageResource(0);
                            } else if (R.id.imgmat98 == MatAnswer3) {
                                Target3.setBackgroundResource(MatImageC8);
                                imgmatch98.setImageResource(0);
                            } else if (R.id.imgmat99 == MatAnswer3) {
                                Target3.setBackgroundResource(MatImageC9);
                                imgmatch99.setImageResource(0);
                            }

                        } else {
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
                switch (dragEvent) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        final View view = (View) event.getLocalState();
                        if (view.getId() == MatAnswer4) {
                            Target4.setText("");
                            MatchScore += 100;
                            ShowScore.setText("  " + MatchScore);
                            if (R.id.imgmat91 == MatAnswer4) {
                                Target4.setBackgroundResource(MatImageC1);
                                imgmatch91.setImageResource(0);
                            } else if (R.id.imgmat92 == MatAnswer4) {
                                Target4.setBackgroundResource(MatImageC2);
                                imgmatch92.setImageResource(0);
                            } else if (R.id.imgmat93 == MatAnswer4) {
                                Target4.setBackgroundResource(MatImageC3);
                                imgmatch93.setImageResource(0);
                            } else if (R.id.imgmat94 == MatAnswer4) {
                                Target4.setBackgroundResource(MatImageC4);
                                imgmatch94.setImageResource(0);
                            } else if (R.id.imgmat95 == MatAnswer4) {
                                Target4.setBackgroundResource(MatImageC5);
                                imgmatch95.setImageResource(0);
                            } else if (R.id.imgmat96 == MatAnswer4) {
                                Target4.setBackgroundResource(MatImageC6);
                                imgmatch96.setImageResource(0);
                            } else if (R.id.imgmat97 == MatAnswer4) {
                                Target4.setBackgroundResource(MatImageC7);
                                imgmatch97.setImageResource(0);
                            } else if (R.id.imgmat98 == MatAnswer4) {
                                Target4.setBackgroundResource(MatImageC8);
                                imgmatch98.setImageResource(0);
                            } else if (R.id.imgmat99 == MatAnswer4) {
                                Target4.setBackgroundResource(MatImageC9);
                                imgmatch99.setImageResource(0);
                            }

                        } else {
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

        View.OnDragListener dragListener5 = new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {
                int dragEvent = event.getAction();
                switch (dragEvent) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        final View view = (View) event.getLocalState();
                        if (view.getId() == MatAnswer5) {
                            Target5.setText("");
                            MatchScore += 100;
                            ShowScore.setText("  " + MatchScore);
                            if (R.id.imgmat91 == MatAnswer5) {
                                Target5.setBackgroundResource(MatImageC1);
                                imgmatch91.setImageResource(0);
                            } else if (R.id.imgmat92 == MatAnswer5) {
                                Target5.setBackgroundResource(MatImageC2);
                                imgmatch92.setImageResource(0);
                            } else if (R.id.imgmat93 == MatAnswer5) {
                                Target5.setBackgroundResource(MatImageC3);
                                imgmatch93.setImageResource(0);
                            } else if (R.id.imgmat94 == MatAnswer5) {
                                Target5.setBackgroundResource(MatImageC4);
                                imgmatch94.setImageResource(0);
                            } else if (R.id.imgmat95 == MatAnswer5) {
                                Target5.setBackgroundResource(MatImageC5);
                                imgmatch95.setImageResource(0);
                            } else if (R.id.imgmat96 == MatAnswer5) {
                                Target5.setBackgroundResource(MatImageC6);
                                imgmatch96.setImageResource(0);
                            } else if (R.id.imgmat97 == MatAnswer5) {
                                Target5.setBackgroundResource(MatImageC7);
                                imgmatch97.setImageResource(0);
                            } else if (R.id.imgmat98 == MatAnswer5) {
                                Target5.setBackgroundResource(MatImageC8);
                                imgmatch98.setImageResource(0);
                            } else if (R.id.imgmat99 == MatAnswer5) {
                                Target5.setBackgroundResource(MatImageC9);
                                imgmatch99.setImageResource(0);
                            }

                        } else {
                            Target5.setText("");

                        }
                        break;
                    case DragEvent.ACTION_DRAG_EXITED:
                        break;
                    case DragEvent.ACTION_DROP:
                        break;
                }
                return true;
            }
        };//ตำแหน่งที่ 5

        View.OnDragListener dragListener6 = new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {
                int dragEvent = event.getAction();
                switch (dragEvent) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        final View view = (View) event.getLocalState();
                        if (view.getId() == MatAnswer6) {
                            Target6.setText("");
                            MatchScore += 100;
                            ShowScore.setText("  " + MatchScore);
                            if (R.id.imgmat91 == MatAnswer6) {
                                Target6.setBackgroundResource(MatImageC1);
                                imgmatch91.setImageResource(0);
                            } else if (R.id.imgmat92 == MatAnswer6) {
                                Target6.setBackgroundResource(MatImageC2);
                                imgmatch92.setImageResource(0);
                            } else if (R.id.imgmat93 == MatAnswer6) {
                                Target6.setBackgroundResource(MatImageC3);
                                imgmatch93.setImageResource(0);
                            } else if (R.id.imgmat94 == MatAnswer6) {
                                Target6.setBackgroundResource(MatImageC4);
                                imgmatch94.setImageResource(0);
                            } else if (R.id.imgmat95 == MatAnswer6) {
                                Target6.setBackgroundResource(MatImageC5);
                                imgmatch95.setImageResource(0);
                            } else if (R.id.imgmat96 == MatAnswer6) {
                                Target6.setBackgroundResource(MatImageC6);
                                imgmatch96.setImageResource(0);
                            } else if (R.id.imgmat97 == MatAnswer6) {
                                Target6.setBackgroundResource(MatImageC7);
                                imgmatch97.setImageResource(0);
                            } else if (R.id.imgmat98 == MatAnswer6) {
                                Target6.setBackgroundResource(MatImageC8);
                                imgmatch98.setImageResource(0);
                            } else if (R.id.imgmat99 == MatAnswer6) {
                                Target6.setBackgroundResource(MatImageC9);
                                imgmatch99.setImageResource(0);
                            }

                        } else {
                            Target6.setText("");

                        }
                        break;
                    case DragEvent.ACTION_DRAG_EXITED:
                        break;
                    case DragEvent.ACTION_DROP:
                        break;
                }
                return true;
            }
        };//ตำแหน่งที่ 6

        View.OnDragListener dragListener7 = new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {
                int dragEvent = event.getAction();
                switch (dragEvent) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        final View view = (View) event.getLocalState();
                        if (view.getId() == MatAnswer7) {
                            Target7.setText("");
                            MatchScore += 100;
                            ShowScore.setText("  " + MatchScore);
                            if (R.id.imgmat91 == MatAnswer7) {
                                Target7.setBackgroundResource(MatImageC1);
                                imgmatch91.setImageResource(0);
                            } else if (R.id.imgmat92 == MatAnswer7) {
                                Target7.setBackgroundResource(MatImageC2);
                                imgmatch92.setImageResource(0);
                            } else if (R.id.imgmat93 == MatAnswer7) {
                                Target7.setBackgroundResource(MatImageC3);
                                imgmatch93.setImageResource(0);
                            } else if (R.id.imgmat94 == MatAnswer7) {
                                Target7.setBackgroundResource(MatImageC4);
                                imgmatch94.setImageResource(0);
                            } else if (R.id.imgmat95 == MatAnswer7) {
                                Target7.setBackgroundResource(MatImageC5);
                                imgmatch95.setImageResource(0);
                            } else if (R.id.imgmat96 == MatAnswer7) {
                                Target7.setBackgroundResource(MatImageC6);
                                imgmatch96.setImageResource(0);
                            } else if (R.id.imgmat97 == MatAnswer7) {
                                Target7.setBackgroundResource(MatImageC7);
                                imgmatch97.setImageResource(0);
                            } else if (R.id.imgmat98 == MatAnswer7) {
                                Target7.setBackgroundResource(MatImageC8);
                                imgmatch98.setImageResource(0);
                            } else if (R.id.imgmat99 == MatAnswer7) {
                                Target7.setBackgroundResource(MatImageC9);
                                imgmatch99.setImageResource(0);
                            }

                        } else {
                            Target7.setText("");

                        }
                        break;
                    case DragEvent.ACTION_DRAG_EXITED:
                        break;
                    case DragEvent.ACTION_DROP:
                        break;
                }
                return true;
            }
        };//ตำแหน่งที่ 7

        View.OnDragListener dragListener8 = new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {
                int dragEvent = event.getAction();
                switch (dragEvent) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        final View view = (View) event.getLocalState();
                        if (view.getId() == MatAnswer8) {
                            Target8.setText("");
                            MatchScore += 100;
                            ShowScore.setText("  " + MatchScore);
                            if (R.id.imgmat91 == MatAnswer8) {
                                Target8.setBackgroundResource(MatImageC1);
                                imgmatch91.setImageResource(0);
                            } else if (R.id.imgmat92 == MatAnswer8) {
                                Target8.setBackgroundResource(MatImageC2);
                                imgmatch92.setImageResource(0);
                            } else if (R.id.imgmat93 == MatAnswer8) {
                                Target8.setBackgroundResource(MatImageC3);
                                imgmatch93.setImageResource(0);
                            } else if (R.id.imgmat94 == MatAnswer8) {
                                Target8.setBackgroundResource(MatImageC4);
                                imgmatch94.setImageResource(0);
                            } else if (R.id.imgmat95 == MatAnswer8) {
                                Target8.setBackgroundResource(MatImageC5);
                                imgmatch95.setImageResource(0);
                            } else if (R.id.imgmat96 == MatAnswer8) {
                                Target8.setBackgroundResource(MatImageC6);
                                imgmatch96.setImageResource(0);
                            } else if (R.id.imgmat97 == MatAnswer8) {
                                Target8.setBackgroundResource(MatImageC7);
                                imgmatch97.setImageResource(0);
                            } else if (R.id.imgmat98 == MatAnswer8) {
                                Target8.setBackgroundResource(MatImageC8);
                                imgmatch98.setImageResource(0);
                            } else if (R.id.imgmat99 == MatAnswer8) {
                                Target8.setBackgroundResource(MatImageC9);
                                imgmatch99.setImageResource(0);
                            }

                        } else {
                            Target8.setText("");

                        }
                        break;
                    case DragEvent.ACTION_DRAG_EXITED:
                        break;
                    case DragEvent.ACTION_DROP:
                        break;
                }
                return true;
            }
        };//ตำแหน่งที่ 8

        View.OnDragListener dragListener9 = new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {
                int dragEvent = event.getAction();
                switch (dragEvent) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        final View view = (View) event.getLocalState();
                        if (view.getId() == MatAnswer9) {
                            Target9.setText("");
                            MatchScore += 100;
                            ShowScore.setText("  " + MatchScore);
                            if (R.id.imgmat91 == MatAnswer9) {
                                Target9.setBackgroundResource(MatImageC1);
                                imgmatch91.setImageResource(0);
                            } else if (R.id.imgmat92 == MatAnswer9) {
                                Target9.setBackgroundResource(MatImageC2);
                                imgmatch92.setImageResource(0);
                            } else if (R.id.imgmat93 == MatAnswer9) {
                                Target9.setBackgroundResource(MatImageC3);
                                imgmatch93.setImageResource(0);
                            } else if (R.id.imgmat94 == MatAnswer9) {
                                Target9.setBackgroundResource(MatImageC4);
                                imgmatch94.setImageResource(0);
                            } else if (R.id.imgmat95 == MatAnswer9) {
                                Target9.setBackgroundResource(MatImageC5);
                                imgmatch95.setImageResource(0);
                            } else if (R.id.imgmat96 == MatAnswer9) {
                                Target9.setBackgroundResource(MatImageC6);
                                imgmatch96.setImageResource(0);
                            } else if (R.id.imgmat97 == MatAnswer9) {
                                Target9.setBackgroundResource(MatImageC7);
                                imgmatch97.setImageResource(0);
                            } else if (R.id.imgmat98 == MatAnswer9) {
                                Target9.setBackgroundResource(MatImageC8);
                                imgmatch98.setImageResource(0);
                            } else if (R.id.imgmat99 == MatAnswer9) {
                                Target9.setBackgroundResource(MatImageC9);
                                imgmatch99.setImageResource(0);
                            }

                        } else {
                            Target9.setText("");

                        }
                        break;
                    case DragEvent.ACTION_DRAG_EXITED:
                        break;
                    case DragEvent.ACTION_DROP:
                        break;
                }
                return true;
            }
        };//ตำแหน่งที่ 9

        Target1.setOnDragListener(dragListener1);
        Target2.setOnDragListener(dragListener2);
        Target3.setOnDragListener(dragListener3);
        Target4.setOnDragListener(dragListener4);
        Target5.setOnDragListener(dragListener5);
        Target6.setOnDragListener(dragListener6);
        Target7.setOnDragListener(dragListener7);
        Target8.setOnDragListener(dragListener8);
        Target9.setOnDragListener(dragListener9);
    }

    public void updateQuestion9 (int num){
        Question.setText(MatQ.getQuestion(num));
        imgmatch91.setImageResource(MatQ.getChoice1(num));
        imgmatch92.setImageResource(MatQ.getChoice2(num));
        imgmatch93.setImageResource(MatQ.getChoice3(num));
        imgmatch94.setImageResource(MatQ.getChoice4(num));
        imgmatch95.setImageResource(MatQ.getChoice5(num));
        imgmatch96.setImageResource(MatQ.getChoice6(num));
        imgmatch97.setImageResource(MatQ.getChoice7(num));
        imgmatch98.setImageResource(MatQ.getChoice8(num));
        imgmatch99.setImageResource(MatQ.getChoice9(num));
        Target1.setText(MatQ.getQuestionText1(num));
        Target2.setText(MatQ.getQuestionText2(num));
        Target3.setText(MatQ.getQuestionText3(num));
        Target4.setText(MatQ.getQuestionText4(num));
        Target5.setText(MatQ.getQuestionText5(num));
        Target6.setText(MatQ.getQuestionText6(num));
        Target7.setText(MatQ.getQuestionText7(num));
        Target8.setText(MatQ.getQuestionText8(num));
        Target9.setText(MatQ.getQuestionText9(num));
        MatAnswer1 = MatQ.getCorrectAnswer1(num);
        MatAnswer2 = MatQ.getCorrectAnswer2(num);
        MatAnswer3 = MatQ.getCorrectAnswer3(num);
        MatAnswer4 = MatQ.getCorrectAnswer4(num);
        MatAnswer5 = MatQ.getCorrectAnswer5(num);
        MatAnswer6 = MatQ.getCorrectAnswer6(num);
        MatAnswer7 = MatQ.getCorrectAnswer7(num);
        MatAnswer8 = MatQ.getCorrectAnswer8(num);
        MatAnswer9 = MatQ.getCorrectAnswer9(num);
        MatImageC1 = MatQ.getChoice1(num);
        MatImageC2 = MatQ.getChoice2(num);
        MatImageC3 = MatQ.getChoice3(num);
        MatImageC4 = MatQ.getChoice4(num);
        MatImageC5 = MatQ.getChoice5(num);
        MatImageC6 = MatQ.getChoice6(num);
        MatImageC7 = MatQ.getChoice7(num);
        MatImageC8 = MatQ.getChoice8(num);
        MatImageC9 = MatQ.getChoice9(num);



    }
    public void onBackPressed() {
        super.onBackPressed();
        Intent menuform = new Intent(this, MenuJigsawActivity.class);
        startActivity(menuform);
        finish(); //ปิ ดหน้าปัจจุบัน
    }

    public void gameOver (){
        builder = new AlertDialog.Builder(this);
        builder.setTitle("Time's up");
        builder.setIcon(R.drawable.reward);
        builder.setMessage("\n Scores : " + MatchScore +" Point");

        builder.setPositiveButton("Try again", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent refresh = new Intent(getApplicationContext(),Jigsaw9Activity.class);
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
