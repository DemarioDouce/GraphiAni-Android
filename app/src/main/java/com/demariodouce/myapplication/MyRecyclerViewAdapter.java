package com.demariodouce.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {

    private List<String> titleList;
    private List<String> descriptionList;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;

    // data is passed into the constructor
    MyRecyclerViewAdapter(Context context, List<String> titleData, List<String> descriptionData) {
        this.mInflater = LayoutInflater.from(context);
        this.titleList = titleData;
        this.descriptionList = descriptionData;
    }

    // inflates the row layout from xml when needed
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.recyclerview_row, parent, false);
        return new ViewHolder(view);
    }

    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String exercise = titleList.get(position);
        String exercise2 = descriptionList.get(position);
        holder.titleTv.setText(exercise);
        holder.descriptionTv.setText(exercise2);
    }

    // total number of rows
    @Override
    public int getItemCount() {
        return titleList.size();
    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView titleTv;
        TextView descriptionTv;

        ViewHolder(View itemView) {
            super(itemView);
            titleTv = itemView.findViewById(R.id.excerciseTitleTv);
            descriptionTv = itemView.findViewById(R.id.excerciseDescriptionTv);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    // convenience method for getting data at click position
    String getItem(int id) {
        return titleList.get(id);
    }

    // allows clicks events to be caught
    void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}
