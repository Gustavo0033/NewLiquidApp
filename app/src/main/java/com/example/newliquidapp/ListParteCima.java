package com.example.newliquidapp;

public class ListParteCima {
    private int id;
    private int imageRoupa;
    private int nameRoupa;
    private int Color;

    public ListParteCima(int id, int imageRoupa, int nameRoupa, int color) {
        this.id = id;
        this.imageRoupa = imageRoupa;
        this.nameRoupa = nameRoupa;
        this.Color = color;
    }

    public int getId() {
        return id;
    }

    public int getColor() {
        return Color;
    }

    public int getImageRoupa() {
        return imageRoupa;
    }

    public int getNameRoupa() {
        return nameRoupa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setColor(int color) {
        Color = color;
    }

    public void setImageRoupa(int imageRoupa) {
        this.imageRoupa = imageRoupa;
    }

    public void setNameRoupa(int nameRoupa) {
        this.nameRoupa = nameRoupa;
    }
}
