package com.example.newliquidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Nova_Conta_Liquid extends AppCompatActivity {

    private View btn_back_newAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_nova_conta_liquid);

        btn_back_newAccount = findViewById(R.id.btn_createAccount_back);
        btn_back_newAccount.setOnClickListener(view -> {
            Intent intent = new Intent(Nova_Conta_Liquid.this, MainActivity.class);
            startActivity(intent);
        });
    }
}