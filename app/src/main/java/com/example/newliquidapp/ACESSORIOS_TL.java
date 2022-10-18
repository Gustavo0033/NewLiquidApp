package com.example.newliquidapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
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

public class ACESSORIOS_TL extends AppCompatActivity {

    private RecyclerView acessoriosTl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_acessorios_tl);

        acessoriosTl = findViewById(R.id.acessorios_liquid);
        acessoriosTl.setLayoutManager(new GridLayoutManager(this, 2));

        List<List_acessorios> Lista_de_Acessorios = new ArrayList<>();
        Lista_de_Acessorios.add(new List_acessorios(1, R.drawable.mousepad_liquid,R.string.Mousepad_Liquid));
        Lista_de_Acessorios.add(new List_acessorios(2, R.drawable.mousepad_bluecapsule,R.string.Mousepad_BlueCapsule));
        Lista_de_Acessorios.add(new List_acessorios(3, R.drawable.mousepad_pulga,R.string.Mousepad_Pulga));
        Lista_de_Acessorios.add(new List_acessorios(4, R.drawable.mousepad_fortnite,R.string.Mousepad_Fortnite));
        Lista_de_Acessorios.add(new List_acessorios(5, R.drawable.mousepad_liquidmaior,R.string.Mousepad_LiquidMaior));


        adapterAcessorio adapter = new adapterAcessorio(Lista_de_Acessorios);

        adapter.setListener(id -> {
            switch (id){
                case 1: startActivity(new Intent(ACESSORIOS_TL.this, Mousepad_Liquid_menor.class));
                break;
            }
        });





        acessoriosTl.setAdapter(adapter);

    }
    public class adapterAcessorio extends RecyclerView.Adapter<adapterAcessorio.ViewHolderAcessorios>{

        private List<List_acessorios> Lista_de_Acessorios;
        private onClickAcessorios listener;

        private adapterAcessorio(List<List_acessorios> Lista_de_Acessorios){
            this.Lista_de_Acessorios = Lista_de_Acessorios;
        }

        public void setListener(onClickAcessorios listener){
            this.listener = listener;
        }




        @NonNull
        @Override
        public ViewHolderAcessorios onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolderAcessorios(getLayoutInflater().inflate(R.layout.linear_acessorios, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolderAcessorios holder, int position) {
        List_acessorios itemCurrentAcessorios = Lista_de_Acessorios.get(position);
        holder.bind(itemCurrentAcessorios);
        }

        @Override
        public int getItemCount() {
            return Lista_de_Acessorios.size();
        }

        public class ViewHolderAcessorios extends RecyclerView.ViewHolder{

            public ViewHolderAcessorios(@NonNull View itemView) {
                super(itemView);
            }
            public void bind(List_acessorios item){

                ImageView imgView = itemView.findViewById(R.id.image_acessorio);
                TextView txtView = itemView.findViewById(R.id.txtName_acessorio);
                LinearLayout container = (LinearLayout) itemView;

                container.setOnClickListener(view -> {
                    listener.onClick(item.getId());
                });


                imgView.setImageResource(item.getImageAcessorio());
                txtView.setText(item.getTxtNameAcessories());

            }
        }
}
 }