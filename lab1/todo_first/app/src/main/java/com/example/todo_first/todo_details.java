package com.example.todo_first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

public class todo_details extends AppCompatActivity {
    private TextView textView;
    private String[] description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo_details);

        Resources res = getResources();
        description = res.getStringArray(R.array.description);

        int currentIndex = getIntent().getIntExtra(MainActivity.TODO_INDEX, 0);

        textView = findViewById(R.id.text_view);
        textView.setText(description[currentIndex]);
    }
}
