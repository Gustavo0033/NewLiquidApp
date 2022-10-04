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

public class Jogadoras_Valorant extends AppCompatActivity {

    private RecyclerView rvMain_Valorant;
    private RecyclerView rvMainValorant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogadoras_valorant);


        List<MainItem_Valorant> mainItems_Vava = new ArrayList<>();
        mainItems_Vava.add(new MainItem_Valorant(1, R.drawable.naxy_liquid, R.string.Naxy, Color.TRANSPARENT));
        mainItems_Vava.add(new MainItem_Valorant(2, R.drawable.bstrdd_liquid, R.string.Bstrdd, Color.TRANSPARENT));
        mainItems_Vava.add(new MainItem_Valorant(3, R.drawable.nat1_liquid, R.string.Nat1, Color.TRANSPARENT));
        mainItems_Vava.add(new MainItem_Valorant(4, R.drawable.daiki_liquid, R.string.Daiki, Color.TRANSPARENT));
        mainItems_Vava.add(new MainItem_Valorant(5, R.drawable.drn_liquid, R.string.Drn, Color.TRANSPARENT));

        rvMain_Valorant = findViewById(R.id.main_rv_Valorant);
        rvMain_Valorant.setLayoutManager(new LinearLayoutManager(this));
        MainAdapter_Valorant adapter = new MainAdapter_Valorant(mainItems_Vava);

        adapter.setListener(id -> {
            switch (id){
              case 1:
                startActivity(new Intent(Jogadoras_Valorant.this, perfilNAXY_Valorant.class));
                break;
              case 2:
                    startActivity(new Intent(Jogadoras_Valorant. this, perfilBSTRDD_Valorant.class));
                    break;
                case 3:
                    startActivity(new Intent(Jogadoras_Valorant.this, perfilNAT1_Valorant.class));
                    break;
                case 4:
                    startActivity(new Intent(Jogadoras_Valorant.this, perfilDAIKI_Valorant.class));
                    break;
                case 5:
                    startActivity(new Intent(Jogadoras_Valorant.this, perfilDRN_Valorant.class));
                    break;
            }


        });
        rvMain_Valorant.setAdapter(adapter);




    }

    private class MainAdapter_Valorant extends RecyclerView.Adapter<MainAdapter_Valorant.MainViewHolder_Valorant>{


        private List<MainItem_Valorant> mainItems_Vava;
        private OnItemClickListener_Valorant listener;

        public MainAdapter_Valorant(List<MainItem_Valorant>mainItems_Vava){
            this.mainItems_Vava = mainItems_Vava;
        }

        public void setListener(OnItemClickListener_Valorant listener) {
            this.listener = listener;
        }

        @NonNull
        @Override
        public MainViewHolder_Valorant onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new MainViewHolder_Valorant(getLayoutInflater().inflate(R.layout.main_item_valorant, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull MainViewHolder_Valorant holder, int position) {
            MainItem_Valorant mainItemCurrent = mainItems_Vava.get(position);
            holder.bind(mainItemCurrent);

        }

        @Override
        public int getItemCount() {
            return mainItems_Vava.size();
        }
        private class MainViewHolder_Valorant extends RecyclerView.ViewHolder{

            public MainViewHolder_Valorant(@NonNull View itemView) {
                super(itemView);
            }
            public void bind(MainItem_Valorant item){
                TextView txtName = itemView.findViewById(R.id.item_txt_nameValorant);
                ImageView imgIcon = itemView.findViewById(R.id.item_img_iconValorant);
                LinearLayout containerValorant = (LinearLayout) itemView;


                containerValorant.setOnClickListener(View ->{
                    listener.onClick(item.getId());
                });



                txtName.setText(item.getTextStringId());
                imgIcon.setImageResource(item.getDrawableId());
                containerValorant.setBackgroundColor(item.getColor());
            }

        }
    }

}