package com.example.newliquidapp;

public class MainItem_csgo {

    private int id;
    private int drawableId;
    private int Color;
    private int textStringId;


    public MainItem_csgo(int id, int drawableId,int textStringId, int color) {
        this.id = id;
        this.drawableId = drawableId;
        this.Color = color;
        this.textStringId = textStringId;

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDrawableId(int drawableId) {
        this.drawableId = drawableId;
    }

    public void setColor(int color) {
        Color = color;
    }

    public int getId() {
        return id;
    }

    public int getDrawableId() {
        return drawableId;
    }

    public int getColor() {
        return Color;
    }

    public void setTextStringId(int textStringId) {
        this.textStringId = textStringId;
    }

    public int getTextStringId() {
        return textStringId;
    }
}
