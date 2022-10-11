package com.example.newliquidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InfoCampsR6 extends AppCompatActivity {

    private View btn_back_invitational;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_info_camps_r6);

        btn_back_invitational = findViewById(R.id.btn_back_invi);
        btn_back_invitational.setOnClickListener(view -> {
            Intent intent = new Intent(InfoCampsR6.this,CampeonatosRainbow6.class);
            startActivity(intent);
        });

    }
}