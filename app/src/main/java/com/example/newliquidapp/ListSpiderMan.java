package com.example.newliquidapp;

public class ListSpiderMan {

    private int id;
    private int imageJersey;
    private int Color;

    public ListSpiderMan(int id, int imageJersey, int Color) {
        this.id = id;
        this.imageJersey = imageJersey;
        this.Color = Color;

    }

    public int getId() {
        return id;
    }

    public int getImageJersey() {
        return imageJersey;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImageJersey(int imageJersey) {
        this.imageJersey = imageJersey;
    }

    public int getColor() {
        return Color;
    }

    public void setColor(int color) {
        Color = color;
    }

}
