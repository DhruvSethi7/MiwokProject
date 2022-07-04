package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;
public class CustomAdaptor extends ArrayAdapter<Word>{
    private int textbackcolor;
    public CustomAdaptor(Activity context,ArrayList<Word> words,int textbackcolor) {
        super(context,0, words);
        this.textbackcolor=textbackcolor;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_items, parent, false);
        }
        Word currentword = getItem(position);
        TextView Miwoktext = (TextView) listItemView.findViewById(R.id.MiwokWord);
        Miwoktext.setText(currentword.getMiwok());
        TextView  EnglishText = (TextView) listItemView.findViewById(R.id.EnglishWord);
        EnglishText.setText(currentword.getEnglishText());
        ImageView imageView=(ImageView)listItemView.findViewById(R.id.image);
        if(currentword.Imageexist()){
            imageView.setImageResource(currentword.getImageresourceid());
            imageView.setVisibility(View.VISIBLE);
        }
        else{
            imageView.setVisibility(View.GONE);
        }
        View textcontainear= listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),textbackcolor);
        textcontainear.setBackgroundColor(color);
        return listItemView;
    }
}
