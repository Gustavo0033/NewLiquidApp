package com.example.newliquidapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class EntrarConta extends AppCompatActivity {

    private View btn_login_back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_entrar_conta);

        btn_login_back = findViewById(R.id.btn_login_back);
        btn_login_back.setOnClickListener(view -> {
            Intent intent = new Intent(EntrarConta.this, MainActivity.class);
            startActivity(intent);
        });




    }



}