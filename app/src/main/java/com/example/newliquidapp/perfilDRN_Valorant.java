package com.example.newliquidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class perfilDRN_Valorant extends AppCompatActivity {

    private View btn_DrnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_drn_valorant);

        btn_DrnVoltar = findViewById(R.id.botao_DrnBack);
        btn_DrnVoltar.setOnClickListener(view -> {
            Intent intent = new Intent(perfilDRN_Valorant.this, Jogadoras_Valorant.class);
            startActivity(intent);
        });
    }
}