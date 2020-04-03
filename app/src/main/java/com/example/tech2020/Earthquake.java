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

public class Earthquake extends AppCompatActivity {
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
        setContentView(R.layout.earthquake);

        ShowVideo("android.resource://" + getPackageName() + "/" + R.raw.earthquake_q1);

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
                    //Wrong Answer
                    mQuizIndex = 6;
                    results [0][0]= "1: " + mQuestion.getText().toString();
                    results [0][1]= mFirstButton.getText().toString();
                    results [0][2]= "Incorrect";
                    openRewardPage(results, myScore);


                } else if (mQuizIndex == 2) {
                    //Correct Answer
                    results [1][0]= "2: " + mQuestion.getText().toString();
                    results [1][1]= mFirstButton.getText().toString();
                    results [1][2]= "Correct";
                    ShowVideo("android.resource://" + getPackageName() + "/" + R.raw.earthquake_q3);
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
                    results [2][0]= "3: " + mQuestion.getText().toString();
                    results [2][1]= mFirstButton.getText().toString();
                    results [2][2]= "Correct";
                    ShowVideo("android.resource://" + getPackageName() + "/" + R.raw.earthquake_q4);
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
                    mQuizIndex = 6;
                    results [3][0]= "4: " + mQuestion.getText().toString();
                    results [3][1]= mFirstButton.getText().toString();
                    results [3][2]= "Incorrect";
                    openRewardPage(results, myScore);
                } else if (mQuizIndex == 5){
                    //Wrong Answer
                    mQuizIndex = 6;
                    results [4][0]= "5: " + mQuestion.getText().toString();
                    results [4][1]= mFirstButton.getText().toString();
                    results [4][2]= "Incorrect";
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
                    mQuizIndex = 6;
                    results [0][0]= "1: " + mQuestion.getText().toString();
                    results [0][1]= mSecondButton.getText().toString();
                    results [0][2]= "Incorrect";
                    openRewardPage(results, myScore);
                } else if (mQuizIndex == 2) {
                    //Wrong Answer
                    mQuizIndex = 6;
                    results [1][0]= "2: " + mQuestion.getText().toString();
                    results [1][1]= mSecondButton.getText().toString();
                    results [1][2]= "Incorrect";
                    openRewardPage(results, myScore);

                } else if (mQuizIndex == 3) {
                    //Wrong Answer
                    mQuizIndex = 6;
                    results [2][0]= "3: " + mQuestion.getText().toString();
                    results [2][1]= mSecondButton.getText().toString();
                    results [2][2]= "Incorrect";
                    openRewardPage(results, myScore);
                } else if (mQuizIndex == 4) {
                    //Wrong Answer
                    mQuizIndex = 6;
                    results [3][0]= "4: " + mQuestion.getText().toString();
                    results [3][1]= mSecondButton.getText().toString();
                    results [3][2]= "Incorrect";
                    openRewardPage(results, myScore);
                }else if (mQuizIndex == 5){
                    //Wrong Answer
                    mQuizIndex = 6;
                    results [4][0]= "5: " + mQuestion.getText().toString();
                    results [4][1]= mSecondButton.getText().toString();
                    results [4][2]= "Incorrect";
                    openRewardPage(results, myScore);


                }
            }
        });

        //THIRD BUTTON
        mThirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mQuizIndex == 1) {
                    //Correct Answer
                    results [0][0]= "1: " + mQuestion.getText().toString();
                    results [0][1]= mThirdButton.getText().toString();
                    results [0][2]= "Correct";
                    ShowVideo("android.resource://" + getPackageName() + "/" + R.raw.earthquake_q2);
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
                    results [1][0]= "2: " + mQuestion.getText().toString();
                    results [1][1]= mThirdButton.getText().toString();
                    results [1][2]= "Incorrect";
                    openRewardPage(results, myScore);
                } else if (mQuizIndex == 3) {
                    //Wrong Answer
                    results [2][0]= "3: " + mQuestion.getText().toString();
                    results [2][1]= mThirdButton.getText().toString();
                    results [2][2]= "Incorrect";
                    openRewardPage(results, myScore);

                } else if (mQuizIndex == 4) {
                    //Wrong Answer
                    mQuizIndex = 6;
                    results [3][0]= "4: " + mQuestion.getText().toString();
                    results [3][1]= mThirdButton.getText().toString();
                    results [3][2]= "Incorrect";
                    openRewardPage(results, myScore);
                }else if (mQuizIndex == 5){
                    //Correct Answer
                    mQuizIndex = 6;
                    results [4][0]= "5: " + mQuestion.getText().toString();
                    results [4][1]= mThirdButton.getText().toString();
                    results [4][2]= "Correct";
                    myScore = myScore + 10;
                    openRewardPage(results,myScore);
                }


            }
        });

        //FOURTH BUTTON
        mFourthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mQuizIndex == 1) {
                    //Wrong Answer
                    mQuizIndex = 6;
                    results [0][0]= "1: " + mQuestion.getText().toString();
                    results [0][1]= mFourthButton.getText().toString();
                    results [0][2]= "Incorrect";
                    openRewardPage(results, myScore);
                } else if (mQuizIndex == 2) {
                    //Wrong Answer
                    mQuizIndex = 6;
                    results [1][0]= "2: " + mQuestion.getText().toString();
                    results [1][1]= mFourthButton.getText().toString();
                    results [1][2]= "Incorrect";
                    openRewardPage(results, myScore);
                } else if (mQuizIndex == 3) {
                    //Wrong Answer
                    mQuizIndex = 6;
                    results [2][0]= "3: " + mQuestion.getText().toString();
                    results [2][1]= mFourthButton.getText().toString();
                    results [2][2]= "Incorrect";
                    openRewardPage(results, myScore);
                } else if (mQuizIndex == 4) {
                    //Correct Answer
                    results [3][0]= "4: " + mQuestion.getText().toString();
                    results [3][1]= mFourthButton.getText().toString();
                    results [3][2]= "Correct";
                    ShowVideo("android.resource://" + getPackageName() + "/" + R.raw.earthquake_q5);
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
                    mQuizIndex = 6;
                    results [4][0]= "5: " + mQuestion.getText().toString();
                    results [4][1]= mFourthButton.getText().toString();
                    results [4][2]= "Incorrect";


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

        Intent intent = Reward.makeIntent(Earthquake.this, resultsReward, myScore, "Earthquake");
        startActivity(intent);
    }
}