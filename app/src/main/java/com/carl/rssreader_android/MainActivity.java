package com.carl.rssreader_android;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.carl.rssreader_android.flow.FlowFragment;
import com.carl.rssreader_android.mine.MineFragment;
import com.carl.rssreader_android.recommend.RecommendFragment;

import java.util.ArrayList;
import java.util.List;

import github.com.st235.lib_expandablebottombar.ExpandableBottomBar;
import github.com.st235.lib_expandablebottombar.ExpandableBottomBarMenuItem;

public class MainActivity extends AppCompatActivity {
    private ExpandableBottomBar ebb_bottom_navi_bar;
    private ViewPager vp_fg_content;
    private List<Fragment> mFragmentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFragmentList = new ArrayList<>();
        mFragmentList.add(FlowFragment.newInstance());
        mFragmentList.add(RecommendFragment.newInstance());
        mFragmentList.add(MineFragment.newInstance());

        initView();
    }



    protected void initView(){

        vp_fg_content = findViewById(R.id.vp_fg_content);
        ebb_bottom_navi_bar = findViewById(R.id.ebb_bottom_navi_bar);

        vp_fg_content.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @NonNull
            @Override
            public Fragment getItem(int position) {
                return mFragmentList.get(position);
            }

            @Override
            public int getCount() {
                return mFragmentList.size();
            }
        });
        vp_fg_content.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        vp_fg_content.setCurrentItem(0);

    }


}
