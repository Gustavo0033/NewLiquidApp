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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos_esportivos);

        esportivoTL = findViewById(R.id.CamisasEsportivas);
        esportivoTL.setLayoutManager(new LinearLayoutManager(this));

        List<List_EsportivoTL> Lista_Jersey_esportiva = new ArrayList<>();
        Lista_Jersey_esportiva.add(new List_EsportivoTL(1, R.drawable.marvelxliquid_spider_jersey_01_1280x1920_451x677_2bf0875b_e221_45aa_8c02_e5b1ff6a5b8a_347x519, Color.WHITE, R.string.shirtSpiderMan));
        Lista_Jersey_esportiva.add(new List_EsportivoTL(2, R.drawable._32520_tl20915_451x677, Color.WHITE, R.string.Jersey2021));
        Lista_Jersey_esportiva.add(new List_EsportivoTL(3, R.drawable._21320_tl_product13190_912x1368_e2043f78_f15c_440b_8f62_84c43f26d56b_347x520, Color.WHITE, R.string.ReinoQuantico));
        Lista_Jersey_esportiva.add(new List_EsportivoTL(4, R.drawable.capitao_america_jersey, Color.WHITE, R.string.Jersey2021));
        Lista_Jersey_esportiva.add(new List_EsportivoTL(5, R.drawable.lvth_njersey_brazil_sponsored__tl0515_0000_layer29_564x846, Color.WHITE, R.string.JerseyAzul));
        Lista_Jersey_esportiva.add(new List_EsportivoTL(6, R.drawable.capitao_america_jersey, Color.WHITE, R.string.CapitaoAmerica));
        Lista_Jersey_esportiva.add(new List_EsportivoTL(7, R.drawable.lvth_nchampionshipjersey_tl0393_0004_layer2copy_b7c12443_7aac_4029_b1b9_4053476566bb_564x846, Color.WHITE, R.string.JerseyBranca));

        adapterEsportivo adapter = new adapterEsportivo(Lista_Jersey_esportiva);

        esportivoTL.setAdapter(adapter);
        adapter.setListener(id -> {
            switch (id){
                case 1: startActivity(new Intent(PRODUTOS_ESPORTIVOS.this,MARVEL_HOMEM_ARANHA.class ));
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
