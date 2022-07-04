package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<Word> familymembers=new ArrayList<Word>();
        familymembers.add(new Word(R.drawable.family_father,"father","apa"));
        familymembers.add(new Word(R.drawable.family_mother,"mother","ata"));
        familymembers.add(new Word(R.drawable.family_son,"son","angsi"));
        familymembers.add(new Word(R.drawable.family_daughter,"daughter","tunne"));
        familymembers.add(new Word(R.drawable.family_older_brother,"older brother","taachi"));
        familymembers.add(new Word(R.drawable.family_younger_brother,"younger brother","challiti"));
        familymembers.add(new Word(R.drawable.family_older_sister,"older sister","tete"));
        familymembers.add(new Word(R.drawable.family_younger_brother,"younger sister","kolliti"));
        familymembers.add(new Word(R.drawable.family_grandmother,"grandmother","ama"));
        familymembers.add(new Word(R.drawable.family_grandfather,"grandfather","paapa"));
        CustomAdaptor itemsAdapter = new CustomAdaptor(this,familymembers,R.color.category_family);
        ListView listView =(ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}