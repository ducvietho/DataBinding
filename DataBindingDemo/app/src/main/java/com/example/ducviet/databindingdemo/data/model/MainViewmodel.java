package com.example.ducviet.databindingdemo.data.model;

import android.databinding.BaseObservable;

import android.databinding.Bindable;
import com.example.ducviet.databindingdemo.manager.RecyclerUserAdapter;

/**
 * Created by ducviet on 13/09/2017.
 */

public class MainViewmodel extends BaseObservable  {
    private RecyclerUserAdapter adapter;

    public MainViewmodel(RecyclerUserAdapter adapter) {
        this.adapter = adapter;
    }

    @Bindable
    public RecyclerUserAdapter getAdapter(){
        return adapter;
    }
}
