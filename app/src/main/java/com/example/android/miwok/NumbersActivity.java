package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<Word> words=new ArrayList<Word>();
        words.add(new Word(R.drawable.number_one,"one","Lutti"));
        words.add(new Word(R.drawable.number_two,"two","otiko"));
        words.add(new Word(R.drawable.number_three,"three","tolookosu"));
        words.add(new Word(R.drawable.number_four,"four","oyyisa"));
        words.add(new Word(R.drawable.number_five,"five","massokka"));
        words.add(new Word(R.drawable.number_six,"six","temmokka"));
        words.add(new Word(R.drawable.number_seven,"seven","kenekaku"));
        words.add(new Word(R.drawable.number_eight,"eight","kawinta"));
        words.add(new Word(R.drawable.number_nine,"nine","wo'e"));
        words.add(new Word(R.drawable.number_ten,"ten","na`aacha"));
        CustomAdaptor itemsAdapter = new CustomAdaptor(this,words,R.color.category_numbers);
        ListView listView =(ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}