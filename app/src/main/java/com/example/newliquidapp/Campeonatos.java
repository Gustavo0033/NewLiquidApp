package com.example.newliquidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Campeonatos extends AppCompatActivity {

    private View RainbowSix;
    private View Valorant;
    private View FreeFire;
    private View CsGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campeonatos);

        RainbowSix = findViewById(R.id.btn_RainbowSix);
        RainbowSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Campeonatos.this, RainbowSix_Liquid.class);
                startActivity(intent);
            }
        });

        Valorant = findViewById(R.id.btn_Valorant);
        Valorant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Campeonatos.this, Valorant_Liquid.class);
                startActivity(intent);
            }
        });

        CsGo = findViewById(R.id.btn_CsGo);
        CsGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Campeonatos.this, CsGo_Liquid.class);
                startActivity(intent);
            }
        });

        FreeFire = findViewById(R.id.btn_FreeFire);
        FreeFire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Campeonatos.this, FreeFire_Liquid.class);
                startActivity(intent);
            }
        });



    }
}