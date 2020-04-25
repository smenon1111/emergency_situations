package com.example.tech2020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class CategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cateogry_layout);

        ViewPager categories = findViewById(R.id.categories);
        categories.setAdapter(new CategoryAdapter(this, getSupportFragmentManager()));
    }
}
