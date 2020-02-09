package com.example.tech2020;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.widget.Toast;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

public class EmergencyMessage extends AppCompatActivity {


    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.emergencymessage);

        Uri uri;
        Button sendButton = findViewById(R.id.button);


        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent smsIntent = new Intent(Intent.ACTION_SENDTO,
                        Uri.parse("sms:5104493731"));
                smsIntent.putExtra("sms_body", "Hello");


                startActivity(smsIntent);

            }
        });


        /* Use the LocationManager class to obtain GPS locations */

        LocationManager mlocManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

        LocationListener mlocListener = new MyLocationListener();


        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mlocManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, mlocListener);


    }


    /* Class My Location Listener */

    public class MyLocationListener implements LocationListener
    {

        @Override

        public void onLocationChanged(Location loc)

        {

            loc.getLatitude();

            loc.getLongitude();
            String Text = "My location is: " +

                    "Latitude = " + loc.getLatitude() +

                    "Longitude = " + loc.getLongitude();




            Toast.makeText( getApplicationContext(),Text,Toast.LENGTH_SHORT).show();

        }


        @Override

        public void onProviderDisabled(String provider)

        {

            Toast.makeText( getApplicationContext(),
                    "GPS Disabled",


                    Toast.LENGTH_SHORT ).show();

        }


        @Override

        public void onProviderEnabled(String provider)

        {

            Toast.makeText( getApplicationContext(),


                    "GPS Enabled",
                    Toast.LENGTH_SHORT).show();

        }


        @Override

        public void onStatusChanged(String provider, int status, Bundle extras)

        {


        }

    }






    }

