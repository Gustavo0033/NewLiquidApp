package com.example.newliquidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class perfilNAXY_Valorant extends AppCompatActivity {

    private View btn_NaxyBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_naxy_valorant);

        btn_NaxyBack = findViewById(R.id.botao_NaxyBack);
        btn_NaxyBack.setOnClickListener(view ->{
            Intent intent = new Intent(perfilNAXY_Valorant.this, Jogadoras_Valorant.class);
            startActivity(intent);
        });
    }
}