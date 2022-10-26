package com.example.newliquidapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class LIQUID_TAPING_SHORT_SLEEVE_TEE extends AppCompatActivity {

    private RecyclerView Liquid_taping;
    private View btn_taping_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_liquid_taping_short_sleeve_tee);

        btn_taping_back = findViewById(R.id.btnTaping_back);
        btn_taping_back.setOnClickListener(view ->{
            Intent intent = new Intent(LIQUID_TAPING_SHORT_SLEEVE_TEE.this, PARTE_DE_CIMA.class);
            startActivity(intent);
        });

        TextView Hyperlink = findViewById(R.id.LinkTaping);
        Hyperlink.setMovementMethod(LinkMovementMethod.getInstance());
        Hyperlink.setLinkTextColor(Color.WHITE);

        Liquid_taping = findViewById(R.id.liquid_taping);
        Liquid_taping.setLayoutManager(new LinearLayoutManager(this));

        List<list_jogger>ListaTaping = new ArrayList<>();
        ListaTaping.add(new list_jogger(1,R.drawable.liquidtapingsstee_tl0104_0000_layer3copy_1140x1710));
        ListaTaping.add(new list_jogger(1,R.drawable.liquidtaping01));
        ListaTaping.add(new list_jogger(1,R.drawable.liquidtaping02));
        ListaTaping.add(new list_jogger(1,R.drawable.liquidtaping03));
        ListaTaping.add(new list_jogger(1,R.drawable.liquidtaping04));

        adapterTaping adapter = new adapterTaping(ListaTaping);
        Liquid_taping.setAdapter(adapter);
    }
    private class adapterTaping extends RecyclerView.Adapter<adapterTaping.ViewHolderTaping>{

        private List<list_jogger>ListaTaping;
        private adapterTaping(List<list_jogger>ListaTaping){
            this.ListaTaping = ListaTaping;
        }

        @NonNull
        @Override
        public ViewHolderTaping onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolderTaping(getLayoutInflater().inflate(R.layout.liquid_jogger,parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolderTaping holder, int position) {
        list_jogger itemCurrent = ListaTaping.get(position);
        holder.bind(itemCurrent);
        }

        @Override
        public int getItemCount() {
            return ListaTaping.size();
        }

        private class ViewHolderTaping extends RecyclerView.ViewHolder{

            public ViewHolderTaping(@NonNull View itemView) {
                super(itemView);
            }
            public void bind(list_jogger item){
                ImageView imgView = itemView.findViewById(R.id.img_joggerTL);
                imgView.setImageResource(item.getImageView());
            }
        }
}
}