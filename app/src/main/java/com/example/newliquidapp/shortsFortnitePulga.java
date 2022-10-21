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

public class shortsFortnitePulga extends AppCompatActivity {

    private RecyclerView ShortsFortnite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_shorts_fortnite_pulga);

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