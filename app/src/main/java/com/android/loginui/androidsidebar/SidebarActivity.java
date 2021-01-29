package com.android.loginui.androidsidebar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.android.loginui.R;

public class SidebarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sidebar);
    }

    //侧边栏样式一  Android原生风格
    public void style1(View view) {
//        startActivity(new Intent(SidebarActivity.this, Style1Activity.class));
    }

    //侧边栏样式二 b站 网易云 滴滴
    public void style2(View view) {
//        startActivity(new Intent(SidebarActivity.this, Style2Activity.class));
    }

    //侧边栏样式三  IOS风格侧滑
    public void style3(View view) {
//        startActivity(new Intent(SidebarActivity.this, Style3Activity.class));
    }

    //侧边栏样式四（仿QQ 5.0.0）
    public void style4(View view) {
        startActivity(new Intent(SidebarActivity.this, Style4Activity.class));
    }

    //侧边栏样式五（仿QQ 8.0.0）
    public void style5(View view) {
//        startActivity(new Intent(SidebarActivity.this, Style5Activity.class));
    }
}
