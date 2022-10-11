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

public class MARVEL_HOMEM_ARANHA extends AppCompatActivity {

    private RecyclerView SpiderManTL;
    private View btn_spiderMan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_marvel_homem_aranha);

        btn_spiderMan = findViewById(R.id.btn_spierMan_back);
        btn_spiderMan.setOnClickListener(view -> {
            Intent intent = new Intent(MARVEL_HOMEM_ARANHA.this, Loja_TeamLiquid.class);
            startActivity(intent);
        });


        SpiderManTL = findViewById(R.id.SpiderManLiquid);

        List<ListSpiderMan> SpiderList = new ArrayList<>();
        SpiderList.add(new ListSpiderMan(1, R.drawable.tl_07012011892_1280x1920_451x677_139689ba_ae61_4666_ad29_d6778f9cbf3a_451x677, Color.WHITE));
        SpiderList.add(new ListSpiderMan(2, R.drawable.tl_07012011893_1280x1920_451x677_9cb92800_8bc9_467c_8314_eae7d22d054d_451x677, Color.WHITE));
        SpiderList.add(new ListSpiderMan(3, R.drawable.tl_07012011927_1280x1920_912x1368_682281d0_99d8_49c6_bb69_ed05af8b2b47_912x1368, Color.WHITE));
        SpiderList.add(new ListSpiderMan(4, R.drawable.tl_07012011945_1280x1920_912x1368_b9918c96_edd3_439d_962e_8f6864894508_912x1368, Color.WHITE));
        SpiderList.add(new ListSpiderMan(5, R.drawable.jersey_spider_man_liquid, Color.WHITE));
        SpiderList.add(new ListSpiderMan(6, R.drawable.marvelxliquid_spider_jersey_02_1280x1920_451x677_d227b281_2a00_4db8_a533_92d9c706840f_451x676, Color.WHITE));



        SpiderManTL.setLayoutManager(new LinearLayoutManager(this));
        SpiderAdapter adapter = new SpiderAdapter(SpiderList);
        SpiderManTL.setAdapter(adapter);

    }

    private class SpiderAdapter extends RecyclerView.Adapter<SpiderViewHolder>{

        private List<ListSpiderMan> SpiderList;

        public SpiderAdapter(List<ListSpiderMan> SpiderList){
            this.SpiderList = SpiderList;
        }

        @NonNull
        @Override
        public SpiderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new SpiderViewHolder(getLayoutInflater().inflate(R.layout.homem_aranha_recycleview,parent,false));
        }

        @Override
        public void onBindViewHolder(@NonNull SpiderViewHolder holder, int position) {
            ListSpiderMan mainItemCurrent = SpiderList.get(position);
            holder.bind(mainItemCurrent);
        }


        @Override
        public int getItemCount() {
            return SpiderList.size();
        }
    }

    private class SpiderViewHolder extends RecyclerView.ViewHolder{

        public SpiderViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void bind(ListSpiderMan item) {
            ImageView imageView = itemView.findViewById(R.id.img_Spider);
            LinearLayout container = (LinearLayout) itemView;

            imageView.setImageResource(item.getImageJersey());
            container.setBackgroundColor(item.getColor());

    }

    }
}
