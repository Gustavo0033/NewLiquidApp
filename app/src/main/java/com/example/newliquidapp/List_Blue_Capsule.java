package com.example.newliquidapp;

public class List_Blue_Capsule {

    private int id;
    private int imageView;
    private int textViewCapsule;


    public List_Blue_Capsule(int id, int imageView, int textViewCapsule) {
        this.id = id;
        this.imageView = imageView;
        this.textViewCapsule = textViewCapsule;

    }

    public int getId() {
        return id;
    }

    public int getImageView() {
        return imageView;
    }



    public void setId(int id) {
        this.id = id;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }

    public int getTextViewCapsule() {
        return textViewCapsule;
    }

    public void setTxtView(int textViewCapsule) {
        this.textViewCapsule = textViewCapsule;
    }
}
