package com.example.tech2020;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);


        Button levelsButton = findViewById(R.id.buttonLevels);
        Button infoButton = findViewById(R.id.buttonInfo);
        Button profileButton = findViewById(R.id.buttonProfile);
        Button playButton = findViewById(R.id.buttonPlay);

        //TODO:  LAYA :change openLevels(); to open{insert your page name for levels here}();
        //TODO: ANVIKA: change openProfile(); to open{insert your page name for profile here}();
        //TODO: ANIRRA: change openGame(); to open{insert your page name for game here}();
        //TODO: if they are the same as what I labeled them as the just take out the block comments
        //TODO:on your Android Manifest file, under <activity android:name=".Info"></activity add the same line of code, replacing "Info" with your activity name if it's not already there


        levelsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*openLevels();*/

            }
        });

        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openInfo();

            }
        });

        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*openProfile();*/

            }
        });

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openStreetDisastersShooting();

            }
        });
    }

    //TODO: same as before change yours to open{your name as you put before}(); and change Levels.class/Profile.class/Game.class to what you put as your java code page

    /*public void openLevels() {
        Intent intent = new Intent(this, Levels.class);
        startActivity(intent);
    }*/
    public void openInfo() {
        Intent intent = new Intent(this, Info.class);
        startActivity(intent);
    }
    /*public void openProfile() {
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }*/
    public void openStreetDisastersShooting() {
        Intent intent = new Intent(this, StreetDisastersShooting.class);
        startActivity(intent);
    }
}
