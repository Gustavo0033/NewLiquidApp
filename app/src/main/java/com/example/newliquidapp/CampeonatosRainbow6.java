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
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CampeonatosRainbow6 extends AppCompatActivity {

    private RecyclerView Rainbow6_Campeonatos;
    private RecyclerView Rainbow6_CampeonatosPart02;
    private View btn_back_CampsR6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campeonatos_rainbow6);

        btn_back_CampsR6 = findViewById(R.id.btn_back_campsR6);
        btn_back_CampsR6.setOnClickListener(view ->{
            Intent intent = new Intent(CampeonatosRainbow6.this, Campeonatos.class);
            startActivity(intent);
        });






        Rainbow6_Campeonatos = findViewById(R.id.CampeonatoR6);

        List<CampRainbow6> ListRainbowR = new ArrayList<>();
        ListRainbowR.add(new CampRainbow6(1, R.drawable.rainbow_6_invitational_logo_full, Color.TRANSPARENT));



        Rainbow6_Campeonatos.setLayoutManager(new LinearLayoutManager(this));
        CampR6Adapter adapter = new CampR6Adapter(ListRainbowR);

        adapter.setListener(id -> {
            switch (id){
                case 1:
                    startActivity(new Intent(CampeonatosRainbow6.this,InfoCampsR6.class ));
                    break;

            }
        });
        Rainbow6_Campeonatos.setAdapter(adapter);

        //Rainbow6 2 recycleView







        Rainbow6_CampeonatosPart02 = findViewById(R.id.BrasileiraoR6);

        List<ListRainbow6Part02> ListRainbow6_02 = new ArrayList<>();
        ListRainbow6_02.add(new ListRainbow6Part02(1, R.drawable.brasileir_or6, Color.TRANSPARENT));
        ListRainbow6_02.add(new ListRainbow6Part02(2, R.drawable._00px_rainbow_six_pro_league, Color.TRANSPARENT));


        Rainbow6_CampeonatosPart02.setLayoutManager(new LinearLayoutManager(this));
        CampPT02Adapter adapter02 = new CampPT02Adapter( ListRainbow6_02);

        adapter02.setListener(id02 -> {
            switch (id02){
                case 1: startActivity(new Intent(CampeonatosRainbow6.this, BrasilieraoR6.class));
                    break;
                case 2:
                    startActivity(new Intent(CampeonatosRainbow6.this,InvitationalR6.class ));
                    break;

            }
        });
        Rainbow6_CampeonatosPart02.setAdapter(adapter02);

    }

    private class CampR6Adapter extends RecyclerView.Adapter<CampR6Adapter.ViewHolderCampR6>{

        private List<CampRainbow6> ListRainbow6;
        private onClickCampR6 listener;

        public CampR6Adapter(List<CampRainbow6> ListRainbow6){
            this.ListRainbow6 = ListRainbow6;
        }

        public void setListener(onClickCampR6 listener){
            this.listener = listener;
        }

        @NonNull
        @Override
        public ViewHolderCampR6 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolderCampR6(getLayoutInflater().inflate(R.layout.campeonato_rainbow6, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolderCampR6 holder, int position) {
            CampRainbow6 mainItemCurrent = ListRainbow6.get(position);
            holder.bind(mainItemCurrent);
        }

        @Override
        public int getItemCount() {
            return ListRainbow6.size();
        }


    private class ViewHolderCampR6 extends RecyclerView.ViewHolder{

        public ViewHolderCampR6(@NonNull View itemView) {
            super(itemView);
        }
        public void bind( CampRainbow6 item){
            ImageView imageView = itemView.findViewById(R.id.imageR6Campeonato);
            LinearLayout container = (LinearLayout) itemView;

            container.setOnClickListener(View ->{
                listener.onClick(item.getId());
            });

            imageView.setImageResource(item.getImageCamp());
            container.setBackgroundColor(item.getColor());
        }

    }


    // SEGUNDA RECYCLEVIEW


    }

    private class CampPT02Adapter extends RecyclerView.Adapter<CampPT02Adapter.ViewHolderPT02>{

        private List<ListRainbow6Part02> ListRainbow6_02;
        private onClickCampR6_02 listener02;

        public CampPT02Adapter(List<ListRainbow6Part02> ListRainbow6_02){
            this.ListRainbow6_02 = ListRainbow6_02;
        }

        public void setListener(onClickCampR6_02 listener02){
            this.listener02 = listener02;
        }


        @NonNull
        @Override
        public ViewHolderPT02 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolderPT02(getLayoutInflater().inflate(R.layout.campeonator6_parte02, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolderPT02 holder, int position) {
        ListRainbow6Part02 mainItemCurrent02 = ListRainbow6_02.get(position);
        holder.bind(mainItemCurrent02);
        }

        @Override
        public int getItemCount() {
            return ListRainbow6_02.size();
        }


    private class ViewHolderPT02 extends RecyclerView.ViewHolder{

        public ViewHolderPT02(@NonNull View itemView) {
            super(itemView);
        }

        public void bind(ListRainbow6Part02 item){
            ImageView imgView02 = itemView.findViewById(R.id.BrasileiroR6);
            LinearLayout container02 = (LinearLayout) itemView;

            container02.setOnClickListener(view -> {
                listener02.onClick_02(item.getId());
            });

            imgView02.setImageResource(item.getImageViewPart02());
            container02.setBackgroundColor(item.getColor());

        }
    }

}
 }