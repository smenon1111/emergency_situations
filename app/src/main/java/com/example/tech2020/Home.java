package com.example.tech2020;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import android.content.Context;

import static android.content.Context.LOCATION_SERVICE;
import static android.support.v4.content.ContextCompat.getSystemService;

public class Home extends Fragment {
    //Home

    public LocationManager locationManager;
    public Location location;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View homeView = inflater.inflate(R.layout.home, container, false);

        Log.d("HELLO", "Hello I am rendering");

        Button levelsButton = homeView.findViewById(R.id.buttonLevels);
        Button playButton = homeView.findViewById(R.id.buttonPlay);
        Button emergencyMessageButton = homeView.findViewById(R.id.buttonEmergencyMessage);
        Button iAmSafe = homeView.findViewById(R.id.iAmSafe);
        Button profileButton = homeView.findViewById(R.id.buttonProfile);

        //TODO:  LAYA :change openLevels(); to open{insert your page name for levels here}();
        //TODO: ANVIKA: change openProfile(); to open{insert your page name for profile here}();
        //TODO: ANIRRA: change openGame(); to open{insert your page name for game here}();
        //TODO: if they are the same as what I labeled them as the just take out the block comments

        emergencyMessageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sendEmergencyMessage();
                Toast messageSentToast = Toast.makeText(getActivity().getApplicationContext(), "Emergency Message Sent", Toast.LENGTH_SHORT);
                messageSentToast.show();
            }
        });

        iAmSafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sendSafeMessage();
                Toast messageSentToast = Toast.makeText(getActivity().getApplicationContext(), "Safe Message Sent", Toast.LENGTH_SHORT);
                messageSentToast.show();
            }
        });


        levelsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*openLevels();*/

            }
        });

        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openProfile();

            }
        });

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openStreetDisastersShooting();

            }
        });

        return homeView;
    }

    //TODO: same as before change yours to open{your name as you put before}(); and change Levels.class/Profile.class/Game.class to what you put as your java code page

    /*public void openLevels() {
        Intent intent = new Intent(this, Levels.class);
        startActivity(intent);
    }*/

    public void openProfile() {
        Intent intent = new Intent(getActivity(), View_Profile.class);
        startActivity(intent);
    }
    public void openStreetDisastersShooting() {
        Intent intent = new Intent(getActivity(), StreetDisastersShooting.class);
        startActivity(intent);
    }

    public void openEmergencyMessage() {
//        Intent intent = new Intent(getActivity(), EmergencyMessage.class);
//        startActivity(intent);
    }

    public void getEmergencyLocation() {

        locationManager = (LocationManager) getActivity().getSystemService(Context.LOCATION_SERVICE);
        if (ActivityCompat.checkSelfPermission(getActivity(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getActivity(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        location = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
    }

    public void sendEmergencyMessage() {
        getEmergencyLocation();

        SmsManager sms = SmsManager.getDefault();
        StringBuffer smsBody = new StringBuffer();
        smsBody.append("Help. I am in trouble. My location is: ");
        smsBody.append("https://maps.google.com?q=");
        smsBody.append(location.getLatitude());
        smsBody.append(",");
        smsBody.append(location.getLongitude());
        sms.sendTextMessage("sms:5104493731", null,
                smsBody.toString(), null, null);
    }

    public void sendSafeMessage() {
        getEmergencyLocation();

        SmsManager sms = SmsManager.getDefault();
        StringBuffer smsBody = new StringBuffer();
        smsBody.append("I am safe. My location is: ");
        smsBody.append("https://maps.google.com?q=");
        smsBody.append(location.getLatitude());
        smsBody.append(",");
        smsBody.append(location.getLongitude());
        sms.sendTextMessage("sms:5104493731", null,
                smsBody.toString(), null, null);
    }
}