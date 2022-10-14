package com.example.newliquidapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class PARTE_DE_CIMA extends AppCompatActivity {

    private RecyclerView ParteDeCima;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_parte_de_cima);
        ParteDeCima = findViewById(R.id.ParteDeCimaActivity);
        ParteDeCima.setLayoutManager(new GridLayoutManager(this,2));



        List<ListParteCima>ParteDeCimaLista = new ArrayList<>();
        ParteDeCimaLista.add(new ListParteCima(1, R.drawable.liquidtapingsstee_tl0104_0000_layer3copy_1140x1710, R.string.CamisetaLiquidLinhaBranca, Color.TRANSPARENT));
        ParteDeCimaLista.add(new ListParteCima(2, R.drawable.teamliquidgeostee_brazilgeos_black_tl0259_0005_layer2copy2_564x846, R.string.CamisetaLiquidPreta, Color.TRANSPARENT));
        ParteDeCimaLista.add(new ListParteCima(3, R.drawable.teamliquidgeostee_brazilgeos_white_tl0259_0003_layer23copy_1140x1710, R.string.CamisetaLiquidBranca, Color.TRANSPARENT));
        ParteDeCimaLista.add(new ListParteCima(4, R.drawable.teamliquidgeostee_brazilgeos_navy_tl0259_0003_layer13copy_1140x1710, R.string.CamisetaLiquidAzulEscuro, Color.TRANSPARENT));
        ParteDeCimaLista.add(new ListParteCima(5, R.drawable.teamliquid_official2021_sponsive, R.string.CamisetaLiquidAzulEscuro, Color.TRANSPARENT));
        ParteDeCimaLista.add(new ListParteCima(6, R.drawable.teamliquid_championshipjersey_sponsered, R.string.CamisetaLiquidBranca, Color.TRANSPARENT));
        ParteDeCimaLista.add(new ListParteCima(7, R.drawable.marvelxliquid_spider_jersey_01_1280x1920_451x677_2bf0875b_e221_45aa_8c02_e5b1ff6a5b8a_347x519, R.string.HomemAranha, Color.TRANSPARENT));
        ParteDeCimaLista.add(new ListParteCima(8, R.drawable._32520_tl20919_2000x3000_1280x1920_451x677_8de64d3a_dc51_4984_aa8e_e4321afe95a3_451x677, R.string.ViuvaNegra, Color.TRANSPARENT));
        ParteDeCimaLista.add(new ListParteCima(9, R.drawable._21320_tl_product13190_912x1368_e2043f78_f15c_440b_8f62_84c43f26d56b_347x520, R.string.ReinoQuantico, Color.TRANSPARENT));
        ParteDeCimaLista.add(new ListParteCima(10, R.drawable.tl0147_blk_1_756x1058, R.string.shirtSpiderMan, Color.TRANSPARENT));
        ParteDeCimaLista.add(new ListParteCima(11, R.drawable.capitao_america_jersey, R.string.CapitaoAmerica, Color.TRANSPARENT));
        ParteDeCimaLista.add(new ListParteCima(12, R.drawable.lvth_njersey_brazil_tl0515_0000_layer8copy_458x687, R.string.CamisetaLiquidAzulEscuro, Color.TRANSPARENT));
        ParteDeCimaLista.add(new ListParteCima(13, R.drawable.moletom_spiderman, R.string.HoodieSpiderMan, Color.TRANSPARENT));
        ParteDeCimaLista.add(new ListParteCima(14, R.drawable.lvth_njersey_brazil_sponsored__tl0515_0000_layer29_564x846, R.string.JerseyAzulPatrocinio, Color.TRANSPARENT));

        CimaAdapter adapter = new CimaAdapter(ParteDeCimaLista);
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