package com.example.lab4ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnStart = findViewById(R.id.btnStart);
        btnStart.setOnClickListener(this);

        EditText editText = findViewById(R.id.editTextText);
        Animation fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        editText.startAnimation(fadeInAnimation);
        btnStart.startAnimation(fadeInAnimation);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnStart) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }
    }
}
