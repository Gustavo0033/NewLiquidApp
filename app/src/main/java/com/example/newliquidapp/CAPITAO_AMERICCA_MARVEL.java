package com.example.newliquidapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.PendingIntent;
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

public class CAPITAO_AMERICCA_MARVEL extends AppCompatActivity {

    private View capita_america_loja;
    private RecyclerView capitao_america;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_capitao_americca_marvel);

        TextView LinkTextView = findViewById(R.id.linkLojaTL);
        LinkTextView.setMovementMethod(LinkMovementMethod.getInstance());
        LinkTextView.setLinkTextColor(Color.WHITE);



        capita_america_loja = findViewById(R.id.btn_capitao_america);
        capita_america_loja.setOnClickListener(view -> {
            Intent intent = new Intent(CAPITAO_AMERICCA_MARVEL.this, Loja_TeamLiquid.class);
            startActivity(intent);
        });



        capitao_america = findViewById(R.id.capitao_america_);
        capitao_america.setLayoutManager(new LinearLayoutManager(this));

        List<list_capitao_america> Lista_capitao_america = new ArrayList<>();
        Lista_capitao_america.add(new list_capitao_america(1, R.drawable.capitao_america_jersey));
        Lista_capitao_america.add(new list_capitao_america(1, R.drawable.jersey_capitao_america_costas));
        Lista_capitao_america.add(new list_capitao_america(1, R.drawable.tl_07012012103_1280x1920_451x677_7f0b1573_7c5e_454e_9a12_3717579d0993_451x677));
        Lista_capitao_america.add(new list_capitao_america(1, R.drawable.jersey_america));
        Lista_capitao_america.add(new list_capitao_america(1, R.drawable.jersey_america02));
        Lista_capitao_america.add(new list_capitao_america(1, R.drawable.jersey_america03));



        adapterCapitaoAmerica adapter = new adapterCapitaoAmerica(Lista_capitao_america);
        capitao_america.setAdapter(adapter);






    }
    private class adapterCapitaoAmerica extends RecyclerView.Adapter<adapterCapitaoAmerica.HolderCapitaoAmerica>{

        private  List <list_capitao_america>  Lista_capitao_america;

        private adapterCapitaoAmerica (List<list_capitao_america> Lista_capitao_america){
            this.Lista_capitao_america = Lista_capitao_america;
        }


        @NonNull
        @Override
        public HolderCapitaoAmerica onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new HolderCapitaoAmerica(getLayoutInflater().inflate(R.layout.linear_capitao_america, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull HolderCapitaoAmerica holder, int position) {
        list_capitao_america itemCurrentCapitao = Lista_capitao_america.get(position);
        holder.bind(itemCurrentCapitao);
        }

        @Override
        public int getItemCount() {
            return Lista_capitao_america.size();
        }

        private class HolderCapitaoAmerica extends RecyclerView.ViewHolder{

            public HolderCapitaoAmerica(@NonNull View itemView) {
                super(itemView);
            }
            public void bind(list_capitao_america item){

                ImageView imgView = itemView.findViewById(R.id.layout_capitaoAmerica);
                imgView.setImageResource(item.getImageCapitao());

            }
        }

}
}