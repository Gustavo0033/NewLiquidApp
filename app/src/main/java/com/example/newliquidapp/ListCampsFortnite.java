package com.example.newliquidapp;

public class ListCampsFortnite {
    private int id;
    private int ImageOfCamp;
    private int Color;

    public ListCampsFortnite(int id, int imageOfCamp, int color) {
        this.id = id;
        this.ImageOfCamp = imageOfCamp;
        this.Color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getColor() {
        return Color;
    }

    public void setColor(int color) {
        Color = color;
    }

    public int getImageOfCamp() {
        return ImageOfCamp;
    }

    public void setImageOfCamp(int imageOfCamp) {
        ImageOfCamp = imageOfCamp;
    }
}
