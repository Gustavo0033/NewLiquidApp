package com.example.newliquidapp;

public class MainItem_FreeFIre {

    private int id;
    private int drawableId;
    private int textStringId;
    private int Color;

    public MainItem_FreeFIre(int id, int drawableId, int textStringId, int color) {
        this.id = id;
        this.drawableId = drawableId;
        this.Color = color;
        this.textStringId = textStringId;
    }

    public void setColor(int color) {
        Color = color;
    }

    public void setDrawableId(int drawableId) {
        this.drawableId = drawableId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getColor() {
        return Color;
    }

    public int getDrawableId() {
        return drawableId;
    }

    public int getId() {
        return id;
    }

    public int getTextStringId() {
        return textStringId;
    }

    public void setTextStringId(int textStringId) {
        this.textStringId = textStringId;
    }
}
