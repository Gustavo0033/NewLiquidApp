package com.example.newliquidapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
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
        getSupportActionBar().hide();
        setContentView(R.layout.activity_the_blue_capsule);

        Blue_Capsule = findViewById(R.id.the_blue_capsule);
        Blue_Capsule.setLayoutManager(new GridLayoutManager(this, 2));



        List<List_Blue_Capsule> Lista_BlueCapsule = new ArrayList<>();
        Lista_BlueCapsule.add(new List_Blue_Capsule(1, R.drawable.bluepajamasettl0262_layflats_041621_tl6029_451x677, R.string.BLUE_PAJAMA_SET));
        Lista_BlueCapsule.add(new List_Blue_Capsule(2, R.drawable.mousepad_bluecapsule, R.string.Mousepad_BlueCapsule));
        Lista_BlueCapsule.add(new List_Blue_Capsule(3, R.drawable.pantufaliquid_branca, R.string.TEAM_LIQUID_SLIPPERS));
        Lista_BlueCapsule.add(new List_Blue_Capsule(4, R.drawable.pumadaazul_liquid, R.string.BLUE_SLIPPERS));
        Lista_BlueCapsule.add(new List_Blue_Capsule(5, R.drawable.teamliquid_blueplush2_0_tl0602_wht_os_cropped_0000_layer4copy_912x1368, R.string.UrsinhoBlue));


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
            TextView txtView = itemView.findViewById(R.id.linearText);

            imgView.setImageResource(item.getImageView());
            txtView.setText(item.getTextViewCapsule());
        }
    }
}
}