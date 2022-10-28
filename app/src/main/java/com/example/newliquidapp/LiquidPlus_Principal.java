package com.example.newliquidapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class LiquidPlus_Principal extends AppCompatActivity {

        private View experiencePlus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_liquid_plus_principal);

        experiencePlus = findViewById(R.id.Experience);
        experiencePlus.setOnClickListener(view -> {
            Intent intent = new Intent(LiquidPlus_Principal.this, Experience_LiquidPlus.class);
            startActivity(intent);
        });

    }

}
