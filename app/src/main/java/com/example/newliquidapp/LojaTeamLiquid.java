package com.example.newliquidapp;

public class LojaTeamLiquid {

    private int id;
    private int ImageClothing;
    private int Color;
    private int txt_name_lancamento;

    public LojaTeamLiquid(int id, int imageClothing, int Color, int txt_name_lancamento) {
        this.id = id;
        this.ImageClothing = imageClothing;
        this.Color = Color;
        this.txt_name_lancamento = txt_name_lancamento;
    }

    public int getId() {
        return id;
    }

    public int getImageClothing() {
        return ImageClothing;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImageClothing(int imageClothing) {
        this.ImageClothing = imageClothing;
    }

    public int getColor() {
        return Color;
    }

    public void setColor(int color) {
        this.Color = color;
    }

    public int getTxt_name_lancamento() {
        return txt_name_lancamento;
    }

    public void setTxt_name_lancamento(int txt_name_lancamento) {
        this.txt_name_lancamento = txt_name_lancamento;
    }
}
