package com.example.newliquidapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
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

public class JERSEY_EXCLUSIVE_BR_BLUE extends AppCompatActivity {

    private RecyclerView jerseyExclusiveBR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_teamliquid_brazil_exclusive);

        TextView txtView = findViewById(R.id.btn_brazilExclusiveBlue);
        txtView.setMovementMethod(LinkMovementMethod.getInstance());
        txtView.setLinkTextColor(Color.WHITE);

        jerseyExclusiveBR = findViewById(R.id.exclusiveBRJersey_blue);
        jerseyExclusiveBR.setLayoutManager(new LinearLayoutManager(this));

        List<list_jogger> exclusiveBlueBrazil = new ArrayList<>();
        exclusiveBlueBrazil.add(new list_jogger(1, R.drawable.lvth_njersey_brazil_sponsored__tl0515_0000_layer29_564x846));
        exclusiveBlueBrazil.add(new list_jogger(1, R.drawable.jersey_blue_brazil01));
        exclusiveBlueBrazil.add(new list_jogger(1, R.drawable.jersey_blue_brazil02));
        exclusiveBlueBrazil.add(new list_jogger(1, R.drawable.jersey_blue_brazil03));
        exclusiveBlueBrazil.add(new list_jogger(1, R.drawable.jersey_blue_brazil04));

        adapterBlue adapter = new adapterBlue(exclusiveBlueBrazil);
        jerseyExclusiveBR.setAdapter(adapter);
    }
    private class adapterBlue extends RecyclerView.Adapter<adapterBlue.ViewHolderBLue>{

        private List<list_jogger>exclusiveBlueBrazil;
        private adapterBlue(List<list_jogger>exclusiveBlueBrazil){
            this.exclusiveBlueBrazil = exclusiveBlueBrazil;
        }

        @NonNull
        @Override
        public ViewHolderBLue onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolderBLue(getLayoutInflater().inflate(R.layout.liquid_jogger,parent,false));
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolderBLue holder, int position) {
        list_jogger itemCurrent = exclusiveBlueBrazil.get(position);
        holder.bind(itemCurrent);
        }

        @Override
        public int getItemCount() {
            return exclusiveBlueBrazil.size();
        }

        private class ViewHolderBLue extends RecyclerView.ViewHolder{

            public ViewHolderBLue(@NonNull View itemView) {
                super(itemView);
            }
            public void bind(list_jogger item){
                ImageView imgView = itemView.findViewById(R.id.img_joggerTL);
                imgView.setImageResource(item.getImageView());
            }
        }

}
}
