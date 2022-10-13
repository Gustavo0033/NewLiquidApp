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

public class MODELOS_LOJA extends AppCompatActivity {

    private RecyclerView store_models;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modelos_loja);

        store_models = findViewById(R.id.modelo_store);
        store_models.setLayoutManager(new LinearLayoutManager(this));

        List<ListModels> ListaDeModelos = new ArrayList<>();
        ListaDeModelos.add(new ListModels(1, R.drawable.shortpulga, Color.TRANSPARENT, R.string.ParteDeBaixo));
        ListaDeModelos.add(new ListModels(2, R.drawable.marvelxliquid_spider_jersey_01_1280x1920_451x677_2bf0875b_e221_45aa_8c02_e5b1ff6a5b8a_347x519, Color.TRANSPARENT, R.string.ParteDeCima));
        ListaDeModelos.add(new ListModels(3, R.drawable.bluepajamasettl0262_layflats_041621_tl6029_451x677, Color.TRANSPARENT, R.string.PijamaLiquid));
        ListaDeModelos.add(new ListModels(4, R.drawable.teamliquid_blueplush2_0_tl0602_wht_os_cropped_0000_layer4copy_912x1368, Color.TRANSPARENT, R.string.Acessórios));
        ListaDeModelos.add(new ListModels(5, R.drawable._32520_tl20915_451x677, Color.TRANSPARENT, R.string.Esportivo));
        ModeloAdapter adapterModels = new ModeloAdapter(ListaDeModelos);


        adapterModels.setListener(id -> {
            switch (id){
                case 1: startActivity(new Intent(MODELOS_LOJA.this,PARTE_DE_BAIXO.class));
                break;
                case 2: startActivity(new Intent(MODELOS_LOJA.this,PARTE_DE_CIMA.class));
                    break;
                case 3: startActivity(new Intent(MODELOS_LOJA.this,THE_BLUE_CAPSULE.class));
                    break;
                case 4: startActivity(new Intent(MODELOS_LOJA.this,ACESSORIOS_TL.class));
                    break;
                case 5: startActivity(new Intent(MODELOS_LOJA.this,PRODUTOS_ESPORTIVOS.class));
                    break;
            }
        });
        store_models.setAdapter(adapterModels);

    }

    private class ModeloAdapter extends RecyclerView.Adapter<ModeloAdapter.ViewHolderModelos>{

        private List<ListModels> ListaDeModelos;
        private onClickModelos listener;

        public ModeloAdapter(List<ListModels>ListaDeModelos){
            this.ListaDeModelos = ListaDeModelos;
        }

        public void setListener(onClickModelos listener){
            this.listener = listener;
        }

        @NonNull
        @Override
        public ViewHolderModelos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolderModelos(getLayoutInflater().inflate(R.layout.modelos_teamliquid_loja, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolderModelos holder, int position) {
        ListModels CurrentModels = ListaDeModelos.get(position);
        holder.bind(CurrentModels);
        }

        @Override
        public int getItemCount() {
            return ListaDeModelos.size();
        }

    private class ViewHolderModelos extends RecyclerView.ViewHolder{

        public ViewHolderModelos(@NonNull View itemView) {
            super(itemView);
        }

        public void bind(ListModels item){
            ImageView imgModels = itemView.findViewById(R.id.imageModelosTL);
            LinearLayout container = (LinearLayout) itemView;
            TextView NamesModels = itemView.findViewById(R.id.txt_nameModels);

            container.setOnClickListener(view -> {
                listener.onClickModelos(item.getId());
            });


            imgModels.setImageResource(item.getImageModel());
            container.setBackgroundColor(item.getColor());
            NamesModels.setText(item.getNameModel());

        }
    }
}
}