package com.example.user.recylerviewapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.OrderListViewHolder> {

    private String[] data;
    public RecyclerAdapter(String[] data)
    {
        this.data = data;
    }

    @Override
    public OrderListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_layout, parent, false);
        return new OrderListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(OrderListViewHolder holder, int position) {
        String title = data[position];
        holder.textTitle.setText(title);
        holder.imgIcon.setText(title);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class OrderListViewHolder extends RecyclerView.ViewHolder{
        TextView imgIcon;
        TextView textTitle;
        public OrderListViewHolder(View itemView) {
            super(itemView);
            imgIcon = itemView.findViewById(R.id.imgIcon);
            textTitle = itemView.findViewById(R.id.textTitle);
        }
    }
}
