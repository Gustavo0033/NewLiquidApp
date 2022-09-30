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

public class Jogadores_Rainbow6 extends AppCompatActivity {

    private RecyclerView rvMain_Rainbow6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogadores_rainbow6);

        List<MainItem_Rainbow6> mainItems_Rainbow6 = new ArrayList<>();
        mainItems_Rainbow6.add(new MainItem_Rainbow6(1, R.drawable.ask_liquid, R.string.Ask, Color.TRANSPARENT));
        mainItems_Rainbow6.add(new MainItem_Rainbow6(2, R.drawable.nesk_liquid, R.string.Nesk, Color.TRANSPARENT));
        mainItems_Rainbow6.add(new MainItem_Rainbow6(3, R.drawable.resetz_liquid, R.string.Resetz, Color.TRANSPARENT));
        mainItems_Rainbow6.add(new MainItem_Rainbow6(4, R.drawable.paluh_liquid, R.string.Paluh, Color.TRANSPARENT));
        mainItems_Rainbow6.add(new MainItem_Rainbow6(5, R.drawable.player_1785_lagonis_4, R.string.Lagonis, Color.TRANSPARENT));
        mainItems_Rainbow6.add(new MainItem_Rainbow6(5, R.drawable.player_131_hugzord_1, R.string.Hugzord, Color.TRANSPARENT));

        rvMain_Rainbow6 = findViewById(R.id.main_rv_Rainbow6);
        rvMain_Rainbow6.setLayoutManager(new LinearLayoutManager(this));
        MainAdapter_Rainbow6 adapter = new MainAdapter_Rainbow6(mainItems_Rainbow6);
        rvMain_Rainbow6.setAdapter(adapter);

    }
    private class MainAdapter_Rainbow6 extends RecyclerView.Adapter<MainViewHolder_Rainbow6>{

        private List<MainItem_Rainbow6> mainItems_Rainbow6;

        public  MainAdapter_Rainbow6(List<MainItem_Rainbow6>mainItems_Rainbow6){
            this.mainItems_Rainbow6 = mainItems_Rainbow6;
        }

        @NonNull
        @Override
        public MainViewHolder_Rainbow6 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new MainViewHolder_Rainbow6(getLayoutInflater().inflate(R.layout.main_item_rainbow6, parent, false));

        }

        @Override
        public void onBindViewHolder(@NonNull MainViewHolder_Rainbow6 holder, int position) {
            MainItem_Rainbow6 mainItemCurrent = mainItems_Rainbow6.get(position);
            holder.bind(mainItemCurrent);
        }

        @Override
        public int getItemCount() {
            return mainItems_Rainbow6.size();
        }
    }

    private class MainViewHolder_Rainbow6 extends RecyclerView.ViewHolder{
        public MainViewHolder_Rainbow6(@NonNull View itemView) {
            super(itemView);
        }
        public void bind(MainItem_Rainbow6 item){
            TextView txtName = itemView.findViewById(R.id.item_txt_nameR6);
            ImageView imgIcon = itemView.findViewById(R.id.item_img_iconR6);
            LinearLayout container = (LinearLayout) itemView;


            txtName.setText(item.getTextStringId());
            imgIcon.setImageResource(item.getDrawableId());
            container.setBackgroundColor(item.getColor());

        }
    }

}