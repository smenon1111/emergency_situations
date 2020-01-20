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
import android.widget.VideoView;


public class StreetDisastersShooting extends AppCompatActivity {
    private MediaController mc;
    private TextView mQuestion;
    private Button mFirstButton;
    private Button mSecondButton;
    private Button mThirdButton;
    private Button mFourthButton;
    private int mQuizIndex = 1;
    private TextView mEnd;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.streetdisasters_shooting);
        VideoView view1 = (VideoView)findViewById(R.id.VideoView);
        String path = "android.resource://" + getPackageName() + "/" + R.raw.demoptone;
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

        //FIRST BUTTON
        mFirstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mQuizIndex == 1) {
                    VideoView view1 = (VideoView) findViewById(R.id.VideoView);
                    String path = "android.resource://" + getPackageName() + "/" + R.raw.demopttwo;
                    view1.setMediaController(mc);
                    view1.requestFocus();
                    view1.setVideoURI(Uri.parse(path));
                    view1.start();
                    mQuestion.setText(R.string.Q2);
                    mFirstButton.setText(R.string.Q2_A1);
                    mSecondButton.setText(R.string.Q2_A2);
                    mThirdButton.setText(R.string.Q2_A3);
                    mFourthButton.setText(R.string.Q2_A4);
                    mQuizIndex = 2;
                } else if (mQuizIndex == 2) {
                    VideoView view1 = (VideoView) findViewById(R.id.VideoView);
                    view1.setVisibility(View.GONE);
                    mFirstButton.setVisibility(View.GONE);
                    mSecondButton.setVisibility(View.GONE);
                    mThirdButton.setVisibility(View.GONE);
                    mFourthButton.setVisibility(View.GONE);
                    mQuestion.setVisibility(View.GONE);
                    mEnd.setText(R.string.S1_End);
                    mQuizIndex = 5;
                } else if (mQuizIndex == 3) {
                    VideoView view1 = (VideoView) findViewById(R.id.VideoView);
                    view1.setVisibility(View.GONE);
                    mFirstButton.setVisibility(View.GONE);
                    mSecondButton.setVisibility(View.GONE);
                    mThirdButton.setVisibility(View.GONE);
                    mFourthButton.setVisibility(View.GONE);
                    mQuestion.setVisibility(View.GONE);
                    mEnd.setText(R.string.S1_End);
                    mQuizIndex = 5;
                } else if (mQuizIndex == 4) {
                    VideoView view1 = (VideoView) findViewById(R.id.VideoView);
                    view1.setVisibility(View.GONE);
                    mFirstButton.setVisibility(View.GONE);
                    mSecondButton.setVisibility(View.GONE);
                    mThirdButton.setVisibility(View.GONE);
                    mFourthButton.setVisibility(View.GONE);
                    mQuestion.setVisibility(View.GONE);
                    mEnd.setText(R.string.S1_Congrats);
                }
            }
        });

        //SECOND BUTTON
        mSecondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mQuizIndex == 1) {
                VideoView view1 = (VideoView) findViewById(R.id.VideoView);
                view1.setVisibility(View.GONE);
                mFirstButton.setVisibility(View.GONE);
                mSecondButton.setVisibility(View.GONE);
                mThirdButton.setVisibility(View.GONE);
                mFourthButton.setVisibility(View.GONE);
                mQuestion.setVisibility(View.GONE);
                mEnd.setText(R.string.S1_End);
                mQuizIndex = 5;
            } else if (mQuizIndex == 2) {
                    VideoView view1 = (VideoView) findViewById(R.id.VideoView);
                    view1.setVisibility(View.GONE);
                    mFirstButton.setVisibility(View.GONE);
                    mSecondButton.setVisibility(View.GONE);
                    mThirdButton.setVisibility(View.GONE);
                    mFourthButton.setVisibility(View.GONE);
                    mQuestion.setVisibility(View.GONE);
                    mEnd.setText(R.string.S1_End);
                    mQuizIndex = 5;
                } else if (mQuizIndex == 3) {
                    VideoView view1 = (VideoView) findViewById(R.id.VideoView);
                    view1.setVisibility(View.GONE);
                    mFirstButton.setVisibility(View.GONE);
                    mSecondButton.setVisibility(View.GONE);
                    mThirdButton.setVisibility(View.GONE);
                    mFourthButton.setVisibility(View.GONE);
                    mQuestion.setVisibility(View.GONE);
                    mEnd.setText(R.string.S1_End);
                    mQuizIndex = 5;
                } else if (mQuizIndex == 4) {
                    VideoView view1 = (VideoView) findViewById(R.id.VideoView);
                    view1.setVisibility(View.GONE);
                    mFirstButton.setVisibility(View.GONE);
                    mSecondButton.setVisibility(View.GONE);
                    mThirdButton.setVisibility(View.GONE);
                    mFourthButton.setVisibility(View.GONE);
                    mQuestion.setVisibility(View.GONE);
                    mEnd.setText(R.string.S1_End);
                    mQuizIndex = 5;
                }
                }
        });

        //THIRD BUTTON
        mThirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mQuizIndex == 1) {
                    VideoView view1 = (VideoView) findViewById(R.id.VideoView);
                    view1.setVisibility(View.GONE);
                    mFirstButton.setVisibility(View.GONE);
                    mSecondButton.setVisibility(View.GONE);
                    mThirdButton.setVisibility(View.GONE);
                    mFourthButton.setVisibility(View.GONE);
                    mQuestion.setVisibility(View.GONE);
                    mEnd.setText(R.string.S1_End);
                    mQuizIndex = 5;
                } else if (mQuizIndex == 2) {
                    VideoView view1 = (VideoView) findViewById(R.id.VideoView);
                    String path = "android.resource://" + getPackageName() + "/" + R.raw.demoptthree;
                    view1.setMediaController(mc);
                    view1.requestFocus();
                    view1.setVideoURI(Uri.parse(path));
                    view1.start();
                    mQuestion.setText(R.string.Q3);
                    mFirstButton.setText(R.string.Q3_A1);
                    mSecondButton.setText(R.string.Q3_A2);
                    mThirdButton.setText(R.string.Q3_A3);
                    mFourthButton.setText(R.string.Q3_A4);
                    mQuizIndex = 3;
                } else if (mQuizIndex == 3) {
                    VideoView view1 = (VideoView) findViewById(R.id.VideoView);
                    String path = "android.resource://" + getPackageName() + "/" + R.raw.demoptfour;
                    view1.setMediaController(mc);
                    view1.requestFocus();
                    view1.setVideoURI(Uri.parse(path));
                    view1.start();
                    mQuestion.setText(R.string.Q4);
                    mFirstButton.setText(R.string.Q4_A1);
                    mSecondButton.setText(R.string.Q4_A2);
                    mThirdButton.setText(R.string.Q4_A3);
                    mFourthButton.setText(R.string.Q4_A4);
                    mQuizIndex = 4;
                } else if (mQuizIndex == 4) {
                    VideoView view1 = (VideoView) findViewById(R.id.VideoView);
                    view1.setVisibility(View.GONE);
                    mFirstButton.setVisibility(View.GONE);
                    mSecondButton.setVisibility(View.GONE);
                    mThirdButton.setVisibility(View.GONE);
                    mFourthButton.setVisibility(View.GONE);
                    mQuestion.setVisibility(View.GONE);
                    mEnd.setText(R.string.S1_End);
                    mQuizIndex = 5;
                }


            }
        });

        //FOURTH BUTTON
        mFourthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mQuizIndex == 1) {
                    VideoView view1 = (VideoView) findViewById(R.id.VideoView);
                    view1.setVisibility(View.GONE);
                    mFirstButton.setVisibility(View.GONE);
                    mSecondButton.setVisibility(View.GONE);
                    mThirdButton.setVisibility(View.GONE);
                    mFourthButton.setVisibility(View.GONE);
                    mQuestion.setVisibility(View.GONE);
                    mEnd.setText(R.string.S1_End);
                    mQuizIndex = 5;
                } else if (mQuizIndex == 2) {
                    VideoView view1 = (VideoView) findViewById(R.id.VideoView);
                    view1.setVisibility(View.GONE);
                    mFirstButton.setVisibility(View.GONE);
                    mSecondButton.setVisibility(View.GONE);
                    mThirdButton.setVisibility(View.GONE);
                    mFourthButton.setVisibility(View.GONE);
                    mQuestion.setVisibility(View.GONE);
                    mEnd.setText(R.string.S1_End);
                    mQuizIndex = 5;
                } else if (mQuizIndex == 3) {
                    VideoView view1 = (VideoView) findViewById(R.id.VideoView);
                    view1.setVisibility(View.GONE);
                    mFirstButton.setVisibility(View.GONE);
                    mSecondButton.setVisibility(View.GONE);
                    mThirdButton.setVisibility(View.GONE);
                    mFourthButton.setVisibility(View.GONE);
                    mQuestion.setVisibility(View.GONE);
                    mEnd.setText(R.string.S1_End);
                    mQuizIndex = 5;
                } else if (mQuizIndex == 4) {
                    VideoView view1 = (VideoView) findViewById(R.id.VideoView);
                    view1.setVisibility(View.GONE);
                    mFirstButton.setVisibility(View.GONE);
                    mSecondButton.setVisibility(View.GONE);
                    mThirdButton.setVisibility(View.GONE);
                    mFourthButton.setVisibility(View.GONE);
                    mQuestion.setVisibility(View.GONE);
                    mEnd.setText(R.string.S1_End);
                    mQuizIndex = 5;
                }

            }
        });





    }


}