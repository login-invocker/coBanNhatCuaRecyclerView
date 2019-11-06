package com.example.testtttttttttttttttttttttttt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HelpAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private List<HelpData> helpDatas;
    private Context context;


    public HelpAdapter(List<HelpData> helpDatas, Context context) {
        this.helpDatas = helpDatas;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView;

                itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewrecycler, parent, false);
        return new HelpHodler(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        String name = helpDatas.get(position).getName();
        HelpHodler contactViewHolder=(HelpHodler) holder;

         contactViewHolder.txt.setText(name);
    }

    @Override
    public int getItemCount() {
        return helpDatas == null ? 0 : helpDatas.size();
    }
}
