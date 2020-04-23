package com.example.tech2020;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.fragment.app.Fragment;


public class User_Registration extends Fragment {

    SQLiteOpenHelper openHelper;
    SQLiteDatabase db;
    EditText txtname, txtuser, txtpass, txtemail, txtphonenumber, c1name, c1no, c2name, c2no;

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View profileView = inflater.inflate(R.layout.register, container, false);

        txtname = (EditText) profileView.findViewById(R.id.name);
        txtuser = (EditText) profileView.findViewById(R.id.username);
        txtpass = (EditText) profileView.findViewById(R.id.password);
        txtemail = (EditText) profileView.findViewById(R.id.email);
        txtphonenumber = (EditText) profileView.findViewById(R.id.no);
        c1name = (EditText) profileView.findViewById(R.id.c1name);
        c1no = (EditText) profileView.findViewById(R.id.c1no);
        c2name = (EditText) profileView.findViewById(R.id.c2name);
        c2no = (EditText) profileView.findViewById(R.id.c2no);

        Button btnRegister = (Button) profileView.findViewById(R.id.register);
        btnRegister.setOnClickListener (new View.OnClickListener() {
            public void onClick(View view) {
                openHelper = new DataBaseHelper(getActivity().getApplicationContext());
                db = openHelper.getWritableDatabase();

                long InsertID = insertdata(txtname.getText().toString(), txtuser.getText().toString(), txtpass.getText().toString(), txtemail.getText().toString(), txtphonenumber.getText().toString(), c1name.getText().toString(), c1no.getText().toString(), c2name.getText().toString(), c2no.getText().toString());
                if (InsertID <= 0)
                    Toast.makeText(getActivity().getApplicationContext(), "Registration was unsuccessful", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getActivity().getApplicationContext(), "Registration was successful", Toast.LENGTH_LONG).show();
            }
        });

        return profileView;
        }
    public long insertdata(String name, String username, String password, String email, String phone, String c1name, String c1no, String c2name, String c2no) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(DataBaseHelper.COL_2, name);
        contentValues.put(DataBaseHelper.COL_3, username);
        contentValues.put(DataBaseHelper.COL_4, password);
        contentValues.put(DataBaseHelper.COL_5, email);
        contentValues.put(DataBaseHelper.COL_6, phone);
        contentValues.put(DataBaseHelper.COL_7, c1name);
        contentValues.put(DataBaseHelper.COL_8, c1no);
        contentValues.put(DataBaseHelper.COL_9, c2name);
        contentValues.put(DataBaseHelper.COL_10, c2no);

        long id = db.insert(DataBaseHelper.TABLE_NAME, null, contentValues);

        return id;

    }
}
