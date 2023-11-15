package com.preetidev.lookie;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class ThirdFragment extends Fragment {

private RecyclerView recyclerView;
private ArrayList<Cart_Data> cartdata;

public ThirdFragment(){

}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_third,container,false);
        recyclerView=view.findViewById(R.id.cart_rec);

        cartdata=new ArrayList<>();

        cartdata.add(new Cart_Data("pants","5.0","Rs 1000",R.drawable.pants));
        cartdata.add(new Cart_Data("handbags","4.5","Rs 500",R.drawable.handbags));
        cartdata.add(new Cart_Data("accessories","4.0","Rs 500",R.drawable.accessories));




        cart_adapter adapter=new cart_adapter(cartdata,this);

        LinearLayoutManager layoutManager=new LinearLayoutManager(requireContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        return view;

    }
}