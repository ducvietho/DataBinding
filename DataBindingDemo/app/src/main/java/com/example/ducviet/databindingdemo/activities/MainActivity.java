package com.example.ducviet.databindingdemo.activities;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;

import com.example.ducviet.databindingdemo.R;

import com.example.ducviet.databindingdemo.databinding.ActivityMainBinding;
import com.example.ducviet.databindingdemo.manager.RecyclerUserAdapter;
import com.example.ducviet.databindingdemo.model.User;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<User> arrayList;
    private GridLayoutManager manager;
    private RecyclerUserAdapter adapter;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(MainActivity.this,R.layout.activity_main);
        arrayList = new ArrayList<>();
        arrayList.add(new User("Viet","Ha Noi"));
        arrayList.add(new User("Giang","Thai Binh"));
        manager = new GridLayoutManager(MainActivity.this,1);
        adapter = new RecyclerUserAdapter(MainActivity.this,arrayList);
        binding.recUser.setHasFixedSize(true);
        binding.recUser.setLayoutManager(manager);
        binding.recUser.setAdapter(adapter);

    }
}
