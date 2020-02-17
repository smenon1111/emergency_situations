package com.example.tech2020;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import java.util.ArrayList;


public class StreetDisastersShooting extends AppCompatActivity {
    private MediaController mc;
    private TextView mQuestion;
    private Button mFirstButton;
    private Button mSecondButton;
    private Button mThirdButton;
    private Button mFourthButton;
    private int mQuizIndex = 1;
    public int myScore = 0;
    public TextView mEnd;


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.streetdisasters_shooting);
        VideoView view1 = (VideoView)findViewById(R.id.VideoView);
        String path = "android.resource://" + getPackageName() + "/" + R.raw.shooting_q1;
        mc = new MediaController(this);
        view1.setMediaController(mc);
        view1.requestFocus();
        view1.setVideoURI(Uri.parse(path));
        view1.start();

        mQuestion = (TextView) findViewById(R.id.question);
        mFirstButton = (Button) findViewById(R.id.firstbutton);
        mSecondButton = (Button) findViewById(R.id.secondbutton);
        mThirdButton = (Button) findViewById(R.id.thirdbutton);
        mFourthButton = (Button) findViewById(R.id.fourthbutton);
        mEnd = (TextView) findViewById(R.id.textView);
        final TextView mMyFinalScore = findViewById(R.id.mMyFinalScore);


        //FIRST BUTTON
        mFirstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mQuizIndex == 1) {
                    //Correct Answer
                    VideoView view1 = (VideoView) findViewById(R.id.VideoView);
                    String path = "android.resource://" + getPackageName() + "/" + R.raw.shooting_q2;
                    view1.setMediaController(mc);
                    view1.requestFocus();
                    view1.setVideoURI(Uri.parse(path));
                    view1.start();
                    mQuestion.setText(R.string.Q2);
                    mFirstButton.setText(R.string.Q2_A1);
                    mSecondButton.setText(R.string.Q2_A2);
                    mThirdButton.setText(R.string.Q2_A3);
                    mFourthButton.setText(R.string.Q2_A4);
                    Toast coinsAdded = Toast.makeText(getApplicationContext(),"Correct Answer! +10 points", Toast.LENGTH_LONG);
                    coinsAdded.show();
                    mQuizIndex = 2;
                    myScore = myScore + 10;


                } else if (mQuizIndex == 2) {
                    //Wrong Answer
                    mEnd.setText(R.string.S1_Congrats );
                    mMyFinalScore.setText(String.format("%d",myScore,"/ 40 points"));
                    openRewardPage();
                    mQuizIndex = 5;
                } else if (mQuizIndex == 3) {
                    //Wrong Answer
                   openRewardPage();
                    mQuizIndex = 5;
                } else if (mQuizIndex == 4) {
                    //Correct Answer
                    VideoView view1 = (VideoView) findViewById(R.id.VideoView);
                    myScore = myScore + 10;
                    mEnd.setText(R.string.S1_Congrats );
                    mMyFinalScore.setText(String.format("%d",myScore,"/ 40 points"));
                    Toast coinsAdded = Toast.makeText(getApplicationContext(),"Correct Answer! +10 points", Toast.LENGTH_LONG);
                    coinsAdded.show();
                    mQuizIndex = 5 ;
                    openRewardPage();
                }
            }
        });

        //SECOND BUTTON
        mSecondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mQuizIndex == 1) {
                //Wrong Answer
                VideoView view1 = (VideoView) findViewById(R.id.VideoView);
                openRewardPage();
                mEnd.setText(R.string.S1_Try);
                mMyFinalScore.setText(String.format("%d",myScore, "/ 40 points"));
                mQuizIndex = 5;
            } else if (mQuizIndex == 2) {
                    //Wrong Answer
                    VideoView view1 = (VideoView) findViewById(R.id.VideoView);
                    openRewardPage();
                    mEnd.setText(R.string.S1_End);
                    mMyFinalScore.setText(String.format("%d",myScore,  "/ 40 points"));
                    mQuizIndex = 5;
                } else if (mQuizIndex == 3) {
                    //Wrong Answer
                    VideoView view1 = (VideoView) findViewById(R.id.VideoView);
                    view1.setVisibility(View.GONE);
                    mFirstButton.setVisibility(View.GONE);
                    mSecondButton.setVisibility(View.GONE);
                    mThirdButton.setVisibility(View.GONE);
                    mFourthButton.setVisibility(View.GONE);
                    mQuestion.setVisibility(View.GONE);
                    mEnd.setText(R.string.S1_End);
                    mMyFinalScore.setText(String.format("%d",myScore,  "/ 40 points"));
                    mQuizIndex = 5;
                } else if (mQuizIndex == 4) {
                    //Wrong Answer
                    VideoView view1 = (VideoView) findViewById(R.id.VideoView);
                   openRewardPage();
                    mEnd.setText(R.string.S1_End);
                    mMyFinalScore.setText(String.format("%d",myScore,  "/ 40 points"));
                    mQuizIndex = 5;
                }
                }
        });

        //THIRD BUTTON
        mThirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mQuizIndex == 1) {
                    //Wrong Answer
                    VideoView view1 = (VideoView) findViewById(R.id.VideoView);
                   openRewardPage();
                    mEnd.setText(R.string.S1_End);
                    mMyFinalScore.setText(String.format("%d",myScore));
                    mQuizIndex = 5;
                    myScore = myScore + 0;
                } else if (mQuizIndex == 2) {
                    //Correct Answer
                    VideoView view1 = (VideoView) findViewById(R.id.VideoView);
                    String path = "android.resource://" + getPackageName() + "/" + R.raw.shooting_q3;
                    view1.setMediaController(mc);
                    view1.requestFocus();
                    view1.setVideoURI(Uri.parse(path));
                    view1.start();
                    mQuestion.setText(R.string.Q3);
                    mFirstButton.setText(R.string.Q3_A1);
                    mSecondButton.setText(R.string.Q3_A2);
                    mThirdButton.setText(R.string.Q3_A3);
                    mFourthButton.setText(R.string.Q3_A4);
                    Toast coinsAdded = Toast.makeText(getApplicationContext(),"Correct Answer! +10 points", Toast.LENGTH_LONG);
                    coinsAdded.show();
                    mQuizIndex = 3;
                    myScore = myScore + 10;
                } else if (mQuizIndex == 3) {
                    //Correct Answer
                    VideoView view1 = (VideoView) findViewById(R.id.VideoView);
                    String path = "android.resource://" + getPackageName() + "/" + R.raw.shooting_q4;
                    view1.setMediaController(mc);
                    view1.requestFocus();
                    view1.setVideoURI(Uri.parse(path));
                    view1.start();
                    mQuestion.setText(R.string.Q4);
                    mFirstButton.setText(R.string.Q4_A1);
                    mSecondButton.setText(R.string.Q4_A2);
                    mThirdButton.setText(R.string.Q4_A3);
                    mFourthButton.setText(R.string.Q4_A4);
                    Toast coinsAdded = Toast.makeText(getApplicationContext(),"Correct Answer! +10 coins", Toast.LENGTH_LONG);
                    coinsAdded.show();
                    mQuizIndex = 4;
                    myScore = myScore + 10;

                } else if (mQuizIndex == 4) {
                    //Wrong Answer
                    VideoView view1 = (VideoView) findViewById(R.id.VideoView);
                    openRewardPage();
                    myScore = myScore + 0;
                    mEnd.setText(R.string.S1_End);
                    mMyFinalScore.setText(String.format("%d",myScore));
                    mQuizIndex = 5;
                }


            }
        });

        //FOURTH BUTTON
        mFourthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mQuizIndex == 1) {
                    //Wrong Answer
                    VideoView view1 = (VideoView) findViewById(R.id.VideoView);
                    view1.setVisibility(View.GONE);
                    mFirstButton.setVisibility(View.GONE);
                    mSecondButton.setVisibility(View.GONE);
                    mThirdButton.setVisibility(View.GONE);
                    mFourthButton.setVisibility(View.GONE);
                    mQuestion.setVisibility(View.GONE);
                    mEnd.setText(R.string.S1_End );
                    mQuizIndex = 5;
                    myScore = myScore + 0;
                    mMyFinalScore.setText(String.format("%d",myScore));
                } else if (mQuizIndex == 2) {
                    //Wrong Answer
                    VideoView view1 = (VideoView) findViewById(R.id.VideoView);
                    view1.setVisibility(View.GONE);
                    mFirstButton.setVisibility(View.GONE);
                    mSecondButton.setVisibility(View.GONE);
                    mThirdButton.setVisibility(View.GONE);
                    mFourthButton.setVisibility(View.GONE);
                    mQuestion.setVisibility(View.GONE);
                    mEnd.setText(R.string.S1_End);
                    mQuizIndex = 5;
                    myScore = myScore + 0;
                    mMyFinalScore.setText(String.format("%d",myScore));
                } else if (mQuizIndex == 3) {
                    //Wrong Answer
                    VideoView view1 = (VideoView) findViewById(R.id.VideoView);
                    view1.setVisibility(View.GONE);
                    mFirstButton.setVisibility(View.GONE);
                    mSecondButton.setVisibility(View.GONE);
                    mThirdButton.setVisibility(View.GONE);
                    mFourthButton.setVisibility(View.GONE);
                    mQuestion.setVisibility(View.GONE);
                    mEnd.setText(R.string.S1_End);
                    mQuizIndex = 5;
                    myScore = myScore + 0;
                    mMyFinalScore.setText(String.format("%d",myScore));
                } else if (mQuizIndex == 4) {
                    //Wrong Answer
                    VideoView view1 = (VideoView) findViewById(R.id.VideoView);
                    view1.setVisibility(View.GONE);
                    mFirstButton.setVisibility(View.GONE);
                    mSecondButton.setVisibility(View.GONE);
                    mThirdButton.setVisibility(View.GONE);
                    mFourthButton.setVisibility(View.GONE);
                    mQuestion.setVisibility(View.GONE);
                    mEnd.setText(R.string.S1_End);
                    mQuizIndex = 5;
                    myScore = myScore + 0;
                    mMyFinalScore.setText(String.format("%d",myScore));
                }

            }
        });
    }

    public void openRewardPage() {
        Intent intent = new Intent(this, Reward.class);
        startActivity(intent);
    }


}