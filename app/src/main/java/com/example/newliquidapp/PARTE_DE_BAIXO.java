package com.example.newliquidapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class PARTE_DE_BAIXO extends AppCompatActivity {

    private RecyclerView parteDeBaixo;
    private View btn_back_parteBaixo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_parte_de_baixo);

        parteDeBaixo = findViewById(R.id.ParteDeBaixo);
        parteDeBaixo.setLayoutManager(new LinearLayoutManager(this));



        btn_back_parteBaixo = findViewById(R.id.btn_parte_baixo_back);
        btn_back_parteBaixo.setOnClickListener(view -> {
            Intent intent = new Intent(PARTE_DE_BAIXO.this, MODELOS_LOJA.class);
            startActivity(intent);
        });




        List<ParteDeBaixo_Lista> ListaParteBaixo = new ArrayList<>();
        ListaParteBaixo.add(new ParteDeBaixo_Lista(1, R.drawable.joggerliquid, R.string.JoggerLiquid));
        ListaParteBaixo.add(new ParteDeBaixo_Lista(1, R.drawable.shortpulga, R.string.PulgaShorts));
        ListaParteBaixo.add(new ParteDeBaixo_Lista(1, R.drawable.fortnite_cal_a, R.string.FortniteCalça));

        BaixoAdapter adapter = new BaixoAdapter(ListaParteBaixo);

        adapter.setListener(id -> {
            switch (id){
                case 1:startActivity(new Intent(PARTE_DE_BAIXO.this, MARVEL_HOMEM_ARANHA.class));
                break;
            }
        });
        parteDeBaixo.setAdapter(adapter);


    }
    private class BaixoAdapter extends RecyclerView.Adapter<BaixoAdapter.ViewHolderBaixo>{

        private List<ParteDeBaixo_Lista> ListaParteBaixo;
        private onClickParteBaixo listener;

        public BaixoAdapter (List<ParteDeBaixo_Lista> ListaParteBaixo){
            this.ListaParteBaixo = ListaParteBaixo;
        }

        public void setListener(onClickParteBaixo listener){
            this.listener = listener;
        }

        @NonNull
        @Override
        public ViewHolderBaixo onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolderBaixo(getLayoutInflater().inflate(R.layout.parte_de_baixo, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolderBaixo holder, int position) {
        ParteDeBaixo_Lista ItemCurrent = ListaParteBaixo.get(position);
        holder.bind(ItemCurrent);
        }

        @Override
        public int getItemCount() {
            return ListaParteBaixo.size();
        }

    private class ViewHolderBaixo extends RecyclerView.ViewHolder{

        public ViewHolderBaixo(@NonNull View itemView) {
            super(itemView);
        }
        public void bind(ParteDeBaixo_Lista item){
            ImageView imgBaixo = itemView.findViewById(R.id.LinearParteBaixo);
            TextView txtBaixo = itemView.findViewById(R.id.txtNameBaixo);
            LinearLayout container = (LinearLayout) itemView;

            container.setOnClickListener(view -> {
                listener.onClick(item.getId());
            });

            imgBaixo.setImageResource(item.getImageBaixo());
            txtBaixo.setText(item.getTextBaixo());
        }
    }
}
}