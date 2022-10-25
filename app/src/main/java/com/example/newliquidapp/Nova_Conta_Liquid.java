package com.example.newliquidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Nova_Conta_Liquid extends AppCompatActivity {

    private View btn_back_newAccount;
    private View txt_login;
    private View icon_houseBack;
    private View icon_players;
    private View icon_bag;
    private View tournaments_icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_nova_conta_liquid);

        icon_bag = findViewById(R.id.icon_bag);
        icon_bag.setOnClickListener(view -> {
            Intent intent = new Intent(Nova_Conta_Liquid.this, Loja_TeamLiquid.class);
            startActivity(intent);
        });

        icon_houseBack = findViewById(R.id.icon_houseBack);
        icon_houseBack.setOnClickListener(view -> {
            Intent intent = new Intent(Nova_Conta_Liquid.this, MainActivity.class);
            startActivity(intent);
        });

        icon_players = findViewById(R.id.icon_players);
        icon_players.setOnClickListener(view -> {
            Intent intent = new Intent(Nova_Conta_Liquid.this,Jogadores_Liquid.class);
            startActivity(intent);
        });

        tournaments_icon = findViewById(R.id.tournaments_icon);
        tournaments_icon.setOnClickListener(view -> {
            Intent intent = new Intent(Nova_Conta_Liquid.this, Campeonatos.class);
            startActivity(intent);
        });



        txt_login = findViewById(R.id.txt_login);
        txt_login.setOnClickListener(view -> {
            Intent intent = new Intent(Nova_Conta_Liquid.this, EntrarConta.class);
            startActivity(intent);
        });

        btn_back_newAccount = findViewById(R.id.btn_createAccount_back);
        btn_back_newAccount.setOnClickListener(view -> {
            Intent intent = new Intent(Nova_Conta_Liquid.this, MainActivity.class);
            startActivity(intent);
        });
    }
}