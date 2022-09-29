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

<<<<<<< HEAD
        FreeFireRecycle = findViewById(R.id.Phoenix_RecycleView);
        FreeFireRecycle.setLayoutManager(new LinearLayoutManager(this));


        FreeFireAdapter adapterFreeFire = new FreeFireAdapter(MainItem_FreeFire);
        FreeFireRecycle.setAdapter(adapterFreeFire);


        List<MainItem_FreeFIre> MainItems_FreeFire = new ArrayList<>();
        MainItems_FreeFire.add(new MainItem_FreeFIre(1, R.drawable.tl_phoenix_lbff8, Color.GRAY, R.string.Phoenix));



    }


    private class FreeFireAdapter extends RecyclerView.Adapter<MainViewHolder>{

        private List<MainItem_FreeFIre> MainItems_FreeFire;

        public FreeFireAdapter(List<MainItem_FreeFIre> MainItem_FreeFire){
            this.MainItems_FreeFire = MainItems_FreeFire;
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
=======
>>>>>>> 6433e4e4907897053a83c14df1fe56e634d2fa93


        }
    }


