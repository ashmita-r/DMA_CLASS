package com.example.todomvvm;

import android.content.Intent;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        //load 1st splashscreen fragment
        Fragment fragment = new SplashScreenOne();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_frame, fragment, fragment.getClass().getSimpleName()).addToBackStack(null).commit();



//        int secondsDelayed = 1;
//        new Handler().postDelayed(new Runnable() {
//            public void run() {
//
//                Intent intent = new Intent(SplashScreen.this,MainActivity.class);
//                startActivity(intent);
//                finish();
//
//            }
//        }, secondsDelayed * 1000);


    }
}
