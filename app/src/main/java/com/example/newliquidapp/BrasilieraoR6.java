package com.example.newliquidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BrasilieraoR6 extends AppCompatActivity {

    private View btn_back_brasileirao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brasilierao_r6);

        btn_back_brasileirao = findViewById(R.id.btn_back_brasileirao);
        btn_back_brasileirao.setOnClickListener(view ->{
            Intent intent = new Intent(BrasilieraoR6.this, CampeonatosRainbow6.class);
            startActivity(intent);
        });
    }
}