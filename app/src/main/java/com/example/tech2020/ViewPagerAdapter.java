package com.viewpager2example;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {

    private int[] imageArray;
    private int viewId;

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity, int[] imageArray, int viewWidgetId) {
        super(fragmentActivity);
        this.imageArray = imageArray;
        this.viewId = viewWidgetId;
    }

   @NonNull @Override public Fragment createFragment(int position) {
        CardFragment frag = CardFragment.newInstance(position);
       frag.setImages( this.imageArray );
        frag.setViewId( this.viewId);
        return frag;
    }

    @Override public int getItemCount() {
        return this.imageArray.length;
    }
}
