package com.example.newliquidapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class Campeonatos extends AppCompatActivity {

    private RecyclerView Teste;
    private RecyclerView CampeonatosTL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campeonatos);

        CampeonatosTL = findViewById(R.id.campeonatosLiquid);


       List<InfoCampeonato> InfoCamps = new ArrayList<>();
       InfoCamps.add(new InfoCampeonato(1,R.drawable.png_fortnite, Color.BLUE));
       InfoCamps.add(new InfoCampeonato(2,R.drawable.b4d710c6bc6c9009e8b88d9e2326ddec, Color.BLACK));
       InfoCamps.add(new InfoCampeonato(3, R.drawable.free_fire_logo_12, Color.BLACK));

        CampeonatosTL.setLayoutManager(new LinearLayoutManager(this));
        adapterCampeonatos adapter = new adapterCampeonatos(InfoCamps);
        CampeonatosTL.setAdapter(adapter);



    }

    private class adapterCampeonatos extends RecyclerView.Adapter<CampsViewHolder>{

        private List<InfoCampeonato> infoCamps;

        public adapterCampeonatos(List<InfoCampeonato> infoCamps){
            this.infoCamps = infoCamps;
        }

        @NonNull
        @Override
        public CampsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new CampsViewHolder(getLayoutInflater().inflate(R.layout.recycleview_campeonatos,parent,false));
        }

        @Override
        public void onBindViewHolder(@NonNull CampsViewHolder holder, int position) {
            InfoCampeonato mainItemCurrent = infoCamps.get(position);
            holder.bind(mainItemCurrent);
        }

        @Override
        public int getItemCount() {
            return infoCamps.size() ;
        }
    }


    private class CampsViewHolder extends RecyclerView.ViewHolder{

        public CampsViewHolder(@NonNull View itemView) {
            super(itemView);
        }


    public class testeViewHolder extends RecyclerView.ViewHolder{

        public testeViewHolder(@NonNull View itemView) {
            super(itemView);
        }

    }
        public void bind(InfoCampeonato item){
            ImageView imageView = itemView.findViewById(R.id.imageCamps);
            LinearLayout container = (LinearLayout) itemView;


            container.setBackgroundColor(item.getColor());
            imageView.setImageResource(item.getImageGame());



    }

    }

}