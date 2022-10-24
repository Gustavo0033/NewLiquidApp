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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class FreeFire_Liquid extends AppCompatActivity {

    private RecyclerView LiquidFreeFire;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_free_fire_liquid);

        LiquidFreeFire = findViewById(R.id.Phoenix_RecycleView);
        LiquidFreeFire.setLayoutManager(new LinearLayoutManager(this));

        List<list_jogger> ListaFreeFire = new ArrayList<>();
        ListaFreeFire.add(new list_jogger(1, R.drawable.lbff));
        ListaFreeFire.add(new list_jogger(2, R.drawable.copa_america_free_fire));



        adapterLiquidFreeFire adapter = new adapterLiquidFreeFire(ListaFreeFire);


        adapter.setListener(id -> {
            switch (id){
                case 1:startActivity(new Intent(FreeFire_Liquid.this, LBFF.class));
                break;
            }
        });
        LiquidFreeFire.setAdapter(adapter);

}
    private class adapterLiquidFreeFire extends RecyclerView.Adapter<adapterLiquidFreeFire.ViewHolderFreeFire>{

        private List<list_jogger>ListaFreeFire;
        private clickCampeonatos listener;



        private adapterLiquidFreeFire(List<list_jogger>ListaFreeFIre){
            this.ListaFreeFire = ListaFreeFIre;
        }

        public void setListener (clickCampeonatos listener){
            this.listener = listener;
        }

        @NonNull
        @Override
        public ViewHolderFreeFire onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolderFreeFire(getLayoutInflater().inflate(R.layout.freefire_recycleview, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolderFreeFire holder, int position) {
        list_jogger itemCurrent = ListaFreeFire.get(position);
        holder.bind(itemCurrent);
        }

        @Override
        public int getItemCount() {
            return ListaFreeFire.size();
        }

        private class ViewHolderFreeFire extends RecyclerView.ViewHolder{

            public ViewHolderFreeFire(@NonNull View itemView) {
                super(itemView);
            }
            public void bind(list_jogger item){

                ImageView imgView = itemView.findViewById(R.id.Phoenix_FreeFIre);
                imgView.setImageResource(item.getImageView());

                LinearLayout container = (LinearLayout) itemView;

                container.setOnClickListener(view ->{
                    listener.onClick(item.getId());
                });

            }
        }
}
}



