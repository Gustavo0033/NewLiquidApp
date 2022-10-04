package com.example.newliquidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private View Campeonato;
    private View Loja;
    private View Jogadores;
    private View EntrarConta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Campeonato = findViewById(R.id.btn_campeonato);
        Campeonato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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

            EntrarConta = findViewById(R.id.btn_Entrar_Conta);
            EntrarConta.setOnClickListener(view -> {
                Intent intent = new Intent(MainActivity.this, EntrarConta_Liquid.class);
                startActivity(intent);
            });





    }
    

}