package com.example.newliquidapp;

public class InfoCampeonato {

    private int id;
    private int image;
    private int Color;


    public InfoCampeonato(int id, int image, int Color) {
        this.id = id;
        this.image = image;
        this.Color = Color;

    }

    public int getId() {
        return id;
    }


    public int getImageGame() {
        return image;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setColor(int Color) {
        this.Color = Color;
    }

    public int getColor() {
        return Color;
    }

    public void setimage(int image) {
        this.image = image;
    }
}
