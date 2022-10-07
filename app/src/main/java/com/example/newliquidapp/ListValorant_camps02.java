package com.example.newliquidapp;

public class ListValorant_camps02 {
    private int id;
    private int imageCamp_Valorant;
    private int Color;

    public ListValorant_camps02(int id, int imageCamp_Valorant, int color) {
        this.id = id;
        this.imageCamp_Valorant = imageCamp_Valorant;
        Color = color;
    }

    public int getColor() {
        return Color;
    }

    public int getId() {
        return id;
    }

    public int getImageCamp_Valorant() {
        return imageCamp_Valorant;
    }

    public void setColor(int color) {
        Color = color;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImageCamp_Valorant(int imageCamp_Valorant) {
        this.imageCamp_Valorant = imageCamp_Valorant;
    }
}
