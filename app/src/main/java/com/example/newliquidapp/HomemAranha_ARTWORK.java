package com.example.newliquidapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class HomemAranha_ARTWORK extends AppCompatActivity {

    private RecyclerView ArtWorkSpider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_homem_aranha_artwork);

        ArtWorkSpider = findViewById(R.id.artWorkSpider);
        ArtWorkSpider.setLayoutManager(new LinearLayoutManager(this));

        List<list_jogger>ListaArtWork = new ArrayList<>();
        ListaArtWork.add(new list_jogger(1,R.drawable.tl0147_blk_1_756x1058));
        ListaArtWork.add(new list_jogger(1,R.drawable.tl0147_blk_1_756x1058));
        ListaArtWork.add(new list_jogger(1,R.drawable.tl0147_blk_1_756x1058));

        adapterArtWork adapter = new adapterArtWork(ListaArtWork);
        ArtWorkSpider.setAdapter(adapter);

    }
    private class adapterArtWork extends RecyclerView.Adapter<adapterArtWork.ViewHolderArtWork>{

        private List<list_jogger> ListaArtWork;
        private adapterArtWork(List<list_jogger>ListaArtWork){
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