package com.example.brainlevel;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class MatchAniActivity extends AppCompatActivity {
    public TextView scoreani;
    public ImageView iv_11,iv_12,iv_13,iv_14,iv_21,iv_22,iv_23,iv_24,iv_31,iv_32,iv_33,iv_34,
            iv_41,iv_42,iv_43,iv_44,iv_51,iv_52,iv_53,iv_54;

    public Integer[] cardsArray = {101,102,103,104,105,106,107,108,109,110,201,202,203,204,205,206,207,208,209,210};
    int ani101,ani102,ani103,ani104,ani105,ani106,ani107,ani108,ani109,ani110,
            ani201,ani202,ani203,ani204,ani205,ani206,ani207,ani208,ani209,ani210;

    int firstCard, secondCard;
    int clickedFirst, clickedSecond;
    int cardNumber = 1;

    int count = 1;
    int playerPoints = 0;
    SeekBar countdown1;
    int counter=0;
    public android.app.AlertDialog.Builder builder;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_ani);
        scoreani = (TextView) findViewById(R.id.scorefruit);

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
                GameOver();
            }
        }.start();

        iv_11 = (ImageView) findViewById(R.id.iv_11);
        iv_12 = (ImageView) findViewById(R.id.iv_12);
        iv_13 = (ImageView) findViewById(R.id.iv_13);
        iv_14 = (ImageView) findViewById(R.id.iv_14);
        iv_21 = (ImageView) findViewById(R.id.iv_21);
        iv_22 = (ImageView) findViewById(R.id.iv_22);
        iv_23 = (ImageView) findViewById(R.id.iv_23);
        iv_24 = (ImageView) findViewById(R.id.iv_24);
        iv_31 = (ImageView) findViewById(R.id.iv_31);
        iv_32 = (ImageView) findViewById(R.id.iv_32);
        iv_33 = (ImageView) findViewById(R.id.iv_33);
        iv_34 = (ImageView) findViewById(R.id.iv_34);
        iv_41 = (ImageView) findViewById(R.id.iv_41);
        iv_42 = (ImageView) findViewById(R.id.iv_42);
        iv_43 = (ImageView) findViewById(R.id.iv_43);
        iv_44 = (ImageView) findViewById(R.id.iv_44);
        iv_51 = (ImageView) findViewById(R.id.iv_51);
        iv_52 = (ImageView) findViewById(R.id.iv_52);
        iv_53 = (ImageView) findViewById(R.id.iv_53);
        iv_54 = (ImageView) findViewById(R.id.iv_54);


        iv_11.setTag("0");
        iv_12.setTag("1");
        iv_13.setTag("2");
        iv_14.setTag("3");
        iv_21.setTag("4");
        iv_22.setTag("5");
        iv_23.setTag("6");
        iv_24.setTag("7");
        iv_31.setTag("8");
        iv_32.setTag("9");
        iv_33.setTag("10");
        iv_34.setTag("11");
        iv_41.setTag("12");
        iv_42.setTag("13");
        iv_43.setTag("14");
        iv_44.setTag("15");
        iv_51.setTag("16");
        iv_52.setTag("17");
        iv_53.setTag("18");
        iv_54.setTag("19");


        //load the card image
        frontOfCardsResources();

        //shuffle the images
        Collections.shuffle(Arrays.asList(cardsArray));

        iv_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_11, theCard);

            }
        });
        iv_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_12, theCard);

            }
        });
        iv_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_13, theCard);

            }
        });
        iv_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_14, theCard);
            }
        });
        iv_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_21, theCard);
            }
        });
        iv_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_22, theCard);
            }
        });
        iv_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_23, theCard);
            }
        });
        iv_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_24, theCard);
            }
        });
        iv_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_31, theCard);
            }
        });
        iv_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_32, theCard);
            }
        });
        iv_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_33, theCard);
            }
        });
        iv_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_34, theCard);
            }
        });
        iv_41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_41, theCard);

            }
        });
        iv_42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_42, theCard);

            }
        });
        iv_43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_43, theCard);

            }
        });
        iv_44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_44, theCard);
            }
        });
        iv_51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_51, theCard);
            }
        });
        iv_52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_52, theCard);
            }
        });
        iv_53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_53, theCard);
            }
        });
        iv_54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_54, theCard);
            }
        });

    }

    private void doStuff(ImageView iv,int card){
        //set the correct image to the imageview
        if(cardsArray[card] == 101) {
            iv.setImageResource(ani101);
        }
        else if (cardsArray[card] == 102) {
            iv.setImageResource(ani102);
        }
        else if (cardsArray[card] == 103) {
            iv.setImageResource(ani103);
        }
        else if (cardsArray[card] == 104) {
            iv.setImageResource(ani104);
        }
        else if (cardsArray[card] == 105) {
            iv.setImageResource(ani105);
        }
        else if (cardsArray[card] == 106) {
            iv.setImageResource(ani106);
        }
        else if(cardsArray[card] == 107) {
            iv.setImageResource(ani107);
        }
        else if (cardsArray[card] == 108) {
            iv.setImageResource(ani108);
        }
        else if (cardsArray[card] == 109) {
            iv.setImageResource(ani109);
        }
        else if (cardsArray[card] == 110) {
            iv.setImageResource(ani110);
        }
        else if(cardsArray[card] == 201) {
            iv.setImageResource(ani101);
        }
        else if (cardsArray[card] == 202) {
            iv.setImageResource(ani102);
        }
        else if (cardsArray[card] == 203) {
            iv.setImageResource(ani103);
        }
        else if (cardsArray[card] == 204) {
            iv.setImageResource(ani104);
        }
        else if (cardsArray[card] == 205) {
            iv.setImageResource(ani105);
        }
        else if (cardsArray[card] == 206) {
            iv.setImageResource(ani106);
        }
        else if(cardsArray[card] == 207) {
            iv.setImageResource(ani107);
        }
        else if (cardsArray[card] == 208) {
            iv.setImageResource(ani108);
        }
        else if (cardsArray[card] == 209) {
            iv.setImageResource(ani109);
        }
        else if (cardsArray[card] == 210) {
            iv.setImageResource(ani110);
        }


        //check which image is selected and save
        if (cardNumber == 1){
            firstCard = cardsArray[card];
            if(firstCard > 200){
                firstCard = firstCard -100;
            }
            cardNumber = 2;
            clickedFirst = card;

            iv.setEnabled(false);
        } else if (cardNumber == 2){
            secondCard = cardsArray[card];
            if(secondCard > 200){
                secondCard = secondCard -100;
            }
            cardNumber = 1;
            clickedSecond = card;

            iv_11.setEnabled(false);
            iv_12.setEnabled(false);
            iv_13.setEnabled(false);
            iv_14.setEnabled(false);
            iv_21.setEnabled(false);
            iv_22.setEnabled(false);
            iv_23.setEnabled(false);
            iv_24.setEnabled(false);
            iv_31.setEnabled(false);
            iv_32.setEnabled(false);
            iv_33.setEnabled(false);
            iv_34.setEnabled(false);
            iv_41.setEnabled(false);
            iv_42.setEnabled(false);
            iv_43.setEnabled(false);
            iv_44.setEnabled(false);
            iv_51.setEnabled(false);
            iv_52.setEnabled(false);
            iv_53.setEnabled(false);
            iv_54.setEnabled(false);


            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //check if the selected image are equal
                    calculate();
                }
            },1000);

        }
    }

    private void calculate(){
        //if image are equal remove tgem and add point
        if(firstCard == secondCard){
            if(clickedFirst ==0){
                iv_11.setVisibility(View.INVISIBLE);
            }else if (clickedFirst ==1){
                iv_12.setVisibility(View.INVISIBLE);
            }else if (clickedFirst ==2){
                iv_13.setVisibility(View.INVISIBLE);
            }else if (clickedFirst ==3){
                iv_14.setVisibility(View.INVISIBLE);
            }else if (clickedFirst ==4){
                iv_21.setVisibility(View.INVISIBLE);
            }else if (clickedFirst ==5){
                iv_22.setVisibility(View.INVISIBLE);
            }else if (clickedFirst ==6){
                iv_23.setVisibility(View.INVISIBLE);
            }else if (clickedFirst ==7){
                iv_24.setVisibility(View.INVISIBLE);
            }else if (clickedFirst ==8){
                iv_31.setVisibility(View.INVISIBLE);
            }else if (clickedFirst ==9){
                iv_32.setVisibility(View.INVISIBLE);
            }else if (clickedFirst ==10){
                iv_33.setVisibility(View.INVISIBLE);
            }else if (clickedFirst ==11){
                iv_34.setVisibility(View.INVISIBLE);
            }else if (clickedFirst ==12){
                iv_41.setVisibility(View.INVISIBLE);
            }else if (clickedFirst ==13){
                iv_42.setVisibility(View.INVISIBLE);
            }else if (clickedFirst ==14){
                iv_43.setVisibility(View.INVISIBLE);
            }else if (clickedFirst ==15){
                iv_44.setVisibility(View.INVISIBLE);
            }else if (clickedFirst ==16){
                iv_51.setVisibility(View.INVISIBLE);
            }else if (clickedFirst ==17){
                iv_52.setVisibility(View.INVISIBLE);
            }else if (clickedFirst ==18){
                iv_53.setVisibility(View.INVISIBLE);
            }else if (clickedFirst ==19){
                iv_54.setVisibility(View.INVISIBLE);
            }

            if(clickedSecond ==0){
                iv_11.setVisibility(View.INVISIBLE);
            }else if (clickedSecond ==1){
                iv_12.setVisibility(View.INVISIBLE);
            }else if (clickedSecond ==2){
                iv_13.setVisibility(View.INVISIBLE);
            }else if (clickedSecond ==3){
                iv_14.setVisibility(View.INVISIBLE);
            }else if (clickedSecond ==4){
                iv_21.setVisibility(View.INVISIBLE);
            }else if (clickedSecond ==5){
                iv_22.setVisibility(View.INVISIBLE);
            }else if (clickedSecond ==6){
                iv_23.setVisibility(View.INVISIBLE);
            }else if (clickedSecond ==7){
                iv_24.setVisibility(View.INVISIBLE);
            }else if (clickedSecond ==8){
                iv_31.setVisibility(View.INVISIBLE);
            }else if (clickedSecond ==9){
                iv_32.setVisibility(View.INVISIBLE);
            }else if (clickedSecond ==10){
                iv_33.setVisibility(View.INVISIBLE);
            }else if (clickedSecond ==11){
                iv_34.setVisibility(View.INVISIBLE);
            }else if (clickedSecond ==12){
                iv_41.setVisibility(View.INVISIBLE);
            }else if (clickedSecond ==13){
                iv_42.setVisibility(View.INVISIBLE);
            }else if (clickedSecond ==14){
                iv_43.setVisibility(View.INVISIBLE);
            }else if (clickedSecond ==15){
                iv_44.setVisibility(View.INVISIBLE);
            }else if (clickedSecond ==16){
                iv_51.setVisibility(View.INVISIBLE);
            }else if (clickedSecond ==17){
                iv_52.setVisibility(View.INVISIBLE);
            }else if (clickedSecond ==18){
                iv_53.setVisibility(View.INVISIBLE);
            }else if (clickedSecond ==19){
                iv_54.setVisibility(View.INVISIBLE);
            }

            if(scoreani.getLineCount() == 1){
                playerPoints++;
                scoreani.setText(" "+playerPoints*100);
            }
        } else {
            iv_11.setImageResource(R.drawable.hidden);
            iv_12.setImageResource(R.drawable.hidden);
            iv_13.setImageResource(R.drawable.hidden);
            iv_14.setImageResource(R.drawable.hidden);
            iv_21.setImageResource(R.drawable.hidden);
            iv_22.setImageResource(R.drawable.hidden);
            iv_23.setImageResource(R.drawable.hidden);
            iv_24.setImageResource(R.drawable.hidden);
            iv_31.setImageResource(R.drawable.hidden);
            iv_32.setImageResource(R.drawable.hidden);
            iv_33.setImageResource(R.drawable.hidden);
            iv_34.setImageResource(R.drawable.hidden);
            iv_41.setImageResource(R.drawable.hidden);
            iv_42.setImageResource(R.drawable.hidden);
            iv_43.setImageResource(R.drawable.hidden);
            iv_44.setImageResource(R.drawable.hidden);
            iv_51.setImageResource(R.drawable.hidden);
            iv_52.setImageResource(R.drawable.hidden);
            iv_53.setImageResource(R.drawable.hidden);
            iv_54.setImageResource(R.drawable.hidden);



        }
        iv_11.setEnabled(true);
        iv_12.setEnabled(true);
        iv_13.setEnabled(true);
        iv_14.setEnabled(true);
        iv_21.setEnabled(true);
        iv_22.setEnabled(true);
        iv_23.setEnabled(true);
        iv_24.setEnabled(true);
        iv_31.setEnabled(true);
        iv_32.setEnabled(true);
        iv_33.setEnabled(true);
        iv_34.setEnabled(true);
        iv_41.setEnabled(true);
        iv_42.setEnabled(true);
        iv_43.setEnabled(true);
        iv_44.setEnabled(true);
        iv_51.setEnabled(true);
        iv_52.setEnabled(true);
        iv_53.setEnabled(true);
        iv_54.setEnabled(true);


        //check of the game over
        checkEnd();
    }

    private void checkEnd(){
        if(iv_11.getVisibility() == View.INVISIBLE &&
                iv_11.getVisibility() == View.INVISIBLE &&
                iv_12.getVisibility() == View.INVISIBLE &&
                iv_13.getVisibility() == View.INVISIBLE &&
                iv_14.getVisibility() == View.INVISIBLE &&
                iv_21.getVisibility() == View.INVISIBLE &&
                iv_22.getVisibility() == View.INVISIBLE &&
                iv_23.getVisibility() == View.INVISIBLE &&
                iv_24.getVisibility() == View.INVISIBLE &&
                iv_31.getVisibility() == View.INVISIBLE &&
                iv_32.getVisibility() == View.INVISIBLE &&
                iv_33.getVisibility() == View.INVISIBLE &&
                iv_34.getVisibility() == View.INVISIBLE &&
                iv_41.getVisibility() == View.INVISIBLE &&
                iv_42.getVisibility() == View.INVISIBLE &&
                iv_43.getVisibility() == View.INVISIBLE &&
                iv_44.getVisibility() == View.INVISIBLE &&
                iv_51.getVisibility() == View.INVISIBLE &&
                iv_52.getVisibility() == View.INVISIBLE &&
                iv_53.getVisibility() == View.INVISIBLE &&
                iv_54.getVisibility() == View.INVISIBLE   ){


            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MatchAniActivity.this);
            alertDialogBuilder.setTitle("WIN");
            alertDialogBuilder.setIcon(R.drawable.reward);
            alertDialogBuilder.setMessage("\n Scores : " + playerPoints*100 + " Point");

            alertDialogBuilder.setPositiveButton("Try again", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent refresh = new Intent(getApplicationContext(), MatchAniActivity.class);
                    startActivity(refresh);
                }
            });
            alertDialogBuilder.setNegativeButton("Back to menu", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent refresh = new Intent(getApplicationContext(), MenumatchingActivity.class);
                    startActivity(refresh);
                }
            });
            alertDialogBuilder.setNeutralButton("Exit", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    finish();
                }
            });
            alertDialogBuilder.show();
        }
    }


    private void frontOfCardsResources (){
        ani101 = R.drawable.ani101;
        ani102 = R.drawable.ani102;
        ani103 = R.drawable.ani103;
        ani104 = R.drawable.ani104;
        ani105 = R.drawable.ani105;
        ani106 = R.drawable.ani106;
        ani107 = R.drawable.ani107;
        ani108 = R.drawable.ani108;
        ani109 = R.drawable.ani109;
        ani110 = R.drawable.ani110;
        ani201 = R.drawable.ani101;
        ani202 = R.drawable.ani102;
        ani203 = R.drawable.ani103;
        ani204 = R.drawable.ani104;
        ani205 = R.drawable.ani105;
        ani206 = R.drawable.ani106;
        ani207 = R.drawable.ani107;
        ani208 = R.drawable.ani108;
        ani209 = R.drawable.ani109;
        ani210 = R.drawable.ani110;

    }
    public void GameOver(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MatchAniActivity.this);
        alertDialogBuilder.setTitle("Time's up");
        alertDialogBuilder.setIcon(R.drawable.reward);
        alertDialogBuilder.setMessage("\n Scores : " + playerPoints*100+" Point");

        alertDialogBuilder.setPositiveButton("Try again", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent refresh = new Intent(getApplicationContext(),MatchAniActivity.class);
                startActivity(refresh);
            }
        });
        alertDialogBuilder.setNegativeButton("Back to menu", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent refresh = new Intent(getApplicationContext(),MenumatchingActivity.class);
                startActivity(refresh);
            }
        });
        alertDialogBuilder.setNeutralButton("Exit", new DialogInterface.OnClickListener() {
            @Override    public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        alertDialogBuilder.show();
    }//ปิด method gameOver

    public void onBackPressed() {
        super.onBackPressed();
        Intent menuform = new Intent(this, MenumatchingActivity.class);
        startActivity(menuform);
        finish(); //ปิ ดหน้าปัจจุบัน
    }
}
