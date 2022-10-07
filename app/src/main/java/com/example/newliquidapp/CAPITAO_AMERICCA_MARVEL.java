package com.example.newliquidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CAPITAO_AMERICCA_MARVEL extends AppCompatActivity {

    private View capita_america_loja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capitao_americca_marvel);

        capita_america_loja = findViewById(R.id.btn_capitao_america);
        capita_america_loja.setOnClickListener(view -> {
            Intent intent = new Intent(CAPITAO_AMERICCA_MARVEL.this, Loja_TeamLiquid.class);
            startActivity(intent);
        });
    }
}