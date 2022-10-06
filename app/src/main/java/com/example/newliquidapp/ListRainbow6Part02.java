package com.example.newliquidapp;

public class ListRainbow6Part02 {

    private int id;
    private int imageViewPart02;
    private int Color;

    public ListRainbow6Part02(int id, int imageViewPart02, int color) {
        this.id = id;
        this.imageViewPart02 = imageViewPart02;
        this.Color = color;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setColor(int color) {
        Color = color;
    }

    public void setImageViewPart02(int imageViewPart02) {
        this.imageViewPart02 = imageViewPart02;
    }

    public int getId() {
        return id;
    }

    public int getColor() {
        return Color;
    }

    public int getImageViewPart02() {
        return imageViewPart02;
    }
}
