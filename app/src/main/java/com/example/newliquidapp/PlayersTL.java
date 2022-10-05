package com.example.newliquidapp;

public class PlayersTL {

    private int id;
    private int imagePlayers;
    private int Color;

    public PlayersTL(int id, int imagePlayers, int Color) {
        this.id = id;
        this.imagePlayers = imagePlayers;
        this.Color = Color;
    }

    public int getId() {
        return id;
    }

    public int getImagePlayers() {
        return imagePlayers;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImagePlayers(int imagePlayers) {
        this.imagePlayers = imagePlayers;
    }

    public int getColor() {
        return Color;
    }

    public void setColor(int color) {
        Color = color;
    }
}
