package com.android.loginui.other;


import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



public class AFragment extends Fragment {
    private static final String ARG_C = "content";

    public static AFragment newInstance(String content) {
        Bundle args = new Bundle();
        args.putString(ARG_C, content);
        AFragment fragment = new AFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        String content = getArguments().getString(ARG_C);
        TextView textView = new TextView(getContext());
        textView.setTextSize(30);
        textView.setGravity(Gravity.CENTER);
        textView.setText(String.format("Test\n\n%s", content));
        textView.setBackgroundColor(0xFFececec);
        return textView;
    }
}
