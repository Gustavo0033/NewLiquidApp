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

public class MOLETOM_HOMEM_ARANHA extends AppCompatActivity {

    private RecyclerView homem_aranha_artwork;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_moletom_homem_aranha);

        homem_aranha_artwork = findViewById(R.id.moletom_artwork);
        homem_aranha_artwork.setLayoutManager(new LinearLayoutManager(this));

        List<list_jogger> ListaArtWork= new ArrayList<>();
        ListaArtWork.add(new list_jogger(1, R.drawable.artwork01));
        ListaArtWork.add(new list_jogger(1, R.drawable.artwork02));
        ListaArtWork.add(new list_jogger(1, R.drawable.artwork03));
        ListaArtWork.add(new list_jogger(1, R.drawable.artwork04));
        ListaArtWork.add(new list_jogger(1, R.drawable.artwork05));

        AdapterArtWork adapter = new AdapterArtWork(ListaArtWork);
        homem_aranha_artwork.setAdapter(adapter);

    }
    private class AdapterArtWork extends RecyclerView.Adapter<AdapterArtWork.ViewHolderArtWork>{

        private List<list_jogger> ListaArtWork;
        private AdapterArtWork (List<list_jogger>ListaArtWork){
            this.ListaArtWork = ListaArtWork;
        }


        @NonNull
        @Override
        public ViewHolderArtWork onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolderArtWork(getLayoutInflater().inflate(R.layout.liquid_jogger,parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolderArtWork holder, int position) {
        list_jogger itemCurrent = ListaArtWork.get(position);
        holder.bind(itemCurrent);
        }

        @Override
        public int getItemCount() {
            return ListaArtWork.size();
        }

        private class ViewHolderArtWork extends RecyclerView.ViewHolder{

            public ViewHolderArtWork(@NonNull View itemView) {
                super(itemView);
            }
            public void bind(list_jogger item){
                ImageView imgView = itemView.findViewById(R.id.img_joggerTL);
                imgView.setImageResource(item.getImageView());
            }
        }
}
}