package com.android.loginui.androidsidebar;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.loginui.R;

/**
 * ================================================
 * 项    目：AndroidSidebar
 * 作    者：zj
 * 版    本：1.0
 * 创建日期：2019/5/12
 * 描    述：如果NavigationView item 形式不能满足侧边栏要求，我们可以完全自己定义布局
 * 修订历史：
 * ================================================
 */
public class NavigationViewFragment extends Fragment {
    public NavigationViewFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.left_menu2, null);
    }
}
