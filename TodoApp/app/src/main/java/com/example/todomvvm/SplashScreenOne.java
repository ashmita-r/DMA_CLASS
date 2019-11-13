package com.example.todomvvm;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class SplashScreenOne extends Fragment {

    public SplashScreenOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_splash_screen_one, container, false);

        int secondsDelayed = 1;
        new Handler().postDelayed(new Runnable() {
            public void run() {

                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);

            }
        }, secondsDelayed * 1000);
        return view;
    }



}
