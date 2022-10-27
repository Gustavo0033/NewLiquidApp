package com.example.newliquidapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class JERSEY_2021_OFFICIAL extends AppCompatActivity {

    private RecyclerView Jersey_offical2012;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_jersey2021_official);

        TextView txtView = findViewById(R.id.btn_siteJersey2021);
        txtView.setMovementMethod(LinkMovementMethod.getInstance());
        txtView.setLinkTextColor(Color.WHITE);

        Jersey_offical2012 = findViewById(R.id.Jersey2021_oficial);
        Jersey_offical2012.setLayoutManager(new LinearLayoutManager(this));

        List<list_jogger>ListJersey2021 = new ArrayList<>();
        ListJersey2021.add(new list_jogger(1,R.drawable.jerseyazul_patrocinio));
        ListJersey2021.add(new list_jogger(1,R.drawable.oficial_jersey01));
        ListJersey2021.add(new list_jogger(1,R.drawable.oficial_jersey02));
        ListJersey2021.add(new list_jogger(1,R.drawable.oficial_jersey03));
        ListJersey2021.add(new list_jogger(1,R.drawable.oficial_jersey04));

        AdapterJesey adapter = new AdapterJesey(ListJersey2021);
        Jersey_offical2012.setAdapter(adapter);
    }
    private class AdapterJesey extends RecyclerView.Adapter<AdapterJesey.ViewHolderOficial>{

        private List<list_jogger>ListJersey2021;
        private AdapterJesey(List<list_jogger>ListJersey2021){
            this.ListJersey2021 = ListJersey2021;
        }

        @NonNull
        @Override
        public ViewHolderOficial onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolderOficial(getLayoutInflater().inflate(R.layout.liquid_jogger,parent,false));
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolderOficial holder, int position) {
            list_jogger itemCurrent = ListJersey2021.get(position);
            holder.bind(itemCurrent);
        }

        @Override
        public int getItemCount() {
            return ListJersey2021.size();
        }

        private class ViewHolderOficial extends RecyclerView.ViewHolder{

            public ViewHolderOficial(@NonNull View itemView) {
                super(itemView);
            }
            public void bind(list_jogger item){
                ImageView imgView = itemView.findViewById(R.id.img_joggerTL);
                imgView.setImageResource(item.getImageView());
            }

        }
}
}