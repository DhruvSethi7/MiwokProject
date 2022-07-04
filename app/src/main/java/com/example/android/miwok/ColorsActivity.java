package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<Word> colors=new ArrayList<Word>();
        colors.add(new Word(R.drawable.color_red,"red","weṭeṭṭi"));
        colors.add(new Word(R.drawable.color_green,"green","chokokki"));
        colors.add(new Word(R.drawable.color_brown,"brown","ṭakaakki"));
        colors.add(new Word(R.drawable.color_gray,"gray","ṭopoppi"));
        colors.add(new Word(R.drawable.color_black,"black","kululli"));
        colors.add(new Word(R.drawable.color_white,"white","kelelli"));
        colors.add(new Word(R.drawable.color_dusty_yellow,"dusty yellow","ṭopiisә"));
        colors.add(new Word(R.drawable.color_mustard_yellow,"mustard yellow","chiwita"));
        CustomAdaptor itemsAdapter = new CustomAdaptor(this,colors,R.color.category_colors);
        ListView listView =(ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}