package com.example.ducviet.databindingdemo.data.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.ducviet.databindingdemo.BR;


/**
 * Created by ducviet on 13/09/2017.
 */

public class User extends BaseObservable {
    private String mName;
    private String mAddress;

    public User(String name, String address) {
        mName = name;
        mAddress = address;
    }

    @Bindable
    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        this.mAddress = address;
        notifyPropertyChanged(BR.address);
    }


}
