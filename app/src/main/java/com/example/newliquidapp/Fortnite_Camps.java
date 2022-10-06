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

public class Fortnite_Camps extends AppCompatActivity {

    private RecyclerView FortnitePlayers;
    private View btn_back_FortniteCamps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fortnite_camps);


        btn_back_FortniteCamps = findViewById(R.id.btn_back_camps_fornite);
        btn_back_FortniteCamps.setOnClickListener(view ->{
            Intent intent = new Intent(Fortnite_Camps.this, Jogadores_Liquid.class);
            startActivity(intent);
        });

        FortnitePlayers = findViewById(R.id.PulgaImage);

        List<FortniteList> FortniteLists = new ArrayList<>();
        FortniteLists.add(new FortniteList(1,R.drawable.pulga, Color.TRANSPARENT, R.string.Pulga));
        FortniteLists.add(new FortniteList(2,R.drawable.suetam, Color.TRANSPARENT, R.string.Suetam));
        FortniteLists.add(new FortniteList(3,R.drawable.persa, Color.TRANSPARENT,R.string.Persa));


        FortnitePlayers.setLayoutManager(new LinearLayoutManager(this));
        FortniteAdapter adapter = new FortniteAdapter(FortniteLists);
        FortnitePlayers.setAdapter(adapter);


    }

    private class FortniteAdapter extends RecyclerView.Adapter<FortniteViewHolder>{

        private List<FortniteList> FortniteLists;

        public FortniteAdapter(List<FortniteList> FortniteLists){
            this.FortniteLists = FortniteLists;
        }

        @NonNull
        @Override
        public FortniteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new FortniteViewHolder(getLayoutInflater().inflate(R.layout.player_fortnite, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull FortniteViewHolder holder, int position) {
            FortniteList FortniteItemCurrent = FortniteLists.get(position);
            holder.bind(FortniteItemCurrent);
        }

        @Override
        public int getItemCount() {
            return FortniteLists.size();
        }
    }

    private class FortniteViewHolder extends RecyclerView.ViewHolder{

        public FortniteViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void bind(FortniteList item){
            ImageView imageView = itemView.findViewById(R.id.pulgaRecycle);
            LinearLayout container = (LinearLayout) itemView;
            TextView txtView = itemView.findViewById(R.id.txt_NamesFortnite);


            txtView.setText(item.getNamePlayer());
            imageView.setImageResource(item.getImageView());
            container.setBackgroundColor(item.getColor());

        }
    }
}