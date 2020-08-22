package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        List<Word> colors= new ArrayList<>();
        colors.add(new Word("Red","weṭeṭṭi",R.drawable.color_red,R.raw.color_red));
        colors.add(new Word("Green","chokokki",R.drawable.color_green,R.raw.color_green));
        colors.add(new Word("Brown","ṭakaakki",R.drawable.color_brown,R.raw.color_brown));
        colors.add(new Word("Gray","ṭopoppi",R.drawable.color_gray,R.raw.color_gray));
        colors.add(new Word("Black","kululli",R.drawable.color_black,R.raw.color_black));
        colors.add(new Word("White","kelelli",R.drawable.color_white,R.raw.color_white));
        colors.add(new Word("Dusty Yellow","ṭopiisә",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        colors.add(new Word("Mustard Yellow","chiwiiṭә",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));



        WordAdapter adapter= new WordAdapter(this,colors, R.color.category_colors);
        ListView colorsListView= (ListView) findViewById(R.id.colorsListView);
        colorsListView.setAdapter(adapter);
    }
}
