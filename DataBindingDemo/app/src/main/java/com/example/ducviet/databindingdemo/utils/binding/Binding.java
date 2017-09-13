package com.example.ducviet.databindingdemo.utils.binding;

import android.databinding.BindingAdapter;
import android.support.v7.widget.RecyclerView;

import com.example.ducviet.databindingdemo.manager.RecyclerUserAdapter;

/**
 * Created by ducviet on 13/09/2017.
 */

public class Binding {
    @BindingAdapter({"recyclerAdapter"})
    public static void setRecyclerUserAddapter(RecyclerView recyclerView, RecyclerUserAdapter recyclerUserAddapter){
        recyclerView.setAdapter(recyclerUserAddapter);
    }
}
