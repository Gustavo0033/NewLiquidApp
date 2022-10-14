package com.example.newliquidapp;

public class List_EsportivoTL {

    private int id;
    private int imageJersey;
    private int Color;
    private int NameJersey;

    public List_EsportivoTL(int id, int imageJersey, int color, int nameJersey) {
        this.id = id;
        this.imageJersey = imageJersey;
        this.Color = color;
        this.NameJersey = nameJersey;
    }

    public int getId() {
        return id;
    }

    public int getColor() {
        return Color;
    }

    public int getImageJersey() {
        return imageJersey;
    }

    public int getNameJersey() {
        return NameJersey;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setColor(int color) {
        Color = color;
    }

    public void setImageJersey(int imageJersey) {
        this.imageJersey = imageJersey;
    }

    public void setNameJersey(int nameJersey) {
        NameJersey = nameJersey;
    }
}
