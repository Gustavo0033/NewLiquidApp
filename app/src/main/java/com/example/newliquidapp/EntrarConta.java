package com.example.newliquidapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class EntrarConta extends AppCompatActivity {

    private RecyclerView RecycleEntrar_Conta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrar_conta);

        RecycleEntrar_Conta = findViewById(R.id.entrarContaLiquid);
        adapterEntrarConta adapter = new adapterEntrarConta();
        RecycleEntrar_Conta.setLayoutManager(new LinearLayoutManager(this));
        RecycleEntrar_Conta.setAdapter(adapter);


    }


    private class adapterEntrarConta extends RecyclerView.Adapter<EntrarViewHolder>{

        @NonNull
        @Override
        public EntrarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void onBindViewHolder(@NonNull EntrarViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }
    }

    // Entenda como sendo a VIEW da celula que está dentro da recycleview
    private class EntrarViewHolder extends RecyclerView.ViewHolder{

        public EntrarViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}