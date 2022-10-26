package com.example.newliquidapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class BRASIL_EXCLUSIVE_BRANCA extends AppCompatActivity {

    private RecyclerView BRexclusiveWhite;
    private View btnExclusiveModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_brasil_exclusive_branca);

        btnExclusiveModels = findViewById(R.id.btn_back_modelsExclusive);
        btnExclusiveModels.setOnClickListener(view -> {
            Intent intent = new Intent(BRASIL_EXCLUSIVE_BRANCA.this, MODELOS_EXLUSIVE_BR.class);
            startActivity(intent);
        });

        TextView txtView = findViewById(R.id.link_exclusiveWhite);
        txtView.setMovementMethod(LinkMovementMethod.getInstance());
        txtView.setLinkTextColor(Color.WHITE);


        BRexclusiveWhite = findViewById(R.id.brasil_exclusive_branca);
        BRexclusiveWhite.setLayoutManager(new LinearLayoutManager(this));

        List<list_jogger>ListaExclusiveWhite = new ArrayList<>();
        ListaExclusiveWhite.add(new list_jogger(1, R.drawable.exclusive_white03));
        ListaExclusiveWhite.add(new list_jogger(1, R.drawable.exclusive_white01));
        ListaExclusiveWhite.add(new list_jogger(1, R.drawable.exclusive_white02));
        ListaExclusiveWhite.add(new list_jogger(1, R.drawable.exclusive_white04));
        ListaExclusiveWhite.add(new list_jogger(1, R.drawable.teamliquidgeostee_brazilgeos_white_tl0259_0003_layer23copy_1140x1710));


        adapterWhite adapter = new adapterWhite(ListaExclusiveWhite);
        BRexclusiveWhite.setAdapter(adapter);
    }
    public class adapterWhite extends RecyclerView.Adapter<adapterWhite.ViewHolderWhite>{

        private List<list_jogger>ListaExclusiveWhite;
        private adapterWhite(List<list_jogger>ListaExclusiveWhite){
            this.ListaExclusiveWhite = ListaExclusiveWhite;
        }

        @NonNull
        @Override
        public ViewHolderWhite onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolderWhite(getLayoutInflater().inflate(R.layout.liquid_jogger,parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolderWhite holder, int position) {
        list_jogger itemCurrent = ListaExclusiveWhite.get(position);
        holder.bind(itemCurrent);
        }

        @Override
        public int getItemCount() {
            return ListaExclusiveWhite.size();
        }

        public class ViewHolderWhite extends RecyclerView.ViewHolder{

            public ViewHolderWhite(@NonNull View itemView) {
                super(itemView);
            }
            public void bind(list_jogger item){
                ImageView imgView = itemView.findViewById(R.id.img_joggerTL);
                imgView.setImageResource(item.getImageView());
            }
        }
}
}