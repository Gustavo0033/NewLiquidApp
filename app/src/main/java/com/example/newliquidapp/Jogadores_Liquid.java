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

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;

public class Jogadores_Liquid extends AppCompatActivity {

   private RecyclerView PlayersLiquid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogadores_liquid);


        List<PlayersTL> PlayersList = new ArrayList<>();
        PlayersList.add(new PlayersTL(1, R.drawable.fortnite_png_branco, Color.CYAN));
        PlayersList.add(new PlayersTL(2, R.drawable.freefire_liquid_branca, Color.BLACK));
        PlayersList.add(new PlayersTL(3, R.drawable.r6_logo,Color.GRAY));
        PlayersList.add(new PlayersTL(4, R.drawable.csgo_liquid_preto,Color.WHITE));





        PlayersLiquid = findViewById(R.id.recyclePlayersTL);
        PlayersLiquid.setLayoutManager(new LinearLayoutManager(this));
        PlayerAdapter adapter = new PlayerAdapter(PlayersList);
        PlayersLiquid.setAdapter(adapter);





}

    private class PlayerAdapter extends RecyclerView.Adapter<PlayersViewHolder>{

        private List<PlayersTL> PlayersList;
        public PlayerAdapter(List<PlayersTL>PlayersList){
            this.PlayersList = PlayersList;
        }

        @NonNull
        @Override
        public PlayersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new PlayersViewHolder(getLayoutInflater().inflate(R.layout.recycleview_jogadoresliquid, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull PlayersViewHolder holder, int position) {
            PlayersTL mainItemCurrent = PlayersList.get(position);
            holder.bind(mainItemCurrent);
        }

        @Override
        public int getItemCount() {
            return PlayersList.size();
        }
    }

    private class PlayersViewHolder extends RecyclerView.ViewHolder{

        public PlayersViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void bind(PlayersTL item){
            ImageView imgView = itemView.findViewById(R.id.PlayersTLRecycle);
            LinearLayout container = (LinearLayout) itemView;


            imgView.setImageResource(item.getImagePlayers());
            container.setBackgroundColor(item.getColor());
        }
    }
}