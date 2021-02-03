package com.android.loginui.fragment;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import androidx.annotation.Nullable;

import com.android.loginui.fragment.One.ArticleArrayAdapter;
import com.android.loginui.fragment.One.CardData;
import com.android.loginui.fragment.One.ExampleDataset;
import com.android.loginui.fragment.One.ItemsCountView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.loginui.R;
import com.ramotion.expandingcollection.ECBackgroundSwitcherView;
import com.ramotion.expandingcollection.ECCardData;
import com.ramotion.expandingcollection.ECPagerView;
import com.ramotion.expandingcollection.ECPagerViewAdapter;

public class FragmentOne extends Fragment { // implements IOnBackPressed
    private ECPagerView ecPagerView;
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

        // Create adapter for pager
        ECPagerViewAdapter adapter = new ECPagerViewAdapter(getContext(), new ExampleDataset().getDataset()) {
            @Override
            public void instantiateCard(LayoutInflater inflaterService, ViewGroup head, ListView list, final ECCardData data) {
                final CardData cardData = (CardData) data;

                // Create adapter for list inside a card and set adapter to card content
                ArticleArrayAdapter articleArrayAdapter = new ArticleArrayAdapter(getContext(), cardData.getListItems());
                list.setAdapter(articleArrayAdapter);
                list.setDivider(getResources().getDrawable(R.drawable.list_divider));
                list.setDividerHeight((int) pxFromDp(getContext(), 0.5f));
                list.setSelector(R.color.transparent);
                list.setBackgroundColor(Color.WHITE);
                list.setCacheColorHint(Color.TRANSPARENT);

                // Add gradient to root header view
                View gradient = new View(getContext());
                gradient.setLayoutParams(new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, AbsListView.LayoutParams.MATCH_PARENT));
                gradient.setBackgroundDrawable(getResources().getDrawable(R.drawable.card_head_gradient));
                head.addView(gradient);

                // Inflate main header layout and attach it to header root view
                inflaterService.inflate(R.layout.simple_head, head);

                // Set header data from data object
                TextView title = (TextView) head.findViewById(R.id.title);
                title.setText(cardData.getHeadTitle());
//                ImageView avatar = (ImageView) head.findViewById(R.id.avatar);
//                avatar.setImageResource(cardData.getPersonPictureResource());
                TextView name = (TextView) head.findViewById(R.id.name);
                name.setText(cardData.getPersonName());
                TextView message = (TextView) head.findViewById(R.id.message);
                message.setText(cardData.getPersonMessage());
//                TextView viewsCount = (TextView) head.findViewById(R.id.socialViewsCount);
//                viewsCount.setText(" " + cardData.getPersonViewsCount());
//                TextView likesCount = (TextView) head.findViewById(R.id.socialLikesCount);
//                likesCount.setText(" " + cardData.getPersonLikesCount());
//                TextView commentsCount = (TextView) head.findViewById(R.id.socialCommentsCount);
//                commentsCount.setText(" " + cardData.getPersonCommentsCount());

                // Add onclick listener to card header for toggle card state
                head.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(final View v) {
                        ecPagerView.toggle();
                    }
                });
            }
        };

        ecPagerView = (ECPagerView) view.findViewById(R.id.ec_pager_element);

        ecPagerView.setPagerViewAdapter(adapter);
        ecPagerView.setBackgroundSwitcherView((ECBackgroundSwitcherView) view.findViewById(R.id.ec_bg_switcher_element));

        final ItemsCountView itemsCountView = (ItemsCountView) view.findViewById(R.id.items_count_view);
        ecPagerView.setOnCardSelectedListener(new ECPagerView.OnCardSelectedListener() {
            @Override
            public void cardSelected(int newPosition, int oldPosition, int totalElements) {
                itemsCountView.update(newPosition, oldPosition, totalElements);
            }
        });
        return view;
    }

    public static float pxFromDp(final Context context, final float dp) {
        return dp * context.getResources().getDisplayMetrics().density;
    }

//    @Override
//    public boolean onBackPressed() {
//        if (!ecPagerView.collapse()){
//            return false;
//        }else{
//            return true;
//        }
//    }
}