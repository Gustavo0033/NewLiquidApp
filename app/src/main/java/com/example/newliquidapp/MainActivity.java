package com.example.newliquidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private View Campeonato;
    private View Loja;
    private View Jogadores;
    private View EntrarContaLiquid;
    private View NovaContaLiquid;
    private View btn_liquidPlus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        btn_liquidPlus = findViewById(R.id.btn_liquidPlus);
        btn_liquidPlus.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, LiquidPlus_Principal.class);
            startActivity(intent);
        });


        Campeonato = findViewById(R.id.btn_campeonato);
        Campeonato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View id) {
                Intent intent = new Intent(MainActivity.this, Campeonatos.class);
                startActivity(intent);
            }
        });

        Loja = findViewById(R.id.btn_Loja);
        Loja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Loja_TeamLiquid.class);
                startActivity(intent);
            }
        });

        Jogadores = findViewById(R.id.btn_Jogadores);
        Jogadores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Jogadores_Liquid.class);
                startActivity(intent);
            }
        });




            NovaContaLiquid = findViewById(R.id.btn_nova_conta);
            NovaContaLiquid.setOnClickListener(view -> {
                Intent intent = new Intent(MainActivity.this, Nova_Conta_Liquid.class);
                startActivity(intent);
            });


    }
    

}