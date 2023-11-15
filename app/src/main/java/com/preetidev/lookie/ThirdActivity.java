package com.preetidev.lookie;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;


public class ThirdActivity extends AppCompatActivity
        implements NavigationView
        .OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

       bottomNavigationView=findViewById(R.id.bottomNavigationView);

       bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem item) {
               int itemId= item.getItemId();
               if(itemId==R.id.home){
                   openFragment(new FirstFragment());
                   return true;
               }else if (itemId==R.id.person){
                   openFragment(new SecondFragment());
                   return true;
               } else if (itemId==R.id.settings) {
                   openFragment(new FourthFragment());
                   return true;
               } else if (itemId==R.id.cart) {
                   openFragment(new ThirdFragment());
                   return true;
               }

               return false;
           }
       });
       fragmentManager=getSupportFragmentManager();
       openFragment(new FirstFragment());

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int itemId= item.getItemId();
        if(itemId==R.id.home){
            openFragment(new FirstFragment());
        }else if (itemId==R.id.person){
            openFragment(new SecondFragment());
        } else if (itemId==R.id.settings) {
            openFragment(new ThirdFragment());
        } else if (itemId==R.id.cart) {
            openFragment(new FourthFragment());
        }
        return true;
    }
    private void openFragment(Fragment fragment){
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.replace(R.id.flFragment,fragment);
        transaction.commit();
    }
}