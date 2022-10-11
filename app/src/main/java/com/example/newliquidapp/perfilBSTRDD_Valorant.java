package com.example.newliquidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class perfilBSTRDD_Valorant extends AppCompatActivity {

    private View btn_BstrddBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_perfil_bstrdd_valorant);

        btn_BstrddBack = findViewById(R.id.botao_bstrddBack);
        btn_BstrddBack.setOnClickListener(view -> {
            Intent intent = new Intent(perfilBSTRDD_Valorant.this, Jogadoras_Valorant.class);
            startActivity(intent);
        });
    }
}