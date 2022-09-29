package com.example.newliquidapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RainbowSix_Liquid extends AppCompatActivity {

    private RecyclerView rvMain_Rainbow6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rainbow_six_liquid);



        List<MainItem_Rainbow6> mainItems_Rainbow6 = new ArrayList<>();
        mainItems_Rainbow6.add(new MainItem_Rainbow6(1, R.drawable.elige_csgo_teamliquid, R.string.ELiGE, Color.BLACK));

        rvMain_Rainbow6 = findViewById(R.id.main_rv_Rainbow6);



        rvMain_Rainbow6.setLayoutManager(new LinearLayoutManager(this));
        MainAdapter_Rainbow6 adapter = new MainAdapter_Rainbow6(mainItems_Rainbow6);
        rvMain_Rainbow6.setAdapter(adapter);
    }

    private class MainAdapter_Rainbow6 extends RecyclerView.Adapter<MainViewHolder>{

        private List<MainItem_Rainbow6> mainItems_Rainbow6;

        public MainAdapter_Rainbow6(List<MainItem_Rainbow6>mainItems_Rainbow6){
            this.mainItems_Rainbow6 = mainItems_Rainbow6;
        }

        @NonNull
        @Override
        public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new MainViewHolder(getLayoutInflater().inflate(R.layout.rainbow6_recycleview, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
            MainItem_Rainbow6 mainItemCurrent = mainItems_Rainbow6.get(position);
            holder.bind(mainItemCurrent);
        }

        @Override
        public int getItemCount() {
            return mainItems_Rainbow6.size();
        }
    }

    private class MainViewHolder extends RecyclerView.ViewHolder{

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
        }
        public void bind(MainItem_Rainbow6 item){
            TextView txtName = itemView.findViewById(R.id.item_txt_name);
            ImageView imgIcon = itemView.findViewById(R.id.item_img_icon);
            LinearLayout container = (LinearLayout) itemView;

            txtName.setText(item.getTextStringId());
            imgIcon.setImageResource(item.getDrawableId());
            container.setBackgroundColor(item.getColor());




        }
    }
}