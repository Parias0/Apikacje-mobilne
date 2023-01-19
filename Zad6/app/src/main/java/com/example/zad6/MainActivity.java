package com.example.zad6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText firstTextField, secondTextField;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstTextField = findViewById(R.id.firstTextField);
        secondTextField = findViewById(R.id.secondTextField);
        submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstText = firstTextField.getText().toString();
                String secondText = secondTextField.getText().toString();

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("firstText", firstText);
                intent.putExtra("secondText", secondText);
                startActivity(intent);
            }
        });
    }
}
