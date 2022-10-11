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

public class Valorant_Liquid extends AppCompatActivity {

    private RecyclerView valorant_infoCamps;
    private RecyclerView valorant_camp02;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_valorant_liquid);

        valorant_infoCamps = findViewById(R.id.CampeonatoValorant);
        valorant_camp02 = findViewById(R.id.CampeonatoValorant02);

        valorant_camp02.setLayoutManager(new LinearLayoutManager(this));







        // LISTA VALORANT 01
        List<CampValorant> ListCampValorant = new ArrayList<>();
        ListCampValorant.add(new CampValorant(1, R.drawable.elite_cup, Color.TRANSPARENT));


        valorant_infoCamps.setLayoutManager(new LinearLayoutManager(this));
        AdapterCampValorant adapter = new AdapterCampValorant(ListCampValorant);

        adapter.setListener(id -> {
            switch (id){
                case 1:
                    startActivity(new Intent(Valorant_Liquid.this, NameCampsValorant.class));


            }


        });
        valorant_infoCamps.setAdapter(adapter);








        // LISTA VALORANT 02

        List<ListValorant_camps02> ListCampValorant02 = new ArrayList<>();
        valorant_camp02.setLayoutManager(new LinearLayoutManager(this));
        AdapterCampValorant02 adapter02 = new AdapterCampValorant02(ListCampValorant02);

        adapter02.setListener(id -> {
            switch (id){
                case 1:
                    startActivity(new Intent(Valorant_Liquid.this, Jogadoras_Valorant.class));
                    break;
                case 2:
                    startActivity(new Intent(Valorant_Liquid.this, Jogadoras_Valorant.class));
                    break;

            }
        });

        ListCampValorant02.add(new ListValorant_camps02(1, R.drawable.valorant_logo, Color.GRAY));
        ListCampValorant02.add(new ListValorant_camps02(1, R.drawable.r6_logo, Color.WHITE));

        valorant_camp02.setAdapter(adapter02);

    }

    private class AdapterCampValorant extends RecyclerView.Adapter<AdapterCampValorant.ViewHolderCampValorant>{

        private List<CampValorant> ListCampValorant;
        private OnClickCampsValorant listener;

        public AdapterCampValorant(List<CampValorant> ListCampValorant){
            this.ListCampValorant = ListCampValorant;
        }

        public void setListener(OnClickCampsValorant listener){
            this.listener = listener;
        }

        @NonNull
        @Override
        public ViewHolderCampValorant onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolderCampValorant(getLayoutInflater().inflate(R.layout.camps_valorant, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolderCampValorant holder, int position) {
            CampValorant mainItemCurrent = ListCampValorant.get(position);
            holder.bind(mainItemCurrent);
        }

        @Override
        public int getItemCount() {
            return ListCampValorant.size();
        }


    private class ViewHolderCampValorant extends RecyclerView.ViewHolder{

        public ViewHolderCampValorant(@NonNull View itemView) {
            super(itemView);
        }

        public void bind(CampValorant item ){
            ImageView imageView = itemView.findViewById(R.id.CampVaVa);
            LinearLayout container = (LinearLayout) itemView;

            container.setOnClickListener(view -> {
                listener.onClick(item.getId());

            });

            container.setBackgroundColor(item.getColor());
            imageView.setImageResource(item.getImageCamp());

            }
        }
    }





        private class AdapterCampValorant02 extends  RecyclerView.Adapter<AdapterCampValorant02.ViewHolderCampValorant02>{

            List<ListValorant_camps02> ListCampValorant02;

            public void setListener(onClickValorantCamp02 listener) {
                this.listener = listener;
            }

            public AdapterCampValorant02(List<ListValorant_camps02> ListCampValorant02){
                this.ListCampValorant02 = ListCampValorant02;
            }

            private onClickValorantCamp02 listener;


            @NonNull
            @Override
            public ViewHolderCampValorant02 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                return new ViewHolderCampValorant02(getLayoutInflater().inflate(R.layout.recycleview_valorant02, parent, false));
            }

            @Override
            public void onBindViewHolder(@NonNull ViewHolderCampValorant02 holder, int position) {
                ListValorant_camps02 mainItemCurrent = ListCampValorant02.get(position);
                holder.bind(mainItemCurrent);
            }

            @Override
            public int getItemCount() {
                return ListCampValorant02.size();
            }


        private class ViewHolderCampValorant02 extends RecyclerView.ViewHolder{

            public ViewHolderCampValorant02(@NonNull View itemView) {
                super(itemView);
            }

            public void bind(ListValorant_camps02 item){
                ImageView imgView02 = itemView.findViewById(R.id.imageValorantCamp02);
                LinearLayout container = (LinearLayout) itemView;


                container.setOnClickListener(view -> {
                    listener.onClick(item.getId());
                });


                imgView02.setImageResource(item.getImageCamp_Valorant());
                container.setBackgroundColor(item.getColor());
            }
        }
    }
}
