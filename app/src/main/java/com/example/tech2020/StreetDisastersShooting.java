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
import android.widget.VideoView;


public class StreetDisastersShooting extends AppCompatActivity {
    private MediaController mc;
    private VideoView mVideoView;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.streetdisasters_shooting);
        VideoView view = (VideoView)findViewById(R.id.VideoView);
        String path = "android.resource://" + getPackageName() + "/" + R.raw.demoptone;
        mc = new MediaController(this);
        view.setMediaController(mc);
        view.requestFocus();
        view.setVideoURI(Uri.parse(path));
        view.start();

    }

}
