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
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class PARTE_DE_CIMA extends AppCompatActivity {

    private RecyclerView ParteDeCima;
    FloatingActionButton AddFab;
    FloatingActionButton AddFab2;
    FloatingActionButton AddFab3;
    boolean isAllFabsVisible;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_parte_de_cima);


        ParteDeCima = findViewById(R.id.ParteDeCimaActivity);
        ParteDeCima.setLayoutManager(new GridLayoutManager(this,2));

        AddFab = findViewById(R.id.btn_fab);
        AddFab2 = findViewById(R.id.btn_fab2);
        AddFab3 = findViewById(R.id.btn_fab3);

        AddFab2.setVisibility(View.GONE);
        AddFab3.setVisibility(View.GONE);

        isAllFabsVisible = false;

        AddFab.setOnClickListener(view -> {
            if (!isAllFabsVisible){
                AddFab2.show();
                AddFab3.show();
                AddFab2.setVisibility(View.VISIBLE);
                AddFab3.setVisibility(View.VISIBLE);

                isAllFabsVisible = true;
            } else{
                AddFab2.hide();
                AddFab3.hide();
                AddFab2.setVisibility(View.GONE);
                AddFab3.setVisibility(View.GONE);

                isAllFabsVisible = false;
            }
        });


        AddFab2.setOnClickListener(view -> {
            Intent intent = new Intent(PARTE_DE_CIMA.this, MARVEL_HOMEM_ARANHA.class);
            startActivity(intent);
        });

        AddFab3.setOnClickListener(view -> {
            Toast.makeText(PARTE_DE_CIMA.this, "Alarm Added", Toast.LENGTH_SHORT).show();
        });





        List<ListParteCima>ParteDeCimaLista = new ArrayList<>();
        ParteDeCimaLista.add(new ListParteCima(1, R.drawable.liquidtapingsstee_tl0104_0000_layer3copy_1140x1710, R.string.CamisetaLiquidLinhaBranca, Color.TRANSPARENT));
        ParteDeCimaLista.add(new ListParteCima(2, R.drawable.teamliquidgeostee_brazilgeos_black_tl0259_0005_layer2copy2_564x846, R.string.CamisetaLiquidPreta, Color.TRANSPARENT));
        ParteDeCimaLista.add(new ListParteCima(3, R.drawable.teamliquid_official2021_sponsive, R.string.JERSEY2021sponsored, Color.TRANSPARENT));
        ParteDeCimaLista.add(new ListParteCima(4, R.drawable.teamliquid_championshipjersey_sponsered, R.string.JerseyBrancaPatrocinio, Color.TRANSPARENT));
        ParteDeCimaLista.add(new ListParteCima(5, R.drawable.marvelxliquid_spider_jersey_01_1280x1920_451x677_2bf0875b_e221_45aa_8c02_e5b1ff6a5b8a_347x519, R.string.HomemAranha, Color.TRANSPARENT));
        ParteDeCimaLista.add(new ListParteCima(6, R.drawable._32520_tl20919_2000x3000_1280x1920_451x677_8de64d3a_dc51_4984_aa8e_e4321afe95a3_451x677, R.string.ViuvaNegra, Color.TRANSPARENT));
        ParteDeCimaLista.add(new ListParteCima(7, R.drawable._21320_tl_product13190_912x1368_e2043f78_f15c_440b_8f62_84c43f26d56b_347x520, R.string.ReinoQuantico, Color.TRANSPARENT));
        ParteDeCimaLista.add(new ListParteCima(8, R.drawable.tl0147_blk_1_756x1058, R.string.shirtSpiderMan, Color.TRANSPARENT));
        ParteDeCimaLista.add(new ListParteCima(9, R.drawable.capitao_america_jersey, R.string.CapitaoAmerica, Color.TRANSPARENT));
        ParteDeCimaLista.add(new ListParteCima(10, R.drawable.lvth_njersey_brazil_tl0515_0000_layer8copy_458x687, R.string.CamisetaLiquidAzulEscuro, Color.TRANSPARENT));
        ParteDeCimaLista.add(new ListParteCima(11, R.drawable.moletom_spiderman, R.string.HoodieSpiderMan, Color.TRANSPARENT));
        ParteDeCimaLista.add(new ListParteCima(12, R.drawable.lvth_njersey_brazil_sponsored__tl0515_0000_layer29_564x846, R.string.JerseyAzulPatrocinio, Color.TRANSPARENT));

        CimaAdapter adapter = new CimaAdapter(ParteDeCimaLista);

        adapter.setListener(id -> {
            switch (id){
                case 1:
                    startActivity(new Intent(PARTE_DE_CIMA.this, LIQUID_TAPING_SHORT_SLEEVE_TEE.class));
                    break;
                case 2:
                    startActivity(new Intent(PARTE_DE_CIMA.this, BRAZIL_EXCLUSIVE_SHIRT.class));
                    break;
                case 5:
                    startActivity(new Intent(PARTE_DE_CIMA.this, MARVEL_HOMEM_ARANHA.class));
                    break;
                case 6:
                    startActivity(new Intent(PARTE_DE_CIMA.this, ViuvaNegra_jersey.class));
                    break;
                case 7:
                    startActivity(new Intent(PARTE_DE_CIMA.this, ReinoQuanticoJersey.class));
                    break;
                case 8:
                    startActivity(new Intent(PARTE_DE_CIMA.this, HomemAranha_ARTWORK.class));
                    break;
                case 11:
                    startActivity(new Intent(PARTE_DE_CIMA.this, CAPITAO_AMERICCA_MARVEL.class));
            }
        });

        ParteDeCima.setAdapter(adapter);
    }

    private class CimaAdapter extends RecyclerView.Adapter<CimaAdapter.ViewHolderCima>{

        private List<ListParteCima> ParteDeCimaLista;
        private onClickParteCima listener;

        public CimaAdapter(List<ListParteCima>ParteDeCimaLista){
            this.ParteDeCimaLista = ParteDeCimaLista;
        }

        public void setListener(onClickParteCima listener){
            this.listener = listener;
        }

        @NonNull
        @Override
        public ViewHolderCima onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolderCima(getLayoutInflater().inflate(R.layout.parte_de_cima_linear, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolderCima holder, int position) {
        ListParteCima ItemCurrent = ParteDeCimaLista.get(position);
        holder.bind(ItemCurrent);
        }

        @Override
        public int getItemCount() {
            return ParteDeCimaLista.size();
        }

    private class ViewHolderCima extends RecyclerView.ViewHolder{

        public ViewHolderCima(@NonNull View itemView) {
            super(itemView);
        }
        public void bind(ListParteCima item){
            ImageView imageCima = itemView.findViewById(R.id.CimaImageLinear);
            TextView txtNameCima = itemView.findViewById(R.id.txtNameCima);
            LinearLayout container = (LinearLayout) itemView;

          container.setOnClickListener(view -> {
              listener.onClick(item.getId());
          });

          imageCima.setImageResource(item.getImageRoupa());
          txtNameCima.setText(item.getNameRoupa());
          container.setBackgroundColor(item.getColor());

        }
    }
}
}