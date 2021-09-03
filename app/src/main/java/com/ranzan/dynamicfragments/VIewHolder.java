package com.ranzan.dynamicfragments;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class VIewHolder extends RecyclerView.ViewHolder {
    private ImageView img;
    private TextView title;
    private TextView subTitle;

    public VIewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View v) {
        img = v.findViewById(R.id.img);
        title = v.findViewById(R.id.t1);
        subTitle = v.findViewById(R.id.t2);
    }

    void setData(ResponseItem responseItem) {
        Glide.with(itemView).load(responseItem.getImage()).into(img);
        title.setText(responseItem.getTitle());
        subTitle.setText(responseItem.getSubTitle());
    }
}
