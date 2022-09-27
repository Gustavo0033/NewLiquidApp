package com.example.newliquidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Jogadoras_Valorant extends AppCompatActivity {

    private View Floating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogadoras_valorant);

        Floating = findViewById(R.id.btn_floating);
        Floating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Jogadoras_Valorant.this, Jogadores_Rainbow6.class);
                startActivity(intent);
            }
        });
    }
}