package com.example.newliquidapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class FreeFire_Liquid extends AppCompatActivity {

    private RecyclerView FreeFireRecycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_free_fire_liquid);

        FreeFireRecycle = findViewById(R.id.Phoenix_RecycleView);
        FreeFireRecycle.setLayoutManager(new LinearLayoutManager(this));

        List<MainItem_FreeFIre> FreeFIreList = null;
        FreeFireAdapter adapterFreeFire = new FreeFireAdapter(FreeFIreList);
        FreeFireRecycle.setAdapter(adapterFreeFire);


        FreeFIreList = new ArrayList<>();
        FreeFIreList.add(new MainItem_FreeFIre(1, R.drawable.tl_phoenix_lbff8, Color.GRAY, R.string.Phoenix));
        FreeFIreList.add(new MainItem_FreeFIre(2, R.drawable.tl_phoenix_lbff8, Color.GRAY, R.string.Phoenix));


    }


    private class FreeFireAdapter extends RecyclerView.Adapter<MainViewHolder>{

        private List<MainItem_FreeFIre> MainItem_FreeFire;

        public FreeFireAdapter(List<MainItem_FreeFIre> MainItem_FreeFire){
            this.MainItem_FreeFire = MainItem_FreeFire;
        }

        @NonNull
        @Override
        public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new MainViewHolder(getLayoutInflater().inflate(R.layout.freefire_recycleview, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
            holder.bind(position);
        }

        @Override
        public int getItemCount() {
            return 5;
        }
    }

    // VIEW que está dentro da RecycleView
    private class MainViewHolder extends RecyclerView.ViewHolder{

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);

        }

        public void bind(int position){


        }
    }

    }
