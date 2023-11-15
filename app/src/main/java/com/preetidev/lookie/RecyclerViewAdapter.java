package com.preetidev.lookie;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {

    private ArrayList<RecyclerViewData> courseDataArrayList;
    private FirstFragment firstFragment;

    public RecyclerViewAdapter(ArrayList<RecyclerViewData> recyclerDataArrayList, FirstFragment firstFragment) {
        this.courseDataArrayList = recyclerDataArrayList;
        this.firstFragment=firstFragment;
    }


    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Inflate Layout
        View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.item_primary,parent,false);
        return new RecyclerViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.RecyclerViewHolder holder, int position) {
     //set the data to textview and imageview
        RecyclerViewData recyclerData=courseDataArrayList.get(position);
        holder.TV.setText(recyclerData.getTitle());
        holder.IV.setImageResource(recyclerData.getImgid());
    }

    @Override
    public int getItemCount() {
        return courseDataArrayList.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder{

        private TextView TV;
        private ImageView IV;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            TV=itemView.findViewById(R.id.TextviewCV);
            IV=itemView.findViewById(R.id.imageCV);

        }
    }
}
