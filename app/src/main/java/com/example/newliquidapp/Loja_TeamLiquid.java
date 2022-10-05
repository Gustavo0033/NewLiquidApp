package com.example.newliquidapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class Loja_TeamLiquid extends AppCompatActivity {

    private RecyclerView LojaTL;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loja_team_liquid);

        List<LojaTeamLiquid> LojaLiquid = new ArrayList<>();
        LojaLiquid.add(new LojaTeamLiquid(1,R.drawable.csgo_liquid_preto, Color.GREEN));
        LojaLiquid.add(new LojaTeamLiquid(2,R.drawable.csgo_liquid_preto, Color.GREEN));
        LojaLiquid.add(new LojaTeamLiquid(3,R.drawable.csgo_liquid_preto, Color.GREEN));
        LojaLiquid.add(new LojaTeamLiquid(4,R.drawable.csgo_liquid_preto, Color.GREEN));
        LojaLiquid.add(new LojaTeamLiquid(5,R.drawable.csgo_liquid_preto, Color.GREEN));
        LojaLiquid.add(new LojaTeamLiquid(6,R.drawable.csgo_liquid_preto, Color.GREEN));


        LojaTL = findViewById(R.id.camisetaAzulescuro);
        LojaTL.setLayoutManager(new GridLayoutManager(this, 2));
        lojaAdapter adapter = new lojaAdapter(LojaLiquid);
        adapter.setListener(id ->{
        switch (id){
            case 1:startActivity(new Intent(Loja_TeamLiquid.this, CsGo_Liquid.class));
            break;
            case 2:startActivity(new Intent(Loja_TeamLiquid.this, perfilBSTRDD_Valorant.class));
            break;
            case 3:startActivity(new Intent(Loja_TeamLiquid.this, perfilDAIKI_Valorant.class));
            break;
            case 4:startActivity(new Intent(Loja_TeamLiquid.this, perfilNAT1_Valorant.class));
            break;
            case 5:startActivity(new Intent(Loja_TeamLiquid.this, perfilDRN_Valorant.class));
            break;
            case 6:startActivity(new Intent(Loja_TeamLiquid.this, players_FreeFire.class));
            break;
        }

        });
        LojaTL.setAdapter(adapter);

    }
    private class lojaAdapter extends RecyclerView.Adapter<lojaAdapter.lojaViewHolder>{

        private List<LojaTeamLiquid> LojaLiquid;
        private TeamLiquidStore listener;

        public lojaAdapter(List<LojaTeamLiquid> LojaLiquid) {
            this.LojaLiquid = LojaLiquid;
        }

        public void setListener(TeamLiquidStore listener) {
            this.listener = listener;
        }

        @NonNull
        @Override
        public lojaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new lojaViewHolder(getLayoutInflater().inflate(R.layout.recycleview_loja,parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull lojaViewHolder holder, int position) {
            LojaTeamLiquid mainItemCurrent = LojaLiquid.get(position);
            holder.bind(mainItemCurrent);

        }

        @Override
        public int getItemCount() {
            return LojaLiquid.size();
        }
        private class lojaViewHolder extends RecyclerView.ViewHolder{

            public lojaViewHolder(@NonNull View itemView) {
                super(itemView);
            }

            public void bind(LojaTeamLiquid item){
                ImageView imageView = itemView.findViewById(R.id.camisetaAzulescuro);
                LinearLayout container = (LinearLayout) itemView;

                container.setOnClickListener(view -> {
                    listener.onClick(item.getId());
                });


                container.setBackgroundColor(item.getColor());
                imageView.setImageResource(item.getId());
            }
        }
    }


}



