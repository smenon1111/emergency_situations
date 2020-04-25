package com.example.tech2020;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    public CategoryAdapter(Context ctxt, FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return (CategoryFragment.newInstance(position));
    }

    @Override
    public int getCount() {
        return 5;
    }
}
