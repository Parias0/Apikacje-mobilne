package com.example.zad2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText textField;
    private EditText textArea;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textField = findViewById(R.id.text_field);
        textArea = findViewById(R.id.text_area);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = textArea.getText().toString();
                textField.setText("Napisałeś: " + text);
                textField.setEnabled(false);
                textField.setFocusable(false);
            }
        });
    }
}