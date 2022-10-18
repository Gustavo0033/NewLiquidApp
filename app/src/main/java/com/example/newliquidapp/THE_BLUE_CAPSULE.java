package com.example.newliquidapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class THE_BLUE_CAPSULE extends AppCompatActivity {

    private RecyclerView Blue_Capsule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_blue_capsule);

        Blue_Capsule = findViewById(R.id.the_blue_capsule);
        Blue_Capsule.setLayoutManager(new LinearLayoutManager(this));



        List<List_Blue_Capsule> Lista_BlueCapsule = new ArrayList<>();
        Lista_BlueCapsule.add(new List_Blue_Capsule(1, R.drawable.bluepajamasettl0262_layflats_041621_tl6029_451x677));
        Lista_BlueCapsule.add(new List_Blue_Capsule(2, R.drawable.pijama_blue));
        Lista_BlueCapsule.add(new List_Blue_Capsule(3, R.drawable.blue_pijama_cal_a));
        Lista_BlueCapsule.add(new List_Blue_Capsule(4, R.drawable.pijama_costas));

        adapterBlue adapter = new adapterBlue(Lista_BlueCapsule);
        Blue_Capsule.setAdapter(adapter);

    }

    private class adapterBlue extends RecyclerView.Adapter<adapterBlue.ViewHolderBlue>{

        private List<List_Blue_Capsule> Lista_BlueCapsule;

        public adapterBlue(List<List_Blue_Capsule> Lista_BlueCapsule){
            this.Lista_BlueCapsule = Lista_BlueCapsule;
        }


        @NonNull
        @Override
        public ViewHolderBlue onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolderBlue(getLayoutInflater().inflate(R.layout.linear_blue_capsule,parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolderBlue holder, int position) {
        List_Blue_Capsule itemCurrent = Lista_BlueCapsule.get(position);
        holder.bind(itemCurrent);
        }

        @Override
        public int getItemCount() {
            return Lista_BlueCapsule.size();
        }


    private class ViewHolderBlue extends RecyclerView.ViewHolder{

        public ViewHolderBlue(@NonNull View itemView) {
            super(itemView);
        }

        public void bind(List_Blue_Capsule item){
            ImageView imgView = itemView.findViewById(R.id.Linear_BlueCapsule);

            imgView.setImageResource(item.getImageView());
        }
    }
}
}