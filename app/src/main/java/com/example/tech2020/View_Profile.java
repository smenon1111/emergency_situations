package com.example.tech2020;

<<<<<<< HEAD
=======
import android.content.ContentValues;
>>>>>>> origin/master
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
<<<<<<< HEAD
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

=======
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.example.tech2020.R;
>>>>>>> origin/master

public class View_Profile extends AppCompatActivity {

    SQLiteOpenHelper openHelper;
    SQLiteDatabase db;
    public static final String TABLE_NAME="T_Register";
    TextView c1name, c1no, c2name, c2no;
    Cursor results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emergency_plan);

        openHelper = new DataBaseHelper(this);
        viewProfiles();
    }


    public void viewProfiles(){

        c1name = (TextView) findViewById(R.id.c1name);
        c1no = (TextView) findViewById(R.id.c1no);
        c2name = (TextView) findViewById(R.id.c2name);
        c2no = (TextView) findViewById(R.id.c2no);

        results = GetProfiles();

<<<<<<< HEAD
        if (results.moveToFirst()){
=======
        if (results.moveToLast()){
>>>>>>> origin/master
            c1name.setText(results.getString(6));
            c1no.setText(results.getString(7));
            c2name.setText(results.getString(8));
            c2no.setText(results.getString(9));
        }
    }

    public Cursor GetProfiles() {
        SQLiteDatabase db = openHelper.getWritableDatabase();
        String query = "Select * from " + TABLE_NAME;

        Cursor results = db.rawQuery(query, null);

        return results;
    }
}
