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
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class TEAM_LIQUID_2021_JERSEY extends AppCompatActivity {

    private RecyclerView Jersey2021;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_team_liquid2021_jersey);

        Jersey2021 = findViewById(R.id.jersey2021);
        Jersey2021.setLayoutManager(new LinearLayoutManager(this));

        List<ListJersey2021> JerseyList2021 = new ArrayList<>();
        JerseyList2021.add(new ListJersey2021( 1, R.drawable.jersey_sem_patrocinio02, R.string.jersey2021, Color.TRANSPARENT));
        JerseyList2021.add(new ListJersey2021( 2, R.drawable.jersey2021_sem_patrocinio01, R.string.jersey2021, Color.TRANSPARENT));
        JerseyList2021.add(new ListJersey2021( 3, R.drawable._32520_tl20915_451x677, R.string.jersey2021, Color.TRANSPARENT));
        JerseyList2021.add(new ListJersey2021( 4, R.drawable.golajerseyazul_patrocinio, R.string.jersey2021, Color.TRANSPARENT));





        AdapterJersey2021 adapter = new AdapterJersey2021(JerseyList2021);
        Jersey2021.setAdapter(adapter);



    }

    private class AdapterJersey2021 extends RecyclerView.Adapter<AdapterJersey2021.ViewHolderJersey>{

        private List<ListJersey2021> JerseyList2021;
        private onClickJersey listener;


        public AdapterJersey2021(List<ListJersey2021> JerseyList2021){
            this.JerseyList2021 = JerseyList2021;
        }

        public void setListener(onClickJersey listener){
            this.listener = listener;
        }


        @NonNull
        @Override
        public ViewHolderJersey onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolderJersey(getLayoutInflater().inflate(R.layout.team_liquid_2021_jersey,parent,false));
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolderJersey holder, int position) {
            ListJersey2021 CurrentJersey = JerseyList2021.get(position);
        holder.bind(CurrentJersey);
        }

        @Override
        public int getItemCount() {
            return JerseyList2021.size();
        }

    private class ViewHolderJersey extends RecyclerView.ViewHolder{

        public ViewHolderJersey(@NonNull View itemView) {
            super(itemView);
        }

        public void bind(ListJersey2021 item){
            ImageView imgJersey = itemView.findViewById(R.id.jerseyLiquid2021);
            LinearLayout container = (LinearLayout) itemView;



            imgJersey.setImageResource(item.getImageJersey());
            container.setBackgroundColor(item.getColor());
        }
    }
}
}