package com.example.newliquidapp;

public class ListJersey2021 {

    private int id;
    private int ImageJersey;
    private int txtNameJersey;
    private int Color;

    public ListJersey2021(int id, int imageJersey, int txtNameJersey, int color) {
        this.id = id;
        this.ImageJersey = imageJersey;
        this.txtNameJersey = txtNameJersey;
        this.Color = color;
    }

    public int getImageJersey() {
        return ImageJersey;
    }

    public int getColor() {
        return Color;
    }

    public int getId() {
        return id;
    }

    public int getTxtNameJersey() {
        return txtNameJersey;
    }

    public void setImageJersey(int imageJersey) {
        ImageJersey = imageJersey;
    }

    public void setColor(int color) {
        Color = color;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTxtNameJersey(int txtNameJersey) {
        this.txtNameJersey = txtNameJersey;
    }
}
