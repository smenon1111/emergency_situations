package com.example.tech2020;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;


public class Earthquake extends AppCompatActivity {
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
        setContentView(R.layout.earthquake);
        VideoView view1 = (VideoView)findViewById(R.id.VideoView);
        String path = "android.resource://" + getPackageName() + "/" + R.raw.earthquake_q1;
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
                    //Wrong Answer
                    closeAllItems();
                    mEnd.setText(R.string.S1_Try);
                    mMyFinalScore.setText(String.format("%d",myScore,  "/ 40 points"));
                    mQuizIndex = 6;

                } else if (mQuizIndex == 2) {
                    //Correct Answer
                    VideoView view1 = (VideoView) findViewById(R.id.VideoView);
                    String path = "android.resource://" + getPackageName() + "/" + R.raw.earthquake_q3;
                    view1.setMediaController(mc);
                    view1.requestFocus();
                    view1.setVideoURI(Uri.parse(path));
                    view1.start();
                    mQuestion.setText(R.string.Q3Earthquake);
                    mFirstButton.setText(R.string.Q3_A1Earthquake);
                    mSecondButton.setText(R.string.Q3_A2Earthquake);
                    mThirdButton.setText(R.string.Q3_A3Earthquake);
                    mFourthButton.setText(R.string.Q3_A4Earthquake);
                    Toast coinsAdded = Toast.makeText(getApplicationContext(),"Correct Answer! +10 points", Toast.LENGTH_LONG);
                    coinsAdded.show();
                    mQuizIndex = 3;
                    myScore = myScore + 10;
                } else if (mQuizIndex == 3) {
                    //Correct Answer
                    VideoView view1 = (VideoView) findViewById(R.id.VideoView);
                    String path = "android.resource://" + getPackageName() + "/" + R.raw.earthquake_q4;
                    view1.setMediaController(mc);
                    view1.requestFocus();
                    view1.setVideoURI(Uri.parse(path));
                    view1.start();
                    mQuestion.setText(R.string.Q4Earthquake);
                    mFirstButton.setText(R.string.Q4_A1Earthquake);
                    mSecondButton.setText(R.string.Q4_A2Earthquake);
                    mThirdButton.setText(R.string.Q4_A3Earthquake);
                    mFourthButton.setText(R.string.Q4_A4Earthquake);
                    Toast coinsAdded = Toast.makeText(getApplicationContext(),"Correct Answer! +10 points", Toast.LENGTH_LONG);
                    coinsAdded.show();
                    mQuizIndex = 4;
                    myScore = myScore + 10;
                } else if (mQuizIndex == 4) {
                    //Wrong Answer
                    closeAllItems();
                    mEnd.setText(R.string.S1_End);
                    mMyFinalScore.setText(String.format("%d",myScore,  "/ 40 points"));
                    mQuizIndex = 6;
                } else if (mQuizIndex == 5){
                    //Wrong Answer
                    closeAllItems();
                    mEnd.setText(R.string.S1_End);
                    mMyFinalScore.setText(String.format("%d",myScore,  "/ 40 points"));
                    mQuizIndex = 6;


                }

            }
        });

        //SECOND BUTTON
        mSecondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mQuizIndex == 1) {
                //Wrong Answer
                    closeAllItems();
                    mEnd.setText(R.string.S1_End);
                    mMyFinalScore.setText(String.format("%d",myScore,  "/ 40 points"));
                    mQuizIndex = 6;
            } else if (mQuizIndex == 2) {
                    //Wrong Answer
                    closeAllItems();
                    mEnd.setText(R.string.S1_End);
                    mMyFinalScore.setText(String.format("%d",myScore,  "/ 40 points"));
                    mQuizIndex = 6;
                } else if (mQuizIndex == 3) {
                    //Wrong Answer
                    closeAllItems();
                    mEnd.setText(R.string.S1_End);
                    mMyFinalScore.setText(String.format("%d",myScore,  "/ 40 points"));
                    mQuizIndex = 6;
                } else if (mQuizIndex == 4) {
                    //Wrong Answer
                    closeAllItems();
                    mEnd.setText(R.string.S1_End);
                    mMyFinalScore.setText(String.format("%d",myScore,  "/ 40 points"));
                    mQuizIndex = 6;
                }else if (mQuizIndex == 5){
                    //Wrong Answer
                    closeAllItems();
                    mEnd.setText(R.string.S1_End);
                    mMyFinalScore.setText(String.format("%d",myScore,  "/ 40 points"));
                    mQuizIndex = 6;


                }
                }
        });

        //THIRD BUTTON
        mThirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mQuizIndex == 1) {
                    //Correct Answer
                    VideoView view1 = (VideoView) findViewById(R.id.VideoView);
                    String path = "android.resource://" + getPackageName() + "/" + R.raw.earthquake_q2;
                    view1.setMediaController(mc);
                    view1.requestFocus();
                    view1.setVideoURI(Uri.parse(path));
                    view1.start();
                    mQuestion.setText(R.string.Q2Earthquake);
                    mFirstButton.setText(R.string.Q2_A1Earthquake);
                    mSecondButton.setText(R.string.Q2_A2Earthquake);
                    mThirdButton.setText(R.string.Q2_A3Earthquake);
                    mFourthButton.setText(R.string.Q2_A4Earthquake);
                    Toast coinsAdded = Toast.makeText(getApplicationContext(),"Correct Answer! +10 points", Toast.LENGTH_LONG);
                    coinsAdded.show();
                    mQuizIndex = 2;
                    myScore = myScore + 10;
                } else if (mQuizIndex == 2) {
                    //Wrong Answer
                    closeAllItems();
                    mEnd.setText(R.string.S1_End);
                    mMyFinalScore.setText(String.format("%d",myScore,  "/ 40 points"));
                    mQuizIndex = 6;
                } else if (mQuizIndex == 3) {
                    //Wrong Answer
                    closeAllItems();
                    mEnd.setText(R.string.S1_End);
                    mMyFinalScore.setText(String.format("%d",myScore,  "/ 40 points"));
                    mQuizIndex = 6;

                } else if (mQuizIndex == 4) {
                    //Wrong Answer
                    closeAllItems();
                    mEnd.setText(R.string.S1_End);
                    mMyFinalScore.setText(String.format("%d",myScore,  "/ 40 points"));
                    mQuizIndex = 6;
                }else if (mQuizIndex == 5){
                    //Correct Answer
                    closeAllItems();
                    myScore = myScore + 10;
                    mEnd.setText(R.string.S1_Congrats);
                    mMyFinalScore.setText(String.format("%d",myScore,  "/ 40 points"));
                    mQuizIndex = 6;
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
                    closeAllItems();
                    mEnd.setText(R.string.S1_Try );
                    mQuizIndex = 6;
                    mMyFinalScore.setText(String.format("%d",myScore));
                } else if (mQuizIndex == 2) {
                    //Wrong Answer
                    closeAllItems();
                    mEnd.setText(R.string.S1_End);
                    mQuizIndex = 6;
                    mMyFinalScore.setText(String.format("%d",myScore));
                } else if (mQuizIndex == 3) {
                    //Wrong Answer
                    closeAllItems();
                    mEnd.setText(R.string.S1_End);
                    mQuizIndex = 6;
                    mMyFinalScore.setText(String.format("%d",myScore));
                } else if (mQuizIndex == 4) {
                    //Correct Answer
                    VideoView view1 = (VideoView) findViewById(R.id.VideoView);
                    String path = "android.resource://" + getPackageName() + "/" + R.raw.earthquake_q5;
                    view1.setMediaController(mc);
                    view1.requestFocus();
                    view1.setVideoURI(Uri.parse(path));
                    view1.start();
                    mQuestion.setText(R.string.Q5Earthquake);
                    mFirstButton.setText(R.string.Q5_A1Earthquake);
                    mSecondButton.setText(R.string.Q5_A2Earthquake);
                    mThirdButton.setText(R.string.Q5_A3Earthquake);
                    mFourthButton.setText(R.string.Q5_A4Earthquake);
                    Toast coinsAdded = Toast.makeText(getApplicationContext(),"Correct Answer! +10 points", Toast.LENGTH_LONG);
                    coinsAdded.show();
                    mQuizIndex = 5;
                    myScore = myScore + 10;
                }else if (mQuizIndex == 5){
                    //Wrong Answer
                    closeAllItems();
                    mEnd.setText(R.string.S1_End);
                    mMyFinalScore.setText(String.format("%d",myScore,  "/ 40 points"));
                    mQuizIndex = 6;


                }

            }
        });





    }

    public void openRewardPage() {
        Intent intent = new Intent(this, Reward.class);
        startActivity(intent);
    }
    public void closeAllItems(){
        VideoView view1 = (VideoView) findViewById(R.id.VideoView);
        view1.setVisibility(View.GONE);
        mFirstButton.setVisibility(View.GONE);
        mSecondButton.setVisibility(View.GONE);
        mThirdButton.setVisibility(View.GONE);
        mFourthButton.setVisibility(View.GONE);
        mQuestion.setVisibility(View.GONE);
        mEnd.setText(R.string.S1_End);
    }

}