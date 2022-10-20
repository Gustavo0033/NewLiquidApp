package com.example.newliquidapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class BRAZIL_EXCLUSIVE_SHIRT extends AppCompatActivity {

    private RecyclerView Brazil_exclusive;
    FloatingActionButton BR_exclusive;
    FloatingActionButton BR_exclusive02;
    boolean isAllFabsVisible;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_brazil_exclusive_shirt);

        BR_exclusive = findViewById(R.id.btn_exclusive);
        BR_exclusive02 = findViewById(R.id.btn_exclusive02);

        BR_exclusive02.setVisibility(View.GONE);

        isAllFabsVisible = false;

        BR_exclusive.setOnClickListener(view -> {
            if (!isAllFabsVisible){
                BR_exclusive02.show();
                BR_exclusive02.setVisibility(View.VISIBLE);

                isAllFabsVisible = true;
            } else{
                BR_exclusive02.hide();
                BR_exclusive02.setVisibility(View.GONE);

                isAllFabsVisible = false;
            }
        });


        BR_exclusive02.setOnClickListener(view -> {
            Intent intent = new Intent(BRAZIL_EXCLUSIVE_SHIRT.this, MODELOS_EXLUSIVE_BR.class);
            startActivity(intent);
        });










        Brazil_exclusive = findViewById(R.id.shirt_exlusiveBR);
        Brazil_exclusive.setLayoutManager(new LinearLayoutManager(this));

        List<list_brExclusive> ListaExclusiveBrazil = new ArrayList<>();
        ListaExclusiveBrazil.add(new list_brExclusive(1, R.drawable.teamliquidgeostee_brazilgeos_black_tl0259_0005_layer2copy2_564x846,R.string.CamisetaLiquidPreta));
        ListaExclusiveBrazil.add(new list_brExclusive(2, R.drawable.camiseta_exclusive01,R.string.CamisetaLiquidPreta));
        ListaExclusiveBrazil.add(new list_brExclusive(3, R.drawable.camiseta_exclusive02,R.string.CamisetaLiquidPreta));



        adapterExclusiveBR adapter = new adapterExclusiveBR(ListaExclusiveBrazil);
        Brazil_exclusive.setAdapter(adapter);

    }
    private class adapterExclusiveBR extends RecyclerView.Adapter<adapterExclusiveBR.ViewHolderExclusive>{

        private List<list_brExclusive> ListaExclusiveBrazil;

        private adapterExclusiveBR(List<list_brExclusive>ListaExclusiveBrazil){
            this.ListaExclusiveBrazil = ListaExclusiveBrazil;
        }
        @NonNull
        @Override
        public ViewHolderExclusive onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolderExclusive(getLayoutInflater().inflate(R.layout.linear_brazil_exclusive, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolderExclusive holder, int position) {
            list_brExclusive itemCurrent = ListaExclusiveBrazil.get(position);
            holder.bind(itemCurrent);
        }

        @Override
        public int getItemCount() {
            return ListaExclusiveBrazil.size();
        }

        private class ViewHolderExclusive extends RecyclerView.ViewHolder{

            public ViewHolderExclusive(@NonNull View itemView) {
                super(itemView);
            }
            public void bind(list_brExclusive item){
                ImageView imgView = itemView.findViewById(R.id.linear_imageExclusive);

                imgView.setImageResource(item.getImageview());
            }
        }
}
}