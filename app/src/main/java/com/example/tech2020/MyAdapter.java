package com.example.tech2020;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import static com.example.tech2020.TabFragment.int_items;


public class MyAdapter extends FragmentPagerAdapter {


    public MyAdapter(FragmentManager fm)
    {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FragmentCPR();
            case 1:
                return new FragmentStroke();
            case 2:
                return new FragmentDrowning();
            case 3:
                return new FragmentChoking();



        }
        return null;
    }

    @Override
    public int getCount() {


        return int_items;
    }

    public CharSequence getPageTitle (int position) {
        switch(position) {
            case 0:
                return "CPR";
            case 1:
                return "Stroke";
            case 2:
                return "Drowning";
            case 3:
                return "Choking";


        }

        return null;
    }
}
