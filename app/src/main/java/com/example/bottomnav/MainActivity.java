package com.example.bottomnav;


import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.BottomBarID);

        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.FrameViewID, new HomeSubActivity()).commit();
        }

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment fragment = null;

                if(menuItem.getItemId()==R.id.homeID){
                    fragment = new HomeSubActivity();
                }
                if(menuItem.getItemId()==R.id.settingID){
                    fragment = new SettingSubActivity();
                }
                if(menuItem.getItemId()==R.id.profileID){
                    fragment = new ProfileSubActivity();
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.FrameViewID,fragment).commit();

                return false;
            }
        });

    }
}
