package com.example.tech2020;


import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

/**
 * A simple {@link Fragment} subclass.
 */
public class TabFragment extends Fragment {

    public  static TabLayout tabLayout;
    public  static ViewPager viewPager;
    public  static int int_items= 4;



    public TabFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_tab,null);
        tabLayout=(TabLayout)v.findViewById(R.id.tabs);
        viewPager=(ViewPager)v.findViewById(R.id.viewpager);
        //set an adpater

        viewPager.setAdapter(new MyAdapter( getChildFragmentManager()));

        tabLayout.post(new Runnable() {
            @Override
            public void run() {
                tabLayout.setupWithViewPager(viewPager);
            }
        });
        return v;
    }

}
