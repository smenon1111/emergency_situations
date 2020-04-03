package com.example.tech2020;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CardFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CardFragment extends Fragment {
    private static final String ARG_COUNT = "param1";
    private int[] imageArray;
    private int viewId;
    private Integer counter = 1;

    public CardFragment() {
        // Required empty public constructor
    }

    public static CardFragment newInstance(int counter) {
        CardFragment fragment = new CardFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COUNT, counter);
        fragment.counter = counter;
        fragment.setArguments(args);
        return fragment;
    }


    public void setImages(int[] imageArray) {
        this.imageArray = imageArray;
    }

    public void setViewId(int viewId) {
        this.viewId = viewId;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (counter==null) {
            counter = this.imageArray.length;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.card_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView imageView = view.findViewById(this.viewId);
        int imageAt = getImageAt(counter);
        Drawable img = getContext().getResources().getDrawable(imageAt);
        imageView.setImageDrawable(img);

        // Create an anonymous implementation of OnClickListener
        View.OnClickListener imageListener = new View.OnClickListener() {
            public void onClick(View v) {
                // do something when the button is clicked
                // Yes we will handle click here but which button clicked??? We don't know
                // 1. Instantiate an <code><a href="/reference/android/app/AlertDialog.Builder.html">AlertDialog.Builder</a></code> with its constructor
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

// 2. Chain together various setter methods to set the dialog characteristics
                if (counter == 0 ) {
                    builder.setMessage(String.format("Please select a level"))
                            .setTitle("Public Disasters Category Chosen");
                } else if  (counter == 1) {
                    builder.setMessage(String.format("Please select a level"))
                            .setTitle("School Disasters Category Chosen");
                } else if  (counter == 2){
                    openStreetDisastersShooting();
                } else if  (counter == 3){
                    openEarthquake();                } else if  (counter == 4){
                    builder.setMessage(String.format("This category is currently locked", counter))
                            .setTitle("Locked");
                } else {
                    builder.setMessage(String.format("Thank you for your interest! This category will be added in our next update.", counter))
                            .setTitle("Future Update");
                }

// 3. Get the <code><a href="/reference/android/app/AlertDialog.html">AlertDialog</a></code> from <code><a href="/reference/android/app/AlertDialog.Builder.html#create()">create()</a></code>
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        };

        imageView.setOnClickListener(imageListener);
    }


    private int getImageAt(int position) {
        return this.imageArray[position];
    }

    public void openStreetDisastersShooting() {
        Intent intent = new Intent(CardFragment.this.getActivity(), StreetDisastersShooting.class);
        startActivity(intent);
    }

    public void openEarthquake() {
        Intent intent = new Intent(CardFragment.this.getActivity(), Earthquake.class);
        startActivity(intent);
    }
}
