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

public class Campeonatos_Fortnite extends AppCompatActivity {

    private View btn_back_campeonatos;
    private RecyclerView CampeonatosFornite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_campeonatos_fortnite);

        btn_back_campeonatos = findViewById(R.id.btn_back_camps_fornite);
        btn_back_campeonatos.setOnClickListener(view ->{
            Intent intent = new Intent(Campeonatos_Fortnite.this, Campeonatos.class);
            startActivity(intent);
        });






        CampeonatosFornite = findViewById(R.id.CampFortnite);
        CampeonatosFornite.setLayoutManager(new LinearLayoutManager(this));


        List<ListCampsFortnite> ListFortnite = new ArrayList<>();
        CampFortAdapter adapter = new CampFortAdapter(ListFortnite);

        ListFortnite.add(new ListCampsFortnite(1, R.drawable.teamliquid_plus, Color.TRANSPARENT));
        ListFortnite.add(new ListCampsFortnite(2, R.drawable.teamliquid_plus, Color.GREEN));





        adapter.setListenerCampsFort(id -> {
            switch (id){
                case 1:
                    startActivity(new Intent(Campeonatos_Fortnite.this, Fortnite_Camps.class));
                    break;
                case 2:
                    startActivity(new Intent(Campeonatos_Fortnite.this, Valorant_Liquid.class));
                    break;
            }
        });



        CampeonatosFornite.setAdapter(adapter);









    }

    private class CampFortAdapter extends RecyclerView.Adapter<CampFortAdapter.ViewHolderFort>{

        private List<ListCampsFortnite> ListFortnite;
        private onClickCampFortnite listenerCampsFort;


        public CampFortAdapter(List<ListCampsFortnite> ListFortnite){
            this.ListFortnite = ListFortnite;
        }

        public void setListenerCampsFort(onClickCampFortnite listenerCampsFort){
            this.listenerCampsFort = listenerCampsFort;
        }


        @NonNull
        @Override
        public ViewHolderFort onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolderFort(getLayoutInflater().inflate(R.layout.fornite_campeonatos, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolderFort holder, int position) {

            ListCampsFortnite mainItemCurrentFort = ListFortnite.get(position);
            holder.bind(mainItemCurrentFort);

        }

        @Override
        public int getItemCount() {
            return ListFortnite.size();
        }


    private class ViewHolderFort extends RecyclerView.ViewHolder{

        public ViewHolderFort(@NonNull View itemView) {
            super(itemView);
        }

        public void bind(ListCampsFortnite item){
            ImageView imgViewCampFortnite = itemView.findViewById(R.id.CampeonatoFortnite_Liquid);
            LinearLayout container = (LinearLayout) itemView;

            container.setOnClickListener(view -> {
                listenerCampsFort.onClick(item.getId());
            });


            imgViewCampFortnite.setImageResource(item.getImageOfCamp());
            container.setBackgroundColor(item.getColor());

        }
    }
}
}
