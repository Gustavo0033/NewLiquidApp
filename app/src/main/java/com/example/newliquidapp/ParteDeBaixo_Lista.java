package com.example.newliquidapp;

public class ParteDeBaixo_Lista {
    private int id;
    private int imageBaixo;
    private int textBaixo;

    public ParteDeBaixo_Lista(int id, int imageBaixo, int textBaixo) {
        this.id = id;
        this.imageBaixo = imageBaixo;
        this.textBaixo = textBaixo;
    }

    public int getId() {
        return id;
    }

    public int getImageBaixo() {
        return imageBaixo;
    }

    public int getTextBaixo() {
        return textBaixo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImageBaixo(int imageBaixo) {
        this.imageBaixo = imageBaixo;
    }

    public void setTextBaixo(int textBaixo) {
        this.textBaixo = textBaixo;
    }
}
