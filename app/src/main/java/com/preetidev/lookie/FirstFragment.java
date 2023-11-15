package com.preetidev.lookie;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;


public class FirstFragment extends  Fragment  {


    private RecyclerView recyclerView , horizontalRV;
    private ArrayList<RecyclerViewData> recyclerDataArrayList , styleDataList;

    public FirstFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View view=inflater.inflate(R.layout.fragment_first,container,false);

        recyclerView=view.findViewById(R.id.recyclerView);
        horizontalRV=view.findViewById(R.id.horizontalRv);


        // assigning ID of the toolbar to a variable
        Toolbar toolbar = view.findViewById(R.id.toolbar);

        // using toolbar as ActionBar
        ((AppCompatActivity) requireActivity()).setSupportActionBar(toolbar);


        //created new arraylist
        recyclerDataArrayList=new ArrayList<>();
        styleDataList= new ArrayList<>();

        //added data to array list
        recyclerDataArrayList.add(new RecyclerViewData("T-Shirt",R.drawable.tshirtt));
        recyclerDataArrayList.add(new RecyclerViewData("Shoes",R.drawable.shoes));
        recyclerDataArrayList.add(new RecyclerViewData("Pants",R.drawable.pants));

        recyclerDataArrayList.add(new RecyclerViewData("Tops",R.drawable.tops));
        recyclerDataArrayList.add(new RecyclerViewData("Formals",R.drawable.formals));
        recyclerDataArrayList.add(new RecyclerViewData("Handbags",R.drawable.handbags));

        recyclerDataArrayList.add(new RecyclerViewData("Jewellery",R.drawable.jewellary));
        recyclerDataArrayList.add(new RecyclerViewData("Kurti & Salwar",R.drawable.kurtisalwar));
        recyclerDataArrayList.add(new RecyclerViewData("Saree",R.drawable.saree));

        recyclerDataArrayList.add(new RecyclerViewData("Sunglasses",R.drawable.sunglasses));
        recyclerDataArrayList.add(new RecyclerViewData("Watches",R.drawable.watches));
        recyclerDataArrayList.add(new RecyclerViewData("Western",R.drawable.western));



        //added data to array list
        styleDataList.add(new RecyclerViewData("Men",R.drawable.men));
        styleDataList.add(new RecyclerViewData("Women",R.drawable.saree));
        styleDataList.add(new RecyclerViewData("Kids",R.drawable.kids));

        styleDataList.add(new RecyclerViewData("Footwear",R.drawable.footwears));
        styleDataList.add(new RecyclerViewData("Accessories",R.drawable.accessories));
        styleDataList.add(new RecyclerViewData("Handbags",R.drawable.handbags));

        styleDataList.add(new RecyclerViewData("Jewellery",R.drawable.jewellary));
        styleDataList.add(new RecyclerViewData("Beauty",R.drawable.beauty));
        styleDataList.add(new RecyclerViewData("Lookie \n brands",R.drawable.lookie));

        styleDataList.add(new RecyclerViewData("Sports \n & fitness",R.drawable.sports));
        styleDataList.add(new RecyclerViewData("Watches",R.drawable.watches));
        styleDataList.add(new RecyclerViewData("Customer's \n most loved",R.drawable.western));

        //added data from arrayList to adapter class
        RecyclerViewAdapter adapter=new RecyclerViewAdapter(recyclerDataArrayList,this);
        RvAdaptery adaptery=new RvAdaptery(styleDataList,this);
        //Grid layout manager to implement grid view
        //in this method 2 represents number of columns to be displayed in grid view
        GridLayoutManager layoutManager =new GridLayoutManager(requireContext(),2);
        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false);
        //at last set adapter to recycler view
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        horizontalRV.setLayoutManager(horizontalLayoutManager);
        horizontalRV.setAdapter(adaptery);

      return view;

    }

    }
