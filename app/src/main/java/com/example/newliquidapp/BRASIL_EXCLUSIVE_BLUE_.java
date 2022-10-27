package com.example.newliquidapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class BRASIL_EXCLUSIVE_BLUE_ extends AppCompatActivity {

    private RecyclerView exclusiveBlue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_brasil_exclusive_blue);

        exclusiveBlue = findViewById(R.id.exclusiveBR);
        exclusiveBlue.setLayoutManager(new LinearLayoutManager(this));

        List<list_jogger>listaExclusiveBlue = new ArrayList<>();
        listaExclusiveBlue.add(new list_jogger(1, R.drawable.exclusiveblue));
        listaExclusiveBlue.add(new list_jogger(1, R.drawable.exclusiveblue02));
        listaExclusiveBlue.add(new list_jogger(1, R.drawable.exclusiveblue03));
        listaExclusiveBlue.add(new list_jogger(1, R.drawable.exclusiveblue04));
        listaExclusiveBlue.add(new list_jogger(1, R.drawable.exclusiveblue05));




        adapterBlue adapter = new adapterBlue(listaExclusiveBlue);
        exclusiveBlue.setAdapter(adapter);
    }
    private class adapterBlue extends RecyclerView.Adapter<adapterBlue.ViewHolderBlue>{

        private List<list_jogger> listaExclusiveBlue;
        private adapterBlue(List<list_jogger>listaExclusiveBlue){
            this.listaExclusiveBlue = listaExclusiveBlue;
        }

        @NonNull
        @Override
        public ViewHolderBlue onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolderBlue(getLayoutInflater().inflate(R.layout.liquid_jogger,parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolderBlue holder, int position) {
        list_jogger itemCurrent = listaExclusiveBlue.get(position);
        holder.bind(itemCurrent);
        }

        @Override
        public int getItemCount() {
            return listaExclusiveBlue.size();
        }

        private class ViewHolderBlue extends RecyclerView.ViewHolder{

            public ViewHolderBlue(@NonNull View itemView) {
                super(itemView);
            }
            public void bind(list_jogger item){
                ImageView imgView = itemView.findViewById(R.id.img_joggerTL);
                imgView.setImageResource(item.getImageView());
            }
        }
}
}