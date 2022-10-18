package com.example.newliquidapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class Mousepad_Liquid_menor extends AppCompatActivity {

    private RecyclerView mousepad_menor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mousepad_liquid_menor);


        mousepad_menor = findViewById(R.id.mousepad_menor);
        mousepad_menor.setLayoutManager(new LinearLayoutManager(this));

        List<Mousepad_menor_list> Lista_mousepadMenor = new ArrayList<>();
        Lista_mousepadMenor.add(new Mousepad_menor_list(1, R.drawable.mousepad_liquid));
        Lista_mousepadMenor.add(new Mousepad_menor_list(2, R.drawable.zoom3_mousepad_menor));
        Lista_mousepadMenor.add(new Mousepad_menor_list(3, R.drawable.zoom2_mousepadmenor));
        Lista_mousepadMenor.add(new Mousepad_menor_list(4, R.drawable.zoom_mousepadmenor));

        adapterMousepadMenor adapter = new adapterMousepadMenor(Lista_mousepadMenor);
        mousepad_menor.setAdapter(adapter);

    }
    public class adapterMousepadMenor extends RecyclerView.Adapter<adapterMousepadMenor.HolderPadMenor>{

        private List<Mousepad_menor_list> Lista_mousepadMenor;


        private adapterMousepadMenor(List<Mousepad_menor_list>Lista_mousepadMenor){
            this.Lista_mousepadMenor = Lista_mousepadMenor;
        }


        @NonNull
        @Override
        public HolderPadMenor onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new HolderPadMenor(getLayoutInflater().inflate(R.layout.mousepad_liquid_menor, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull HolderPadMenor holder, int position) {
        Mousepad_menor_list ItemCurrent = Lista_mousepadMenor.get(position);
        holder.bind(ItemCurrent);
        }

        @Override
        public int getItemCount() {
            return Lista_mousepadMenor.size();
        }

        private class HolderPadMenor extends RecyclerView.ViewHolder{

            public HolderPadMenor(@NonNull View itemView) {
                super(itemView);
            }
            public void bind(Mousepad_menor_list item){

                ImageView imgView = itemView.findViewById(R.id.mousepad_liquid_menor);
                imgView.setImageResource(item.getImageView());

            }
        }
}
}