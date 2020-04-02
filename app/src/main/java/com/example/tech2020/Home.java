package com.example.tech2020;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;



public class Home extends Fragment {

    public LocationManager locationManager;
    public Location location;

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState){

        View homeView = inflater.inflate(R.layout.home, container, false);



        Button levelsButton = homeView.findViewById(R.id.buttonLevels);
        Button infoButton = homeView.findViewById(R.id.buttonInfo);
        Button profileButton = homeView.findViewById(R.id.buttonProfile);
        Button playButton = homeView.findViewById(R.id.buttonPlay);
        Button emergencyMessageButton = homeView.findViewById(R.id.buttonEmergencyMessage);
        Button iAmSafe = homeView.findViewById(R.id.iAmSafe);

        //TODO:  LAYA :change openLevels(); to open{insert your page name for levels here}();
        //TODO: ANVIKA: change openProfile(); to open{insert your page name for profile here}();
        //TODO: ANIRRA: change openGame(); to open{insert your page name for game here}();
        //TODO: if they are the same as what I labeled them as the just take out the block comments
        //TODO:on your Android Manifest file, under <activity android:name=".Info"></activity add the same line of code, replacing "Info" with your activity name if it's not already there

        emergencyMessageButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            sendEmergencyMessage();
            Toast messageSentToast = Toast.makeText(getActivity().getApplicationContext(),"Emergency Message Sent", Toast.LENGTH_SHORT);
            messageSentToast.show();
        }
        });

        iAmSafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendSafeMessage();
                Toast messageSentToast = Toast.makeText(getActivity().getApplicationContext(),"Safe Message Sent", Toast.LENGTH_SHORT);
                messageSentToast.show();
            }
        });



        levelsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLevels();
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
                openEmergencyPlan();
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

    public void openLevels() {
        Intent intent = new Intent(getActivity(), MainActivity.class);
        startActivity(intent);
    }
    public void openInfo() {
        Intent intent = new Intent(getActivity(), Info.class);
        startActivity(intent);
    }
    public void openEmergencyPlan() {
        Intent intent = new Intent(getActivity(), View_Profile.class);
        startActivity(intent);
    }
    public void openStreetDisastersShooting() {
        Intent intent = new Intent(getActivity(),StreetDisastersShooting.class);
        startActivity(intent);
    }

//    public void openEmergencyMessage() {
//        Intent intent = new Intent(this, EmergencyMessage.class);
//        startActivity(intent);
//    }

    public void getEmergencyLocation() {

        locationManager = (LocationManager) getActivity().getSystemService(Context.LOCATION_SERVICE);
        if (ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
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
