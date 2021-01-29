package com.android.loginui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.android.loginui.MainActivity;
import com.android.loginui.R;
import com.android.loginui.fragment.One.AddScheduleFragment;

public class FragmentOne extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment1, null);

        FloatingActionButton floatBtn = view.findViewById(R.id.floating);
        //设置悬浮按钮的点击事件
        floatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"You clicked float button",Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}