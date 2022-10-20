package com.example.newliquidapp;

public class list_brExclusive {

    private int id;
    private int imageview;
    private int textView;

    public list_brExclusive(int id, int imageview, int textView) {
        this.id = id;
        this.imageview = imageview;
        this.textView = textView;
    }

    public int getId() {
        return id;
    }

    public int getImageview() {
        return imageview;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImageview(int imageview) {
        this.imageview = imageview;
    }

    public int getTextView() {
        return textView;
    }

    public void setTextView(int textView) {
        this.textView = textView;
    }
}
