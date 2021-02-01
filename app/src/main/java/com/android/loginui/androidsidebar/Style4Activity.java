package com.android.loginui.androidsidebar;

import android.graphics.Color;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.android.loginui.R;
import com.android.loginui.fragment.FragmentFour;
import com.android.loginui.fragment.FragmentOne;
import com.android.loginui.fragment.FragmentThree;
import com.android.loginui.fragment.FragmentTwo;
import com.android.loginui.other.MyViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import me.majiajie.pagerbottomtabstrip.NavigationController;
import me.majiajie.pagerbottomtabstrip.PageNavigationView;
import me.majiajie.pagerbottomtabstrip.listener.OnTabItemSelectedListener;

/**
 * ================================================
 * 项    目：AndroidSidebar
 * 作    者：zj
 * 版    本：1.0
 * 创建日期：2019/4/21
 * 描    述：侧边栏样式四（仿QQ 5.0.0）
 * 修订历史：
 * ================================================
 */
public class Style4Activity extends AppCompatActivity {
    private final String TAG = "Style4Activity";

    int[] testColors = {0xFF455A64, 0xFF00796B, 0xFF795548, 0xFF5B4947, 0xFFF57C00};
//    private final int[] COLORS = {0xFF455A64, 0xFF00796B, 0xFF795548, 0xFF5B4947, 0xFFF57C00};
    NavigationController mNavigationController;
    private List<Fragment> list;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //隐藏状态栏时，获取状态栏高度
        int statusBarHeight = ScreenInfoUtils.getStatusBarHeight(this);
        //隐藏状态栏
        ScreenInfoUtils.fullScreen(this);

        setContentView(R.layout.activity_style4);

        // 底部导航实现
        PageNavigationView pageBottomTabLayout = findViewById(R.id.tab);
        ViewPager viewPager = findViewById(R.id.viewPager);
        mNavigationController = pageBottomTabLayout.material()
                .addItem(R.drawable.ic_ondemand_video_black_24dp, "Page_One", testColors[0])
                .addItem(R.drawable.ic_audiotrack_black_24dp, "Page_Two", testColors[1])
                .addItem(R.drawable.ic_book_black_24dp, "Page_Three", testColors[2])
                .addItem(R.drawable.ic_news_black_24dp, "Page_Four", testColors[3])
//                .setDefaultColor(0x89FFFFFF)//未选中状态的颜色
//                .setMode(MaterialMode.CHANGE_BACKGROUND_COLOR | MaterialMode.HIDE_TEXT)//这里可以设置样式模式，总共可以组合出4种效果
                .enableAnimateLayoutChanges()
                .build();
        //把Fragment添加到List集合里面
        list = new ArrayList<>();
        list.add(new FragmentOne());
        list.add(new FragmentTwo());
        list.add(new FragmentThree());
        list.add(new FragmentFour());
        //适配器
//        viewPager.setAdapter(new MyViewPagerAdapter(getSupportFragmentManager(), mNavigationController.getItemCount()));
        viewPager.setAdapter(new MyViewPagerAdapter(getSupportFragmentManager(), list));
        // 自动适配ViewPager页面切换
        mNavigationController.setupWithViewPager(viewPager);
        // 也可以设置Item选中事件的监听
        mNavigationController.addTabItemSelectedListener(new OnTabItemSelectedListener() {
            @Override
            public void onSelected(int index, int old) {
                Log.i("asd", "selected: " + index + " old: " + old);
                Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
                toolbar.setTitle("wsh/cly Page" + index);
            }
            @Override
            public void onRepeat(int index) {
                Log.i("asd", "onRepeat selected: " + index);
            }
        });


        //初始化状态栏的高度,设置填充的高度
        View statusbar = (View) findViewById(R.id.view_statusbar);
        ConstraintLayout.LayoutParams params =
                new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT, statusBarHeight);
        statusbar.setLayoutParams(params);

        // 抽屉
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        final DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        //将ToolBar与ActionBar关联
        setSupportActionBar(toolbar);
        //另外openDrawerContentDescRes 打开图片   closeDrawerContentDescRes 关闭图片
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, 0, 0);
        //初始化状态
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        // 设置toolbar默认图标
//        toolbar.setNavigationIcon(R.drawable.ic_head);

        //蒙层颜色
        drawerLayout.setScrimColor(Color.TRANSPARENT);
        drawerLayout.addDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerStateChanged(int newState) {
            }

            @Override
            public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {
                // 滑动的过程中执行 slideOffset：从0到1
                //主页内容
                View content = drawerLayout.getChildAt(0);
                //侧边栏
                View menu = drawerView;
                //
                float scale = 1 - slideOffset;//1~0
                float leftScale = (float) (1 - 0.3 * scale);
                float rightScale = (float) (0.7f + 0.3 * scale);//0.7~1
//                menu.setScaleX(leftScale);//1~0.7
                menu.setScaleY(leftScale);//1~0.7

//                content.setScaleX(rightScale);
                content.setScaleY(rightScale);
                content.setTranslationX(menu.getMeasuredWidth() * slideOffset);//0~width
                Log.d(TAG, "slideOffset=" + slideOffset + ",leftScale=" + leftScale + ",rightScale=" + rightScale);
            }

            @Override
            public void onDrawerOpened(@NonNull View drawerView) {
            }

            @Override
            public void onDrawerClosed(@NonNull View drawerView) {
            }
        });
    }
}
