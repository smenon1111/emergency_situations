package com.example.tech2020;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Reward extends AppCompatActivity {
    //final TextView mMyFinalScore = findViewById(R.id.mMyFinalScore);
    static Context mainActivityContext;
    static String[] myAnswerArray;
    static int myScore;
    static String myPageNameReward;
    static int[] myAccuracyReward;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reward);

        TextView Answer1 = findViewById(R.id.Answer1);
        TextView Answer2 = findViewById(R.id.Answer2);
        TextView Answer3 = findViewById(R.id.Answer3);
        TextView Answer4 = findViewById(R.id.Answer4);
        TextView Answer5 = findViewById(R.id.Answer5);

        ImageView Correct_Incorrect1 =  findViewById(R.id.Result2);
        ImageView Correct_Incorrect2 =  findViewById(R.id.Result3);
        ImageView Correct_Incorrect3 =  findViewById(R.id.Result4);
        ImageView Correct_Incorrect4 =  findViewById(R.id.Result5);
        ImageView Correct_Incorrect5 =  findViewById(R.id.Result6);

        TextView GoodJob = (TextView) findViewById(R.id.titleGood);
        TextView BadJob = (TextView) findViewById(R.id.titleBad);
        TextView MyFinalScore = (TextView) findViewById(R.id.MyFinalScore);

        Button homeButton = (Button) findViewById(R.id.homeButton);

        Answer1.setText( myAnswerArray[0]);
        Answer2.setText( myAnswerArray[1]);
        Answer3.setText( myAnswerArray[2]);
        Answer4.setText( myAnswerArray[3]);
        Answer5.setText( myAnswerArray[4]);


        Correct_Incorrect1.setImageResource(myAccuracyReward[0]);
        Correct_Incorrect2.setImageResource(myAccuracyReward[1]);
        Correct_Incorrect3.setImageResource(myAccuracyReward[2]);
        Correct_Incorrect4.setImageResource(myAccuracyReward[3]);
        Correct_Incorrect5.setImageResource(myAccuracyReward[4]);

        if (myPageNameReward.equals("StreetDisastersShooting")){
            MyFinalScore.setText(myScore + "/ 40 points");

        }else if(myPageNameReward.equals("Earthquake")){
            MyFinalScore.setText(myScore + " / 50 points");

        }else if(myPageNameReward.equals("COVID19")){
            MyFinalScore.setText(myScore + " / 50 points");

        }


        if (myScore == 0){
            GoodJob.setText("Try Harder Next Time");
        }else if (myScore == 10){
            GoodJob.setText("Try Harder Next Time");
        }else if (myScore == 20){
            GoodJob.setText("Good Try!");
        }else if (myScore == 30 && myPageNameReward.equals("StreetDisastersShooting")){
            GoodJob.setText("So Close!");
        }else if (myScore == 30 && myPageNameReward.equals("Earthquake")){
            GoodJob.setText("Good Try!");
        }else if (myScore == 40 && myPageNameReward.equals("StreetDisastersShooting")){
            GoodJob.setText("Congratulations!");
        }else if (myScore == 40 && myPageNameReward.equals("Earthquake")){
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
    public static Intent makeIntent(Context context, String[] myQuestion, int myScoreReward, String myPageName, int[] myAccuracy ) {
        mainActivityContext = context;
        myAnswerArray = myQuestion;
        myScore = myScoreReward;
        myPageNameReward = myPageName;
        myAccuracyReward = myAccuracy;
        return new Intent(context, Reward.class);
    }
}
