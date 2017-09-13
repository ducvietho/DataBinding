package com.example.ducviet.databindingdemo.activities;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.ducviet.databindingdemo.R;

import com.example.ducviet.databindingdemo.data.model.MainViewmodel;
import com.example.ducviet.databindingdemo.databinding.ActivityMainBinding;
import com.example.ducviet.databindingdemo.manager.RecyclerUserAdapter;
import com.example.ducviet.databindingdemo.data.model.User;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {
    private ArrayList<User> arrayList;
    private RecyclerUserAdapter adapter;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(MainActivity.this,R.layout.activity_main);
        arrayList = new ArrayList<>();
        arrayList.add(new User("Viet","Ha Noi"));
        arrayList.add(new User("Giang","Thai Binh"));
        adapter = new RecyclerUserAdapter(MainActivity.this,arrayList);
        MainViewmodel mainViewmodel = new MainViewmodel(adapter);
        binding.setRecycler(mainViewmodel);
    }

}
