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

public class ReinoQuanticoJersey extends AppCompatActivity {

    private RecyclerView ReinoQuanticoJersey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reino_quantico_jersey);

        ReinoQuanticoJersey = findViewById(R.id.reinoQuanticoJersey);
        ReinoQuanticoJersey.setLayoutManager(new LinearLayoutManager(this));

        List<list_jogger> ListaReino = new ArrayList<>();
        ListaReino.add(new list_jogger(1, R.drawable._21320_tl_product13190_912x1368_e2043f78_f15c_440b_8f62_84c43f26d56b_347x520));
        ListaReino.add(new list_jogger(2, R.drawable._21320_tl_product13190_912x1368_e2043f78_f15c_440b_8f62_84c43f26d56b_347x520));
        ListaReino.add(new list_jogger(2, R.drawable._21320_tl_product13190_912x1368_e2043f78_f15c_440b_8f62_84c43f26d56b_347x520));


        adapterReino adapter = new adapterReino(ListaReino);
        ReinoQuanticoJersey.setAdapter(adapter);

    }
    private class adapterReino extends RecyclerView.Adapter<adapterReino.ViewHolderReino>{

        private List<list_jogger> ListaReino;

        private adapterReino(List<list_jogger> ListReino){
            this.ListaReino = ListReino;
        }


        @NonNull
        @Override
        public ViewHolderReino onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolderReino(getLayoutInflater().inflate(R.layout.liquid_jogger,parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolderReino holder, int position) {
        list_jogger itemCurrent = ListaReino.get(position);
        holder.bind(itemCurrent);
        }

        @Override
        public int getItemCount() {
            return ListaReino.size();
        }

        private class ViewHolderReino extends RecyclerView.ViewHolder{

            public ViewHolderReino(@NonNull View itemView) {
                super(itemView);
            }
            public void bind(list_jogger item){

                ImageView imgView = itemView.findViewById(R.id.img_joggerTL);
                imgView.setImageResource(item.getImageView());

            }
        }
}
}

