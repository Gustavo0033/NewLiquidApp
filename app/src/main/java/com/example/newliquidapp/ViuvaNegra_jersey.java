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

public class ViuvaNegra_jersey extends AppCompatActivity {

    private RecyclerView viuvaNegraJersey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viuva_negra_jersey);

        viuvaNegraJersey = findViewById(R.id.viuvaNegra_Jersey);
        viuvaNegraJersey.setLayoutManager(new LinearLayoutManager(this));

        List<list_jogger>ViuvaList = new ArrayList<>();
        ViuvaList.add(new list_jogger(1, R.drawable._32520_tl20919_2000x3000_1280x1920_451x677_8de64d3a_dc51_4984_aa8e_e4321afe95a3_451x677));
        ViuvaList.add(new list_jogger(1, R.drawable._32520_tl20919_2000x3000_1280x1920_451x677_8de64d3a_dc51_4984_aa8e_e4321afe95a3_451x677));

        adapterViuva adapter = new adapterViuva(ViuvaList);

        viuvaNegraJersey.setAdapter(adapter);



    }
    private class adapterViuva extends RecyclerView.Adapter<adapterViuva.ViewHolderViuva>{

        private List<list_jogger> ViuvaList;

        private adapterViuva(List<list_jogger> ViuvaList){
            this.ViuvaList = ViuvaList;
        }


        @NonNull
        @Override
        public ViewHolderViuva onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolderViuva(getLayoutInflater().inflate(R.layout.liquid_jogger, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolderViuva holder, int position) {
        list_jogger itemCurrent = ViuvaList.get(position);
        holder.bind(itemCurrent);
        }

        @Override
        public int getItemCount() {
            return ViuvaList.size();
        }

        private class ViewHolderViuva extends RecyclerView.ViewHolder{

            public ViewHolderViuva(@NonNull View itemView) {
                super(itemView);
            }
            public void bind(list_jogger item){
                ImageView imgView = itemView.findViewById(R.id.img_joggerTL);
                imgView.setImageResource(item.getImageView());
            }
        }

}
}