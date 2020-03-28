package com.example.tech2020;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.tech2020.FragmentCPR;
import com.example.tech2020.FragmentChoking;
import com.example.tech2020.FragmentDrowning;
import com.example.tech2020.FragmentStroke;

public class TabAdapter extends FragmentStatePagerAdapter{

    int mNumOfTabs;

    public TabAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        //returning current tabs
        switch (position) {
            case 0:
                FragmentCPR fragmentCPR = new FragmentCPR();
                return fragmentCPR;
            case 1:
                FragmentStroke fragmentStroke = new FragmentStroke();
                return fragmentStroke;
            case 2:
                FragmentDrowning fragmentDrowning = new FragmentDrowning();
                return fragmentDrowning;
            case 3:
                FragmentChoking fragmentChoking = new FragmentChoking();
                return fragmentChoking;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
