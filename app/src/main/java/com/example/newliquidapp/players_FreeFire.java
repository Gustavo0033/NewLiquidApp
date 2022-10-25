package com.example.newliquidapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import kotlinx.coroutines.channels.Receive;

public class players_FreeFire extends AppCompatActivity {

    private RecyclerView player_freefire;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_players_free_fire);

        player_freefire = findViewById(R.id.recycleview_playerFreeFire);
        player_freefire.setLayoutManager(new LinearLayoutManager(this));

        List<ListParteCima> ListaPlayerFreeFire = new ArrayList<>();
        ListaPlayerFreeFire.add(new ListParteCima(1, R.drawable.tl_phoenix_lbff8, R.string.Phoenix, Color.TRANSPARENT));
        ListaPlayerFreeFire.add(new ListParteCima(1, R.drawable.tl_phoenix_lbff8, R.string.Phoenix, Color.TRANSPARENT));
        ListaPlayerFreeFire.add(new ListParteCima(1, R.drawable.tl_phoenix_lbff8, R.string.Phoenix, Color.TRANSPARENT));

        adapterFreeFire adapter = new adapterFreeFire(ListaPlayerFreeFire);
        player_freefire.setAdapter(adapter);


    }
    private class adapterFreeFire extends RecyclerView.Adapter<adapterFreeFire.ViewHolderFreeFire>{

        private List<ListParteCima> ListaPlayersFreeFire;
        private adapterFreeFire(List<ListParteCima>ListaPlayersFreeFire){
            this.ListaPlayersFreeFire = ListaPlayersFreeFire;
        }

        @NonNull
        @Override
        public ViewHolderFreeFire onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolderFreeFire(getLayoutInflater().inflate(R.layout.freefire_recycleview,parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolderFreeFire holder, int position) {
        ListParteCima itemCurrent = ListaPlayersFreeFire.get(position);
        holder.bind(itemCurrent);
        }

        @Override
        public int getItemCount() {
            return ListaPlayersFreeFire.size();
        }

        private class ViewHolderFreeFire extends RecyclerView.ViewHolder{

            public ViewHolderFreeFire(@NonNull View itemView) {
                super(itemView);
            }
            public void bind(ListParteCima item){
                ImageView imgView = itemView.findViewById(R.id.Phoenix_FreeFIre);
                imgView.setImageResource(item.getImageRoupa());

                TextView txtView = itemView.findViewById(R.id.txt_name_player);
                txtView.setText(item.getNameRoupa());

                LinearLayout container = (LinearLayout) itemView;
                container.setBackgroundColor(item.getColor());


            }
        }
}
}