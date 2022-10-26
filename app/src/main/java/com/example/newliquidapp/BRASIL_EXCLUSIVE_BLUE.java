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

public class BRASIL_EXCLUSIVE_BLUE extends AppCompatActivity {

    private RecyclerView ShirtExclusive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brasil_exclusive_preto);

        ShirtExclusive = findViewById(R.id.ExclusiveBlack);
        ShirtExclusive.setLayoutManager(new LinearLayoutManager(this));

        List<list_jogger> ListaExclusiveBlack = new ArrayList<>();
        ListaExclusiveBlack.add(new list_jogger(1,R.drawable.exclusiveblue));
        ListaExclusiveBlack.add(new list_jogger(1,R.drawable.exclusiveblue02));
        ListaExclusiveBlack.add(new list_jogger(1,R.drawable.exclusiveblue03));
        ListaExclusiveBlack.add(new list_jogger(1,R.drawable.exclusiveblue04));
        ListaExclusiveBlack.add(new list_jogger(1,R.drawable.exclusiveblue05));


        adapterExclusiveBlack adapter = new adapterExclusiveBlack(ListaExclusiveBlack);
        ShirtExclusive.setAdapter(adapter);

    }
    private class adapterExclusiveBlack extends RecyclerView.Adapter<adapterExclusiveBlack.ViewHolderExclusive>{

        private List<list_jogger> ListaExclusiveBlack;

        private adapterExclusiveBlack(List<list_jogger>ListaExclusiveBlack){
            this.ListaExclusiveBlack = ListaExclusiveBlack;
        }

        @NonNull
        @Override
        public ViewHolderExclusive onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolderExclusive(getLayoutInflater().inflate(R.layout.liquid_jogger,parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolderExclusive holder, int position) {
        list_jogger itemCurrent = ListaExclusiveBlack.get(position);
        holder.bind(itemCurrent);
        }

        @Override
        public int getItemCount() {
            return ListaExclusiveBlack.size();
        }

        private class ViewHolderExclusive extends RecyclerView.ViewHolder{

            public ViewHolderExclusive(@NonNull View itemView) {
                super(itemView);
            }
            public void bind(list_jogger item){
                ImageView imgView = itemView.findViewById(R.id.img_joggerTL);
                imgView.setImageResource(item.getImageView());
            }
        }
}
}