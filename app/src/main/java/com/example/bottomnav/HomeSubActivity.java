package com.example.bottomnav;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HomeSubActivity extends Fragment {

    RecyclerView recyclerView;
    String[] text = {"Shahin Safi", "Ridoy", "Zahidul Islam", "Zahirul Islam", "Tarek", "Faruk", "Nadim","Shahin Safi", "Ridoy", "Zahidul Islam", "Zahirul Islam", "Tarek", "Faruk", "Nadim"};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vHome = inflater.inflate(R.layout.home_layout,container,false);

        recyclerView = vHome.findViewById(R.id.recyclerViewID);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(new RecyclerAdapter(getActivity(),text));


        return vHome;


    }

}
