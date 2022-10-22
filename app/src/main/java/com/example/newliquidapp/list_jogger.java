package com.example.newliquidapp;

public class list_jogger {
    private int id;
    private int imageView;

    public list_jogger(int id, int imageView) {
        this.id = id;
        this.imageView = imageView;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }

    public int getId() {
        return id;
    }

    public int getImageView() {
        return imageView;
    }
}
