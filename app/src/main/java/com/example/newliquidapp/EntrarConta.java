package com.example.newliquidapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class EntrarConta extends AppCompatActivity {

    private View btn_login_back;
    private View icon_houseBack;
    private View icon_players;
    private View icon_bag;
    private View tournaments_icon;
    FloatingActionButton btn_plus;
    FloatingActionButton btn_house;
    FloatingActionButton btn_back;
    boolean isAllFabsVisible;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_entrar_conta);


        btn_plus = findViewById(R.id.btn_plus);
        btn_house = findViewById(R.id.btn_back_home);
        btn_back = findViewById(R.id.btn_back);

        btn_house.setVisibility(View.GONE);
        btn_back.setVisibility(View.GONE);

        isAllFabsVisible = false;

        btn_plus.setOnClickListener(view -> {
            if(!isAllFabsVisible){
                btn_house.show();
                btn_back.show();
                btn_house.setVisibility(View.VISIBLE);
                btn_back.setVisibility(View.VISIBLE);

                isAllFabsVisible = true;
            }else{
                btn_house.hide();
                btn_back.hide();
                btn_house.setVisibility(View.GONE);
                btn_back.setVisibility(View.GONE);

                isAllFabsVisible = false;
            }
        });


        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(view -> {
            Intent intent = new Intent(EntrarConta.this, Nova_Conta_Liquid.class);
            startActivity(intent);
        });

        btn_house = findViewById(R.id.btn_back_home);
        btn_house.setOnClickListener(view -> {
            Intent intent = new Intent(EntrarConta.this, MainActivity.class);
            startActivity(intent);
        });
























        icon_bag = findViewById(R.id.icon_bag);
        icon_bag.setOnClickListener(view -> {
            Intent intent = new Intent(EntrarConta.this,Loja_TeamLiquid.class);
            startActivity(intent);
        });

        icon_houseBack =  findViewById(R.id.icon_houseBack);
        icon_houseBack.setOnClickListener(view -> {
            Intent intent = new Intent(EntrarConta.this, MainActivity.class);
            startActivity(intent);
        });

        icon_players = findViewById(R.id.icon_players);
        icon_players.setOnClickListener(view -> {
            Intent intent = new Intent(EntrarConta.this, Jogadores_Liquid.class);
            startActivity(intent);
        });

        tournaments_icon = findViewById(R.id.tournaments_icon);
        tournaments_icon.setOnClickListener(view -> {
            Intent intent = new Intent(EntrarConta.this, Campeonatos.class);
            startActivity(intent);
        });


    }





}