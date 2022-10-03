package com.example.newliquidapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class Campeonatos extends AppCompatActivity {

    private RecyclerView Teste;
    private RecyclerView CampeonatosTL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campeonatos);

        Teste = findViewById(R.id.teste_telinha);
        Teste.setLayoutManager(new LinearLayoutManager(this));
        testeAdapter TestAdapter = new testeAdapter();
        Teste.setAdapter(TestAdapter);


        CampeonatosTL = findViewById(R.id.campeonatosLiquid);
        CampeonatosTL.setLayoutManager(new LinearLayoutManager(this));
        adapterCampeonatos adapter = new adapterCampeonatos();
        CampeonatosTL.setAdapter(adapter);

    }

    private class adapterCampeonatos extends RecyclerView.Adapter<CampsViewHolder>{

        @NonNull
        @Override
        public CampsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new CampsViewHolder(getLayoutInflater().inflate(R.layout.recycleview_campeonatos,parent,false));
        }

        @Override
        public void onBindViewHolder(@NonNull CampsViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 6 ;
        }
    }












    // RECYCLEVIEW DA SEGUNDA TELA

    private class CampsViewHolder extends RecyclerView.ViewHolder{

        public CampsViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    private class testeAdapter extends RecyclerView.Adapter<testeViewHolder>{

        @NonNull
        @Override
        public testeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new testeViewHolder(getLayoutInflater().inflate(R.layout.recycleview_teste_telinha,parent,false));
        }

        @Override
        public void onBindViewHolder(@NonNull testeViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 6;
        }
    }

    public class testeViewHolder extends RecyclerView.ViewHolder{

        public testeViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}