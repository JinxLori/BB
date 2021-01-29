# BB
### 登录界面：

https://github.com/Shashank02051997/LoginUI-Android

### 侧滑栏：

https://github.com/androidneter/AndroidSidebar

### 底部导航：

https://github.com/tyzlmjj/PagerBottomTabStrip

```java
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
```

