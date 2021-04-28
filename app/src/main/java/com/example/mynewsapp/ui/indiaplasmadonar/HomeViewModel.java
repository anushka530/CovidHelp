package com.example.mynewsapp.ui.indiaplasmadonar;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;


    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is indiaplasmadonar fragment");

    }

    public LiveData<String> getText() {
        return mText;
    }
}