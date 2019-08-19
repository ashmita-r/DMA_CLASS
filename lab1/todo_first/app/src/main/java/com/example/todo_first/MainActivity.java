package com.example.todo_first;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String[] tasks;
    int currentIndex = 0;
    private TextView textView;
    public static final String TODO_INDEX = "com.example.todoIndex";

    private Button detailButton;
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity", "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity", "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivity", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity", "onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity", "onPause");
    }



    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("TODO_INDEX", currentIndex);
        Log.d("MainActivity", "onSaveTnstanceState");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState != null){
            currentIndex = savedInstanceState.getInt("TODO_INDEX");
        }
        Resources res = getResources();
        tasks = res.getStringArray(R.array.tasks);


        textView = findViewById(R.id.text_view);
        textView.setText(tasks[currentIndex]);

        detailButton = findViewById(R.id.btn_detail);
        detailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, todo_details.class);
                intent.putExtra(TODO_INDEX,currentIndex);
                startActivity(intent);
            }
        });


    }

    public void previousButton(View view) {
        if (currentIndex > 0){
            currentIndex = currentIndex % tasks.length;
        }else {
            currentIndex = tasks.length;
        }
        currentIndex = --currentIndex % tasks.length;
        textView.setText(tasks[currentIndex]);
    }

    public void nextButton (View view) {
        currentIndex = ++currentIndex % tasks.length;
        textView.setText(tasks[currentIndex]);

    }
}
