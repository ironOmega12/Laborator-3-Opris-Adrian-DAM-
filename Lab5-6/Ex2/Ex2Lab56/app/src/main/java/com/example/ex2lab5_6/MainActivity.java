package com.example.ex2lab5_6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnRe;
    Button btnStray;
    Button btnMc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRe = findViewById(R.id.btnRe);
        btnStray = findViewById(R.id.btnStray);
        btnMc = findViewById(R.id.btnMc);

        btnRe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, repage.class);
                startActivity(intent);
            }
        });
        btnStray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, straypage.class);
                startActivity(intent);
            }
        });
        btnMc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, mcpage.class);
                startActivity(intent);
            }
        });
    }
}