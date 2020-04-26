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




    String[] questions = new String[5];
    int[] correct_incorrect = new int[5];



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
//        questions [4] = "";
//        correct_incorrect [4]= R.drawable.check_mark;


        //FIRST BUTTON
        mFirstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mQuizIndex == 1) {
                    //Correct Answer
                    questions [0] = "1:" + mFirstButton.getText().toString();
                    correct_incorrect [0] = R.drawable.check_mark;
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
                    questions [1]= "2:" +  mFirstButton.getText().toString();
                    correct_incorrect [1]= R.drawable.red_mark;
                    openRewardPage(questions, myScore, correct_incorrect);
                }
                else if (mQuizIndex == 3) {
                    //Wrong Answer
                    questions [2]= "3: " + mFirstButton.getText().toString();
                    correct_incorrect [2]= R.drawable.red_mark;
                    mQuizIndex = 5;
                    openRewardPage(questions, myScore, correct_incorrect);
                }
                else if (mQuizIndex == 4) {
                    //Correct Answer
                    myScore = myScore + 10;
                    Toast coinsAdded = Toast.makeText(getApplicationContext(),"Correct Answer! +10 points", Toast.LENGTH_SHORT);
                    coinsAdded.show();
                    questions [3] = "4: " + mFirstButton.getText().toString();
                    correct_incorrect [3]= R.drawable.check_mark;
                    mQuizIndex = 5 ;
                    openRewardPage(questions, myScore, correct_incorrect);
                }
            }
        });

        //SECOND BUTTON
        mSecondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mQuizIndex == 1) {
                    //Wrong Answer
                    questions [0]= "1. " + mSecondButton.getText().toString();
                    correct_incorrect [0]= R.drawable.red_mark;
                    mQuizIndex = 5;
                    openRewardPage(questions, myScore, correct_incorrect);
                }
                else if (mQuizIndex == 2) {
                    //Wrong Answer
                    questions [1]= "2. " + mSecondButton.getText().toString();
                    correct_incorrect [1]= R.drawable.red_mark;
                    mQuizIndex = 5;
                    openRewardPage(questions, myScore, correct_incorrect);
                }
                else if (mQuizIndex == 3) {
                    //Wrong Answer
                    questions [2]= "3. " + mSecondButton.getText().toString();
                    correct_incorrect [2]= R.drawable.red_mark;
                    mQuizIndex = 5;
                    openRewardPage(questions, myScore, correct_incorrect);
                }
                else if (mQuizIndex == 4) {
                    //Wrong Answer
                    questions [3] = "4. " + mSecondButton.getText().toString();
                    correct_incorrect [3]=R.drawable.red_mark;
                    mQuizIndex = 5;
                    openRewardPage(questions, myScore, correct_incorrect);
                }
            }
        });

        //THIRD BUTTON
        mThirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mQuizIndex == 1) {
                    //Wrong Answer
                    questions [0]= "1. " +mThirdButton.getText().toString();
                    correct_incorrect [0]= R.drawable.red_mark;
                    openRewardPage(questions, myScore, correct_incorrect);
                    mQuizIndex = 5;
                }
                else if (mQuizIndex == 2) {
                    //Correct Answer
                    questions [1]= "2. " + mThirdButton.getText().toString();
                    correct_incorrect [1]= R.drawable.check_mark;

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
                    questions [2]= "3. " + mThirdButton.getText().toString();
                    correct_incorrect [2]= R.drawable.check_mark;
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
                    questions [3]= "4. " + mThirdButton.getText().toString();
                    correct_incorrect [3]= R.drawable.red_mark;
                    openRewardPage(questions, myScore, correct_incorrect);
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
                    questions [0]= "1. " + mFourthButton.getText().toString();
                    correct_incorrect [0]= R.drawable.red_mark;
                    mQuizIndex = 5;
                    openRewardPage(questions, myScore, correct_incorrect);
                }
                else if (mQuizIndex == 2) {
                    //Wrong Answer
                    questions [1]= "2. " + mFourthButton.getText().toString();
                    correct_incorrect [1]= R.drawable.red_mark;
                   mQuizIndex = 5;
                    openRewardPage(questions, myScore, correct_incorrect);
                }
                else if (mQuizIndex == 3) {
                    //Wrong Answer
                    questions [2]= "3. " + mFourthButton.getText().toString();
                    correct_incorrect [2]= R.drawable.red_mark;
                    mQuizIndex = 5;
                    openRewardPage(questions, myScore, correct_incorrect);
                }
                else if (mQuizIndex == 4) {
                    //Wrong Answer
                    questions [3]= "4. " + mFourthButton.getText().toString();
                    correct_incorrect [3]= R.drawable.red_mark;
                    mQuizIndex = 5;
                    openRewardPage(questions, myScore, correct_incorrect);
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

    public void openRewardPage(String[] myQuestion, int myScore, int[] myAccuracy) {

        Intent intent = Reward.makeIntent(StreetDisastersShooting.this, myQuestion, myScore,"StreetDisastersShooting", myAccuracy );
        startActivity(intent);
    }


}