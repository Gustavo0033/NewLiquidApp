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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valorant_liquid);

        valorant_infoCamps = findViewById(R.id.CampeonatoValorant);


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
}