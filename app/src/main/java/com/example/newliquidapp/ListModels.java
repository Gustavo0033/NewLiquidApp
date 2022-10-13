package com.example.newliquidapp;

public class ListModels {

    private int id;
    private int imageModel;
    private int Color;
    private int NameModel;

    public ListModels(int id, int imageModel, int color, int NameModel) {
        this.id = id;
        this.imageModel = imageModel;
        this.Color = color;
        this.NameModel = NameModel;
    }

    public int getColor() {
        return Color;
    }

    public int getId() {
        return id;
    }

    public int getImageModel() {
        return imageModel;
    }

    public void setColor(int color) {
        Color = color;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImageModel(int imageModel) {
        this.imageModel = imageModel;
    }

    public int getNameModel() {
        return NameModel;
    }

    public void setNameModel(int nameModel) {
        NameModel = nameModel;
    }
}
