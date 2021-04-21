package com.example.recyclerviewinabdroid;

public class Modelclass {

    private int imageview1;
    private String  textview1, textView2,tetview3;
    private  String divider;

    Modelclass(int imageview1,String textview1,String textView2,String textView3,String divider ){
        this.imageview1=imageview1;
        this.textview1=textview1;
        this.textView2=textView2;
        this.tetview3=textView3;
        this.divider=divider;
    }


    public int getImageview1() {
        return imageview1;
    }

    public String getTextview1() {
        return textview1;
    }

    public String getTextView2() {
        return textView2;
    }

    public String getTetview3() {
        return tetview3;
    }

    public String getDivider() {
        return divider;
    }
}
