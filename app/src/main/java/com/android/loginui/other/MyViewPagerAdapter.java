package com.android.loginui.other;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

public class MyViewPagerAdapter extends FragmentPagerAdapter {

//    private int size;

//    public MyViewPagerAdapter(FragmentManager fm, int size) {
//        super(fm);
//        this.size = size;
//    }
//
//    @Override
//    public Fragment getItem(int position) {
//        return AFragment.newInstance(position + "");
//    }
//
//    @Override
//    public int getCount() {
//        return size;
//    }

    private List<Fragment> mlist;

    public MyViewPagerAdapter(FragmentManager fm, List<Fragment> list) {
        super(fm);
        this.mlist = list;
    }

    @Override
    public Fragment getItem(int position) {
        return mlist.get(position);
    }

    @Override
    public int getCount() {
        return mlist.size();
    }
}
