package com.example.tech2020;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

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
