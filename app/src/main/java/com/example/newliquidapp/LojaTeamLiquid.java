package com.example.newliquidapp;

public class LojaTeamLiquid {

    private int id;
    private int ImageClothing;
    private int Color;

    public LojaTeamLiquid(int id, int imageClothing, int Color) {
        this.id = id;
        this.ImageClothing = imageClothing;
        this.Color = Color;
    }

    public int getId() {
        return id;
    }

    public int getImageClothing() {
        return ImageClothing;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImageClothing(int imageClothing) {
        this.ImageClothing = imageClothing;
    }

    public int getColor() {
        return Color;
    }

    public void setColor(int color) {
        this.Color = color;
    }
}
