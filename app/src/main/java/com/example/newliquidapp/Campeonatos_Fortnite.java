package com.example.newliquidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Campeonatos_Fortnite extends AppCompatActivity {

    private View btn_back_campeonatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campeonatos_fortnite);

        btn_back_campeonatos = findViewById(R.id.btn_back_camps_fornite);
        btn_back_campeonatos.setOnClickListener(view ->{
            Intent intent = new Intent(Campeonatos_Fortnite.this, Campeonatos.class);
            startActivity(intent);
        });

    }
}