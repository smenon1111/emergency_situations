package com.example.tech2020;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;


import androidx.appcompat.app.AppCompatActivity;

public class View_Profile extends AppCompatActivity {

    SQLiteOpenHelper openHelper;
    SQLiteDatabase db;
    public static final String TABLE_NAME="T_Register";
    EditText c1name, c1no, c2name, c2no, communicationPlan, inTownMP, outTownMP, EvacuationPlan;
    Cursor results;
    String colUserName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emergency_plan);

        openHelper = new DataBaseHelper(this);
        viewEmergencyPlan();

        c1name = (EditText) findViewById(R.id.name);
        c1no = (EditText) findViewById(R.id.no);
        c2name = (EditText) findViewById(R.id.name1);
        c2no = (EditText) findViewById(R.id.no1);
        communicationPlan = (EditText) findViewById(R.id.communicationPlanInput);
        inTownMP = (EditText) findViewById(R.id.MeetingPlacesInTownInput);
        outTownMP = (EditText) findViewById(R.id.MeetingPlacesOutofTownInput);
        EvacuationPlan = (EditText) findViewById(R.id.EvacuationPlanInput);
        final TextView eTo = findViewById(R.id.nameID);

        Button saveButton = findViewById(R.id.saveButton);
        Button sendButton = findViewById(R.id.sendButton);

        saveButton.setOnClickListener (new View.OnClickListener() {
            public void onClick(View view) {
                openHelper = new DataBaseHelper(getApplicationContext());
                db = openHelper.getWritableDatabase();
                long UpdateID = updateData(c1name.getText().toString(), c1no.getText().toString(), c2name.getText().toString(), c2no.getText().toString(),communicationPlan.getText().toString(), inTownMP.getText().toString(), outTownMP.getText().toString(), EvacuationPlan.getText().toString());
                if (UpdateID <= 0)
                    Toast.makeText(getApplicationContext(), "Save was ...Unsuccessful", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(), "Emergency Plan Saved", Toast.LENGTH_LONG).show();
            }
        });

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewEmail();
                Intent it = new Intent(Intent.ACTION_SEND);
                it.putExtra(Intent.EXTRA_SUBJECT," My Family Emergency Plan");
                it.putExtra(Intent.EXTRA_TEXT,
                        "In-Town Contact: " + c1name.getText() + ", " + c1no.getText() + "  " +
                        "Out Of Town Contact: " + c2name.getText() + ", " + c2no.getText() + "  " +
                        "Communication Plan: " + communicationPlan.getText() + "  " +
                        "In-Town Meeting Place: " + inTownMP.getText() + "  " +
                        "Out Of Town Meeting Place: "  + outTownMP.getText() + "  " +
                        "Evacuation Plan: " + EvacuationPlan.getText());
                it.setType("message/rfc822");
                startActivity(Intent.createChooser(it,"Choose Mail App"));
            }
        });

    }
    public long updateData(String c1name, String c1no, String c2name, String c2no, String communicationPlanInput, String MPinTown, String MPoutTown, String evacuationPlaninput) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(DataBaseHelper.COL_7, c1name);
        contentValues.put(DataBaseHelper.COL_8, c1no);
        contentValues.put(DataBaseHelper.COL_9, c2name);
        contentValues.put(DataBaseHelper.COL_10, c2no);
        contentValues.put(DataBaseHelper.COL_11,communicationPlanInput);
        contentValues.put(DataBaseHelper.COL_12, MPinTown);
        contentValues.put(DataBaseHelper.COL_13, MPoutTown);
        contentValues.put(DataBaseHelper.COL_14, evacuationPlaninput);
        String[] selectionArgs = { String.valueOf(colUserName) };
        long id = db.update(DataBaseHelper.TABLE_NAME,contentValues,DataBaseHelper.COL_3 +" = ? ",selectionArgs);
        return id;

    }




    public void viewEmergencyPlan(){


        c1name = (EditText) findViewById(R.id.name);
        c1no = (EditText) findViewById(R.id.no);
        c2name = (EditText) findViewById(R.id.name1);
        c2no = (EditText) findViewById(R.id.no1);
        communicationPlan = (EditText) findViewById(R.id.communicationPlanInput);
        inTownMP = (EditText) findViewById(R.id.MeetingPlacesInTownInput);
        outTownMP = (EditText) findViewById(R.id.MeetingPlacesOutofTownInput);
        EvacuationPlan = (EditText) findViewById(R.id.EvacuationPlanInput);

        results = GetProfiles();

        if (results.moveToLast()){
            colUserName = results.getString(2);
            c1name.setText(results.getString(6));
            c1no.setText(results.getString(7));
            c2name.setText(results.getString(8));
            c2no.setText(results.getString(9));
            communicationPlan.setText(results.getString(10));
            inTownMP.setText(results.getString(11));
            outTownMP.setText(results.getString(12));
            EvacuationPlan.setText(results.getString(13));
        }
    }

    public void viewEmail(){
        final TextView eTo = findViewById(R.id.nameID);
        results = GetProfiles();
        if (results.moveToLast()){
            eTo.setText(results.getString(5));
        }
    }
    public Cursor GetProfiles() {
        SQLiteDatabase db = openHelper.getWritableDatabase();
        String query = "Select * from " + TABLE_NAME;

        Cursor results = db.rawQuery(query, null);

        return results;
    }
}
