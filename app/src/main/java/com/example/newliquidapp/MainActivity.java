package com.example.newliquidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private View Campeonato;
    private View Loja;
    private View Jogadores;
<<<<<<< HEAD
    private View EntrarConta;
=======
    private View EntrarContaLiquid;
>>>>>>> b21e1fd9c4a2688b2a10b1c7c3a8047619884dab

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

<<<<<<< HEAD
            EntrarConta = findViewById(R.id.btn_Entrar_Conta);
            EntrarConta.setOnClickListener(view -> {
                Intent intent = new Intent(MainActivity.this, EntrarConta_Liquid.class);
                startActivity(intent);
            });
=======
        EntrarContaLiquid = findViewById(R.id.btn_entrarConta);
        EntrarContaLiquid.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, EntrarConta.class);
            startActivity(intent);
        });
>>>>>>> b21e1fd9c4a2688b2a10b1c7c3a8047619884dab





    }
    

}