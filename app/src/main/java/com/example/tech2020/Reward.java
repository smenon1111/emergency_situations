package com.example.tech2020;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Reward extends AppCompatActivity {
    //final TextView mMyFinalScore = findViewById(R.id.mMyFinalScore);
    static Context mainActivityContext;
    static String[][] myAnswerArray;
    static int myScore;
    static String myPageNameReward;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reward);
        TextView Question1 = (TextView) findViewById(R.id.Question1);
        TextView Question2 = (TextView) findViewById(R.id.Question2);
        TextView Question3 = (TextView) findViewById(R.id.Question3);
        TextView Question4 = (TextView) findViewById(R.id.Question4);

        TextView Answer1 = (TextView) findViewById(R.id.Answer1);
        TextView Answer2 = (TextView) findViewById(R.id.Answer2);
        TextView Answer3 = (TextView) findViewById(R.id.Answer3);
        TextView Answer4 = (TextView) findViewById(R.id.Answer4);

        TextView Correct_Incorrect1 = (TextView) findViewById(R.id.Result2);
        TextView Correct_Incorrect2 = (TextView) findViewById(R.id.Result3);
        TextView Correct_Incorrect3 = (TextView) findViewById(R.id.Result4);
        TextView Correct_Incorrect4 = (TextView) findViewById(R.id.Result5);

        TextView GoodJob = (TextView) findViewById(R.id.titleGood);
        TextView BadJob = (TextView) findViewById(R.id.titleBad);
        TextView MyFinalScore = (TextView) findViewById(R.id.MyFinalScore);

        Button homeButton = (Button) findViewById(R.id.homeButton);

        Question1.setText(myAnswerArray[0][0]);
        Question2.setText(myAnswerArray[1][0]);
        Question3.setText(myAnswerArray[2][0]);
        Question4.setText(myAnswerArray[3][0]);

        Answer1.setText(myAnswerArray[0][1]);
        Answer2.setText(myAnswerArray[1][1]);
        Answer3.setText(myAnswerArray[2][1]);
        Answer4.setText(myAnswerArray[3][1]);

        Correct_Incorrect1.setText(myAnswerArray[0][2]);
        Correct_Incorrect2.setText(myAnswerArray[1][2]);
        Correct_Incorrect3.setText(myAnswerArray[2][2]);
        Correct_Incorrect4.setText(myAnswerArray[3][2]);

        MyFinalScore.setText(String.format("%d", myScore, "/ 40 points"));

        if (myScore == 0){
            GoodJob.setText("Try Harder Next Time");
        }else if (myScore == 10){
            GoodJob.setText("Try Harder Next Time");
        }else if (myScore == 20){
            GoodJob.setText("Good Try!");
        }else if (myScore == 30 && myPageNameReward == "StreetDisastersShooting"){
            GoodJob.setText("So Close!");
        }else if (myScore == 30 && myPageNameReward == "Earthquake"){
            GoodJob.setText("Good Try!");
        }else if (myScore == 40 && myPageNameReward == "StreetDisastersShooting"){
            GoodJob.setText("Congratulations!");
        }else if (myScore == 40 && myPageNameReward == "Earthquake"){
            GoodJob.setText("So Close!");
        }else if (myScore == 50){
            GoodJob.setText("Congratulations!");
        }

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHome();
            }
        });

    }


    public void openHome(){
        Intent intent = new Intent(this,Home.class);
        startActivity(intent);
    }
    public static Intent makeIntent(Context context, String[][] myReward, int myScoreReward, String myPageName ) {
        mainActivityContext = context;
        myAnswerArray = myReward;
        myScore = myScoreReward;
        myPageNameReward = myPageName;
        return new Intent(context, Reward.class);
    }
}
