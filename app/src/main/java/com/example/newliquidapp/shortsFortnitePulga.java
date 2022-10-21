package com.example.newliquidapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class shortsFortnitePulga extends AppCompatActivity {

    private RecyclerView ShortsFortnite;
    private View btn_shortBack;
    private View logo_short_pulga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_shorts_fortnite_pulga);

        logo_short_pulga = findViewById(R.id.LogoShortPulga);
        logo_short_pulga.setOnClickListener(view -> {
            Intent intent = new Intent(shortsFortnitePulga.this, MainActivity.class);
            startActivity(intent);
        });





        btn_shortBack = findViewById(R.id.back_parteBaixo3);
        btn_shortBack.setOnClickListener(view -> {
            Intent intent = new Intent(shortsFortnitePulga.this, PARTE_DE_BAIXO.class);
            startActivity(intent);
        });

        ShortsFortnite = findViewById(R.id.shortPulga);
        ShortsFortnite.setLayoutManager(new LinearLayoutManager(this));

        List<list_jogger> ListaShorts = new ArrayList<>();
        ListaShorts.add(new list_jogger(1, R.drawable.shortpulga));
        ListaShorts.add(new list_jogger(1, R.drawable.shorts_pulga));
        ListaShorts.add(new list_jogger(1, R.drawable.shorts_pulga02));
        ListaShorts.add(new list_jogger(1, R.drawable.shorts_pulga03));
        ListaShorts.add(new list_jogger(1, R.drawable.shorts_pulga04));



        adapterShorts adapter = new adapterShorts(ListaShorts);
        ShortsFortnite.setAdapter(adapter);



    }
    private class adapterShorts extends RecyclerView.Adapter<adapterShorts.ViewHolderShorts>{

        private List<list_jogger> ListaShorts;

        private adapterShorts(List<list_jogger>ListaShorts){
            this.ListaShorts = ListaShorts;
        }
        @NonNull
        @Override
        public ViewHolderShorts onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolderShorts(getLayoutInflater().inflate(R.layout.liquid_jogger, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolderShorts holder, int position) {
        list_jogger itemCurrent = ListaShorts.get(position);
        holder.bind(itemCurrent);
        }

        @Override
        public int getItemCount() {
            return ListaShorts.size();
        }

        private class ViewHolderShorts extends RecyclerView.ViewHolder{

            public ViewHolderShorts(@NonNull View itemView) {
                super(itemView);
            }
            public void bind(list_jogger item){
                ImageView imgView = itemView.findViewById(R.id.img_joggerTL);
                imgView.setImageResource(item.getImageView());
            }
        }
}
}