package com.example.newliquidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class perfilNAT1_Valorant extends AppCompatActivity {

    private View btn_Nat1Voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_perfil_nat1_valorant);

        btn_Nat1Voltar = findViewById(R.id.fabNat1);
        btn_Nat1Voltar.setOnClickListener(view -> {
            Intent intent = new Intent(perfilNAT1_Valorant. this, Jogadoras_Valorant.class);
            startActivity(intent);
        });
    }
}