package com.example.zad6;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private TextView displayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        displayText = findViewById(R.id.displayText);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String firstText = bundle.getString("firstText");
            String secondText = bundle.getString("secondText");
            displayText.setText(firstText + " " + secondText);
        }
    }
}

