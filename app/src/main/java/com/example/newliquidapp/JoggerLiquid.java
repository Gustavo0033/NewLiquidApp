package com.example.newliquidapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class JoggerLiquid extends AppCompatActivity {
    private RecyclerView JoggersLiquid;
    private View btn_backBaixo2;
    private View logo_jogger_liquid;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_jogger_liquid);

        TextView LinkTextView = findViewById(R.id.linkJogger);
        LinkTextView.setMovementMethod(LinkMovementMethod.getInstance());
        LinkTextView.setLinkTextColor(Color.WHITE);


        logo_jogger_liquid = findViewById(R.id.logoJoggerLiquid);
        logo_jogger_liquid.setOnClickListener(view -> {
            Intent intent = new Intent(JoggerLiquid.this, MainActivity.class);
            startActivity(intent);
        });




        btn_backBaixo2 = findViewById(R.id.back_parteBaixo2);
        btn_backBaixo2.setOnClickListener(view -> {
            Intent intent = new Intent(JoggerLiquid.this, PARTE_DE_BAIXO.class);
            startActivity(intent );
        });

        JoggersLiquid = findViewById(R.id.recycleJogger);
        JoggersLiquid.setLayoutManager(new LinearLayoutManager(this));


        List<list_jogger>JoggerLista = new ArrayList<>();
        JoggerLista.add(new list_jogger(1, R.drawable.joggerliquid));
        JoggerLista.add(new list_jogger(1, R.drawable.jogger_liquid));
        JoggerLista.add(new list_jogger(1, R.drawable.jogger_liquid2));
        JoggerLista.add(new list_jogger(1, R.drawable.jogger_liquid3));

        adapterJogger adapter = new adapterJogger(JoggerLista);
        JoggersLiquid.setAdapter(adapter);

    }
    private class adapterJogger extends RecyclerView.Adapter<adapterJogger.ViewHolderJogger>{

        private List<list_jogger>JoggerLista;

        private adapterJogger(List<list_jogger>JoggerLista){
            this.JoggerLista = JoggerLista;
        }

        @NonNull
        @Override
        public ViewHolderJogger onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolderJogger(getLayoutInflater().inflate(R.layout.liquid_jogger, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolderJogger holder, int position) {
        list_jogger itemCurrent = JoggerLista.get(position);
        holder.bind(itemCurrent);
        }

        @Override
        public int getItemCount() {
            return JoggerLista.size();
        }

        private class ViewHolderJogger extends RecyclerView.ViewHolder{

            public ViewHolderJogger(@NonNull View itemView) {
                super(itemView);
            }
            public void bind(list_jogger item){
                ImageView imgView = itemView.findViewById(R.id.img_joggerTL);
                imgView.setImageResource(item.getImageView());

            }
        }
}
}