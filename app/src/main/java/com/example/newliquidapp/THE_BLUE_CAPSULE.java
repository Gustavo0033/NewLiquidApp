package com.example.newliquidapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class THE_BLUE_CAPSULE extends AppCompatActivity {

    private RecyclerView Blue_Capsule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_blue_capsule);

        Blue_Capsule = findViewById(R.id.the_blue_capsule);
        Blue_Capsule.setLayoutManager(new LinearLayoutManager(this));


        adapterBlue adapter = new adapterBlue();
        Blue_Capsule.setAdapter(adapter);

    }

    private class adapterBlue extends RecyclerView.Adapter<adapterBlue.ViewHolderBlue>{

        @NonNull
        @Override
        public ViewHolderBlue onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolderBlue(getLayoutInflater().inflate(R.layout.linear_blue_capsule,parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolderBlue holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }


    private class ViewHolderBlue extends RecyclerView.ViewHolder{

        public ViewHolderBlue(@NonNull View itemView) {
            super(itemView);
        }
    }
}
}