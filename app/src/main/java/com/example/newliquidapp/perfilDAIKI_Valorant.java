package com.example.newliquidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class perfilDAIKI_Valorant extends AppCompatActivity {

    private View btn_DaikiBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_daiki_valorant);

        btn_DaikiBack = findViewById(R.id.botao_DaikiBack);
        btn_DaikiBack.setOnClickListener(view -> {
            Intent intent = new Intent(perfilDAIKI_Valorant.this, Jogadoras_Valorant.class);
                    startActivity(intent);
        });
    }
}