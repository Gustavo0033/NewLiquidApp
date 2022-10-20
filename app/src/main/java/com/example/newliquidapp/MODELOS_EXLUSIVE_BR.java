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

public class MODELOS_EXLUSIVE_BR extends AppCompatActivity {

    private RecyclerView models_exclusive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_modelos_exlusive_br);

        models_exclusive = findViewById(R.id.exclusiveBR);
        models_exclusive.setLayoutManager(new LinearLayoutManager(this));

        List<list_brExclusive> ListaBrExclusive = new ArrayList<>();
        ListaBrExclusive.add(new list_brExclusive(1, R.drawable.teamliquidgeostee_brazilgeos_white_tl0259_0003_layer23copy_1140x1710, R.string.CamisetaLiquidBranca));
        ListaBrExclusive.add(new list_brExclusive(2, R.drawable.teamliquidgeostee_brazilgeos_navy_tl0259_0003_layer13copy_1140x1710, R.string.CamisetaLiquidAzulEscuro));


        adapterExclusive adapter = new adapterExclusive(ListaBrExclusive);
        models_exclusive.setAdapter(adapter);

    }
    private class adapterExclusive extends RecyclerView.Adapter<adapterExclusive.ViewHolderExclusive>{

        private List<list_brExclusive> ListaBrExclusive;

        private adapterExclusive(List<list_brExclusive> ListaBrExclusive){
            this.ListaBrExclusive = ListaBrExclusive;
        }
        @NonNull
        @Override
        public ViewHolderExclusive onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolderExclusive(getLayoutInflater().inflate(R.layout.linear_brazil_exclusive, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolderExclusive holder, int position) {
        list_brExclusive itemCurrent = ListaBrExclusive.get(position);
        holder.bind(itemCurrent);
        }

        @Override
        public int getItemCount() {
            return ListaBrExclusive.size();
        }

        private class ViewHolderExclusive extends RecyclerView.ViewHolder{

            public ViewHolderExclusive(@NonNull View itemView) {
                super(itemView);
            }
            public void bind(list_brExclusive item){
                ImageView imgExclusive = itemView.findViewById(R.id.linear_imageExclusive);
                imgExclusive.setImageResource(item.getImageview());

                TextView txtExclusive = itemView.findViewById(R.id.txtLinear);
                txtExclusive.setText(item.getTextView());
            }
        }
}
 }