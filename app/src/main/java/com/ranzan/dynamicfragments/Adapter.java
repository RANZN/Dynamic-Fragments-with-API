package com.ranzan.dynamicfragments;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<VIewHolder> {
    private List<ResponseItem> list;

    public Adapter(List<ResponseItem> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public VIewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new VIewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VIewHolder holder, int position) {
        ResponseItem responseItem = list.get(position);
        holder.setData(responseItem);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public void updateUI(List<ResponseItem> responseItems){
        list=responseItems;
        notifyDataSetChanged();
    }
}
