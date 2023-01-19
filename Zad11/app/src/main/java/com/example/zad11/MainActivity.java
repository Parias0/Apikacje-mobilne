package com.example.zad11;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button button,button3, button2, button4, button5, button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom);
                imageView.startAnimation(animation);
            }

        });

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
                imageView.startAnimation(animation);
            }

        });

        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
                imageView.startAnimation(animation);
            }

        });

        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
                imageView.startAnimation(animation);
            }

        });

        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
                imageView.startAnimation(animation);
            }

        });

        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide);
                imageView.startAnimation(animation);
            }

        });

    }
}


