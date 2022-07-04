package com.example.android.miwok;

import android.widget.ImageView;

public class Word {
    private String MiwokText;
    private String EnglishText;
    private int imageresourceid=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    public Word(String EnglishText, String Miwoktext){
        this.EnglishText=EnglishText;
        this.MiwokText=Miwoktext;
    }
    public Word(int imageresourceid,String EnglishText,String Miwoktext){
        this.imageresourceid=imageresourceid;
        this.EnglishText=EnglishText;
        this.MiwokText=Miwoktext;
    }
    public int getImageresourceid() {
        return imageresourceid;
    }
    public String getMiwok(){
        return MiwokText;
    }
    public String getEnglishText(){
        return EnglishText;
    }
    public boolean Imageexist()
    {return imageresourceid!=NO_IMAGE_PROVIDED;}
}
