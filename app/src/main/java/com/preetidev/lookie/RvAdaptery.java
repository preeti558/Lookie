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

public class RvAdaptery  extends RecyclerView.Adapter<RvAdaptery.RvHolder> {

    private ArrayList<RecyclerViewData> styleList;
    private FirstFragment mFragment;

    public RvAdaptery(ArrayList<RecyclerViewData> styleList, FirstFragment fragment) {
        this.styleList = styleList;
        this.mFragment = fragment;
    }

    @NonNull
    @Override
    public RvAdaptery.RvHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Inflate Layout
        View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.item_secondary,parent,false);
        return new RvAdaptery.RvHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull RvAdaptery.RvHolder holder, int position) {
        //set the data to textview and imageview
        RecyclerViewData recyclerData=styleList.get(position);
        holder.textView.setText(recyclerData.getTitle());
        holder.imageView.setImageResource(recyclerData.getImgid());
    }

    @Override
    public int getItemCount() {
        return styleList.size();
    }

    public class RvHolder extends RecyclerView.ViewHolder{

        private TextView textView;
        private ImageView imageView;

        public RvHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.style);
           imageView=itemView.findViewById(R.id.img);

        }
    }
}