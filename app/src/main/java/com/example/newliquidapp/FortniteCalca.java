package com.example.newliquidapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class FortniteCalca extends AppCompatActivity {

    private RecyclerView calcaFort;
    private View btn_backBaixo;
    private View logo_fort_calca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_fortnite_calca);

        logo_fort_calca = findViewById(R.id.FortCalcaLogo);
        logo_fort_calca.setOnClickListener(view -> {
            Intent intent = new Intent(FortniteCalca.this, MainActivity.class);
            startActivity(intent);
        });





        btn_backBaixo = findViewById(R.id.back_parteBaixo);
        btn_backBaixo.setOnClickListener(view -> {
            Intent intent = new Intent(FortniteCalca.this, PARTE_DE_BAIXO.class);
            startActivity(intent);
        });


        calcaFort = findViewById(R.id.calcaFort);
        calcaFort.setLayoutManager(new LinearLayoutManager(this));

        List<list_jogger> ListaShort_fortnite = new ArrayList<>();
        ListaShort_fortnite.add(new list_jogger(1,R.drawable.fortnite_cal_a));
        ListaShort_fortnite.add(new list_jogger(1,R.drawable.calca_fortnite));
        ListaShort_fortnite.add(new list_jogger(1,R.drawable.calca_fortnite2));
        ListaShort_fortnite.add(new list_jogger(1,R.drawable.calca_fortnite3));

        adapterCalcaFort adapter = new adapterCalcaFort(ListaShort_fortnite);
        calcaFort.setAdapter(adapter);
    }
    private class adapterCalcaFort extends RecyclerView.Adapter<adapterCalcaFort.CalcaFortHolder>{

        private List<list_jogger> ListaShort_fortnite;

        private adapterCalcaFort (List<list_jogger>ListaShort_fortnite){
            this.ListaShort_fortnite = ListaShort_fortnite;
        }


        @NonNull
        @Override
        public CalcaFortHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new CalcaFortHolder(getLayoutInflater().inflate(R.layout.liquid_jogger,parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull CalcaFortHolder holder, int position) {
        list_jogger itemCurrent = ListaShort_fortnite.get(position);
        holder.bind(itemCurrent);
        }

        @Override
        public int getItemCount() {
            return ListaShort_fortnite.size();
        }

        private class CalcaFortHolder extends RecyclerView.ViewHolder{

            public CalcaFortHolder(@NonNull View itemView) {
                super(itemView);
            }
            public void bind(list_jogger item){
                ImageView imgView = itemView.findViewById(R.id.img_joggerTL);
                imgView.setImageResource(item.getImageView());
            }
        }
}
}