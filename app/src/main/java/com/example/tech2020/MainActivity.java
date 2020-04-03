package com.example.tech2020;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

public class MainActivity extends AppCompatActivity {

    ViewPager2 viewPagerTop;
    ViewPager2 viewPagerBottom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPagerTop = findViewById(R.id.view_pager);
        viewPagerTop.setAdapter(createCardAdapter(0));

        viewPagerBottom = findViewById(R.id.view_level);
        viewPagerBottom.setAdapter(createCardAdapter(1));
    }
    private ViewPagerAdapter createCardAdapter(int which) {
        int[] images;
        int viewWidgetId;
        if (which == 0) {
            images = new int[]{R.drawable.public_disasters,
                    R.drawable.school_disasters,
                    R.drawable.medical_disasters_locked,
                    R.drawable.water_disasters_locked,
                    R.drawable.car_disasters_locked,
                    R.drawable.medical_disasters_locked};
            viewWidgetId = R.id.launcherimg;
        } else {
            images = new int[]{R.drawable.watercolor1,
                    R.drawable.watercolor2,
                    R.drawable.watercolor3,
                    R.drawable.watercolor4};
            viewWidgetId = R.id.launcherimg2;
        }

        ViewPagerAdapter adapter = new ViewPagerAdapter(this, images, viewWidgetId);
        return adapter;
    }
}
