package com.example.newliquidapp;

public class CampValorant {

    private int id;
    private int ImageCamp;
    private int Color;

    public CampValorant(int id, int imageCamp, int Color) {
        this.id = id;
        ImageCamp = imageCamp;
        this.Color = Color;
    }

    public int getId() {
        return id;
    }

    public int getImageCamp() {
        return ImageCamp;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImageCamp(int imageCamp) {
        ImageCamp = imageCamp;
    }

    public int getColor() {
        return Color;
    }

    public void setColor(int color) {
        Color = color;
    }
}
