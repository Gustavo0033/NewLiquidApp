package com.example.newliquidapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

public class Loja_TeamLiquid extends AppCompatActivity {

    private RecyclerView LojaTL;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loja_team_liquid);

        LojaTL = findViewById(R.id.camisetaAzulescuro);
        LojaTL.setLayoutManager(new LinearLayoutManager(this));





    }
}