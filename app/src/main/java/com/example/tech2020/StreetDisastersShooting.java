package com.example.tech2020;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class StreetDisastersShooting extends AppCompatActivity {
    private MediaController mc;
    private TextView mQuestion;
    private Button mFirstButton;
    private Button mSecondButton;
    private Button mThirdButton;
    private Button mFourthButton;
    private int mQuizIndex = 1;
    public int myScore = 0;

    String[][] results = new String[5][3];


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.streetdisasters_shooting);

        ShowVideo("android.resource://" + getPackageName() + "/" + R.raw.shooting_q1);

        mQuestion = (TextView) findViewById(R.id.question);
        mFirstButton = (Button) findViewById(R.id.firstbutton);
        mSecondButton = (Button) findViewById(R.id.secondbutton);
        mThirdButton = (Button) findViewById(R.id.thirdbutton);
        mFourthButton = (Button) findViewById(R.id.fourthbutton);



        //FIRST BUTTON
        mFirstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mQuizIndex == 1) {
                    //Correct Answer
                    results [0][0]= "1: " + mQuestion.getText().toString();
                    results [0][1]= mFirstButton.getText().toString();
                    results [0][2]= "Correct";
                    ShowVideo("android.resource://" + getPackageName() + "/" + R.raw.shooting_q2);
                    mQuestion.setText(R.string.Q2);
                    mFirstButton.setText(R.string.Q2_A1);
                    mSecondButton.setText(R.string.Q2_A2);
                    mThirdButton.setText(R.string.Q2_A3);
                    mFourthButton.setText(R.string.Q2_A4);
                    Toast coinsAdded = Toast.makeText(getApplicationContext(),"Correct Answer! +10 points", Toast.LENGTH_SHORT);
                    coinsAdded.show();
                    mQuizIndex = 2;
                    myScore = myScore + 10;

                }
                else if (mQuizIndex == 2) {
                    //Wrong Answer
                    mQuizIndex = 5;
                    results [1][0]= "2: " + mQuestion.getText().toString();
                    results [1][1]= mFirstButton.getText().toString();
                    results [1][2]= "Incorrect";
                    openRewardPage(results, myScore);
                }
                else if (mQuizIndex == 3) {
                    //Wrong Answer
                    results [2][0]= "3: " + mQuestion.getText().toString();
                    results [2][1]= mFirstButton.getText().toString();
                    results [2][2]= "Incorrect";
                    mQuizIndex = 5;
                    openRewardPage(results, myScore);
                }
                else if (mQuizIndex == 4) {
                    //Correct Answer
                    myScore = myScore + 10;
                    Toast coinsAdded = Toast.makeText(getApplicationContext(),"Correct Answer! +10 points", Toast.LENGTH_SHORT);
                    coinsAdded.show();
                    results [3][0]= "4: " + mQuestion.getText().toString();
                    results [3][1]= mFirstButton.getText().toString();
                    results [3][2]= "Correct";
                    mQuizIndex = 5 ;
                    openRewardPage(results, myScore);
                }
            }
        });

        //SECOND BUTTON
        mSecondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mQuizIndex == 1) {
                    //Wrong Answer
                    results [0][0]= "1: " + mQuestion.getText().toString();
                    results [0][1]= mSecondButton.getText().toString();
                    results [0][2]= "Incorrect";
                    mQuizIndex = 5;
                    openRewardPage(results, myScore);
                }
                else if (mQuizIndex == 2) {
                    //Wrong Answer
                    results [1][0]= "2: " + mQuestion.getText().toString();
                    results [1][1]= mSecondButton.getText().toString();
                    results [1][2]= "Incorrect";
                    mQuizIndex = 5;
                    openRewardPage(results, myScore);
                }
                else if (mQuizIndex == 3) {
                    //Wrong Answer
                    results [2][0]= "3: " + mQuestion.getText().toString();
                    results [2][1]= mSecondButton.getText().toString();
                    results [2][2]= "Incorrect";
                    mQuizIndex = 5;
                    openRewardPage(results, myScore);
                }
                else if (mQuizIndex == 4) {
                    //Wrong Answer
                    results [3][0]= "4: " + mQuestion.getText().toString();
                    results [3][1]= mSecondButton.getText().toString();
                    results [3][2]= "Incorrect";
                    mQuizIndex = 5;
                    openRewardPage(results, myScore);
                }
            }
        });

        //THIRD BUTTON
        mThirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mQuizIndex == 1) {
                    //Wrong Answer
                    results [0][0]= "1: " + mQuestion.getText().toString();
                    results [0][1]= mThirdButton.getText().toString();
                    results [0][2]= "Incorrect";
                    openRewardPage(results, myScore);
                    mQuizIndex = 5;
                }
                else if (mQuizIndex == 2) {
                    //Correct Answer
                    results [1][0]= "2: " + mQuestion.getText().toString();
                    results [1][1]= mThirdButton.getText().toString();
                    results [1][2]= "Correct";

                    VideoView view1 = (VideoView) findViewById(R.id.VideoView);
                    ShowVideo("android.resource://" + getPackageName() + "/" + R.raw.shooting_q3);
                    mQuestion.setText(R.string.Q3);
                    mFirstButton.setText(R.string.Q3_A1);
                    mSecondButton.setText(R.string.Q3_A2);
                    mThirdButton.setText(R.string.Q3_A3);
                    mFourthButton.setText(R.string.Q3_A4);
                    Toast coinsAdded = Toast.makeText(getApplicationContext(),"Correct Answer! +10 points", Toast.LENGTH_SHORT);
                    coinsAdded.show();
                    mQuizIndex = 3;
                    myScore = myScore + 10;
                }
                else if (mQuizIndex == 3) {
                    //Correct Answer
                    results [2][0]= "3: " + mQuestion.getText().toString();
                    results [2][1]= mThirdButton.getText().toString();
                    results [2][2]= "Correct";
                    ShowVideo("android.resource://" + getPackageName() + "/" + R.raw.shooting_q4);
                    mQuestion.setText(R.string.Q4);
                    mFirstButton.setText(R.string.Q4_A1);
                    mSecondButton.setText(R.string.Q4_A2);
                    mThirdButton.setText(R.string.Q4_A3);
                    mFourthButton.setText(R.string.Q4_A4);
                    Toast coinsAdded = Toast.makeText(getApplicationContext(),"Correct Answer! +10 coins", Toast.LENGTH_SHORT);
                    coinsAdded.show();
                    mQuizIndex = 4;
                    myScore = myScore + 10;
                }
                else if (mQuizIndex == 4) {
                    //Wrong Answer
                    VideoView view1 = (VideoView) findViewById(R.id.VideoView);
                    results [3][0]= "4: " + mQuestion.getText().toString();
                    results [3][1]= mThirdButton.getText().toString();
                    results [3][2]= "Incorrect";
                    openRewardPage(results, myScore);
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
                    results [0][0]= "1: " + mQuestion.getText().toString();
                    results [0][1]= mFourthButton.getText().toString();
                    results [0][2]= "Incorrect";
                    mQuizIndex = 5;
                    openRewardPage(results, myScore);
                }
                else if (mQuizIndex == 2) {
                    //Wrong Answer
                    results [1][0]= "2: " + mQuestion.getText().toString();
                    results [1][1]= mFourthButton.getText().toString();
                    results [1][2]= "Incorrect";
                   mQuizIndex = 5;
                    openRewardPage(results, myScore);
                }
                else if (mQuizIndex == 3) {
                    //Wrong Answer
                    results [2][0]= "3: " + mQuestion.getText().toString();
                    results [2][1]= mFourthButton.getText().toString();
                    results [2][2]= "Incorrect";
                    mQuizIndex = 5;
                    openRewardPage(results, myScore);
                }
                else if (mQuizIndex == 4) {
                    //Wrong Answer
                    results [3][0]= "4: " + mQuestion.getText().toString();
                    results [3][1]= mFourthButton.getText().toString();
                    results [3][2]= "Incorrect";
                    mQuizIndex = 5;
                    openRewardPage(results, myScore);
                }

            }
        });
    }

    public void ShowVideo (String path){

        VideoView view1 = (VideoView) findViewById(R.id.VideoView);
        view1.setMediaController(mc);
        view1.requestFocus();
        view1.setVideoURI(Uri.parse(path));
        view1.start();
    }

    public void openRewardPage(String[][] resultsReward, int myScore) {

        Intent intent = Reward.makeIntent(StreetDisastersShooting.this, resultsReward, myScore,"StreetDisastersShooting");
        startActivity(intent);
    }


}