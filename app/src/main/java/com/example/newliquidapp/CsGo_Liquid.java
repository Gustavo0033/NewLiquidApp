package com.example.newliquidapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
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

public class CsGo_Liquid extends AppCompatActivity {


    private RecyclerView rvMain_csgo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cs_go_liquid);


        List<MainItem_csgo> mainItems_csgo = new ArrayList<>();
        mainItems_csgo.add(new MainItem_csgo(1, R.drawable.ask_liquid, R.string.Jogador01_CSGO, Color.WHITE));
        mainItems_csgo.add(new MainItem_csgo(2, R.drawable.resetz_liquid, R.string.Jogador01_CSGO, Color.WHITE));
        mainItems_csgo.add(new MainItem_csgo(3, R.drawable.nesk_liquid, R.string.Jogador01_CSGO, Color.WHITE));
        mainItems_csgo.add(new MainItem_csgo(4, R.drawable.player_1785_lagonis_4, R.string.Jogador01_CSGO, Color.WHITE));
        mainItems_csgo.add(new MainItem_csgo(5, R.drawable.paluh_liquid, R.string.Jogador01_CSGO, Color.WHITE));
        mainItems_csgo.add(new MainItem_csgo(6, R.drawable.player_131_hugzord_1, R.string.Paluh, Color.WHITE));
        rvMain_csgo = findViewById(R.id.main_rv_csgo);

        // 1° Definir o comportamento da exibição do layout da recycleView
        rvMain_csgo.setLayoutManager(new LinearLayoutManager(this));
        MainAdapter_csgo adapter = new MainAdapter_csgo(mainItems_csgo);
        rvMain_csgo.setAdapter(adapter);

    }

    private class MainAdapter_csgo extends RecyclerView.Adapter<MainViewHolder_csgo>{

        private List<MainItem_csgo> mainItems_csgo;

        public MainAdapter_csgo(List<MainItem_csgo>mainItems_csgo){
           this.mainItems_csgo = mainItems_csgo;
        }

        @NonNull
        @Override
        public MainViewHolder_csgo onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new MainViewHolder_csgo(getLayoutInflater().inflate(R.layout.csgo_recycleview, parent, false));

        }

        @Override
        public void onBindViewHolder(@NonNull MainViewHolder_csgo holder, int position) {
            MainItem_csgo mainItemCurrent = mainItems_csgo.get(position);
            holder.bind(mainItemCurrent);

        }

        @Override
        public int getItemCount() {
            return mainItems_csgo.size();
        }
    }

    private class MainViewHolder_csgo extends RecyclerView.ViewHolder{
        public MainViewHolder_csgo(@NonNull View itemView) {
            super(itemView);
        }

        public void bind(MainItem_csgo item){
            TextView txtName = itemView.findViewById(R.id.item_txt_name);
            ImageView imgIcon = itemView.findViewById(R.id.item_img_icon);
            LinearLayout container = (LinearLayout) itemView;

            txtName.setText(item.getTextStringId());
            imgIcon.setImageResource(item.getDrawableId());
            container.setBackgroundColor(item.getColor());
        }
    }





}