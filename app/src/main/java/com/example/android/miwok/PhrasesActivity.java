package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<Word> phrases=new ArrayList<Word>();
        phrases.add(new Word("Where are you going?","minto wuksus"));
        phrases.add(new Word("What is your name?","tinnә oyaase'nә"));
        phrases.add(new Word("My name is...","oyaaset..."));
        phrases.add(new Word("How are you feeling?","michәksәs?"));
        phrases.add(new Word("I’m feeling good.","kuchi achit"));
        phrases.add(new Word("Are you coming?","әәnәs'aa?"));
        phrases.add(new Word("Yes, I’m coming.","hәә’ әәnәm"));
        phrases.add(new Word("I’m coming.","әәnәm"));
        phrases.add(new Word("Let’s go.","yoowutis"));
        phrases.add(new Word("Come here.","әnni'nem"));
        CustomAdaptor itemsAdapter = new CustomAdaptor(this,phrases,R.color.category_phrases);
        ListView listView =(ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);}}