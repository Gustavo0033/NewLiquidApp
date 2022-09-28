package com.example.newliquidapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class FreeFire_Liquid extends AppCompatActivity {

    private RecyclerView FreeFireRecycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_free_fire_liquid);

        FreeFireRecycle = findViewById(R.id.Phoenix_RecycleView);
        FreeFireRecycle.setLayoutManager(new LinearLayoutManager(this));
        FreeFireAdapter adapterFreeFire = new FreeFireAdapter();
        FreeFireRecycle.setAdapter(adapterFreeFire);
    }


    private class FreeFireAdapter extends RecyclerView.Adapter<MainViewHolder>{

        @NonNull
        @Override
        public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new MainViewHolder(getLayoutInflater().inflate(R.layout.freefire_recycleview, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 6;
        }
    }

    // VIEW que está dentro da RecycleView
    private class MainViewHolder extends RecyclerView.ViewHolder{

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}