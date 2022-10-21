package com.example.newliquidapp;

public class List_acessorios {
    private int id;
    private int imageAcessorio;
    private int txtNameAcessories;

    public List_acessorios(int id, int imageAcessorio, int txtNameAcessories) {
        this.id = id;
        this.imageAcessorio = imageAcessorio;
        this.txtNameAcessories = txtNameAcessories;
    }

    public int getImageAcessorio() {
        return imageAcessorio;
    }

    public int getTxtNameAcessories() {
        return txtNameAcessories;
    }

    public int getId() {
        return id;
    }

    public void setImageAcessorio(int imageAcessorio) {
        this.imageAcessorio = imageAcessorio;
    }

    public void setTxtNameAcessories(int txtNameAcessories) {
        this.txtNameAcessories = txtNameAcessories;
    }

    public void setId(int id) {
        this.id = id;
    }
}