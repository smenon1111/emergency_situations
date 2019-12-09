package com.example.tech2020;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button locationButton = (Button) findViewById(R.id.button2);

        locationButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                   openHome();
                }
            });

    }

    public void openHome() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

}