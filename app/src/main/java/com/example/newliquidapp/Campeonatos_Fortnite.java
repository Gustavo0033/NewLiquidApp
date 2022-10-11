package com.example.newliquidapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Campeonatos_Fortnite extends AppCompatActivity {

    private View btn_back_campeonatos;
    private RecyclerView CampeonatosFornite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_campeonatos_fortnite);

        btn_back_campeonatos = findViewById(R.id.btn_back_camps_fornite);
        btn_back_campeonatos.setOnClickListener(view ->{
            Intent intent = new Intent(Campeonatos_Fortnite.this, Campeonatos.class);
            startActivity(intent);
        });

        CampeonatosFornite = findViewById(R.id.CampFortnite);
        CampeonatosFornite.setLayoutManager(new LinearLayoutManager(this));
        CampFortAdapter adapter = new CampFortAdapter();

        List<ListCampsFortnite> ListFortnite = new ArrayList<>();
        ListFortnite.add(new ListCampsFortnite(1, R.drawable.teamliquid_plus, Color.TRANSPARENT));







        CampeonatosFornite.setAdapter(adapter);








    }

    private class CampFortAdapter extends RecyclerView.Adapter<ViewHolderFort>{

        @NonNull
        @Override
        public ViewHolderFort onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolderFort(getLayoutInflater().inflate(R.layout.fornite_campeonatos, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolderFort holder, int position) {
            holder.bind(mainItemCurrentFort)

        }

        @Override
        public int getItemCount() {
            return 0;
        }
    }

    private class ViewHolderFort extends RecyclerView.ViewHolder{

        public ViewHolderFort(@NonNull View itemView) {
            super(itemView);
        }
    }
}