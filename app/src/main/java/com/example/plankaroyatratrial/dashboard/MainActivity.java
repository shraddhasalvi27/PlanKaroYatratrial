package com.example.plankaroyatratrial.dashboard;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class  MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_nav);
        NavigationBarView.OnItemSelectedListener;
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new HomeFragment()).commit();


    }
    private NavigationBarView.OnItemSelectedListener navigationItemSelectedListner=new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {


            Fragment selectedFragment=null;
            switch (item.getItemId()){
                case R.id.home:
                    selectedFragment=new HomeFragment();
                    break;
                case R.id.profile:
                    selectedFragment=new Profile();
                    break;
                case R.id.setting:
                    selectedFragment=new Setting();
                    break;




        }
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFragment).commit();
            return true;
    };
};}