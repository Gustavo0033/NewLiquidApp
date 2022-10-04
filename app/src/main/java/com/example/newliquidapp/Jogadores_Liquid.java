package com.example.newliquidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.net.Inet4Address;

public class Jogadores_Liquid extends AppCompatActivity {

    private View JogadoresR6;
    private View JogadorasValorant;
    private View JogadoresFreeFire;
    private View JogadoresCsGO;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogadores_liquid);



        JogadoresR6 = findViewById(R.id.btn_Jogadores_Rainbow6);
        JogadoresR6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Jogadores_Liquid.this, Jogadores_Rainbow6.class);
                startActivity(intent);
            }
        });


        JogadorasValorant = findViewById(R.id.btn_Jogadores_Valorant);
        JogadorasValorant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Jogadores_Liquid.this, Jogadoras_Valorant.class);
                startActivity(intent);
            }
        });


        JogadoresFreeFire = findViewById(R.id.btn_Jogadores_FreeFire);
        JogadoresFreeFire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Jogadores_Liquid.this,players_FreeFire.class);
            startActivity(intent);}
        });

        JogadoresCsGO = findViewById(R.id.btn_Jogadores_CsGo);
        JogadoresCsGO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Jogadores_Liquid.this, CsGo_Liquid.class);
                startActivity(intent);
            }
        });


    }
}