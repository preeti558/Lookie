package com.preetidev.lookie;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class cart_adapter extends RecyclerView.Adapter<cart_adapter.RecyclerViewHolder> {

    private ArrayList<Cart_Data> cart_data_list;
    private ThirdFragment thirdFragment;

    public cart_adapter(ArrayList<Cart_Data> cart_data_list, ThirdFragment thirdFragment) {
        this.cart_data_list = cart_data_list;
        this.thirdFragment = thirdFragment;
    }


    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_item,parent,false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull cart_adapter.RecyclerViewHolder holder, int position) {

        Cart_Data cartData=cart_data_list.get(position);
        holder.tv1.setText(cartData.getName());
        holder.tv2.setText(cartData.getRating());
        holder.tv3.setText(cartData.getPrice());

        holder.iv.setImageResource(cartData.getImg());

    }

    @Override
    public int getItemCount() {
        return cart_data_list.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder{

        private TextView tv1,tv2,tv3;
        private ImageView iv;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            tv1=itemView.findViewById(R.id.name);
            tv2=itemView.findViewById(R.id.rating);
            tv3=itemView.findViewById(R.id.price);

            iv=itemView.findViewById(R.id.cart_img);



        }
    }
}
