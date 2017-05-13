package com.rango.lucassouza.rango.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.rango.lucassouza.rango.R;

import java.util.List;

public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.MyViewHolder> {

    private String[] itemName;
    private Integer[] imgid;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView txtView;
        public ImageView imgView;

        public MyViewHolder(View view) {
            super(view);
            txtView = (TextView) view.findViewById(R.id.item_name);
            imgView = (ImageView) view.findViewById(R.id.icon);

        }
    }


    public HorizontalAdapter(String[] itemName, Integer[] imgId) {
        this.imgid = imgId;
        this.itemName = itemName;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.product, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        holder.txtView.setText(itemName[position]);
        holder.imgView.setImageResource(imgid[position]);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemName.length;
    }
}
