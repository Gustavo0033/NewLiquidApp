package com.example.newliquidapp;

public class FortniteList {

    private int id;
    private int imageView;
    private int Color;
    private int NamePlayer;

    public FortniteList(int id, int imageView, int Color, int NamePlayer) {
        this.id = id;
        this.imageView = imageView;
        this.Color = Color;
        this.NamePlayer = NamePlayer;
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

    public int getColor() {
        return Color;
    }

    public void setColor(int color) {
        this.Color = color;
    }

    public int getNamePlayer() {
        return NamePlayer;
    }

    public void setNamePlayer(int namePlayer) {
        NamePlayer = namePlayer;
    }
}
