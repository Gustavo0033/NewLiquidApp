package com.example.newliquidapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class PRODUTOS_ESPORTIVOS extends AppCompatActivity {

    private RecyclerView esportivoTL;
    private View btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_produtos_esportivos);



        btn_back = findViewById(R.id.btn_modelos);
        btn_back.setOnClickListener(view -> {
            Intent intent = new Intent(PRODUTOS_ESPORTIVOS.this, MODELOS_LOJA.class);
            startActivity(intent);
        });

        esportivoTL = findViewById(R.id.CamisasEsportivas);
        esportivoTL.setLayoutManager(new LinearLayoutManager(this));

        List<List_EsportivoTL> Lista_Jersey_esportiva = new ArrayList<>();
        Lista_Jersey_esportiva.add(new List_EsportivoTL(1, R.drawable.jerseyazul_patrocinio, Color.WHITE, R.string.Jersey2021));
        Lista_Jersey_esportiva.add(new List_EsportivoTL(1, R.drawable._32520_tl20915_451x677, Color.WHITE, R.string.Jersey2021));
        Lista_Jersey_esportiva.add(new List_EsportivoTL(1, R.drawable.jerseyazul_patrocinio, Color.WHITE, R.string.Jersey2021));
        Lista_Jersey_esportiva.add(new List_EsportivoTL(1, R.drawable._32520_tl20915_451x677, Color.WHITE, R.string.Jersey2021));
        Lista_Jersey_esportiva.add(new List_EsportivoTL(2, R.drawable.lvth_njersey_brazil_sponsored__tl0515_0000_layer29_564x846, Color.WHITE, R.string.JerseyAzul));
        Lista_Jersey_esportiva.add(new List_EsportivoTL(3, R.drawable.lvth_nchampionshipjersey_tl0393_0004_layer2copy_b7c12443_7aac_4029_b1b9_4053476566bb_564x846, Color.WHITE, R.string.JerseyBranca));
        Lista_Jersey_esportiva.add(new List_EsportivoTL(4, R.drawable.teamliquid_official2021_hoodie_sponsors_04_564x846, Color.WHITE, R.string.MoletomLiquid));
        Lista_Jersey_esportiva.add(new List_EsportivoTL(5, R.drawable.teamliquid_championshipjersey_sponsered, Color.WHITE, R.string.JerseyAzulPatrocinio));
        Lista_Jersey_esportiva.add(new List_EsportivoTL(6, R.drawable.lvth_njersey_brazil_tl0515_0000_layer8copy_458x687, Color.WHITE, R.string.JerseyAzul));
        Lista_Jersey_esportiva.add(new List_EsportivoTL(7, R.drawable.jerseyazul_patrocinio, Color.WHITE, R.string.Jersey2021Sponsored));
        adapterEsportivo adapter = new adapterEsportivo(Lista_Jersey_esportiva);

        esportivoTL.setAdapter(adapter);
        adapter.setListener(id -> {
            switch (id){
                case 1: startActivity(new Intent(PRODUTOS_ESPORTIVOS.this,TEAM_LIQUID_2021_JERSEY.class ));
                break;
                case 2: startActivity(new Intent(PRODUTOS_ESPORTIVOS.this,MARVEL_HOMEM_ARANHA.class ));
                    break;
                case 3: startActivity(new Intent(PRODUTOS_ESPORTIVOS.this,MARVEL_HOMEM_ARANHA.class ));
                    break;
                case 4: startActivity(new Intent(PRODUTOS_ESPORTIVOS.this,MARVEL_HOMEM_ARANHA.class ));
                    break;
                case 5: startActivity(new Intent(PRODUTOS_ESPORTIVOS.this,MARVEL_HOMEM_ARANHA.class ));
                    break;
                case 6: startActivity(new Intent(PRODUTOS_ESPORTIVOS.this,MARVEL_HOMEM_ARANHA.class ));
                    break;
            }
        });



    }

    private class adapterEsportivo extends RecyclerView.Adapter<adapterEsportivo.ViewHolderEsportivo>{

        private List<List_EsportivoTL> Lista_Jersey_esportiva;
        private onClickEsportivaTL listener;

        public adapterEsportivo(List<List_EsportivoTL> Lista_Jersey_esportiva){
            this.Lista_Jersey_esportiva = Lista_Jersey_esportiva;
        }

        public void setListener(onClickEsportivaTL listener){
            this.listener = listener;
        }


        @NonNull
        @Override
        public ViewHolderEsportivo onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolderEsportivo(getLayoutInflater().inflate(R.layout.esportivo_liquid, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolderEsportivo holder, int position) {
        List_EsportivoTL itemCurrentEsportivo = Lista_Jersey_esportiva.get(position);
        holder.bind(itemCurrentEsportivo);
        }

        @Override
        public int getItemCount() {
            return Lista_Jersey_esportiva.size();
        }

    private class ViewHolderEsportivo extends RecyclerView.ViewHolder{

        public ViewHolderEsportivo(@NonNull View itemView) {
            super(itemView);
        }

        public void bind(List_EsportivoTL item){

            ImageView imgViewEsportiva = itemView.findViewById(R.id.LinearImageTL);
            LinearLayout container = (LinearLayout) itemView;
            TextView txtViewEsportiva = itemView.findViewById(R.id.LinearTxtTL);

            container.setOnClickListener(view -> {
                listener.onClick(item.getId());
            });


            imgViewEsportiva.setImageResource(item.getImageJersey());
            txtViewEsportiva.setText(item.getNameJersey());
            container.setBackgroundColor(item.getColor());

        }
    }
}
    }
