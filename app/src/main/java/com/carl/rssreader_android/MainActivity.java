package com.carl.rssreader_android;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import github.com.st235.lib_expandablebottombar.ExpandableBottomBar;
import github.com.st235.lib_expandablebottombar.ExpandableBottomBarMenuItem;

public class MainActivity extends AppCompatActivity {
    private ExpandableBottomBar ebb_bottom_navi_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    protected void initView(){
        ebb_bottom_navi_bar = findViewById(R.id.ebb_bottom_navi_bar);
    }
}
