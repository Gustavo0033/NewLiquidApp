package com.example.newliquidapp;

public class CampRainbow6 {
    private int id;
    private int ImageCamp;
    private int Color;

    public CampRainbow6(int id, int imageCamp, int color) {
        this.id = id;
        ImageCamp = imageCamp;
        Color = color;
    }

    public void setColor(int color) {
        Color = color;
    }

    public void setImageCamp(int imageCamp) {
        ImageCamp = imageCamp;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getColor() {
        return Color;
    }

    public int getImageCamp() {
        return ImageCamp;
    }

    public int getId() {
        return id;
    }
}
