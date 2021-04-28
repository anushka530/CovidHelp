package com.example.mynewsapp.ui.indiaplasmadonar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.mynewsapp.R;
import com.example.mynewsapp.webViewController;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);


        WebView WebView = root.findViewById(R.id.webViewbbc);
        WebView.loadUrl("http://indiaplasmadonor.com/");
        WebView.setWebViewClient(new webViewController());
        return root;
    }
}