package com.android.loginui.fragment.One;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.loginui.R;

/**
 * 添加日程的界面
 *
 */
public class AddScheduleFragment  extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_schedule, null);
        return view;
    }
}
