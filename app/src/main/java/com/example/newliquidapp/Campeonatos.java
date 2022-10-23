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


    private RecyclerView CampeonatosTL;
    private View btn_back_main;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_campeonatos);

        btn_back_main = findViewById(R.id.btn_back_mainActivity);
        btn_back_main.setOnClickListener(view -> {
            Intent intent = new Intent(Campeonatos.this, MainActivity.class);
            startActivity(intent);
        });


        CampeonatosTL = findViewById(R.id.campeonatosLiquid);


       List<InfoCampeonato> InfoCamps = new ArrayList<>();
       InfoCamps.add(new InfoCampeonato(1,R.drawable.fortnite_logo_preto, Color.TRANSPARENT));
       InfoCamps.add(new InfoCampeonato(2,R.drawable.b4d710c6bc6c9009e8b88d9e2326ddec, Color.BLACK));
       InfoCamps.add(new InfoCampeonato(3, R.drawable.freefire_teste, Color.WHITE));
       InfoCamps.add(new InfoCampeonato(4, R.drawable.csgo_liquid_branca, Color.GRAY));
       InfoCamps.add(new InfoCampeonato(5, R.drawable.valorant_logo, Color.WHITE));

        CampeonatosTL.setLayoutManager(new LinearLayoutManager(this));
        adapterCampeonatos adapter = new adapterCampeonatos(InfoCamps);
        adapter.setListener(id -> {
            switch (id){
                case 1:
                    startActivity(new Intent(Campeonatos.this, Campeonatos_Fortnite.class));
                    break;
                case 2:
                    startActivity(new Intent(Campeonatos.this, CampeonatosRainbow6.class));
                    break;
                case 3:
                    startActivity(new Intent(Campeonatos.this, FreeFire_Liquid.class));
                    break;
                case 4:
                    startActivity(new Intent(Campeonatos.this, CsGo_Liquid.class));
                    break;
                case 5:
                    startActivity(new Intent(Campeonatos.this, Valorant_Liquid.class));
                    break;
            }

        });
        CampeonatosTL.setAdapter(adapter);



    }

    private class adapterCampeonatos extends RecyclerView.Adapter<adapterCampeonatos.CampsViewHolder>{

        private List<InfoCampeonato> infoCamps;
        private clickCampeonatos listener;

        public adapterCampeonatos(List<InfoCampeonato> infoCamps){
            this.infoCamps = infoCamps;
        }

        public void setListener(clickCampeonatos listener) {
            this.listener = listener;
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
        private class CampsViewHolder extends RecyclerView.ViewHolder{

            public CampsViewHolder(@NonNull View itemView) {
                super(itemView);
            }

            public void bind(InfoCampeonato item){
                ImageView imageView = itemView.findViewById(R.id.imageCamps);
                LinearLayout container = (LinearLayout) itemView;

                container.setOnClickListener(view -> {
                    listener.onClick(item.getId());
                });


                container.setBackgroundColor(item.getColor());
                imageView.setImageResource(item.getImageGame());


            }

        }


    }


}